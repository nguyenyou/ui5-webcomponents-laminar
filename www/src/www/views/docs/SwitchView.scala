package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object SwitchView extends ExampleView("Switch") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
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
      ),
      Demo(
        title = "Controlled",
        content = Source.annotate {
          val checkedVar    = Var(false)
          val checkedSignal = checkedVar.signal.distinct
          div(
            Switch(
              _.checked <-- checkedSignal,
              _.onChange.mapToChecked --> checkedVar
            )(),
            p(
              "Checked: ",
              text <-- checkedSignal.map(if (_) "Yes" else "No")
            )
          )
        }
      )
    )
  }

}
