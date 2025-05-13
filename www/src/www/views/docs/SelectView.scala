package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object SelectView extends ExampleView("Select") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Select()(
            UOption(_.icon := IconName.laptop)("Desktop"),
            UOption(_.icon := IconName.ipad, _.selected := true)("Tablet"),
            UOption(_.icon := IconName.phone)("Phone")
          )
        }
      ),
      Demo(
        title = "States",
        content = Source.annotate {
          div(
            Select(
              _.valueState := "Positive"
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Information"
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Critical"
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Negative"
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState        := "Negative",
              _.valueStateMessage := div("Please provide valid value")
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.readonly := true
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.disabled := true
            )(
              UOption(_.icon := IconName.meal, _.selected := true)("Apple"),
              UOption(_.icon := IconName.meal)("Avocado"),
              UOption(_.icon := IconName.phone)("Mango")
            )
          )
        }
      ),
      Demo(
        title = "Options with additional text",
        content = Source.annotate {
          Select()(
            UOption(_.additionalText := "AT")("Austria"),
            UOption(_.additionalText := "BE")("Belgium"),
            UOption(_.additionalText := "BR")("Brazil"),
            UOption(_.additionalText := "BG")("Bulgaria"),
            UOption(_.additionalText := "CA")("Canada")
          )
        }
      ),
      Demo(
        title = "Custom Options",
        content = Source.annotate {
          Select()(
            OptionCustom(
              _.displayText := "AR"
            )(
              div(
                tw.flex.justify_between.items_center.w_full,
                Icon(_.name := IconName.soccer)(),
                "Argentina",
                Icon(_.name := IconName.employee)()
              )
            ),
            OptionCustom(
              _.displayText := "BE"
            )(
              div(
                tw.flex.justify_between.items_center.w_full,
                Icon(_.name := IconName.soccer)(),
                "Belgium",
                Icon(_.name := IconName.employee)()
              )
            ),
            OptionCustom(
              _.displayText := "BR"
            )(
              div(
                tw.flex.justify_between.items_center.w_full,
                Icon(_.name := IconName.soccer)(),
                "Brazil",
                Icon(_.name := IconName.employee)()
              )
            )
          )
        }
      )
    )
  }

}
