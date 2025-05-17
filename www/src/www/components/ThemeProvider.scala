package www.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.Assets
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import org.scalajs.dom
import www.components.ThemeProvider.contentDensitySignal
import www.components.ThemeProvider.directionSignal
import www.components.ThemeProvider.websiteThemeSignal
import www.facades.GlobalConfig

case class ThemeProvider() {
  // Documentation: https://sap.github.io/ui5-webcomponents/docs/development/styling/#theming-assets
  Assets.WebComponents
  Assets.WebComponentsFiori
  Assets.WebComponentsCompat
  Assets.WebComponentsAi

  Icons.registerCustomIcons()

  def apply(child: HtmlElement): HtmlElement = {
    child.amend(
      websiteThemeSignal.changes --> Observer[String] { theme =>
        setTheme(theme)
      },
      contentDensitySignal.changes --> Observer[String] {
        case "cozy" =>
          dom.document.body.classList.remove("ui5-content-density-compact")
        case "compact" =>
          dom.document.body.classList.add("ui5-content-density-compact")
      },
      directionSignal.changes --> Observer[String] { direction =>
        direction match {
          case "ltr" =>
            dom.document.body.removeAttribute("dir")
          case "rtl" =>
            dom.document.body.setAttribute("dir", "rtl")
        }
        distLocaleApplyDirectionMod.default()
      }
    )
  }
}

object ThemeProvider {
  enum Theme(
      val key: String,
      val name: String,
      val pair: String,
      val isLight: Boolean
  ) {
    case SapHorizon
        extends Theme(
          "sap_horizon",
          "Morning Horizon (Light)",
          "sap_horizon_dark",
          true
        )
    case SapHorizonDark
        extends Theme(
          "sap_horizon_dark",
          "Evening Horizon (Dark)",
          "sap_horizon",
          false
        )
    case SapHorizonHcb
        extends Theme(
          "sap_horizon_hcb",
          "Horizon High Contrast Black",
          "sap_horizon_hcw",
          false
        )
    case SapHorizonHcw
        extends Theme(
          "sap_horizon_hcw",
          "Horizon High Contrast White",
          "sap_horizon_hcb",
          true
        )
    case SapFiori3     extends Theme("sap_fiori_3", "Quartz Light", "sap_fiori_3_dark", true)
    case SapFiori3Dark extends Theme("sap_fiori_3_dark", "Quartz Dark", "sap_fiori_3", false)
    case SapFiori3Hcb
        extends Theme(
          "sap_fiori_3_hcb",
          "Quartz High Contrast Black",
          "sap_fiori_3_hcw",
          false
        )
    case SapFiori3Hcw
        extends Theme(
          "sap_fiori_3_hcw",
          "Quartz High Contrast White",
          "sap_fiori_3_hcb",
          true
        )
  }

  val initialTheme: String = GlobalConfig.initialTheme

  val websiteThemeVar: Var[String]       = Var(initialTheme)
  val websiteThemeSignal: Signal[String] = websiteThemeVar.signal.distinct

  val contentDensityVar: Var[String]       = Var("cozy")
  val contentDensitySignal: Signal[String] = contentDensityVar.signal.distinct

  val directionVar: Var[String]       = Var("ltr")
  val directionSignal: Signal[String] = directionVar.signal.distinct
}
