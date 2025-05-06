package website.views.docs

import com.raquo.laminar.api.L.*
import website.components.IframePreview
import website.examples.*

object DialogView extends ExampleView("Dialog") {

  val openDialogBus = EventBus[Boolean]()

  override def component: HtmlElement = {
    div(
      IframePreview(
        example = DialogExampleBasic,
        title = "Basic",
        iframeHeight = 400
      ) {
        """
          |val openDialogBus = EventBus[Boolean]()
          |
          |div(
          |  Button(
          |    _.design := ButtonDesign.Emphasized,
          |    "Open Dialog",
          |    _.events.onClick.mapTo(true) --> openDialogBus
          |  ),
          |  Dialog(
          |    _.open <-- openDialogBus,
          |    _.headerText := "Register Form",
          |    sectionTag(
          |      div(
          |        cls("grid grid-cols-2"),
          |        Label(
          |          _.forId := "username",
          |          _.required := true,
          |          "Username:"
          |        ),
          |        Input(_.id := "username")
          |      ),
          |      div(
          |        cls("grid grid-cols-2"),
          |        Label(
          |          _.forId := "password",
          |          _.required := true,
          |          "Password:"
          |        ),
          |        Input(
          |          _.id := "password",
          |          _.tpe := InputType.Password,
          |          _.valueState := ValueState.Negative
          |        )
          |      ),
          |      div(
          |        cls("grid grid-cols-2"),
          |        Label(
          |          _.forId := "email",
          |          _.required := true,
          |          "Email:"
          |        ),
          |        Input(_.id := "email", _.tpe := InputType.Email)
          |      ),
          |    ),
          |    _.slots.footer := div(
          |      cls("w-full flex items-center justify-end py-4 gap-2"),
          |      Button(
          |        _.design := ButtonDesign.Emphasized,
          |        "Submit",
          |        _.events.onClick.mapTo(false) --> openDialogBus
          |      ),
          |      Button(
          |        _.design := ButtonDesign.Transparent,
          |        "Cancel",
          |        _.events.onClick.mapTo(false) --> openDialogBus
          |      )
          |    )
          |  )
          |)
         """.stripMargin
      }
    )
  }

}
