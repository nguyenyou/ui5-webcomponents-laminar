package website.views.docs

import com.raquo.laminar.api.L.*
import website.components.IframePreview
import scala.scalajs.js
import scala.concurrent.duration.*
import website.examples.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

object ToastView extends ExampleView("Toast") {

  override def component: HtmlElement = {
    div(
      IframePreview(example = ToastExampleBasic, title = "Basic") {
        """
          |val toastBus = EventBus[Boolean]()
          |val app = div(
          |  Button(
          |    "Show Basic Toast",
          |    _.events.onClick.mapTo(true) --> toastBus
          |  ),
          |  Toast(
          |    _.open <-- toastBus,
          |    "This is a Toast message"
          |  )
          |)
       """.stripMargin
      },
      IframePreview(example = ToastExampleDuration, title = "Duration") {
        """
          |val toastBus = EventBus[Boolean]()
          |val app = div(
          |  Button(
          |    "Show Toast",
          |    _.events.onClick.mapTo(true) --> toastBus
          |  ),
          |  Toast(
          |    _.open <-- toastBus,
          |    _.duration := 5000.millis,
          |    "Toast message, displayed for 5 seconds."
          |  )
          |)
       """.stripMargin
      },
      IframePreview(example = ToastExamplePlacement, title = "Placement") {
        """
          |val toastBus = EventBus[Boolean]()
          |val app = div(
          |  Button(
          |    "Show Toast",
          |    _.events.onClick.mapTo(true) --> toastBus
          |  ),
          |  Toast(
          |    _.open <-- toastBus,
          |    _.placement := ToastPlacement.BottomEnd,
          |    "Toast message, displayed in the 'BottomEnd'"
          |  )
          |)
       """.stripMargin
      }
    )
  }

}
