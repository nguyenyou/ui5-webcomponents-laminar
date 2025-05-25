package www.views.docs

import com.raquo.laminar.api.L.*
import www.libs.scalawind.*
import www.BuildInfo

val baseUrl = BuildInfo.baseUrl

trait ExampleView(val name: String) {
  def component: HtmlElement

  def someIconValues = List(
  )

  object Images {
    val womanAvatar1 = s"$baseUrl/img/woman_avatar_1.png"
    val manAvatar1   = s"$baseUrl/img/man_avatar_1.png"
    val manAvatar2   = s"$baseUrl/img/man_avatar_2.png"
    val manAvatar3   = s"$baseUrl/img/man_avatar_3.png"
    val womanAvatar3 = s"$baseUrl/img/woman_avatar_3.png"
    val womanAvatar4 = s"$baseUrl/img/woman_avatar_4.png"
    val womanAvatar5 = s"$baseUrl/img/woman_avatar_5.png"
    val lampAvatar1  = s"$baseUrl/img/Lamp_avatar_01.jpg"
    val sample1      = s"$baseUrl/img/sample1.jpg"
    val sample2      = s"$baseUrl/img/sample2.jpg"
    val sample3      = s"$baseUrl/img/sample3.jpg"
  }

  def apply(): HtmlElement = {
    div(
      tw.p_2,
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
