package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import www.components.*
import www.libs.scalawind.*
import www.macros.Source
import www.macros.Source.AnnotationType

object DialogExampleBasic extends ExampleRenderer {

  override def content: AnnotationType = Source.annotate {
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

  override def content: AnnotationType = Source.annotate {
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

object DialogView extends ExampleView("Dialog") {
  override def component: HtmlElement = {
    div(
      IframePreview(
        example = DialogExampleBasic,
        title = "Basic",
        iframeHeight = 400
      )(),
      Demo(
        title = "Draggable and Resizable",
        content = Source.annotate {
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
              _.draggable  := true,
              _.resizable  := true,
              _.headerText := "Draggable/Resizable dialog",
              _.footer := Toolbar()(
                ToolbarButton(
                  _.text   := "OK",
                  _.design := "Emphasized",
                  _.onClick.mapTo(false) --> openDialogEventBus
                )()
              )
            )(
              p("Move this dialog around the screen by dragging it by its header."),
              p("Resize this dialog by dragging it by its resize handle."),
              p("These features are available only on Desktop.")
            )
          )
        }
      ),
      Demo(
        title = "Usage of Bar as header/footer",
        content = Source.annotate {
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
              _.id := dialogId,
              _.header := Bar(
                _.design := "Header",
                _.startContent := Title()(
                  "Bar used in Header and Footer"
                ),
                _.endContent := Button(
                  _.design := "Transparent",
                  _.icon   := IconName.decline,
                  _.onClick.mapTo(false) --> openDialogEventBus
                )()
              )(),
              _.footer := Bar(
                _.design := "Footer",
                _.endContent := Button(
                  _.design := "Emphasized",
                  _.onClick.mapTo(false) --> openDialogEventBus
                )(
                  "OK",
                  minWidth.rem(4)
                )
              )()
            )(
              p(
                "Adding styles for the parts to remove the default Dialog's paddings when ui5-bar is used inside Header and Footer"
              )
            )
          )
        }
      ),
      IframePreview(
        example = DialogExampleStates,
        title = "States",
        iframeHeight = 400
      )(),
      Demo(
        title = "Stretch",
        content = Source.annotate {
          val openEventBus = EventBus[Boolean]()

          val button = Button(
            _.onClick.mapTo(true) --> openEventBus
          )("Open Dialog")

          div(
            compactSize(true),
            button,
            Dialog(
              _.open <-- openEventBus,
              _.stretch := true
            )(
              p("This dialog is stretched to the width of the screen. Press ESC to close it.")
            )
          )
        }
      )
    )
  }

}
