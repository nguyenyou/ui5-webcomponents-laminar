package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object BreadcrumbsView extends ExampleView("Breadcrumbs") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          Breadcrumbs()(
            BreadcrumbsItem(
              _.href   := "#",
              _.target := "_blank"
            )("Root page"),
            BreadcrumbsItem(
              _.href := "#"
            )("Parent page"),
            BreadcrumbsItem(
              _.href := "#"
            )("Current page")
          )
        }
      )
    )
  }

}
