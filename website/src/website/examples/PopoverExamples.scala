package website.examples

import io.github.nguyenyou.ui5.webcomponents.laminar.*
import com.raquo.laminar.api.L.*
import org.scalajs.dom
import org.scalajs.dom.HTMLElement
import scala.concurrent.duration.DurationInt
import scala.util.Random

object PopoverExampleBasic extends ExampleRenderer {

  override def component: HtmlElement = {
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
