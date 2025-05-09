package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object SegmentedButtonView extends ExampleView("Segmented Button") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          SegmentedButton(
            _.accessibleName := "Map type"
          )(
            SegmentedButtonItem(
            )("Map"),
            SegmentedButtonItem(
              _.selected := true
            )("Satellite"),
            SegmentedButtonItem(
            )("Terrain")
          )
        }
      )
    )
  }

}
