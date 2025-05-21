package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object TableView extends ExampleView("Table") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          div(
            Table(
              _.id           := "table",
              _.overflowMode := "Popin",
              _.headerRow := TableHeaderRow()(
                TableHeaderCell(
                  _.id := "productCol"
                )(
                  width.px(300),
                  span("Product")
                ),
                TableHeaderCell(
                  _.id := "supplierCol"
                )(
                  width.px(200),
                  "Supplier"
                ),
                TableHeaderCell(
                  _.id := "dimensionsCol"
                )(
                  width.px(300),
                  "Dimensions"
                ),
                TableHeaderCell(
                  _.id := "weightCol"
                )(
                  width.px(100),
                  "Weight"
                ),
                TableHeaderCell(
                  _.id := "priceCol"
                )(
                  width.px(220),
                  "Price"
                )
              )
            )(
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 15"),
                    br(),
                    "HT-1000"
                  )
                ),
                TableCell()(
                  Label()("Very Best Screens")
                ),
                TableCell()(
                  Label()("30 x 18 x 3 cm")
                ),
                TableCell()(
                  Label()(
                    color("#2b7c2b"),
                    b("4.2"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("956"),
                    " EUR"
                  )
                )
              ),
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 17"),
                    br(),
                    "HT-1001"
                  )
                ),
                TableCell()(
                  Label()("Smartcards")
                ),
                TableCell()(
                  Label()("29 x 17 x 3.1 cm")
                ),
                TableCell()(
                  Label(
                  )(
                    color("#2b7c2b"),
                    b("4.5"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("1249"),
                    " EUR"
                  )
                )
              ),
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 18"),
                    br(),
                    "HT-1002"
                  )
                ),
                TableCell()(
                  Label()("Technocom")
                ),
                TableCell()(
                  Label()("32 x 21 x 4 cm")
                ),
                TableCell()(
                  Label()(
                    color("#2b7c2b"),
                    b("3.7"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("29"),
                    " EUR"
                  )
                )
              )
            )
          )
        }
      ),
      Demo(
        title = "Popin Mode",
        content = Source.annotate {
          val tableWidthVar     = Var("100%")
          val popinHiddenVar    = Var(true)
          val popinHiddenSignal = popinHiddenVar.signal.distinct

          div(
            Bar(
              _.endContent := SegmentedButton(
                _.accessibleName := "Show/Hide Details",
                _.onSelectionChange.map { event =>
                  event.detail.selectedItems.headOption.foreach { item =>
                    item.getAttribute("tooltip") match {
                      case v: String =>
                        if (v == "Show Details") {
                          popinHiddenVar.set(false)
                        } else {
                          popinHiddenVar.set(true)
                        }
                      case _ => ()
                    }

                  }
                } --> Observer.empty
              )(
                SegmentedButtonItem(
                  _.tooltip := "Show Details",
                  _.icon    := IconName.detailMore,
                  _.selected <-- popinHiddenSignal.not
                )(),
                SegmentedButtonItem(
                  _.tooltip := "Hide Details",
                  _.icon    := IconName.detailLess,
                  _.selected <-- popinHiddenSignal
                )()
              )
            )(
              SegmentedButton(
                _.accessibleName := "Switch Table Size",
                _.onSelectionChange.map { event =>
                  event.detail.selectedItems.headOption.foreach { item =>
                    item.textContent match {
                      case v: String => tableWidthVar.set(v)
                      case _         => ()
                    }
                  }
                } --> Observer.empty
              )(
                SegmentedButtonItem()("25%"),
                SegmentedButtonItem()("50%"),
                SegmentedButtonItem()("75%"),
                SegmentedButtonItem(
                  _.selected := true
                )("100%")
              )
            ),
            Table(
              _.overflowMode := "Popin",
              _.headerRow := TableHeaderRow()(
                TableHeaderCell(
                  _.id       := "productCol",
                  _.minWidth := "250px"
                )(
                  span("Product")
                ),
                TableHeaderCell(
                  _.id       := "supplierCol",
                  _.minWidth := "180px"
                )(
                  "Supplier"
                ),
                TableHeaderCell(
                  _.id         := "dimensionsCol",
                  _.importance := -1,
                  _.minWidth   := "180px",
                  _.popinHidden <-- popinHiddenSignal
                )(
                  "Dimensions"
                ),
                TableHeaderCell(
                  _.id         := "weightCol",
                  _.importance := -1,
                  _.minWidth   := "80px",
                  _.popinHidden <-- popinHiddenSignal
                )(
                  "Weight"
                ),
                TableHeaderCell(
                  _.id       := "priceCol",
                  _.minWidth := "120px"
                )(
                  "Price"
                )
              )
            )(
              width <-- tableWidthVar.signal,
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 15"),
                    br(),
                    "HT-1000"
                  )
                ),
                TableCell()(
                  Label()("Very Best Screens")
                ),
                TableCell()(
                  Label()("30 x 18 x 3 cm")
                ),
                TableCell()(
                  Label()(
                    color("#2b7c2b"),
                    b("4.2"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("956"),
                    " EUR"
                  )
                )
              ),
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 17"),
                    br(),
                    "HT-1001"
                  )
                ),
                TableCell()(
                  Label()("Smartcards")
                ),
                TableCell()(
                  Label()("29 x 17 x 3.1 cm")
                ),
                TableCell()(
                  Label(
                  )(
                    color("#2b7c2b"),
                    b("4.5"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("1249"),
                    " EUR"
                  )
                )
              ),
              TableRow()(
                TableCell()(
                  Label()(
                    b("Notebook Basic 18"),
                    br(),
                    "HT-1002"
                  )
                ),
                TableCell()(
                  Label()("Technocom")
                ),
                TableCell()(
                  Label()("32 x 21 x 4 cm")
                ),
                TableCell()(
                  Label()(
                    color("#2b7c2b"),
                    b("3.7"),
                    " KG"
                  )
                ),
                TableCell()(
                  Label()(
                    b("29"),
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
