package www.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import org.scalajs.dom.FileList
import org.scalajs.dom.URL
import www.components.Demo
import www.libs.scalawind.*
import www.macros.Source

object FileUploaderView extends ExampleView("FileUploader") {

  override def component: HtmlElement = {
    div(
      compactSize(true),
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
      ),
      Demo(
        title = "Upload Multiple Files",
        description =
          """By default, only one file can be selected, to allow multiple files to be uploaded - set the "multiple" property.""",
        content = Source.annotate {
          FileUploader(
            _.multiple := true
          )(
            Button(
              _.icon := IconName.upload
            )(
              "Upload Multiple Files"
            )
          )
        }
      ),
      Demo(
        title = "Files Filter",
        description = """You can define the files, allowed for uploading via the "accept" property.""",
        content = Source.annotate {
          val selectedFilesVar = Var(Option.empty[FileList])
          div(
            FileUploader(
              _.multiple := true,
              _.accept   := "image/*",
              _.onChange.map { event =>
                val files = event.target.files
                if (files.length > 0) {
                  selectedFilesVar.set(Some(files))
                } else {
                  selectedFilesVar.set(None)
                }
              } --> Observer.empty
            )(
              Button(
                _.icon := IconName.upload
              )(
                "Upload Images"
              )
            ),
            div(
              children <-- selectedFilesVar.signal.map {
                _.map {
                  _.map { file =>
                    val url = URL.createObjectURL(file)
                    img(
                      src := url,
                      tw.object_contain,
                      width.px(100),
                      height.px(100),
                      onLoad --> Observer { _ =>
                        URL.revokeObjectURL(url)
                      }
                    )
                  }
                }.getOrElse(Seq.empty)
              }
            )
          )
        }
      ),
      Demo(
        title = "Button Only",
        description = """You can hide the input part via the "hide-input" property.""",
        content = Source.annotate {
          FileUploader(
            _.hideInput := true
          )(
            Button(
              _.icon := IconName.upload
            )("Upload")
          )
        }
      )
    )
  }

}
