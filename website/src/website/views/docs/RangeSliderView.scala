package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object RangeSliderView extends ExampleView("Range Slider") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          RangeSlider(
            _.min        := 0,
            _.max        := 100,
            _.step       := 5,
            _.startValue := 20,
            _.endValue   := 60
          )()
        }
      )
    )
  }

}
