package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object SearchView extends ExampleView("Search") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val scopeVar = Var("")
          val dataList = List[(name: String, scope: String)](
            ("Laptop", "products"),
            ("Leave Requests", "apps"),
            ("Log work", "apps"),
            ("Manage Products", "apps"),
            ("Mobile Phones", "products"),
            ("Tablet", "products")
          )

          val scopedItemsSignal = scopeVar.signal.map { scope =>
            if (scope.isEmpty) {
              dataList
            } else {
              dataList.filter { _.scope == scope }
            }
          }

          div(
            Search(
              _.showClearIcon := true,
              _.placeholder   := "Search Apps, Products",
              _.onScopeChange.map { event =>
                val scope = event.detail.scope.toOption
                  .flatMap {
                    _.text.toOption.map {
                      case "All"     => ""
                      case s: String => s.toLowerCase()
                    }
                  }
                  .getOrElse("")
                scopeVar.set(scope)
              } --> Observer.empty,
              _.scopes := SearchScope(
                _.text     := "All",
                _.selected := true
              )(),
              _.scopes := SearchScope(
                _.text := "Apps"
              )(),
              _.scopes := SearchScope(
                _.text := "Products"
              )()
            )(
              children <-- scopedItemsSignal.map {
                _.map { item =>
                  SearchItem(
                    _.text      := item.name,
                    _.scopeName := item.scope
                  )()
                }
              }
            )
          )
        }
      )
    )
  }
}
