package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object FormView extends ExampleView("Form") {

  def getLayoutByWidth(width: Double): String = {
    if (width > 599 && width <= 1023) {
      "M"
    } else if (width >= 1024 && width <= 1439) {
      "L"
    } else if (width >= 1440) {
      "XL"
    } else {
      "S"
    }
  }
  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val slider    = Slider()()
          val container = div()
          val txtLayout = Text()()
          div(
            tw.overflow_auto,
            div(
              Label(
                _.showColon := true
              )("Form Layout"),
              Text()("S1 M3 L4 XL4"),
              Label(
                _.showColon := true
              )("Page Size"),
              txtLayout.amend(
                "L"
              ),
              slider.amend(
                Slider.value := 33,
                Slider.onInput.map { _ =>
                  val width = (slider.ref.value / 100 * 1500)
                  container.ref.style.width = s"${width}px"
                  txtLayout.ref.innerHTML = getLayoutByWidth(width)
                } --> Observer.empty
              )
            ),
            container.amend(
              width.px(500),
              maxWidth.px(1500),
              overflowX.auto,
              Form(
                _.headerText := "Address",
                _.layout     := "S1 M2 L2 XL2"
              )(
                FormItem(
                  _.labelContent := Label()("Name")
                )(
                  Text()("Red Point Stores")
                ),
                FormItem(
                  _.labelContent := Label()("ZIP Code/City")
                )(
                  Text()("411 Maintown")
                ),
                FormItem(
                  _.labelContent := Label()("Street")
                )(
                  Text()("Main St 1618")
                ),
                FormItem(
                  _.labelContent := Label()("Country")
                )(
                  Text()("Germany")
                )
              )
            )
          )
        }
      )
    )
  }

}
