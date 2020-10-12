// @GENERATOR:play-routes-compiler
// @SOURCE:/home/michail/dev/Electronify/conf/routes
// @DATE:Mon Oct 12 09:44:01 EEST 2020


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
