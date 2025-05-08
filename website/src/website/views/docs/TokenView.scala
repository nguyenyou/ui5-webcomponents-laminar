package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object TokenView extends ExampleView("Token") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Variants(
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
