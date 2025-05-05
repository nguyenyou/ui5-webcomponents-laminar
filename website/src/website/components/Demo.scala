package website.components

import com.raquo.laminar.api.L.*

object Demo {
  def apply(
      title: => String = "",
      content: => (String, HtmlElement)
  ): HtmlElement = {
    Preview(title)(content._2)(content._1)
  }
}
