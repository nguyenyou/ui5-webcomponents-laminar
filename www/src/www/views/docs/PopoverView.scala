package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import org.scalajs.dom
import www.components.*
import www.libs.scalawind.*
import www.macros.Source

object PopoverView extends ExampleView("Popover") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          val openVar: Var[Boolean] = Var(false)

          div(
            compactSize(true),
            Button(
              _.id     := "openPopoverButton",
              _.design := "Emphasized",
              _.onClick.mapTo(true) --> openVar
            )("Open Popover"),
            Popover(
              _.openerId := "openPopoverButton",
              _.open <-- openVar,
              _.headerText := "Newsletter subscription",
              _.footer := div(
                tw.flex.justify_end.flex_1.py_2,
                Button(
                  _.design := "Emphasized",
                  _.onClick.mapTo(false) --> openVar
                )("Subscribe")
              )
            )(
              div(
                Label(
                  _.forId    := "emailInput",
                  _.required := true
                )(),
                Input(
                  _.id          := "emailInput",
                  _.placeholder := "Enter Email",
                  _.tpe         := "Email"
                )()
              )
            )
          )
        }
      ),
      Demo(
        title = "Opener Dom Element",
        content = Source.annotate {
          val openVar: Var[Boolean] = Var(false)

          val btn = Button(
            _.design := "Emphasized",
            _.onClick.mapTo(true) --> openVar.writer
          )("Open Popover")

          div(
            compactSize(true),
            btn,
            Popover(
              _.open <-- openVar.signal,
              _.headerText := "Newsletter subscription",
              _.footer := div(
                tw.flex.justify_end.flex_1.py_2,
                Button(
                  _.design := "Emphasized",
                  _.onClick.mapTo(false) --> openVar.writer
                )("Subscribe")
              )
            )(
              onMountCallback { ctx =>
                ctx.thisNode.ref.opener = btn.ref
              },
              div(
                div(
                  Label(
                    _.forId    := "emailInput",
                    _.required := true
                  )(),
                  Input(
                    _.id          := "emailInput",
                    _.placeholder := "Enter Email",
                    _.tpe         := "Email"
                  )()
                )
              )
            )
          )
        }
      ),
      Demo(
        title = "2nd Opener Dom Element",
        content = Source.annotate {
          val openEventBus = EventBus[Option[dom.HTMLElement]]()

          div(
            compactSize(true),
            Button(
              _.design := "Emphasized",
              _.onClick.map(_.target).map(Some(_)) --> openEventBus
            )(
              "Open Popover"
            ),
            Popover(
              _.headerText := "Newsletter subscription",
              _.footer := div(
                tw.flex.justify_end.flex_1.py_2,
                Button(
                  _.design := "Emphasized"
                )("Subscribe")
              )
            )(
              inContext { thisNode =>
                openEventBus --> Observer[Option[dom.HTMLElement]] {
                  case Some(opener) =>
                    thisNode.ref.opener = opener
                    thisNode.ref.open = true
                  case None =>
                    thisNode.ref.open = false
                }
              },
              div(
                Label(
                  _.forId    := "emailInput",
                  _.required := true
                )(),
                Input(
                  _.id          := "emailInput",
                  _.placeholder := "Enter Email",
                  _.tpe         := "Email"
                )()
              )
            )
          )
        }
      ),
      Demo(
        title = "3rd Opener Dom Element",
        content = Source.annotate {

          def showAtAndCloseFromEvents(eventStream: EventStream[Option[dom.HTMLElement]]): Modifier[Popover.Element] = {
            inContext[Popover.Element] { element =>
              eventStream --> Observer[Option[dom.HTMLElement]] {
                case Some(opener) =>
                  element.ref.opener = opener
                  element.ref.open = true
                case None =>
                  element.ref.open = false
              }
            }
          }

          val openEventBus = EventBus[Option[dom.HTMLElement]]()

          div(
            compactSize(true),
            Button(
              _.design := "Emphasized",
              _.onClick.map(_.target).map(Some(_)) --> openEventBus
            )(
              "Open Popover"
            ),
            Popover(
              _.headerText := "Newsletter subscription",
              _.footer := div(
                tw.flex.justify_end.flex_1.py_2,
                Button(
                  _.design := "Emphasized"
                )("Subscribe")
              )
            )(
              showAtAndCloseFromEvents(openEventBus.events),
              div(
                Label(
                  _.forId    := "emailInput",
                  _.required := true
                )(),
                Input(
                  _.id          := "emailInput",
                  _.placeholder := "Enter Email",
                  _.tpe         := "Email"
                )()
              )
            )
          )
        }
      )
    )
  }

}
