package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.IconName
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object ListView extends ExampleView("List") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Lis()(
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
        title = "Grouping",
        content = Source.annotate {
          div(
            Lis(_.selectionMode := "Multiple")(
              ListItemGroup(_.headerText := "Front End Developers")(
                ListItemStandard(
                  _.icon    := IconName.navigationRightArrow,
                  _.iconEnd := true,
                  _.image := Avatar(
                    _.shape := "Square"
                  )(
                    img(
                      src := Images.womanAvatar3
                    )
                  )
                )("Jennifer"),
                ListItemStandard(
                  _.icon    := IconName.navigationRightArrow,
                  _.iconEnd := true,
                  _.image := Avatar(
                    _.shape := "Square"
                  )(
                    img(
                      src := Images.womanAvatar4
                    )
                  )
                )("Lora")
              )
            )
          )
        }
      ),
      Demo(
        title = "Separators",
        content = Source.annotate {
          div(
            Lis(_.separators := "None")(
              ListItemStandard(_.icon := IconName.product)("Item #1"),
              ListItemStandard(_.icon := IconName.product)("Item #2"),
              ListItemStandard(_.icon := IconName.product)("Item #3")
            ),
            br(),
            br(),
            Lis(_.separators := "Inner")(
              ListItemStandard(_.icon := IconName.shippingStatus)("Item #1"),
              ListItemStandard(_.icon := IconName.shippingStatus)("Item #2"),
              ListItemStandard(_.icon := IconName.shippingStatus)("Item #3")
            )
          )
        }
      ),
      Demo(
        title = "Selection Modes",
        content = Source.annotate {
          div(
            Lis(
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
            Lis(
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
            Lis(
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
            Lis(
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
            Lis(
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
      ),
      Demo(
        title = "Multiple Developer Groups",
        content = Source.annotate {
          Lis(_.selectionMode := "Multiple")(
            ListItemGroup(_.headerText := "Front End Developers")(
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_3.png",
                    alt := "Woman image"
                  )
                )
              )("Jennifer"),
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_4.png",
                    alt := "Woman image"
                  )
                )
              )("Lora"),
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_5.png",
                    alt := "Woman image"
                  )
                )
              )("Carlotta")
            ),
            ListItemGroup(_.headerText := "Back End Developers")(
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/man_avatar_1.png",
                    alt := "Woman image"
                  )
                )
              )("Clark"),
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_1.png",
                    alt := "Woman image"
                  )
                )
              )("Ellen"),
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/man_avatar_2.png",
                    alt := "Woman image"
                  )
                )
              )("Adam")
            ),
            ListItemGroup(
              _.header := div(
                tw.w_full.flex.space_between.items_center,
                span("Back End Developers"),
                Icon(
                  _.name := IconName.navigationRightArrow
                )()
              )
            )(
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/woman_avatar_1.png",
                    alt := "Woman image"
                  )
                )
              )("Ellen"),
              ListItemStandard(
                _.icon    := IconName.navigationRightArrow,
                _.iconEnd := true,
                _.image := Avatar(
                  _.shape := "Square"
                )(
                  img(
                    src := "https://sap.github.io/ui5-webcomponents/images/avatars/man_avatar_2.png",
                    alt := "Woman image"
                  )
                )
              )("Adam")
            )
          )
        }
      ),
      Demo(
        title = "Wrapping Behavior",
        content = Source.annotate {
          div(
            Lis(
              _.headerText := "List Item Wrapping Examples"
            )(
              // Default Behavior (Truncating)
              ListItemStandard(
                _.text := "Long list item title that gets truncated when it exceeds the width of the container. This allows users to see the beginning of the text and understand what the item is about. Long list item title that gets truncated when it exceeds the width of the container. This allows users to see the beginning of the text and understand what the item is about.",
                _.description := "This description is truncated by default and shows an ellipsis at the end when the text is too long to fit in a single line. This description is truncated by default and shows an ellipsis at the end when the text is too long to fit in a single line.",
                _.additionalText := "Truncated",
                _.image := Avatar()(
                  img(
                    src := Images.manAvatar1
                  )
                )
              )(),
              // Wrapped Behavior
              ListItemStandard(
                _.wrappingType := "Normal",
                _.text := "Long list item title that gets wrapped when it exceeds the width of the container. This allows users to read the full title without requiring interaction. Long list item title that gets wrapped when it exceeds the width of the container. This allows users to read the full title without requiring interaction. Long list item title that gets wrapped when it exceeds the width of the container. This allows users to read the full title without requiring interaction.",
                _.description := "This description gets wrapped when the 'wrappingType' property is set to 'Normal', and the content flows to multiple lines instead of being truncated. This allows users to read lengthy descriptions without requiring interaction. This description gets wrapped when the 'wrappingType' property is set to 'Normal', and the content flows to multiple lines instead of being truncated. This allows users to read lengthy descriptions without requiring interaction.",
                _.additionalText := "Wrapped",
                _.image := Avatar()(
                  img(
                    src := Images.manAvatar2
                  )
                )
              )()
            )
          )
        }
      )
    )
  }

}
