package www.facades

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

object Marked {
  @js.native
  @JSImport("marked", "parse")
  def parse(markdown: String): String = js.native
}