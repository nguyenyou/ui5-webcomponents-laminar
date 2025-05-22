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
          val openVar: Var[Boolean] = Var(false) // [!code highlight]

          div(
            compactSize(true),
            Button(
              _.id     := "openPopoverButton", // [!code highlight]
              _.design := "Emphasized",
              _.onClick.mapTo(true) --> openVar // [!code highlight]
            )("Open Popover"),
            Popover(
              _.openerId := "openPopoverButton", // [!code highlight]
              _.open <-- openVar, // [!code highlight]
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
          val openVar: Var[Boolean] = Var(false) // [!code highlight]

          val btn = Button(
            _.design := "Emphasized",
            _.onClick.mapTo(true) --> openVar.writer // [!code highlight]
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
              // [!code highlight:3]
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
          val openEventBus = EventBus[Option[dom.HTMLElement]]() // [!code highlight]

          div(
            compactSize(true),
            Button(
              _.design := "Emphasized",
              _.onClick.map(_.target).map(Some(_)) --> openEventBus // [!code highlight]
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
              // [!code highlight:9]
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
          val openEventBus = EventBus[Option[dom.HTMLElement]]() // [!code highlight]

          div(
            compactSize(true),
            Button(
              _.design := "Emphasized",
              _.onClick.map(_.target).map(Some(_)) --> openEventBus // [!code highlight]
            )(
              "Open Popover"
            ),
            Popover(
              _.headerText := "Newsletter subscription",
              _.openerRef(openEventBus.events), // [!code highlight]
              _.footer := div(
                tw.flex.justify_end.flex_1.py_2,
                Button(
                  _.design := "Emphasized"
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
      )
    )
  }

}
