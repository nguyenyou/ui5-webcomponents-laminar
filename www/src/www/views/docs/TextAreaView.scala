package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object TextAreaView extends ExampleView("TextArea") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          TextArea(
            _.placeholder := "Type message..."
          )()
        }
      )
    )
  }

}
