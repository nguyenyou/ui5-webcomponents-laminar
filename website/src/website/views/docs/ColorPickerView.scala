package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
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
      )
    )
  }
}
