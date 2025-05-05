package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object RadioButtonView extends ExampleView("Radio Button") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            RadioButton(
              _.name := "myGroup",
              _.text := "Option A"
            )(),
            RadioButton(
              _.name    := "myGroup",
              _.text    := "Option B",
              _.checked := true
            )(),
            RadioButton(
              _.name := "myGroup",
              _.text := "Option C"
            )()
          )
        }
      )
    )
  }

}
