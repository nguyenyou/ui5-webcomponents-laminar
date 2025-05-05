package website.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.Assets
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import org.scalajs.dom
import website.components.ThemeProvider.{contentDensitySignal, directionSignal, websiteThemeSignal}
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import website.facades.GlobalConfig

case class ThemeProvider() {
  // Documentation: https://sap.github.io/ui5-webcomponents/docs/development/styling/#theming-assets
  Assets.WebComponents
  Assets.WebComponentsFiori
  Assets.WebComponentsCompat
  Assets.WebComponentsAi

  def apply(child: HtmlElement): HtmlElement = {
    child.amend(
      websiteThemeSignal.changes --> Observer[String] { theme =>
        setTheme(theme)
      },
      contentDensitySignal.changes --> Observer[String] { contentDensity =>
        contentDensity match {
          case "cozy" =>
            dom.document.body.classList.remove("ui5-content-density-compact")
          case "compact" =>
            dom.document.body.classList.add("ui5-content-density-compact")
        }
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
  val Themes = Seq(
    ("sap_horizon", "Morning Horizon (Light)"),
    ("sap_horizon_dark", "Evening Horizon (Dark)"),
    ("sap_horizon_hcb", "Horizon High Contrast Black"),
    ("sap_horizon_hcw", "Horizon High Contrast White"),
    ("sap_fiori_3", "Quartz Light"),
    ("sap_fiori_3_dark", "Quartz Dark"),
    ("sap_fiori_3_hcb", "Quartz High Contrast Black"),
    ("sap_fiori_3_hcw", "Quartz High Contrast White")
  )

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

  val initialTheme = GlobalConfig.initialTheme

  val websiteThemeVar    = Var(initialTheme)
  val websiteThemeSignal = websiteThemeVar.signal

  val contentDensityVar    = Var("cozy")
  val contentDensitySignal = contentDensityVar.signal

  val directionVar    = Var("ltr")
  val directionSignal = directionVar.signal
}
