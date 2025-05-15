package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source
//  <ui5-product-switch>
//         <ui5-product-switch-item title-text="Home" subtitle-text="Central Home" icon="home"></ui5-product-switch-item>
//         <ui5-product-switch-item title-text="Analytics Cloud" subtitle-text="Analytics Cloud"
//             icon="business-objects-experience"></ui5-product-switch-item>
//         <ui5-product-switch-item title-text="Catalog" subtitle-text="Ariba" icon="contacts"></ui5-product-switch-item>
//         <ui5-product-switch-item title-text="Travel &amp; Expense" subtitle-text="Concur"
//             icon="flight"></ui5-product-switch-item>
//     </ui5-product-switch>
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
                _.titleText    := "Travel &amp; Expense",
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
