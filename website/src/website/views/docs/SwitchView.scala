package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object SwitchView extends ExampleView("Switch") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Variants(
            Switch()(),
            Switch(
              _.checked := true
            )(),
            Switch(
              _.disabled := true
            )(),
            Switch(
              _.checked  := true,
              _.disabled := true
            )()
          )
        }
      ),
      Demo(
        title = "Design",
        content = Source.annotate {
          Variants(
            Switch(
              _.design := "Graphical"
            )(),
            Switch(
              _.design   := "Graphical",
              _.disabled := true
            )(),
            Switch(
              _.design  := "Textual",
              _.textOn  := "On",
              _.textOff := "Off"
            )(),
            Switch(
              _.design   := "Textual",
              _.textOn   := "On",
              _.textOff  := "Off",
              _.disabled := true
            )()
          )
        }
      )
    )
  }

}
