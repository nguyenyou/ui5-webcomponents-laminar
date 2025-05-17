package www.facades

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Marked {
  @js.native
  @JSImport("marked", "parse") // import { parse } from 'marked';
  def parse(markdown: String): String = js.native
}
