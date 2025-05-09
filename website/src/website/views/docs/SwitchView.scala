package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.libs.scalawind.*
import website.macros.Source

object SwitchView extends ExampleView("Switch") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            tw.flex.flex_wrap.gap_2,
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
          div(
            tw.flex.flex_wrap.gap_2,
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
