package website.examples

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import website.libs.scalawind.*
import website.macros.Source

object DialogExampleBasic extends ExampleRenderer {

  override def content = Source.annotate {
    val openDialogEventBus = EventBus[Boolean]()

    div(
      tw.p_4,
      compactSize(true),
      Button(
        _.onClick.mapTo(true) --> openDialogEventBus
      )("Open Dialog"),
      Dialog(
        _.open <-- openDialogEventBus,
        _.onClose.mapTo(false) --> openDialogEventBus,
        _.headerText := "Register Form",
        _.footer := div(
          tw.w_full.flex.items_center.justify_end.py_4.gap_2,
          Button(
            _.design := "Emphasized",
            _.onClick.mapTo(false) --> openDialogEventBus
          )("Submit"),
          Button(
            _.design := "Transparent",
            _.onClick.mapTo(false) --> openDialogEventBus
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

object DialogExampleStates extends ExampleRenderer {

  override def content = Source.annotate {
    val openerId = "dialogOpener"
    val dialogId = "dialog"

    val openDialogEventBus = EventBus[Boolean]()

    val button = Button(
      _.id := openerId,
      _.onClick.mapTo(true) --> openDialogEventBus
    )(
      "Open Dialog"
    )
    button.ref.accessibilityAttributes.setHasPopup(AriaHasPopup.dialog)
    button.ref.accessibilityAttributes.setControls(dialogId)

    div(
      compactSize(true),
      button,
      Dialog(
        _.open <-- openDialogEventBus,
        _.id         := dialogId,
        _.state      := "Negative",
        _.headerText := "State :: Negative",
        _.footer := Toolbar()(
          ToolbarButton(
            _.text := "Close",
            _.onClick.mapTo(false) --> openDialogEventBus
          )()
        )
      )(
        Text()("Dialog with state")
      )
    )
  }
}
