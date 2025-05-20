package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.CustomIcons
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object IconView extends ExampleView("Icon") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            tw.space_x_2,
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
            tw.space_x_2,
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
            tw.space_x_2,
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
      ),
      Demo(
        title = "Interactive",
        content = Source.annotate {
          div(
            Icon(
              _.name := IconName.home,
              _.mode := "Interactive"
            )()
          )
        }
      ),
      Demo(
        title = "SAP Fiori Tools Icons",
        content = Source.annotate {
          div(
            tw.space_x_2,
            Icon(
              _.name := IconName.tntActor
            )(),
            Icon(
              _.name := IconName.tntAggregator
            )(),
            Icon(
              _.name := IconName.tntAssociation
            )(),
            Icon(
              _.name := IconName.tntNetwork
            )(),
            Icon(
              _.name := IconName.tntRepeater
            )()
          )
        }
      ),
      Demo(
        title = "SAP Business Suite Icons",
        content = Source.annotate {
          div(
            tw.space_x_2,
            Icon(
              _.name := IconName.bsAddPolygon
            )(),
            Icon(
              _.name := IconName.bs2x1GridLayout
            )(),
            Icon(
              _.name := IconName.bsActivate
            )(),
            Icon(
              _.name := IconName.bs3d
            )(),
            Icon(
              _.name := IconName.bs4x4GridLayout
            )()
          )
        }
      ),
      Demo(
        title = "Custom Icons",
        content = Source.annotate {
          div(
            tw.flex.gap_2.items_center,
            Button()(
              CustomIcons.icon    := "FileGeneric",
              CustomIcons.endIcon := "CaretDown",
              "Please choose an option"
            ),
            Button(
              _.design := "Emphasized"
            )(
              CustomIcons.icon := "Sign",
              "Sign"
            ),
            Button()(
              CustomIcons.icon := "Download"
            ),
            Button(
              _.design := "Negative"
            )(
              CustomIcons.icon := "Trash",
              "Delete"
            ),
            Icon()(
              CustomIcons.name := "Sign"
            )
          )
        }
      )
    )
  }

}
