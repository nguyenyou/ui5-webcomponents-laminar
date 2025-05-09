package www.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*

case class ThemeToggle() {
  def apply(): HtmlElement = {
    Button(
      _.design := "Transparent",
      _.icon <-- ThemeProvider.websiteThemeSignal.map { currentTheme =>
        val theme = ThemeProvider.Theme.values.find(_.key == currentTheme).get

        if (theme.isLight) {
          IconName.darkMode
        } else {
          IconName.lightMode
        }
      },
      _.onClick(_.sample(ThemeProvider.websiteThemeSignal).map { currentTheme =>
        val theme =
          ThemeProvider.Theme.values.find(_.key == currentTheme).get
        theme.pair
      }) --> ThemeProvider.websiteThemeVar.writer
    )()
  }
}
