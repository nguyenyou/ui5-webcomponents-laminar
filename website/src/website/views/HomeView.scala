package website.views

import com.raquo.laminar.api.L.*
import website.AppRouter
import website.views.docs.ExampleView
import website.Pages.AvatarPage

object HomeView extends ExampleView("Home") {
  override def component: HtmlElement = {
    div(
      // onMountCallback { _ =>
      //   AppRouter.pushState(AvatarPage)
      // }
    )
  }

}
