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
            Opt(_.icon := IconName.laptop)("Desktop"),
            Opt(_.icon := IconName.ipad, _.selected := true)("Tablet"),
            Opt(_.icon := IconName.phone)("Phone")
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
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Information"
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Critical"
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState := "Negative"
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.valueState        := "Negative",
              _.valueStateMessage := div("Please provide valid value")
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.readonly := true
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            ),
            Select(
              _.disabled := true
            )(
              Opt(_.icon := IconName.meal, _.selected := true)("Apple"),
              Opt(_.icon := IconName.meal)("Avocado"),
              Opt(_.icon := IconName.phone)("Mango")
            )
          )
        }
      ),
      Demo(
        title = "Options with additional text",
        content = Source.annotate {
          Select()(
            Opt(_.additionalText := "AT")("Austria"),
            Opt(_.additionalText := "BE")("Belgium"),
            Opt(_.additionalText := "BR")("Brazil"),
            Opt(_.additionalText := "BG")("Bulgaria"),
            Opt(_.additionalText := "CA")("Canada")
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
