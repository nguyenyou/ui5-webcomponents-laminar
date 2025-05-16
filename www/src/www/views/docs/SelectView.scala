package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.*
import www.components.Codeblock
import www.libs.scalawind.*
import www.macros.Source

object SelectView extends ExampleView("Select") {

  val recipeSelectedItemContent = Source.annotate {
    type Item = (id: String, text: String)
    val items = List[Item](
      ("1", "Option 1"),
      ("2", "Option 2")
    )
    Select(
      _.onChange.map { event =>
        // event.detail.selectedOption is a reference to the selected HTML Element
        // dataset contains all attributes that were passed with the data- prefix.
        event.detail.selectedOption.dataset.get("id").foreach { id =>
          println(s"Selected item ID: $id")
        }
      } --> Observer.empty
    )(
      items.map { item =>
        UOption()(
          dataAttr("id") := item.id,
          item.text
        )
      }
    )
  }

  override def component: HtmlElement = {
    div(
      compactSize(true),
      h2(
        tw.font_semibold.text_xl,
        "Samples"
      ),
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
      ),
      h2(
        tw.font_semibold.text_xl,
        "Recipes"
      ),
      h3(
        tw.font_semibold.text_lg,
        "Get the ID of the selected item with onChange"
      ),
      Markdown("""
      With the help of the HTML5 `data-` API you can define any primitive value (like numbers, strings) 
      as an attribute on an element. This data will be available on the onChange event as 
      part of the `dataset` object of the `selectedOption`:
      """),
      Codeblock(recipeSelectedItemContent.source).amend(tw.mb_2),
      Demo(
        content = recipeSelectedItemContent
      )
    )
  }

}
