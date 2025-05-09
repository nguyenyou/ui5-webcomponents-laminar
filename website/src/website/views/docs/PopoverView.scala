package website.views.docs

import com.raquo.laminar.api.L.*
import website.components.Demo
import website.components.IframePreview
import website.examples.PopoverExampleBasic
import website.macros.Source

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
