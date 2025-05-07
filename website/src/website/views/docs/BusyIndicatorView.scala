package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.libs.scalawind.*
import website.macros.Source

object BusyIndicatorView extends ExampleView("Busy Indicator") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          BusyIndicator(
            _.active := true
          )()
        }
      ),
      Demo(
        title = "Sizes",
        content = Source.annotate {
          div(
            tw.space_x_4,
            BusyIndicator(
              _.active := true,
              _.size   := "S"
            )(),
            BusyIndicator(
              _.active := true,
              _.size   := "M"
            )(),
            BusyIndicator(
              _.active := true,
              _.size   := "L"
            )()
          )
        }
      ),
      Demo(
        title = "Text Placement with display text",
        content = Source.annotate {
          div(
            tw.space_x_4,
            BusyIndicator(
              _.active := true,
              _.text   := "Loading data from backend server.."
            )(
              div(tw.w_("200px").h_("200px"))
            ),
            BusyIndicator(
              _.active        := true,
              _.text          := "Loading data from backend server..",
              _.textPlacement := "Top"
            )(
              div(tw.w_("200px").h_("200px"))
            )
          )
        }
      )
    )
  }

}
