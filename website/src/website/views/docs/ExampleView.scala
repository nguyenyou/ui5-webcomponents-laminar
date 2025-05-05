package website.views.docs

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.scalawind.*

trait ExampleView(val name: String) {
  def component: HtmlElement

  def someIconValues = List(
  )

  object Images {
    val womanAvatar1 = "/img/woman_avatar_1.png"
    val manAvatar1   = "/img/man_avatar_1.png"
    val womanAvatar5 = "/img/woman_avatar_5.png"
    val manAvatar3   = "/img/man_avatar_3.png"
    val lampAvatar1  = "/img/Lamp_avatar_01.jpg"
    val sample1      = "/img/sample1.jpg"
    val sample2      = "/img/sample2.jpg"
    val sample3      = "/img/sample3.jpg"
  }

  def Variants(children: HtmlElement*) = {
    div(
      tw.flex.flex_wrap.gap_2,
      children
    )
  }

  def apply(): HtmlElement = {
    div(
      cls("p-6"),
      h1(
        cls("text-2xl font-bold mb-5 mt-0"),
        name
      ),
      div(
        component
      )
    )
  }

}
