package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object ColorPickerView extends ExampleView("Color Picker") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          ColorPicker(
            _.value := "rgba(220, 208, 255, 1)"
          )()
        }
      ),
      Demo(
        title = "Controlled",
        content = Source.annotate {
          val colorVar    = Var("rgba(220, 208, 255, 1)")
          val colorSignal = colorVar.signal.distinct
          div(
            ColorPicker(
              _.value <-- colorSignal,
              _.onChange.mapToValue --> colorVar
            )(),
            div(
              tw.font_bold.mt_4,
              text <-- colorSignal.map(color => s"Current color: $color")
            )
          )
        }
      ),
      Demo(
        title = "Simplified Picker",
        content = Source.annotate {
          ColorPicker(
            _.value      := "#F6A192",
            _.simplified := true
          )()
        }
      )
    )
  }
}
