package www.views.docs

import com.raquo.laminar.api.L.*
import com.raquo.laminar.api.features.unitArrows
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object BarcodeScannerDialogView extends ExampleView("Link") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          val scanResult = Label()()
          val scanError  = Label()()
          val scanner    = BarcodeScannerDialog()()

          scanner.amend(
            BarcodeScannerDialog.onScanSuccess.map { event =>
              scanResult.ref.innerHTML = event.detail.text
            } --> Observer.empty,
            BarcodeScannerDialog.onScanError.map { event =>
              scanError.ref.innerHTML = event.detail.message
            } --> Observer.empty
          )

          div(
            scanner,
            Button(
              _.onClick --> {
                scanner.ref.open = true
              }
            )("Scan"),
            div(
              scanResult,
              scanError
            )
          )
        }
      )
    )
  }

}
