package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object TagView extends ExampleView("Tag") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Tag(
            _.design      := "Set1",
            _.colorScheme := "6"
          )(
            "Tag Text"
          )
        }
      )
    )
  }

}
