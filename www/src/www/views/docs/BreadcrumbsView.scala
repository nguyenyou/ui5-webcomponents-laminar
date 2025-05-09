package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

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
      ),
      Demo(
        title = "Overflow",
        content = Source.annotate {
          Breadcrumbs()(
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Root Page"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page1"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page2"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page3"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page4"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page5"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page6"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page7"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page8"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page9"),
            BreadcrumbsItem(
              _.href   := "https://www.sap.com",
              _.target := "_blank"
            )("Parent Page10"),
            BreadcrumbsItem()("Current Page")
          )
        }
      ),
      Demo(
        title = "Separator Styles",
        content = Source.annotate {
          div(
            div(
              Breadcrumbs(
                _.separators := "BackSlash"
              )(
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Root Page"),
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Parent Page"),
                BreadcrumbsItem()("Current Page")
              )
            ),
            div(
              Breadcrumbs(
                _.separators := "DoubleBackSlash"
              )(
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Root Page"),
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Parent Page"),
                BreadcrumbsItem()("Current Page")
              )
            ),
            div(
              Breadcrumbs(
                _.separators := "DoubleGreaterThan"
              )(
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Root Page"),
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Parent Page"),
                BreadcrumbsItem()("Current Page")
              )
            ),
            div(
              Breadcrumbs(
                _.separators := "DoubleSlash"
              )(
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Root Page"),
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Parent Page"),
                BreadcrumbsItem()("Current Page")
              )
            ),
            div(
              Breadcrumbs(
                _.separators := "GreaterThan"
              )(
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Root Page"),
                BreadcrumbsItem(
                  _.href := "https://www.sap.com"
                )("Parent Page"),
                BreadcrumbsItem()("Current Page")
              )
            )
          )
        }
      ),
      Demo(
        title = "Current Page Appearance",
        content = Source.annotate {
          div(
            Breadcrumbs(
              _.design := "NoCurrentPage"
            )(
              BreadcrumbsItem(
                _.href   := "https://www.sap.com",
                _.target := "_blank"
              )("Root Page"),
              BreadcrumbsItem(
                _.href := "https://www.sap.com"
              )("Parent Page"),
              BreadcrumbsItem()("Parent Page")
            ),
            Breadcrumbs(
              _.design := "Standard"
            )(
              BreadcrumbsItem(
                _.href   := "https://www.sap.com",
                _.target := "_blank"
              )("Root Page"),
              BreadcrumbsItem(
                _.href := "https://www.sap.com"
              )("Parent Page"),
              BreadcrumbsItem()("Current Page")
            )
          )
        }
      )
    )
  }

}
