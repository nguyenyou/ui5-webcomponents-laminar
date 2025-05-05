package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object ProgressIndicatorView extends ExampleView("Progress Indicator") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          ProgressIndicator(
            _.value := 25
          )()
        }
      )
    )
  }

}
