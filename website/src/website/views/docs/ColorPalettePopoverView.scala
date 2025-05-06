package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import website.components.Demo
import website.macros.Source

object ColorPalettePopoverView extends ExampleView("Color Palette") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "ColorPalettePopover",
        content = Source.annotate {
          val openVar         = Var(false)
          val popoverOpenerId = "btnOpenPalette"
          div(
            Button(
              _.id := popoverOpenerId,
              _.onClick.mapTo(true) --> openVar.writer
            )("Open ColorPalettePopover"),
            ColorPalettePopover(
              _.open <-- openVar.signal,
              _.onClose.mapTo(false) --> openVar.writer,
              _.openerId := popoverOpenerId
            )(
              ColorPaletteItem(_.value := "black")(),
              ColorPaletteItem(_.value := "darkblue")(),
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
          )
        }
      )
    )
  }

}
