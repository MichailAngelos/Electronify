package controllers.services

import controllers.utils.Utils
import models.User._
import models.{User, UserList}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.{JdbcProfile, SQLActionBuilder}

import java.sql.{Connection, PreparedStatement, ResultSet, Statement}
import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
  var conn: Connection = _
  var stmt: Statement = _
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
    val query =
      sqlu"insert into electronify.users values (${user.id}, ${user.username}, ${user.password}, ${user.email}, ${user.telephone}, ${user.created_at}, ${user.active})"
    val response: Int = Utils.getFutureValue[Int](db.run(query))

    response match {
      case 1 => Status.IM_A_TEAPOT
      case _ => Status.BAD_REQUEST
    }
  }
}
