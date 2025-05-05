package website.components

import com.raquo.laminar.api.L.*
import website.facades.hljs
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.scalawind.*

object Codeblock {

  def apply(source: String): HtmlElement = {
    div(
      tw.relative,
      pre(
        tw.m_0.whitespace_pre_wrap.text_sm.rounded_md.overflow_hidden
          .raw("language-scala"),
        code(
          tw.block.important(tw.px_8.py_6),
          onMountCallback(mnt => hljs.highlightElement(mnt.thisNode.ref)),
          source.trim
        )
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
