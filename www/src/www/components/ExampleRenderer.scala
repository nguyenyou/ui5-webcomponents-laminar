package www.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import org.scalajs.dom
import www.facades.GlobalConfig
import www.macros.Source.AnnotationType

trait ExampleRenderer {
  def id: String = this.getClass.getSimpleName
  def content: AnnotationType
  def source: String         = content.source
  def component: HtmlElement = content.element

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
