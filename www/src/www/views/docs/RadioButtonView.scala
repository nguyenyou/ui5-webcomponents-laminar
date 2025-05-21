package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object RadioButtonView extends ExampleView("Radio Button") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
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
      ),
      Demo(
        title = "States",
        description = "The RadioButton supports several semantic value states, readonly, disabled, etc.",
        content = Source.annotate {
          div(
            RadioButton(
              _.name    := "myGroup",
              _.text    := "Option A",
              _.checked := true
            )(),
            RadioButton(
              _.name       := "myGroup",
              _.text       := "Option B",
              _.valueState := "None"
            )(),
            RadioButton(
              _.name       := "myGroup",
              _.text       := "Option C",
              _.valueState := "Critical"
            )(),
            RadioButton(
              _.name       := "myGroup",
              _.text       := "Option C",
              _.valueState := "Negative"
            )(),
            RadioButton(
              _.name       := "myGroup",
              _.text       := "Option C",
              _.valueState := "Positive"
            )(),
            RadioButton(
              _.name       := "myGroup",
              _.text       := "Option C",
              _.valueState := "Information"
            )(),
            RadioButton(
              _.name     := "myGroup",
              _.text     := "Option C",
              _.disabled := true
            )(),
            RadioButton(
              _.name     := "myGroup",
              _.text     := "Option C",
              _.readonly := true
            )()
          )
        }
      ),
      Demo(
        title = "Text Truncation and Wrapping",
        description = """The RadioButton text wraps by default. To make it truncate - set **wrapping-type="None"**.""",
        content = Source.annotate {
          div(
            tw.flex.flex_col.gap_2,
            RadioButton(
              _.wrappingType := "None",
              _.text         := "Truncating text when 'wrapping-type=None' set and long text",
              _.name         := "wrapping"
            )(
              width.px(200)
            ),
            RadioButton(
              _.text := "Wrapping text when 'wrapping-type=Normal' set with long text",
              _.name := "wrapping"
            )(
              width.px(200)
            )
          )
        }
      )
    )
  }

}
