package website.views.docs

import com.raquo.laminar.api.L.*
import website.libs.scalawind.*

trait ExampleView(val name: String) {
  def component: HtmlElement

  def someIconValues = List(
  )

  object Images {
    val womanAvatar1 = "/img/woman_avatar_1.png"
    val manAvatar1   = "/img/man_avatar_1.png"
    val manAvatar2   = "/img/man_avatar_2.png"
    val manAvatar3   = "/img/man_avatar_3.png"
    val womanAvatar3 = "/img/woman_avatar_3.png"
    val womanAvatar5 = "/img/woman_avatar_5.png"
    val lampAvatar1  = "/img/Lamp_avatar_01.jpg"
    val sample1      = "/img/sample1.jpg"
    val sample2      = "/img/sample2.jpg"
    val sample3      = "/img/sample3.jpg"
  }

  def apply(): HtmlElement = {
    div(
      tw.p_6,
      h1(
        tw.text_2xl.font_bold.mb_5.mt_0,
        name
      ),
      div(
        component
      )
    )
  }

}
