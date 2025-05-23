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
        )("Default"),
        Button(
          _.design := "Emphasized"
        )("Emphasized"),
        Button(
          _.design := "Positive"
        )("Positive"),
        Button(
          _.design := "Negative"
        )("Negative"),
        Button(
          _.design := "Attention"
        )("Attention"),
        Button(
          _.design := "Transparent"
        )("Transparent")
      )
    )
  }
}
