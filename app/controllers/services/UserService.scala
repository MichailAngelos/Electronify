package controllers.services

import controllers.utils.Utils
import models.{User, UserList}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
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
}
