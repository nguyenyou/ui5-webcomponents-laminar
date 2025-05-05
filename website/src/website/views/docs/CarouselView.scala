package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object CarouselView extends ExampleView("Carousel") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          Carousel()(
            img(src := Images.sample1, alt := "Landscape 1"),
            img(src := Images.sample2, alt := "Landscape 2"),
            img(src := Images.sample3, alt := "Bulb")
          )
        }
      )
    )
  }

}
