package www.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.facades.*
import www.libs.scalawind.*

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

object Codeblock {
  val themeVar    = Var("github-dark-dimmed")
  val themeSignal = themeVar.signal.distinct

  val ThemeSwitcher = div(
    Select()(
      UOption()("github-dark-dimmed"),
      UOption()("monokai")
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
