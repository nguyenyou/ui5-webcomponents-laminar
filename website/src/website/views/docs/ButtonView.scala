package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.libs.scalawind.*
import website.macros.Source

object ButtonView extends ExampleView("Button") {
  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          Variants(
            Button(
            )("Press"),
            Button(
              _.icon := IconName.edit
            )("Edit"),
            Button(
              _.disabled := true
            )("Merge")
          )
        }
      ),
      Demo(
        title = "Design",
        content = Source.annotate {
          Variants(
            Button(
              _.design := "Default"
            )("Default"),
            Button(
              _.design := "Positive"
            )("Positive"),
            Button(
              _.design := "Negative"
            )("Negative"),
            Button(
              _.design := "Transparent"
            )("Transparent"),
            Button(
              _.design := "Emphasized"
            )("Emphasized"),
            Button(
              _.design := "Attention"
            )("Attention")
          )
        }
      ),
      Demo(
        title = "Icon Only",
        content = Source.annotate {
          Variants(
            Button(
              _.icon    := IconName.edit,
              _.design  := "Default",
              _.tooltip := "Edit Button"
            )(),
            Button(
              _.icon    := IconName.account,
              _.design  := "Transparent",
              _.tooltip := "Account Button"
            )()
          )
        }
      ),
      Demo(
        title = "Text and Icon",
        content = Source.annotate {
          Variants(
            Button(
              _.icon := IconName.edit
            )("Edit"),
            Button(
              _.icon := IconName.account
            )("Account")
          )
        }
      ),
      Demo(
        title = "Icon at the End",
        content = Source.annotate {
          Variants(
            Button(
              _.endIcon := IconName.navigationDownArrow
            )("Button with Icon at the end"),
            Button(
              _.icon    := IconName.home,
              _.endIcon := IconName.navigationDownArrow
            )("Button with two Icons")
          )
        }
      ),
      Demo(
        title = "Custom Styling",
        content = Source.annotate {
          div(
            styleTag(
              """
                |.custom-button[ui5-button] {
                |  width: 10rem;
                |  color: DarkSlateBlue;
                |  background-color: #f4f2fd;
                |  border-color: DarkSlateBlue;
                |}
                |.custom-button[ui5-button]:active,
                |.custom-button[ui5-button]:hover {
                |  background-color: #dad4f7;
                |}
              """.stripMargin
            ),
            Button()(
              cls("custom-button"),
              "Custom Button"
            )
          )
        }
      ),
      Demo(
        title = "Menu Button",
        content = Source.annotate {
          val menuIsOpenVar = Var(false)
          val menuOpenerId  = "btnOpenBasic"
          div(
            Button(
              _.id      := menuOpenerId,
              _.icon    := IconName.actionSettings,
              _.endIcon := IconName.navigationDownArrow,
              _.onClick.mapTo(true) --> menuIsOpenVar.writer
            )("Menu"),
            Menu(
              _.open <-- menuIsOpenVar.signal,
              _.onClose.mapTo(false) --> menuIsOpenVar.writer,
              _.headerText := "Basic Menu with Items",
              _.id         := "menuBasic",
              _.openerId   := menuOpenerId
            )(
              MenuItem(
                _.text := "New File",
                _.icon := IconName.addDocument
              )(),
              MenuItem(
                _.text     := "New Folder",
                _.icon     := IconName.addFolder,
                _.disabled := true
              )(),
              MenuSeparator()(),
              MenuItem(
                _.text := "Open",
                _.icon := IconName.openFolder
              )(),
              MenuItem(
                _.text := "Close"
              )(),
              MenuSeparator()(),
              MenuItem(
                _.text := "Preferences",
                _.icon := IconName.actionSettings
              )(),
              MenuItem(
                _.text := "Exit",
                _.icon := IconName.journeyArrive
              )()
            )
          )
        }
      ),
      Demo(
        title = "Button with badge",
        content = Source.annotate {
          div(
            div(
              Label()("Cozy"),
              div(
                tw.space_x_2,
                Button(
                  _.design := "Emphasized",
                  _.icon   := IconName.employee,
                  _.badge := ButtonBadge(
                    _.design := "OverlayText",
                    _.text   := "999+"
                  )()
                )(
                  "Requests"
                ),
                Button(
                  _.badge := ButtonBadge(
                    _.design := "AttentionDot"
                  )()
                )("Reviews")
              )
            ),
            div(
              cls("ui5-content-density-compact"),
              Label()("Compact"),
              div(
                tw.space_x_2,
                Button(
                  _.badge := ButtonBadge(
                    _.design := "InlineText",
                    _.text   := "72"
                  )()
                )("Messages"),
                Button(
                  _.badge := ButtonBadge(
                    _.design := "AttentionDot"
                  )()
                )("Reviews")
              )
            )
          )
        }
      )
    )
  }

}
