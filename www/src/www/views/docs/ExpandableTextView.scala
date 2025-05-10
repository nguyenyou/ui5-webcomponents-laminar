package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object ExpandableTextView extends ExampleView("ExpandableText") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            Table(
              _.headerRow := TableHeaderRow()(
                TableHeaderCell()("Product"),
                TableHeaderCell()("Description"),
                TableHeaderCell()("Dimensions"),
                TableHeaderCell()("Price")
              )
            )(
              TableRow()(
                TableCell()(
                  strong("Notebook Basic 15")
                ),
                TableCell()(
                  ExpandableText(
                    _.text := "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Perferendis accusamus assumenda debitis excepturi distinctio adipisci magnam qui a id, praesentium ullam voluptatem ad, modi quo perspiciatis soluta quasi facere molestiae"
                  )()
                ),
                TableCell()(
                  Label()("30 x 18 x 3 cm")
                ),
                TableCell()(
                  Label()(
                    strong("956"),
                    " EUR"
                  )
                )
              ),
              TableRow()(
                TableCell()(
                  strong("Notebook Basic 17")
                ),
                TableCell()(
                  ExpandableText(
                    _.text := "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Perferendis accusamus assumenda debitis excepturi distinctio adipisci magnam qui a id, praesentium ullam voluptatem ad, modi quo perspiciatis soluta quasi facere molestiae"
                  )()
                ),
                TableCell()(
                  Label()("29 x 17 x 3.1 cm")
                ),
                TableCell()(
                  Label()(
                    strong("1249"),
                    " EUR"
                  )
                )
              )
            )
          )
        }
      )
    )
  }

}
