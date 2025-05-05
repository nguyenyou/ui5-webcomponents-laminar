package website.examples

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
trait ExampleRenderer {
  def id: String = this.getClass.getSimpleName
  def component: HtmlElement

  def apply() = {
    val previewContainer = dom.document.getElementById(id)
    Option(previewContainer).foreach { container =>
      val theme          = container.getAttribute("data-theme")
      val contentDensity = container.getAttribute("data-content-density")
      val direction      = container.getAttribute("data-direction")
      Option(theme).foreach(setTheme)
      Option(contentDensity).foreach { density =>
        density match {
          case "cozy" =>
            dom.document.body.classList.remove("ui5-content-density-compact")
          case "compact" =>
            dom.document.body.classList.add("ui5-content-density-compact")
        }
      }
      Option(direction).foreach { direction =>
        direction match {
          case "ltr" =>
            dom.document.body.removeAttribute("dir")
          case "rtl" =>
            dom.document.body.setAttribute("dir", "rtl")
        }
        distLocaleApplyDirectionMod.default()
      }
      render(container, component)
    }
  }

}
