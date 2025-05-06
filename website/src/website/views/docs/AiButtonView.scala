package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.IconName
import io.github.nguyenyou.ui5.webcomponents.laminar.Menu
import io.github.nguyenyou.ui5.webcomponents.laminar.MenuItem
import io.github.nguyenyou.ui5.webcomponents.laminar.MenuSeparator
import io.github.nguyenyou.ui5.webcomponents.laminar.ai.Button
import io.github.nguyenyou.ui5.webcomponents.laminar.ai.ButtonState
import website.components.Demo
import website.macros.Source

object AiButtonView extends ExampleView("AI Button") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val buttonStateVar = Var("generate")
          val menuOpenVar    = Var(false)
          val menuOpenerId   = "menuOpenerId"

          def startGeneration() = {
            org.scalajs.dom.window.setTimeout(
              () => {
                buttonStateVar.set("revise")
              },
              3000
            )
          }

          div(
            Button(
              _.id := menuOpenerId,
              _.state <-- buttonStateVar.signal,
              _.onClick.map { event =>
                println(event.target.state)
                event.target.state.toOption.foreach { state =>
                  menuOpenVar.set(false)

                  state match {
                    case "generate" =>
                      buttonStateVar.set("generating")
                      startGeneration()
                    case "generating" =>
                      buttonStateVar.set("generate")
                    case "revise" =>
                      menuOpenVar.set(true)
                  }

                }

              } --> Observer.empty
            )(
              ButtonState(
                _.name := "generate",
                _.text := "Generate",
                _.icon := IconName.ai
              )(),
              ButtonState(
                _.name := "generating",
                _.text := "Stop Generating",
                _.icon := IconName.stop
              )(),
              ButtonState(
                _.name    := "revise",
                _.text    := "Revise",
                _.icon    := IconName.ai,
                _.endIcon := IconName.navigationDownArrow
              )()
            ),
            child <-- menuOpenVar.signal.map { open =>
              if (open) {
                Menu(
                  _.open := true,
                  _.onClose.mapTo(false) --> menuOpenVar.writer,
                  _.headerText := "Basic Menu with Items",
                  _.id         := "menuBasic",
                  _.openerId   := menuOpenerId,
                  _.onItemClick.map { event =>
                    println(event)
                    event.detail.text match {
                      case "Regenerate" =>
                        buttonStateVar.set("generating")
                        startGeneration()
                      case _ => ()
                    }
                  } --> Observer.empty
                )(
                  MenuItem(
                    _.text := "Regenerate"
                  )(),
                  MenuSeparator()(),
                  MenuItem(
                    _.text := "Fix Spelling & Grammar"
                  )(),
                  MenuItem(
                    _.text := "Change Tone"
                  )(
                    MenuItem(
                      _.text := "Option 1"
                    )(),
                    MenuItem(
                      _.text := "Option 2"
                    )(),
                    MenuItem(
                      _.text := "Option 3"
                    )()
                  ),
                  MenuItem(
                    _.text := "Adjust Length"
                  )(
                    MenuItem(
                      _.text := "Shorten text"
                    )(),
                    MenuItem(
                      _.text := "Lengthen text"
                    )()
                  ),
                  MenuItem(
                    _.text := "Bulleted List"
                  )(),
                  MenuItem(
                    _.text := "Translate"
                  )(
                    MenuItem(
                      _.text := "English"
                    )(),
                    MenuItem(
                      _.text := "German"
                    )(),
                    MenuItem(
                      _.text := "Spanish"
                    )()
                  ),
                  MenuItem(
                    _.text     := "New Folder",
                    _.icon     := IconName.addFolder,
                    _.disabled := true
                  )(),
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
              } else {
                emptyNode
              }
            }
          )
        }
      )
    )
  }

}
