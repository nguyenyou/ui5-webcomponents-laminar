package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object LinkView extends ExampleView("Link") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            cls("flex gap-2"),
            Link(
              _.href   := "#",
              _.target := "_blank"
            )("Standard Link"),
            Link(
              _.href     := "#",
              _.target   := "_blank",
              _.disabled := true
            )("Disabled Link")
          )
        }
      )
    )
  }

}
