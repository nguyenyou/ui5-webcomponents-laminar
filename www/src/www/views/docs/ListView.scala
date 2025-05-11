package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.IconName
import www.components.Demo
import www.macros.Source

object ListView extends ExampleView("List") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          List()(
            ListItemStandard(
              _.icon                := IconName.nutritionActivity,
              _.description         := "Tropical plant with an edible fruit",
              _.additionalText      := "In-stock",
              _.additionalTextState := "Positive"
            )(
              "Pineapple"
            ),
            ListItemStandard(
              _.icon                := IconName.nutritionActivity,
              _.description         := "Occurs between red and yellow",
              _.additionalText      := "Expires",
              _.additionalTextState := "Critical"
            )(
              "Orange"
            ),
            ListItemStandard(
              _.icon                := IconName.nutritionActivity,
              _.description         := "The yellow lengthy fruit",
              _.additionalText      := "Re-stock",
              _.additionalTextState := "Information"
            )(
              "Blueberry"
            ),
            ListItemStandard(
              _.icon                := IconName.nutritionActivity,
              _.description         := "The tropical stone fruit",
              _.additionalText      := "Re-stock",
              _.additionalTextState := "Negative"
            )(
              "Mango"
            )
          )
        }
      ),
      Demo(
        title = "Selection Modes",
        content = Source.annotate {
          div(
            List(
              _.selectionMode := "Single",
              _.headerText    := "Single Select Mode"
            )(
              ListItemStandard(
                _.icon     := IconName.map,
                _.iconEnd  := true,
                _.selected := true
              )(
                "Argentina"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "Bulgaria"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "China"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true,
                _.tpe     := "Inactive"
              )(
                "Denmark (ui5-li type='Inactive')"
              )
            ),
            br(),
            List(
              _.selectionMode := "SingleStart",
              _.headerText    := "Single Select Begin Mode"
            )(
              ListItemStandard(
                _.icon     := IconName.map,
                _.iconEnd  := true,
                _.selected := true
              )(
                "Argentina"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "Bulgaria"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "China"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true,
                _.tpe     := "Inactive"
              )(
                "Denmark (ui5-li type='Inactive')"
              )
            ),
            br(),
            List(
              _.selectionMode := "SingleEnd",
              _.headerText    := "Single Select End Mode"
            )(
              ListItemStandard(
                _.icon     := IconName.map,
                _.iconEnd  := true,
                _.selected := true
              )(
                "Argentina"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "Bulgaria"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true
              )(
                "China"
              ),
              ListItemStandard(
                _.icon    := IconName.map,
                _.iconEnd := true,
                _.tpe     := "Inactive"
              )(
                "Denmark (ui5-li type='Inactive')"
              )
            ),
            br(),
            List(
              _.selectionMode := "Multiple",
              _.headerText    := "Multi Select Mode"
            )(
              ListItemStandard()(
                "Pineapple"
              ),
              ListItemStandard(
                _.selected := true
              )(
                "Orange"
              ),
              ListItemStandard()(
                "Banana"
              ),
              ListItemStandard()(
                "Mango"
              )
            ),
            br(),
            List(
              _.selectionMode := "Delete",
              _.headerText    := "Delete Mode"
            )(
              ListItemStandard()(
                "Argentina"
              ),
              ListItemStandard()(
                "Bulgaria"
              ),
              ListItemStandard()(
                "China"
              )
            )
          )
        }
      )
    )
  }

}
