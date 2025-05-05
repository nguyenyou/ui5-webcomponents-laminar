package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object MultiComboBoxView extends ExampleView("Multi Combo Box") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          MultiComboBox(
            _.placeholder := "Type your value",
          )()
        }
      )
    )
  }

}
