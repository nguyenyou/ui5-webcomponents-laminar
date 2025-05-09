package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object SelectView extends ExampleView("Select") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Select()(
            Opt(_.icon := IconName.laptop)("Desktop"),
            Opt(_.icon := IconName.ipad, _.selected := true)("Tablet"),
            Opt(_.icon := IconName.phone)("Phone")
          )
        }
      )
    )
  }

}
