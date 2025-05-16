package www.components

import com.raquo.laminar.api.L.*
import www.macros.Source.AnnotationType

object Demo {
  def apply(
      title: => String = "",
      description: => String = "",
      content: => AnnotationType
  ): HtmlElement = {
    Preview(title, description)(content.element)(content.source)
  }
}
