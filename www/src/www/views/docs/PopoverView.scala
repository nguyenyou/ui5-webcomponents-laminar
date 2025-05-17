package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import org.scalajs.dom
import www.components.*
import www.libs.scalawind.*
import www.macros.Source
import www.macros.Source.AnnotationType

object PopoverExampleBasic extends ExampleRenderer {

  override def content: AnnotationType = Source.annotate {
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

  override def content: AnnotationType = Source.annotate {
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

object PopoverOpenerDomElement2 extends ExampleRenderer {

  override def content: AnnotationType = Source.annotate {
    val openVar: Var[Option[dom.HTMLElement]] = Var(None)

    div(
      Button(
        _.design := "Emphasized",
        _.onClick.map(_.target) --> openVar.someWriter
      )(
        "Open Popover"
      ),
      Popover(
        _.headerText := "Newsletter subscription",
        _.footer := div(
          tw.flex.justify_end.flex_1,
          Button(
            _.design := "Emphasized"
          )("Subscribe")
        )
      )(
        inContext { thisNode =>
          openVar.signal.distinct --> Observer[Option[dom.HTMLElement]] {
            case Some(opener) =>
              thisNode.ref.opener = opener
              thisNode.ref.open = true
            case None => thisNode.ref.open = false
          }
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
      IframePreview(example = PopoverExampleBasic, title = "Basic")(),
      IframePreview(example = PopoverOpenerDomElement, title = "Opener Dom Element")(),
      IframePreview(example = PopoverOpenerDomElement2, title = "Another Sample for Opener Dom Element")()
    )
  }

}
