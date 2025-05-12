package www.facades

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, JSName}

object Shiki {
  @js.native
  @JSImport("shiki", "codeToHtml")
  def codeToHtml(code: String, options: CodeToHtmlOptions = js.native): js.Promise[String] = js.native
}

trait CodeToHtmlOptions extends js.Object {
  val lang: js.UndefOr[String] = js.undefined
  val theme: js.UndefOr[String] = js.undefined
}

object CodeToHtmlOptions {
  def apply(
    lang: js.UndefOr[String] = js.undefined,
    theme: js.UndefOr[String] = js.undefined
  ): CodeToHtmlOptions = {
    val options = js.Dynamic.literal()
    lang.foreach(options.lang = _)
    theme.foreach(options.theme = _)
    options.asInstanceOf[CodeToHtmlOptions]
  }
}



