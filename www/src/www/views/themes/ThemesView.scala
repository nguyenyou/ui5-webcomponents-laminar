package www.views.themes

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.libs.scalawind.*

object ThemesView {
  def apply(): HtmlElement = {
    div(
      div(
        tw.flex.gap_2,
        Button(
          _.design := "Default"
        )("Button"),
        Button(
          _.design := "Emphasized"
        )("Button"),
        Button(
          _.design := "Positive"
        )("Button"),
        Button(
          _.design := "Negative"
        )("Button"),
        Button(
          _.design := "Attention"
        )("Button"),
        Button(
          _.design := "Transparent"
        )("Button")
      )
    )
  }
}
