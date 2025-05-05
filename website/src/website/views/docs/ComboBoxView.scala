package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object ComboBoxView extends ExampleView("ComboBox") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic ComboBox",
        content = Source.annotate {
          ComboBox(
            _.placeholder := "Select a country"
          )(
            ComboBoxItem(
              _.text := "Argentina"
            )(),
            ComboBoxItem(
              _.text := "Brazil"
            )(),
            ComboBoxItem(
              _.text := "Canada"
            )(),
            ComboBoxItem(
              _.text := "France"
            )(),
            ComboBoxItem(
              _.text := "Germany"
            )(),
            ComboBoxItem(
              _.text := "India"
            )(),
            ComboBoxItem(
              _.text := "Japan"
            )()
          )
        }
      ),
      Demo(
        title = "Clear Icon",
        content = Source.annotate {
          ComboBox(
            _.value         := "Denmark",
            _.showClearIcon := true
          )(
            ComboBoxItem(
              _.text := "Austria"
            )(),
            ComboBoxItem(
              _.text := "Bulgaria"
            )(),
            ComboBoxItem(
              _.text := "Germany"
            )(),
            ComboBoxItem(
              _.text := "Italy"
            )(),
            ComboBoxItem(
              _.text := "Spain"
            )()
          )
        }
      ),
      Demo(
        title = "Items with additional text",
        content = Source.annotate {
          ComboBox(
            _.placeholder := "Two-column layout"
          )(
            ComboBoxItem(
              _.text           := "Austria",
              _.additionalText := "AT"
            )(),
            ComboBoxItem(
              _.text           := "Belgium",
              _.additionalText := "BE"
            )(),
            ComboBoxItem(
              _.text           := "Brazil",
              _.additionalText := "BR"
            )(),
            ComboBoxItem(
              _.text           := "Bulgaria",
              _.additionalText := "BG"
            )(),
            ComboBoxItem(
              _.text           := "Canada",
              _.additionalText := "CA"
            )(),
            ComboBoxItem(
              _.text           := "The United Kingdom of Great Britain and Northern Ireland",
              _.additionalText := "UK"
            )()
          )
        }
      ),
      Demo(
        title = "Items Grouping",
        content = Source.annotate {
          ComboBox(
            _.placeholder := "Grouping of items"
          )(
            ComboBoxItemGroup(
              _.headerText := "A"
            )(
              ComboBoxItem(
                _.text := "Argentina"
              )(),
              ComboBoxItem(
                _.text := "Australia"
              )(),
              ComboBoxItem(
                _.text := "Austria"
              )()
            ),
            ComboBoxItemGroup(
              _.headerText := "B"
            )(
              ComboBoxItem(
                _.text := "Bahrain"
              )(),
              ComboBoxItem(
                _.text := "Belgium"
              )(),
              ComboBoxItem(
                _.text := "Brazil"
              )()
            ),
            ComboBoxItemGroup(
              _.headerText := "C"
            )(
              ComboBoxItem(
                _.text := "Canada"
              )(),
              ComboBoxItem(
                _.text := "Chile"
              )()
            )
          )
        }
      ),
      Demo(
        title = "Items Text Wrapping",
        content = Source.annotate {
          ComboBox(
            _.placeholder := "Enter product"
          )(
            ComboBoxItem(
              _.text := "Wireless DSL/ Repeater and Print Server Lorem ipsum dolar st amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor incidunt ut labore et dolore magna aliquyam erat, diam nonumy eirmod tempor individunt ut labore et dolore magna aliquyam erat, sed justo et ea rebum."
            )(),
            ComboBoxItem(
              _.text := "Widescreen Portable DVD Player w MP3, consetetur sadipscing, sed diam nonumy eirmod tempor invidunt ut labore et dolore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergen, no sea takimata. Tortor pretium viverra suspendisse potenti nullam. Congue quisque egestas diam in arcu cursus.Rutrum tellus pellentesque eu tincidunt tortor. Nec tincidunt praesent semper feugiat nibh sed"
            )(),
            ComboBoxItem(
              _.text := "Portable DVD Player with 9 inches LCD Monitor"
            )()
          )
        }
      ),
      Demo(
        title = "Filters",
        content = Source.annotate {
          ComboBox(
            _.placeholder := "Contains Filtering",
            _.filter      := "Contains"
          )(
            ComboBoxItem(
              _.text := "Afghanistan"
            )(),
            ComboBoxItem(
              _.text := "Albania"
            )(),
            ComboBoxItem(
              _.text := "Algeria"
            )(),
            ComboBoxItem(
              _.text := "Argentina"
            )(),
            ComboBoxItem(
              _.text := "Australia"
            )(),
            ComboBoxItem(
              _.text := "Austria"
            )()
          )
        }
      )
    )
  }
}
