package website.examples

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.libs.scalawind.*

object DialogExampleBasic extends ExampleRenderer {

  override def component: HtmlElement = {
    val openDialogVar = Var(false)

    div(
      tw.p_4,
      Button(
        _.design := "Emphasized",
        _.onClick.mapTo(true) --> openDialogVar.writer
      )("Open Dialog"),
      Dialog(
        _.open <-- openDialogVar.signal,
        _.onClose.mapTo(false) --> openDialogVar.writer,
        _.headerText := "Register Form",
        _.footer := div(
          tw.w_full.flex.items_center.justify_end.py_4.gap_2,
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
            tw.grid.grid_cols_2,
            Label(
              _.forId    := "username",
              _.required := true
            )("Username:"),
            Input(_.id := "username")()
          ),
          div(
            tw.grid.grid_cols_2,
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
            tw.grid.grid_cols_2,
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
