package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object MenuView extends ExampleView("Menu") {

  override def component: HtmlElement = {
    div(
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
      )
    )
  }

}
