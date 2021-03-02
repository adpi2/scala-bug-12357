package macros

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context
import scala.reflect.macros.TypecheckException
import scala.reflect.macros.ParseException

object Macro {
  inline def foo(inline code: String): String = code
  def foo(code: String): String = macro Scala2Macro.foo
}

object Scala2Macro {
  def foo(c: Context)(code: c.Tree): c.Tree = code 
}