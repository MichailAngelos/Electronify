package constants

import models.User

object FakeData{
 var user: User = User(1,"mgeorgiou","1234","mgeorgiou@electronify.com",99942975,"",active = true)
 var user2: User = User(2,"achaitidis", "12312" ,"achaitidis@electronify.com",9994556,"10-05-19 16:00:17",active = false)
 var user3: User = User(8,"kvenizelou", "1113234" ,"kvenizelou@electronify.com",99862956,"19-04-19 18:00:17",active = true)
 var user4: User = User(4,"tchristou", "119912234" ,"tchristou@electronify.com",97542956,"10-04-11 20:00:17",active = false)

  var users = Seq(user,user2,user3,user4)
}
