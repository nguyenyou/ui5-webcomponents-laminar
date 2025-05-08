package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object MultiInputView extends ExampleView("Multi Input") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          MultiInput(
            _.tokens := Token(
              _.text := "Argentina"
            )(),
            _.tokens := Token(
              _.text := "Mexico"
            )(),
            _.tokens := Token(
              _.text := "Philippines"
            )(),
            _.tokens := Token(
              _.text := "Sweden"
            )(),
            _.tokens := Token(
              _.text := "USA"
            )()
          )()
        }
      )
    )
  }

}
