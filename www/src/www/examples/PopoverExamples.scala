package www.examples

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
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
          div(flex := "1"),
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
