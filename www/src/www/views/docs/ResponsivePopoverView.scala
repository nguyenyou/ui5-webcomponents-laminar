package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object ResponsivePopoverView extends ExampleView("ResponsivePopover") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val openerId = "btn"
          val popover = ResponsivePopover(
            _.openerId   := openerId,
            _.headerText := "Newsletter subscription",
            _.footer := div(
              tw.flex.justify_end.w_full.items_center.py_2,
              Button(
                _.design := "Emphasized"
              )("Subscribe")
            )
          )()
          div(
            compactSize(true),
            Button(
              _.id := openerId,
              _.onClick.map { _ =>
                popover.ref.open = !popover.ref.open
              } --> Observer.empty
            )("Open ResponsivePopover"),
            popover.amend(
              div(
                tw.flex.flex_col.justify_center,
                Label(
                  _.forId     := "emailInput",
                  _.required  := true,
                  _.showColon := true
                )("Email"),
                Input(
                  _.id          := "emailInput",
                  _.placeholder := "Enter Email"
                )(
                  minWidth.px(150)
                ),
                Label()(
                  "Note: If you open the page in mobile, a dialog would be displayed."
                )
              )
            )
          )
        }
      )
    )
  }

}
