// @GENERATOR:play-routes-compiler
// @SOURCE:F:/playprojectscala/conf/routes
// @DATE:Sun Feb 14 08:31:00 CET 2021


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
