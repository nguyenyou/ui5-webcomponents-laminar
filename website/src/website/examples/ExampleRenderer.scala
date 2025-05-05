package website.examples

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import website.facades.GlobalConfig
trait ExampleRenderer {
  def id: String = this.getClass.getSimpleName
  def component: HtmlElement

  def apply() = {
    val previewContainer = dom.document.getElementById(id)
    Option(previewContainer).foreach { container =>
      setTheme(GlobalConfig.initialTheme)
      GlobalConfig.initialContentDensity match {
        case "cozy" =>
          dom.document.body.classList.remove("ui5-content-density-compact")
        case "compact" =>
          dom.document.body.classList.add("ui5-content-density-compact")
      }
      GlobalConfig.initialDirection match {
        case "ltr" =>
          dom.document.body.removeAttribute("dir")
        case "rtl" =>
          dom.document.body.setAttribute("dir", "rtl")
      }
      distLocaleApplyDirectionMod.default()
      render(container, component)
    }
  }

}
