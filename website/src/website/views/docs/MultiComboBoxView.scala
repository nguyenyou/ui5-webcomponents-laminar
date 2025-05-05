package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object MultiComboBoxView extends ExampleView("Multi Combo Box") {
  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          MultiComboBox(
            _.placeholder := "Type your value"
          )(
            MultiComboBoxItem(
              _.text := "Albania"
            )(),
            MultiComboBoxItem(
              _.text     := "Argentina",
              _.selected := true
            )(),
            MultiComboBoxItem(
              _.text := "Bulgaria"
            )(),
            MultiComboBoxItem(
              _.text := "Denmark"
            )(),
            MultiComboBoxItem(
              _.text := "England"
            )(),
            MultiComboBoxItem(
              _.text := "Germany"
            )(),
            MultiComboBoxItem(
              _.text := "Philippines"
            )(),
            MultiComboBoxItem(
              _.text := "Portugal"
            )(),
            MultiComboBoxItem(
              _.text := "The United Kingdom of Great Britain and Northern Ireland"
            )()
          )
        }
      )
    )
  }

}
