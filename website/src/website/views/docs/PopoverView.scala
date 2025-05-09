package www.views.docs

import com.raquo.laminar.api.L.*
import www.components.Demo
import www.components.IframePreview
import www.examples.PopoverExampleBasic
import www.macros.Source

object PopoverView extends ExampleView("Popover") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            IframePreview(example = PopoverExampleBasic, title = "Basic")()
          )
        }
      )
    )
  }

}
