package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object ToggleButtonView extends ExampleView("Toggle Button") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Variants(
            ToggleButton()("Toggle"),
            ToggleButton(
              _.icon := IconName.edit
            )("Edit")
          )
        }
      )
    )
  }

}
