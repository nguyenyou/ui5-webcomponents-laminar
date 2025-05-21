package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object SegmentedButtonView extends ExampleView("Segmented Button") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            tw.flex.flex_col.gap_4.items_start,
            SegmentedButton(
              _.accessibleName := "Font style"
            )(
              SegmentedButtonItem(
                _.tooltip  := "Bold",
                _.icon     := IconName.boldText,
                _.selected := true
              )(),
              SegmentedButtonItem(
                _.tooltip := "Italic",
                _.icon    := IconName.italicText
              )(),
              SegmentedButtonItem(
                _.tooltip := "Underline",
                _.icon    := IconName.underlineText
              )()
            ),
            SegmentedButton(
              _.accessibleName := "Map type"
            )(
              SegmentedButtonItem(
              )("Map"),
              SegmentedButtonItem(
                _.selected := true
              )("Satellite"),
              SegmentedButtonItem(
              )("Terrain")
            )
          )
        }
      ),
      Demo(
        title = "Selection Modes",
        description = "You can define if single or multiple buttons can be pressed.",
        content = Source.annotate {
          div(
            tw.flex.flex_col.gap_4.items_start,
            SegmentedButton(
              _.accessibleName := "Font style",
              _.selectionMode  := "Single"
            )(
              SegmentedButtonItem(
                _.tooltip  := "Bold",
                _.icon     := IconName.boldText,
                _.selected := true
              )(),
              SegmentedButtonItem(
                _.tooltip := "Italic",
                _.icon    := IconName.italicText
              )(),
              SegmentedButtonItem(
                _.tooltip := "Underline",
                _.icon    := IconName.underlineText
              )()
            ),
            SegmentedButton(
              _.accessibleName := "Map type",
              _.selectionMode  := "Multiple"
            )(
              SegmentedButtonItem(
              )("Map"),
              SegmentedButtonItem(
                _.selected := true
              )("Satellite"),
              SegmentedButtonItem(
              )("Terrain")
            )
          )
        }
      )
    )
  }

}
