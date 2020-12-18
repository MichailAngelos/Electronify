// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/IdeaProjects/Electronify/conf/routes
// @DATE:Fri Dec 18 16:36:31 EET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
