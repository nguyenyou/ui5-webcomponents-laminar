package www.examples

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.macros.Source

case object ToastExampleBasic extends ExampleRenderer {

  override def content = Source.annotate {
    val toastBus = EventBus[Boolean]()
    div(
      Button(
        _.onClick.mapTo(true) --> toastBus
      )("Show Toast"),
      Toast(
        _.open <-- toastBus
      )("This is a Toast message")
    )
  }

}

case object ToastExampleDuration extends ExampleRenderer {

  override def content = Source.annotate {
    val toastBus = EventBus[Boolean]()
    div(
      Button(
        _.onClick.mapTo(true) --> toastBus
      )("Show Toast"),
      Toast(
        _.open <-- toastBus,
        _.duration := 5000
      )("Toast message, displayed for 5 seconds.")
    )
  }

}

case object ToastExamplePlacement extends ExampleRenderer {

  override def content = Source.annotate {
    val toastBus = EventBus[Boolean]()
    div(
      Button(
        _.onClick.mapTo(true) --> toastBus
      )("Show Toast"),
      Toast(
        _.open <-- toastBus,
        _.placement := "BottomEnd"
      )("Toast message, displayed in the 'BottomEnd'")
    )
  }

}
