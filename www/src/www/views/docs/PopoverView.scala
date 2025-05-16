package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.compactSize
import www.components.*
import www.libs.scalawind.*
import www.macros.Source

object PopoverExampleBasic extends ExampleRenderer {

  override def content = Source.annotate {
    val openVar: Var[Boolean] = Var(false)

    div(
      Button(
        _.id     := "openPopoverButton",
        _.design := "Emphasized",
        _.onClick.mapTo(true) --> openVar.writer
      )("Open Popover"),
      Popover(
        _.openerId := "openPopoverButton",
        _.open <-- openVar.signal,
        _.headerText := "Newsletter subscription",
        _.footer := div(
          tw.flex.justify_end.flex_1.py_1,
          Button(
            _.design := "Emphasized",
            _.onClick.mapTo(false) --> openVar.writer
          )("Subscribe")
        )
      )(
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

}

object PopoverOpenerDomElement extends ExampleRenderer {

  override def content = Source.annotate {
    val openVar: Var[Boolean] = Var(false)

    val btn = Button(
      _.design := "Emphasized",
      _.onClick.mapTo(true) --> openVar.writer
    )("Open Popover")

    div(
      btn,
      Popover(
        _.open <-- openVar.signal,
        _.headerText := "Newsletter subscription",
        _.footer := div(
          tw.flex.justify_end.flex_1,
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

}

object PopoverView extends ExampleView("Popover") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      IframePreview(example = PopoverExampleBasic, title = "Basic")(),
      IframePreview(example = PopoverOpenerDomElement, title = "Opener Dom Element")()
    )
  }

}
