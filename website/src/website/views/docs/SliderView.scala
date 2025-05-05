package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object SliderView extends ExampleView("Slider") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val selectedValueVar = Var(0.0)

          Slider(
            _.value <-- selectedValueVar.signal,
            _.onInput.map(_.target.value) --> selectedValueVar
          )()
        }
      ),
      Demo(
        title = "Show Tickmarks",
        content = Source.annotate {
          div(
            Slider(
              _.value         := 20,
              _.min           := 0,
              _.max           := 100,
              _.step          := 5,
              _.showTickmarks := true
            )(),
            Slider(
              _.value         := 20,
              _.min           := 0,
              _.max           := 100,
              _.step          := 5,
              _.labelInterval := 2,
              _.showTickmarks := true
            )()
          )
        }
      ),
      Demo(
        title = "Show Tickmarks",
        content = Source.annotate {
          div(
            Slider(
              _.value       := 20,
              _.min         := 0,
              _.max         := 100,
              _.step        := 5,
              _.showTooltip := true
            )()
          )
        }
      )
    )
  }

}
