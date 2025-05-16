package www.components

import com.raquo.airstream.web.WebStorageVar
import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.facades.*
import www.libs.scalawind.*

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

object Codeblock {
  val themeVar: WebStorageVar[String] = WebStorageVar
    .localStorage(key = "codeTheme", syncOwner = None)
    .text(default = "github-dark-dimmed")
  val themeSignal = themeVar.signal.distinct

  val themes = List(
    "andromeeda",
    "aurora-x",
    "ayu-dark",
    "catppuccin-frappe",
    "catppuccin-latte",
    "catppuccin-macchiato",
    "catppuccin-mocha",
    "dark-plus",
    "dracula",
    "dracula-soft",
    "everforest-dark",
    "everforest-light",
    "github-dark",
    "github-dark-default",
    "github-dark-dimmed",
    "github-dark-high-contrast",
    "github-light",
    "github-light-default",
    "github-light-high-contrast",
    "gruvbox-dark-hard",
    "gruvbox-dark-medium",
    "gruvbox-dark-soft",
    "gruvbox-light-hard",
    "gruvbox-light-medium",
    "gruvbox-light-soft",
    "houston",
    "kanagawa-dragon",
    "kanagawa-lotus",
    "kanagawa-wave",
    "laserwave",
    "light-plus",
    "material-theme",
    "material-theme-darker",
    "material-theme-lighter",
    "material-theme-ocean",
    "material-theme-palenight",
    "min-dark",
    "min-light",
    "monokai",
    "night-owl",
    "nord",
    "one-dark-pro",
    "one-light",
    "plastic",
    "poimandres",
    "red",
    "rose-pine",
    "rose-pine-dawn",
    "rose-pine-moon",
    "slack-dark",
    "slack-ochin",
    "snazzy-light",
    "solarized-dark",
    "solarized-light",
    "synthwave-84",
    "tokyo-night",
    "vesper",
    "vitesse-black",
    "vitesse-dark",
    "vitesse-light"
  )

  val ThemeSwitcher = div(
    tw.hidden.md(tw.block),
    Select(
      _.onChange.map { event =>
        event.detail.selectedOption.dataset.get("id").collect { case id: String =>
          themeVar.set(id)
        }
      } --> Observer.empty
    )(
      themes.map { theme =>
        UOption(
          _.selected <-- themeVar.signal.map(_ == theme)
        )(
          dataAttr("id") := theme,
          theme
        )
      }
    )
  )

  def apply(source: String): HtmlElement = {
    val codeNode = div()
    val dedented = source.trim

    div(
      tw.relative,
      codeNode.amendThis { thisNode =>
        themeSignal --> Observer[String] { theme =>
          Shiki
            .codeToHtml(
              dedented,
              CodeToHtmlOptions(
                lang = "scala",
                theme = theme
              )
            )
            .toFuture
            .onComplete {
              case Failure(_) => ()
              case Success(value) =>
                thisNode.ref.innerHTML = value
            }
        }
      },
      codeNode.amend(
        pre(
          cls("shiki"),
          code(dedented)
        )
      ),
      Copy(
        content = Val(dedented),
        renderChildren = renderer => {
          div(
            tw.absolute.top_4.right_6,
            button(
              tw.inline_flex.items_center.justify_center.cursor_pointer.w_9.h_9.rounded_md.bg_neutral_800.border_none.outline_none
                .hover(tw.bg_black),
              Icon(
                _.name <-- renderer.isCopied.map {
                  if (_) IconName.accept else IconName.copy
                }
              )(
                tw.text_white
              ),
              onClick --> { _ =>
                renderer.copy.onNext(())
              }
            )
          )
        }
      )()
    )
  }

}
