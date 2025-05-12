package www.components

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.facades.CodeToHtmlOptions
import www.facades.Shiki
import www.libs.scalawind.*

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

object Codeblock {

  def apply(source: String): HtmlElement = {
    div(
      tw.relative,
      div(
        onMountCallback { ctx =>
          Shiki
            .codeToHtml(
              source,
              CodeToHtmlOptions(
                lang = "scala",
                theme = "github-dark-dimmed"
              )
            )
            .toFuture
            .onComplete {
              case Failure(_) => ()
              case Success(value) =>
                ctx.thisNode.ref.innerHTML = value
            }
        },
        source.trim
      ),
      Copy(
        content = Val(source.trim),
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
