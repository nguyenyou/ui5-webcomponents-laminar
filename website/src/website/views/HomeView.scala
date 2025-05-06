package website.views

import com.raquo.laminar.api.L.*
import website.AppRouter
import website.Pages.AvatarPage
import website.views.docs.ExampleView

object HomeView extends ExampleView("Home") {
  override def component: HtmlElement = {
    div(
      onMountCallback { _ =>
        AppRouter.pushState(AvatarPage)
      }
    )
  }

}
