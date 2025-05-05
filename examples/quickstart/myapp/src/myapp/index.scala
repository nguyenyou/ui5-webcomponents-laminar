package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

@main
def main(): Unit = {
  val container = dom.document.getElementById("app")
  render(
    container,
    div(  
      Button()("Click me"),
      Button(
        _.design := "Emphasized",
        _.icon := IconName.email,
      )("Click me"),
      Avatar(
        _.initials := "AB"
      )()
    )
  )
}
