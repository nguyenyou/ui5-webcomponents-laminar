package website

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import website.components.ThemeProvider
import website.examples.ExampleRegistry
@main
def main(): Unit = {
  val container = dom.document.getElementById("app")
  Option(container).foreach(render(_, ThemeProvider()(App()())))
  ExampleRegistry.run()
}
