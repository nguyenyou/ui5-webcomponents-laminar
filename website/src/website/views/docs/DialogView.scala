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
      )()
    )
  }

}
