package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object ColorPaletteView extends ExampleView("Color Palette") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic",
        content = Source.annotate {
          ColorPalette()(
            ColorPaletteItem(_.value := "darkblue")(),
            ColorPaletteItem(_.value := "pink")(),
            ColorPaletteItem(_.value := "#444444")(),
            ColorPaletteItem(_.value := "rgb(0,200,0)")(),
            ColorPaletteItem(_.value := "green")(),
            ColorPaletteItem(_.value := "darkred")(),
            ColorPaletteItem(_.value := "yellow")(),
            ColorPaletteItem(_.value := "blue")(),
            ColorPaletteItem(_.value := "cyan")(),
            ColorPaletteItem(_.value := "orange")(),
            ColorPaletteItem(_.value := "#5480e7")(),
            ColorPaletteItem(_.value := "#ff6699")()
          )
        }
      )
    )
  }

}
