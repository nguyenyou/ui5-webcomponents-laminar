package www.components

import com.raquo.laminar.api.L.*
import www.facades.Marked

object Markdown {
  def apply(content: String): HtmlElement = {
    div(
      cls("typography"),
      onMountCallback { ctx =>
        ctx.thisNode.ref.innerHTML = Marked.parse(content)
      }
    )
  }
}
