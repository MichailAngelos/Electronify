package services

import models.{User, UserList}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class UserService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile] {
  import profile.api._

  def getAll: Future[UserList] = {
    val query = sql"select * from users;".as[Seq[User]]
   db.run(query).map(user => UserList.getUserList(users = user))
  }
}
