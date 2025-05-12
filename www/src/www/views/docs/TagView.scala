package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object TagView extends ExampleView("Tag") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Tag(
            _.design      := "Set1",
            _.colorScheme := "6"
          )(
            "Tag Text"
          )
        }
      ),
      Demo(
        title = "Designs",
        content = Source.annotate {
          div(
            tw.flex.flex_col.items_start.gap_4,
            Tag(
              _.design       := "Neutral",
              _.wrappingType := "None"
            )(
              "Neutral"
            ),
            Tag(
              _.design       := "Information",
              _.wrappingType := "None"
            )(
              "Information"
            ),
            Tag(
              _.design       := "Positive",
              _.wrappingType := "None"
            )(
              "Positive"
            ),
            Tag(
              _.design       := "Negative",
              _.wrappingType := "None"
            )(
              "Negative"
            ),
            Tag(
              _.design       := "Critical",
              _.wrappingType := "None"
            )(
              "Critical"
            ),
            Tag(
              _.design       := "Set1",
              _.wrappingType := "None"
            )(
              "Set1"
            ),
            Tag(
              _.design       := "Set2",
              _.wrappingType := "None"
            )(
              "Set2"
            )
          )
        }
      ),
      Demo(
        title = "Interactive Tag",
        content = Source.annotate {
          Tag(
            _.design       := "Positive",
            _.interactive  := true,
            _.wrappingType := "None"
          )(
            "Success"
          )
        }
      ),
      Demo(
        title = "Text Wrapping",
        content = Source.annotate {
          div(
            tw.flex.flex_col.gap_4,
            Tag(
              _.wrappingType := "None"
            )(
              width.px(200),
              "This would truncate as it is too long"
            ),
            Tag()(
              width.px(200),
              "This would wrap as it is too long"
            )
          )
        }
      ),
      Demo(
        title = "Color Scheme Set 1",
        content = Source.annotate {
          div(
            tw.flex.flex_col.items_start.gap_4,
            Tag(
              _.design      := "Set1",
              _.colorScheme := "1"
            )(
              "Color Scheme 1"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "2"
            )(
              "Color Scheme 2"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "3"
            )(
              "Color Scheme 3"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "4"
            )(
              "Color Scheme 4"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "5"
            )(
              "Color Scheme 5"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "6"
            )(
              "Color Scheme 6"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "7"
            )(
              "Color Scheme 7"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "8"
            )(
              "Color Scheme 8"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "9"
            )(
              "Color Scheme 9"
            ),
            Tag(
              _.design      := "Set1",
              _.colorScheme := "10"
            )(
              "Color Scheme 10"
            )
          )
        }
      ),
      Demo(
        title = "Color Scheme Set 2",
        content = Source.annotate {
          div(
            tw.flex.flex_col.items_start.gap_4,
            Tag(
              _.design      := "Set2",
              _.colorScheme := "1"
            )(
              "Color Scheme 1"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "2"
            )(
              "Color Scheme 2"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "3"
            )(
              "Color Scheme 3"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "4"
            )(
              "Color Scheme 4"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "5"
            )(
              "Color Scheme 5"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "6"
            )(
              "Color Scheme 6"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "7"
            )(
              "Color Scheme 7"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "8"
            )(
              "Color Scheme 8"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "9"
            )(
              "Color Scheme 9"
            ),
            Tag(
              _.design      := "Set2",
              _.colorScheme := "10"
            )(
              "Color Scheme 10"
            )
          )
        }
      ),
      Demo(
        title = "Size",
        content = Source.annotate {
          div(
            tw.flex.items_start.gap_4,
            Tag(
              _.design        := "Neutral",
              _.hideStateIcon := true,
              _.size          := "L",
              _.wrappingType  := "None"
            )(
              "Planned"
            ),
            Tag(
              _.design       := "Negative",
              _.size         := "L",
              _.wrappingType := "None"
            )()
          )
        }
      )
    )
  }

}
