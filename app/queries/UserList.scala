package queries

import constants.FakeData.users
import models.User

class UserList {
  def getAll: Seq[User] = { users }
}
