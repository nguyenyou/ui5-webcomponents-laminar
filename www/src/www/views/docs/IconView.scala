package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object IconView extends ExampleView("Icon") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            Icon(
              _.name := IconName.home
            )(),
            Icon(
              _.name := IconName.ai
            )(),
            Icon(
              _.name := IconName.da2
            )(),
            Icon(
              _.name := IconName.heart
            )(),
            Icon(
              _.name := IconName.activities
            )()
          )
        }
      )
    )
  }

}
