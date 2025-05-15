package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object ProductSwitchView extends ExampleView("Product Switch") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            ProductSwitch()(
              ProductSwitchItem(
                _.titleText    := "Home",
                _.subtitleText := "Central Home",
                _.icon         := IconName.home
              )(),
              ProductSwitchItem(
                _.titleText    := "Analytics Cloud",
                _.subtitleText := "Analytics Cloud",
                _.icon         := IconName.businessObjectsExperience
              )(),
              ProductSwitchItem(
                _.titleText    := "Catalog",
                _.subtitleText := "Ariba",
                _.icon         := IconName.contacts
              )(),
              ProductSwitchItem(
                _.titleText    := "Travel & Expense",
                _.subtitleText := "Concur",
                _.icon         := IconName.flight
              )()
            )
          )
        }
      )
    )
  }
}
