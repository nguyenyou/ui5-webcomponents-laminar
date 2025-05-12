package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

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
      ),
      Demo(
        title = "Busy component",
        description = "The BusyIndicator can be placed over another web component.",
        content = Source.annotate {
          val busyVar  = Var(false)
          val itemsVar = Var(List.empty[String])

          div(
            tw.flex.flex_col.gap_4,
            Button(
              _.onClick --> Observer { _ =>
                busyVar.set(true)
                org.scalajs.dom.window.setTimeout(
                  () => {
                    itemsVar.update { _ ++ List("UI5", "Web", "Components") }
                    busyVar.set(false)
                  },
                  3000
                )
              }
            )("Fetch List Data"),
            BusyIndicator(
              _.active <-- busyVar.signal.distinct
            )(
              Lis(
                _.noDataText := "No Data",
                _.headerText := "Available Items"
              )(
                children <-- itemsVar.signal.map(items =>
                  items.map(item =>
                    ListItemStandard(
                      _.text := item
                    )()
                  )
                )
              )
            )
          )
        }
      )
    )
  }

}
