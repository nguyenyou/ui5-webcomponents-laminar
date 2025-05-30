package www

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigThemeMod.setTheme
import org.scalajs.dom
import www.components.ThemeProvider
import www.facades.GlobalConfig
import www.views.docs.*

@main
def main(): Unit = {
  setTheme(GlobalConfig.initialTheme)

  dom.window.setTimeout(
    () => {
      Option(dom.document.getElementById("initial-dark-mode")).foreach(_.remove())
    },
    1000
  )

  val container = dom.document.getElementById("app")
  Option(container).foreach(render(_, ThemeProvider()(App()())))

  // Iframe preview examples
  ToastExampleBasic()
  ToastExamplePlacement()
  ToastExampleDuration()
  DialogExampleBasic()
  DialogExampleStates()
}
