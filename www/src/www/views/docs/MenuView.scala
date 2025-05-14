package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.Demo
import www.macros.Source

object MenuView extends ExampleView("Menu") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
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
        title = "Sub-menu",
        content = Source.annotate {
          val menuIsOpenVar = Var(false)
          val menuOpenerId  = "btnOpenSubMenu"
          div(
            Button(
              _.id      := menuOpenerId,
              _.endIcon := IconName.slimArrowDown,
              _.onClick.mapTo(true) --> menuIsOpenVar.writer
            )("Open Menu"),
            br(),
            Menu(
              _.open <-- menuIsOpenVar.signal,
              _.onClose.mapTo(false) --> menuIsOpenVar.writer,
              _.id       := "menuSubs",
              _.openerId := menuOpenerId
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
              MenuItem(
                _.text := "Open",
                _.icon := IconName.openFolder
              )(
                MenuItem(
                  _.text := "Open Locally",
                  _.icon := IconName.openFolder
                )(
                  MenuItem(_.text := "Open from C")(),
                  MenuItem(_.text := "Open from D")(),
                  MenuItem(_.text := "Open from E")()
                ),
                MenuItem(_.text := "Open from Cloud")()
              ),
              MenuItem(
                _.text := "Save",
                _.icon := IconName.save
              )(
                MenuItem(
                  _.text := "Save Locally",
                  _.icon := IconName.save
                )(
                  MenuItem(_.text := "Save on C", _.icon := IconName.save)(),
                  MenuItem(_.text := "Save on D", _.icon := IconName.save)(),
                  MenuItem(_.text := "Save on E", _.icon := IconName.save)()
                ),
                MenuItem(_.text := "Save on Cloud", _.icon := IconName.uploadToCloud)()
              ),
              MenuItem(
                _.text := "Close"
              )(),
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
        title = "Menu Item with Additional Text",
        content = Source.annotate {
          val menuIsOpenVar = Var(false)
          val menuOpenerId  = "btnOpenAdditionalText"
          div(
            Button(
              _.id      := menuOpenerId,
              _.endIcon := IconName.slimArrowDown,
              _.onClick.mapTo(true) --> menuIsOpenVar.writer
            )("Open Menu"),
            br(),
            Menu(
              _.open <-- menuIsOpenVar.signal,
              _.onClose.mapTo(false) --> menuIsOpenVar.writer,
              _.id       := "menuAdditionalText",
              _.openerId := menuOpenerId
            )(
              MenuItem(
                _.text           := "New File",
                _.icon           := IconName.addDocument,
                _.additionalText := "Ctrl+N"
              )(),
              MenuItem(
                _.text           := "New Folder",
                _.icon           := IconName.addFolder,
                _.additionalText := "Ctrl+F",
                _.disabled       := true
              )(),
              MenuItem(
                _.text := "Open",
                _.icon := IconName.openFolder
              )(),
              MenuItem(
                _.text := "Close"
              )(),
              MenuItem(
                _.text := "Preferences",
                _.icon := IconName.actionSettings
              )(),
              MenuItem(
                _.text           := "Exit",
                _.icon           := IconName.journeyArrive,
                _.additionalText := "Ctrl+X"
              )()
            )
          )
        }
      ),
      Demo(
        title = "Menu Item with End Content",
        content = Source.annotate {
          val menuIsOpenVar = Var(false)
          val menuOpenerId  = "btnOpenEndContent"
          div(
            Button(
              _.id := menuOpenerId,
              _.onClick.mapTo(true) --> menuIsOpenVar.writer
            )("Open Menu"),
            Menu(
              _.open <-- menuIsOpenVar.signal,
              _.onClose.mapTo(false) --> menuIsOpenVar.writer,
              _.id         := "menuEndContent",
              _.headerText := "My ui5-menu",
              _.openerId   := menuOpenerId
            )(
              MenuItem(
                _.text           := "New File",
                _.accessibleName := "Opens a file explorer",
                _.additionalText := "Ctrl+Alt+Shift+N",
                _.tooltip        := "Select a file - prevent default",
                _.icon           := IconName.addDocument,
                _.endContent := Button(
                  _.id     := "newAdd",
                  _.icon   := IconName.add,
                  _.design := "Transparent"
                )(),
                _.endContent := Button(
                  _.id     := "newHint",
                  _.icon   := IconName.hint,
                  _.design := "Transparent"
                )(),
                _.endContent := Button(
                  _.id     := "newFavorite",
                  _.icon   := IconName.favorite,
                  _.design := "Transparent"
                )()
              )(),
              MenuItem(
                _.text           := "New Folder",
                _.additionalText := "Ctrl+F",
                _.icon           := IconName.addFolder
              )(),
              MenuItem(
                _.text           := "New Folder",
                _.additionalText := "Ctrl+F",
                _.icon           := IconName.addFolder
              )(),
              MenuItem(
                _.text           := "Open",
                _.icon           := IconName.openFolder,
                _.accessibleName := "Choose platform"
              )(
                MenuItem(
                  _.text           := "Open Locally",
                  _.icon           := IconName.openFolder,
                  _.additionalText := "Ctrl+K"
                )(),
                MenuItem(
                  _.text           := "Open from SAP Cloud",
                  _.additionalText := "Ctrl+L"
                )()
              ),
              MenuItem(
                _.text := "Save with very long title for a menu item text inside",
                _.icon := IconName.save
              )(
                MenuItem(
                  _.text := "Save Locally",
                  _.icon := IconName.save
                )(),
                MenuItem(
                  _.text := "Save on Cloud",
                  _.icon := IconName.uploadToCloud
                )()
              ),
              MenuItem(
                _.text           := "Close",
                _.additionalText := "Ctrl+W"
              )(),
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
      )
    )
  }

}
