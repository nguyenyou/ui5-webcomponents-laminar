package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.macros.Source

object MultiComboBoxView extends ExampleView("Multi Combo Box") {
  override def component: HtmlElement = {
    div(
      compactSize(true),
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
      ),
      Demo(
        title = "Clear Icon",
        content = Source.annotate {
          MultiComboBox(
            _.value         := "Italy",
            _.noValidation  := true,
            _.showClearIcon := true
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
      ),
      Demo(
        title = "Custom values",
        description =
          "By default, typing of non-existing items is permitted. Use **noValidation** to allow typing values that are not present as items.",
        content = Source.annotate {
          MultiComboBox(
            _.placeholder := "Enter product"
          )(
            MultiComboBoxItem(
              _.text := "Wireless DSL/ Repeater and Print Server Lorem ipsum dolar st amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor incidunt ut labore et dolore magna aliquyam erat, diam nonumy eirmod tempor individunt ut labore et dolore magna aliquyam erat, sed justo et ea rebum."
            )(),
            MultiComboBoxItem(
              _.text := "Widescreen Portable DVD Player w MP3, consetetur sadipscing, sed diam nonumy eirmod tempor invidunt ut labore et dolore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergen, no sea takimata. Tortor pretium viverra suspendisse potenti nullam. Congue quisque egestas diam in arcu cursus.Rutrum tellus pellentesque eu tincidunt tortor. Nec tincidunt praesent semper feugiat nibh sed"
            )(),
            MultiComboBoxItem(
              _.text := "Portable DVD Player with 9 inches LCD Monitor"
            )()
          )
        }
      ),
      Demo(
        title = "Select All Items",
        description =
          """When **showSelectAll** is enabled, "Select All" checkbox is displayed to allow users select all item at once.""",
        content = Source.annotate {
          MultiComboBox(
            _.placeholder   := "Type your value",
            _.showSelectAll := true
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
      ),
      Demo(
        title = "Items Grouping",
        content = Source.annotate {
          MultiComboBox(
            _.placeholder   := "Type your value",
            _.showSelectAll := true
          )(
            MultiComboBoxItemGroup(
              _.headerText := "Asia"
            )(
              MultiComboBoxItem(
                _.text := "Afghanistan"
              )(),
              MultiComboBoxItem(
                _.text     := "China",
                _.selected := true
              )(),
              MultiComboBoxItem(
                _.text := "India"
              )(),
              MultiComboBoxItem(
                _.text := "Indonesia"
              )()
            ),
            MultiComboBoxItemGroup(
              _.headerText := "Europe"
            )(
              MultiComboBoxItem(
                _.text := "Austria"
              )(),
              MultiComboBoxItem(
                _.text     := "Bulgaria",
                _.selected := true
              )(),
              MultiComboBoxItem(
                _.text := "Germany"
              )(),
              MultiComboBoxItem(
                _.text := "Italy"
              )()
            ),
            MultiComboBoxItemGroup(
              _.headerText := "North America"
            )(
              MultiComboBoxItem(
                _.text := "Canada"
              )(),
              MultiComboBoxItem(
                _.text     := "Mexico",
                _.selected := true
              )(),
              MultiComboBoxItem(
                _.text := "Haiti"
              )(),
              MultiComboBoxItem(
                _.text := "United States"
              )()
            )
          )
        }
      ),
      Demo(
        title = "Items Text Wrapping",
        description =
          """The sample demonstrates how the text of the items wrap when too long. **Note**: their representation in the input field (known as token) will truncate.""".stripMargin,
        content = Source.annotate {
          MultiComboBox(
            _.placeholder := "Enter product"
          )(
            MultiComboBoxItem(
              _.text := "Wireless DSL/ Repeater and Print Server Lorem ipsum dolar st amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor incidunt ut labore et dolore magna aliquyam erat, diam nonumy eirmod tempor individunt ut labore et dolore magna aliquyam erat, sed justo et ea rebum."
            )(),
            MultiComboBoxItem(
              _.text := "Widescreen Portable DVD Player w MP3, consetetur sadipscing, sed diam nonumy eirmod tempor invidunt ut labore et dolore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergen, no sea takimata. Tortor pretium viverra suspendisse potenti nullam. Congue quisque egestas diam in arcu cursus.Rutrum tellus pellentesque eu tincidunt tortor. Nec tincidunt praesent semper feugiat nibh sed"
            )(),
            MultiComboBoxItem(
              _.text := "Portable DVD Player with 9 inches LCD Monitor"
            )()
          )
        }
      )
    )
  }

}
