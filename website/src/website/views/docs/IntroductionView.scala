package website.views.docs

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.Button.ButtonDesign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleApplyDirectionMod
import io.github.nguyenyou.scalawind.*

import website.macros.Source
import website.components.PreviewCode
import website.examples.PopoverExampleBasic
import website.components.IframePreview
import website.components.ThemeProvider.websiteThemeSignal
import website.components.ThemeProvider.websiteThemeVar
import website.components.ThemeProvider.contentDensityVar
import website.components.ThemeProvider.directionVar
import website.components.Demo

val THEMES = Seq(
  ("sap_horizon", "Morning Horizon (Light)"),
  ("sap_horizon_dark", "Evening Horizon (Dark)"),
  ("sap_horizon_hcb", "Horizon High Contrast Black"),
  ("sap_horizon_hcw", "Horizon High Contrast White"),
  ("sap_fiori_3", "Quartz Light"),
  ("sap_fiori_3_dark", "Quartz Dark"),
  ("sap_fiori_3_hcb", "Quartz High Contrast Black"),
  ("sap_fiori_3_hcw", "Quartz High Contrast White")
)

object IntroductionView extends ExampleView("Introduction") {
  val buttonDesignVar = Var[ButtonDesign]("Emphasized")
  val buttonDesignSeq = Seq[ButtonDesign](
    "Emphasized",
    "Negative",
    "Positive",
    "Transparent",
    "Default",
    "Attention"
  )
  val disabledVar = Var(false)
  val textVar     = Var("Hello World")

  override def component: HtmlElement = {
    div(
      IframePreview(example = PopoverExampleBasic, title = "Basic")(),
      Demo(
        title = "Basic",
        content = Source.annotate {
          div(
            Button(
              _.design := "Positive"
            )("Click me")
          )
        }
      ),
      PopoverExampleBasic.component,
      div(
        tw.flex.items_center,
        Input(
          _.value <-- textVar.signal,
          _.onInput.map(_.target.value) --> textVar.writer
        )(),
        Switch(
          _.checked <-- disabledVar.signal,
          _.onChange.map(_.target.checked) --> disabledVar.writer
        )(),
        Select(
          _.onChange.map(_.detail.selectedOption.id) --> Observer[String] {
            case design: ButtonDesign => buttonDesignVar.set(design)
            case _                    => ()
          }
        )(
          buttonDesignSeq.map(design => Opt(_.id := design)(design))
        )
      ),
      div(
        Select(
          _.onChange.map(_.detail.selectedOption.id) --> selectedOptionVar.writer
        )(),
        Select(
          _.onChange.map(
            _.detail.selectedOption.id
          ) --> contentDensityVar.writer
        )(
          Opt(_.id := "cozy")("Cozy"),
          Opt(_.id := "compact")("Compact")
        ),
        Select(
          _.onChange.map(_.detail.selectedOption.id) --> directionVar.writer
        )(
          Opt(_.id := "ltr")("LTR"),
          Opt(_.id := "rtl")("RTL")
        )
      ),
      Button(
        _.design <-- buttonDesignVar.signal,
        _.disabled <-- disabledVar.signal
      )(
        text <-- textVar.signal
      ),
      Button(
        _.design := "Positive"
      )("Click me"),
      Button(
        _.design := "Emphasized",
        _.icon   := IconName.email
      )("Click me"),
      Avatar(
        _.initials := "AB"
      )()
    )
  }

}
