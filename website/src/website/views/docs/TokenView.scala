package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object TokenView extends ExampleView("Token") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
            Token(
              _.text := "green"
            )(),
            Token(
              _.text     := "healthy",
              _.selected := true
            )(),
            Token(
              _.text := "vegan"
            )(),
            Token(
              _.text     := "low fat",
              _.selected := true
            )()
          )
        }
      )
    )
  }

}
