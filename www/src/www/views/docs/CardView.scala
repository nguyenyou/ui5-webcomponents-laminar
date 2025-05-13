package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object CardView extends ExampleView("Card") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Card(
            _.header := CardHeader(
              _.titleText      := "This header is interactive",
              _.subtitleText   := "Click, press Enter or Space",
              _.additionalText := "3 of 6",
              _.interactive    := true,
              _.avatar := Icon(
                _.name := IconName.group
              )()
            )()
          )(
            UList(
              _.separators := "None"
            )(
              ListItemStandard(
                _.description := "Software Architect",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := Images.manAvatar2
                  )
                )
              )(
                "Richard Wilson"
              ),
              ListItemStandard(
                _.description := "Visual Designer",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_3.png",
                    alt := "Woman image"
                  )
                )
              )(
                "Elena Petrova"
              ),
              ListItemStandard(
                _.description := "Quality Specialist",
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/man_avatar_3.png",
                    alt := "Man image"
                  )
                )
              )(
                "John Miller"
              )
            )
          )
        }
      ),
      Demo(
        title = "Table Card",
        content = Source.annotate {
          Card(
            _.header := CardHeader(
              _.titleText      := "New Purchase Orders",
              _.subtitleText   := "Today",
              _.additionalText := "3 of 15"
            )()
          )(
            Table(
              _.headerRow := TableHeaderRow()(
                TableHeaderCell()(
                  Label()("Sales Order")
                ),
                TableHeaderCell()(
                  Label()("Customer")
                ),
                TableHeaderCell()(
                  Label()("Net Amount")
                ),
                TableHeaderCell()(
                  Label()("Status")
                )
              )
            )(
              TableRow()(
                TableCell()(
                  Label()("5000010050")
                ),
                TableCell()(
                  Label()("Entertainment Argentina")
                ),
                TableCell()(
                  Label()("6k USD")
                ),
                TableCell()(
                  Text()(tw.text_green_500, "Approved")
                )
              ),
              TableRow()(
                TableCell()(
                  Label()("5000010051")
                ),
                TableCell()(
                  Label()("Brazil Technologies")
                ),
                TableCell()(
                  Label()("2k USD")
                ),
                TableCell()(
                  Text()(tw.text_red_500, "Rejected")
                )
              )
            )
          )
        }
      ),
      Demo(
        title = "Timeline Card",
        content = Source.annotate {
          Card(
            _.header := CardHeader(
              _.titleText    := "Upcoming Activities",
              _.subtitleText := "Today"
            )()
          )(
            Timeline()(
              TimelineItem(
                _.titleText     := "called",
                _.icon          := IconName.phone,
                _.name          := "John Smith",
                _.nameClickable := true
              )(),
              TimelineItem(
                _.titleText := "Weekly Sync - BTP Design",
                _.icon      := IconName.calendar
              )(
                "MR SOF02 2.43"
              ),
              TimelineItem(
                _.titleText := "Video Conference Call - UI5",
                _.icon      := IconName.calendar
              )(
                "Online meeting"
              )
            )
          )
        }
      ),
      Demo(
        title = "Object Card",
        content = Source.annotate {
          Card(
            _.header := CardHeader(
              _.titleText    := "Donna Maria Moore",
              _.subtitleText := "Senior Sales Executive",
              _.avatar := img(
                src := Images.manAvatar1
              )
            )()
          )(
            div(
              tw.space_y_4.p_4,
              Title(
                _.level := "H5"
              )("Contact details"),
              div(
                Label(
                  _.showColon := true
                )("Company Name"),
                Text()("Company A")
              ),
              div(
                Label(
                  _.showColon := true
                )("Address"),
                Text()("481 West Street, Anytown 45066, USA")
              ),
              div(
                Label(
                  _.showColon := true
                )("Website"),
                Link(
                  _.target := "_blank"
                )("www.company_a.example.com")
              )
            )
          )
        }
      )
    )
  }

}
