package controllers.services

import controllers.constants.Responses._
import controllers.utils.Utils
import models.Logger
import models.db.User._
import models.db.{User, UserList}
import models.raw.LogIn
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.JdbcProfile
import slick.sql.SqlAction

import java.util.UUID
import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile]
    with Logger {

  import profile.api._

  def getUserById(id: String): User = {
    val query = sql"select * from electronify.users where id = $id;".as[User]
    val user = Utils.getFutureValue(db.run(query)).headOption

    user match {
      case Some(user) =>
        if (
          id == user.id
            .getOrElse(UUID.fromString(""))
            .toString && user.active
        ) {
          logger.info(SUCCESS)
          user
        } else {
          logger.info(NO_USER_FOUND)
          User.defaultUser
        }
      case None => {
        logger.info(NO_USER_FOUND)
        User.defaultUser
      }
    }
  }

  def getAllActiveUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = true;".as[Seq[User]]
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
  }

  def getAllDisableUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = false;".as[Seq[User]]
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
  }

  def createUser(user: User): Int = {
    val activeUsers = getAllActiveUsers
    val filter =
      activeUsers.users.filter(existingUser => user.email == existingUser.email)

    user.id match {
      case Some(userId) =>
        val id = userId.toString
        if (filter.isEmpty) {
          val query: SqlAction[Int, NoStream, Effect] =
            sqlu"insert into electronify.users values ($id, ${user.username}, ${user.password}, ${user.email}, ${user.telephone}, ${user.created_at}, ${user.active})"

          updateQueries(query) match {
            case 1 => Status.CREATED
            case _ => Status.BAD_REQUEST
          }
        } else Status.BAD_GATEWAY
      case None => Status.BAD_REQUEST
    }
  }

  def disableUser(id: String): Int = {
    val activeUsers = getAllDisableUsers
    val filter =
      activeUsers.users.filter(existingUser =>
        id == existingUser.id.get.toString
      )

    if (filter.isEmpty) {
      val query: SqlAction[Int, NoStream, Effect] =
        sqlu"update electronify.users set active = false where id = $id;"

      updateQueries(query) match {
        case 1 => Status.ACCEPTED
        case _ => Status.BAD_REQUEST
      }
    } else Status.GONE
  }

  def logInUser(credentials: LogIn): User = {
    val query =
      sql"select * from electronify.users where username = ${credentials.username} and password = ${credentials.password} and active = true;"
        .as[User]
    val userO = Utils.getFutureValue(db.run(query)).headOption
    userO match {
      case Some(value) => value
      case None =>
        logger.info(NO_USER_FOUND)
        User.defaultUser
    }
  }

  def updateQueries(query: SqlAction[Int, NoStream, Effect]): Int = {
    Utils.getFutureValue[Int](db.run(query))
  }
}
