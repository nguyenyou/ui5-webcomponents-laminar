package website.views.docs

import com.raquo.laminar.api.L.*
import website.components.IframePreview
import website.examples.*

object ToastView extends ExampleView("Toast") {

  override def component: HtmlElement = {
    div(
      IframePreview(example = ToastExampleBasic, title = "Basic")(),
      IframePreview(example = ToastExampleDuration, title = "Duration")(),
      IframePreview(example = ToastExamplePlacement, title = "Placement")()
    )
  }

}
