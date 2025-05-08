package website.examples

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

object DialogExampleBasic extends ExampleRenderer {

  override def component: HtmlElement = {
    val openDialogVar = Var(false)

    div(
      cls("p-4"),
      Button(
        _.design := "Emphasized",
        _.onClick.mapTo(true) --> openDialogVar.writer
      )("Open Dialog"),
      Dialog(
        _.open <-- openDialogVar.signal,
        _.onClose.mapTo(false) --> openDialogVar.writer,
        _.headerText := "Register Form",
        _.footer := div(
          cls("w-full flex items-center justify-end py-4 gap-2"),
          Button(
            _.design := "Emphasized",
            _.onClick.mapTo(false) --> openDialogVar.writer
          )("Submit"),
          Button(
            _.design := "Transparent",
            _.onClick.mapTo(false) --> openDialogVar.writer
          )("Cancel")
        )
      )(
        sectionTag(
          div(
            cls("grid grid-cols-2"),
            Label(
              _.forId    := "username",
              _.required := true
            )("Username:"),
            Input(_.id := "username")()
          ),
          div(
            cls("grid grid-cols-2"),
            Label(
              _.forId    := "password",
              _.required := true
            )("Password:"),
            Input(
              _.id         := "password",
              _.tpe        := "Password",
              _.valueState := "Negative"
            )()
          ),
          div(
            cls("grid grid-cols-2"),
            Label(
              _.forId    := "email",
              _.required := true
            )("Email:"),
            Input(_.id := "email", _.tpe := "Email")()
          )
        )
      )
    )
  }

}
