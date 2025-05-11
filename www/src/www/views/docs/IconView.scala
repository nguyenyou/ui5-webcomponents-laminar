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
      ),
      Demo(
        title = "Design",
        content = Source.annotate {
          div(
            Icon(
              _.name   := IconName.da2,
              _.design := "Default"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Contrast"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Critical"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Negative"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Positive"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Information"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "Neutral"
            )(),
            Icon(
              _.name   := IconName.da2,
              _.design := "NonInteractive"
            )()
          )
        }
      ),
      Demo(
        title = "Custom Styling",
        content = Source.annotate {
          div(
            Icon(
              _.name := IconName.home
            )(
              width.rem(2),
              height.rem(2),
              color("blueviolet")
            ),
            Icon(
              _.name := IconName.ai
            )(
              width.rem(2),
              height.rem(2),
              color("orangered")
            ),
            Icon(
              _.name := IconName.da2
            )(
              width.rem(2),
              height.rem(2),
              color("orange")
            ),
            Icon(
              _.name := IconName.heart
            )(
              width.rem(2),
              height.rem(2),
              color("red")
            ),
            Icon(
              _.name := IconName.activities
            )(
              width.rem(2),
              height.rem(2),
              color("olivedrab")
            )
          )
        }
      )
    )
  }

}
