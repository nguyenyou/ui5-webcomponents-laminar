package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object MessageStripView extends ExampleView("Message Strip") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          MessageStrip(
            _.design := "Information"
          )("Information Message")
        }
      )
    )
  }

}
