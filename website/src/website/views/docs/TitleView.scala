package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object TitleView extends ExampleView("Title") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            Title(
              _.level := "H1",
              _.size  := "H1"
            )("Title Level 1"),
            Title(
              _.level := "H2",
              _.size  := "H2"
            )("Title Level 2"),
            Title(
              _.level := "H3",
              _.size  := "H3"
            )("Title Level 3"),
            Title(
              _.level := "H4",
              _.size  := "H4"
            )("Title Level 4"),
            Title(
              _.level := "H5",
              _.size  := "H5"
            )("Title Level 5"),
            Title(
              _.level := "H6",
              _.size  := "H6"
            )("Title Level 6")
          )
        }
      )
    )
  }

}
