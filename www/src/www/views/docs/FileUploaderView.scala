package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.components.Demo
import www.macros.Source

object FileUploaderView extends ExampleView("FileUploader") {

  override def component: HtmlElement = {
    div(
      Demo(
        title = "Basic Sample",
        content = Source.annotate {
          FileUploader()(
            Button(
              _.icon              := IconName.upload,
              _.accessibleNameRef := "upload-single-file-label"
            )(
              "Upload File"
            )
          )
        }
      )
    )
  }

}
