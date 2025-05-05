package website.components

import com.raquo.laminar.api.L.*
import website.views
import website.Pages.*
import website.AppRouter.*
import website.docPages
import website.facades.scrollIntoViewIfNeeded
import org.scalajs.dom
import website.facades.ScrollOptions
import io.github.nguyenyou.scalawind.*
import website.extensions.scalawind.*
case class Sidebar() {
  private case class IndicatorStyles(height: Int, width: Int, top: Int)

  private val activeLinkRefVar = Var[Option[dom.Element]](None)

  val scrollContainer = div(tw.relative.h_full.overflow_y_auto)

  private def pageLink(
      page: Page,
      title: Option[String] = None
  ): HtmlElement = {
    val tag            = a()
    val isActiveSignal = currentPageSignal.map(_ == page).distinct
    tag
      .amend(
        tw.group.relative.flex.h_8.w_full.items_center.rounded_lg.px_3.font_normal.text_sap_text,
        tw.font_medium.sidebar_item_hover.text_sap_brand <-- isActiveSignal,
        tw.hover(tw.sidebar_item_hover).transition_all.ease_linear,
        navigateTo(page),
        title.getOrElse(page.title),
        isActiveSignal --> Observer[Boolean] { isActive =>
          if (isActive) {
            activeLinkRefVar.set(Some(tag.ref))
          }
        }
      )
  }

  private val scrollToViewSubscription =
    activeLinkRefVar.signal.distinct --> Observer[Option[dom.Element]] {
      case Some(ref) =>
        dom.window.requestAnimationFrame { _ =>
          scrollIntoViewIfNeeded(
            ref,
            ScrollOptions(
              behavior = ScrollOptions.SMOOTH,
              block = ScrollOptions.CENTER,
              inline = ScrollOptions.CENTER,
              scrollMode = ScrollOptions.IF_NEEDED,
              boundary = scrollContainer.ref
            )
          )
        }
      case None => ()
    }

  def apply(): HtmlElement = {
    asideTag(
      tw.relative.border_grid.fixed.top_14.z_30.hidden,
      tw.w_full.shrink_0.border_r.md(tw.sticky.block),
      cls("h-[calc(100vh-3.5rem)]"),
      scrollContainer.amend(
        tw.no_scrollbar.h_full.overflow_auto.py_6.pr_4.lg(tw.py_8),
        div(
          tw.flex.flex_col.gap_6,
          div(
            div(
              tw.rounded_md.px_2.py_1.text_sm.font_medium,
              "Components"
            ),
            div(
              tw.grid.grid_flow_row.auto_rows_max.`gap_0.5`.text_sm,
              docPages.map(page => pageLink(page))
            )
          )
        )
      )
    ).amend(
      scrollToViewSubscription
    )
  }

}
