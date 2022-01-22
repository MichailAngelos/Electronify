package controllers.services

import controllers.utils.Utils
import models.User._
import models.{User, UserList}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.JdbcProfile
import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {

  import profile.api._

  def getAll: UserList = {
    val query = sql"select * from electronify.users;".as[Seq[User]]
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
  }

  def getAllActiveUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = true;".as[Seq[User]]
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
  }

  def createUser(user: User): Int = {
    val stringId = user.id.toString
    val query =
      sql"insert into electronify.users(id,username,password,email,telephone,created_at,active) values($stringId,$user.username,$user.password,$user.email,$user.telephone,$user.created_at,$user.active);".asUpdate
      val response: Int = Utils.getFutureValue[Int](db.run(query))

      response match {
        case Status.CREATED => response
        case _ => Status.IM_A_TEAPOT
      }

    //todo resolve error
    //could not find implicit value for parameter e: slick.jdbc.SetParameter[models.User]

  }
}
