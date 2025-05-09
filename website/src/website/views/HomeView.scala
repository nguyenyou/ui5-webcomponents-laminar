package www.views

import com.raquo.laminar.api.L.*
import www.AppRouter
import www.Pages.AvatarPage
import www.views.docs.ExampleView

object HomeView extends ExampleView("Home") {
  override def component: HtmlElement = {
    div(
      onMountCallback { _ =>
        AppRouter.pushState(AvatarPage)
      }
    )
  }

}
