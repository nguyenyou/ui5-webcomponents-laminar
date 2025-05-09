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
      )
    )
  }

}
