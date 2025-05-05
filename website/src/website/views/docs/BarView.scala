package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object BarView extends ExampleView("Bar") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Bar(
            _.startContent := Button(
              _.icon    := IconName.home,
              _.tooltip := "Go home",
              _.design  := "Transparent"
            )(),
            _.endContent := Button(
              _.icon    := IconName.settings,
              _.tooltip := "Go to settings",
              _.design  := "Transparent"
            )()
          )(
            Label()(
              "Header title"
            )
          )
        }
      )
    )
  }
}
