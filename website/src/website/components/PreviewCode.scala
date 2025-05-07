package website.components

import com.raquo.laminar.api.L.*
import website.libs.scalawind.*

case class PreviewCode(
    content: (String, HtmlElement)
) {
  def apply(): HtmlElement = {
    val (source, preview) = content

    div(
      div(
        tw.flex.flex_col.gap_2,
        preview,
        Codeblock(source)
      )
    )
  }
}
