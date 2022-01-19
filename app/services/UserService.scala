package services

import models.User
import queries.UserList

import javax.inject.Inject

class UserService @Inject() (users: UserList)  {
  def getAllUsers:Seq[User] = {
    users.getAll
  }
}
