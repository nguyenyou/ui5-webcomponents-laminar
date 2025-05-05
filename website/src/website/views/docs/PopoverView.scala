package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source
import website.examples.PopoverExampleBasic
import website.components.IframePreview

object PopoverView extends ExampleView("Popover") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            IframePreview(example = PopoverExampleBasic, title = "Basic") {
              """
              |val openVar: Var[Boolean] = Var(false)
              |
              |div(
              |  Button(
              |    _.id     := "openPopoverButton",
              |    _.design := "Emphasized",
              |    _.onClick.mapTo(true) --> openVar.writer
              |  )("Open Popover"),
              |  Popover(
              |    _.openerId := "openPopoverButton",
              |    _.open <-- openVar.signal,
              |    _.headerText := "Newsletter subscription",
              |    _.footer := div(
              |      div(flex := "1"),
              |      Button(
              |        _.design := "Emphasized",
              |        _.onClick.mapTo(false) --> openVar.writer
              |      )("Subscribe")
              |    )
              |  )(
              |    div(
              |      div(
              |        Label(
              |          _.forId    := "emailInput",
              |          _.required := true
              |        )(),
              |        Input(
              |          _.id          := "emailInput",
              |          _.placeholder := "Enter Email",
              |          _.tpe         := "Email"
              |        )()
              |      )
              |    )
              |  )
              |)
              """.stripMargin
            }
          )
        }
      )
    )
  }

}
