package www.views.icons

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import www.libs.scalawind.*

object IconsView {
  def renderIconCard(item: IconCollection.IconItem) = {
    div(
      tw.border_all.border_grid.overflow_hidden.p_2.rounded,
      width.px(120),
      height.px(120),
      tw.flex.flex_col.justify_center,
      div(
        tw.flex.justify_center,
        div(
          tw.inline_flex.items_center.justify_center.rounded,
          width.px(80),
          height.px(80),
          Icon(
            _.accessibleName := item.name,
            _.name           := item.iconName,
            _.showTooltip    := true
          )(
            width.rem(2),
            height.rem(2)
          )
        )
      ),
      div(
        tw.text_center,
        div(
          tw.text_xs.truncate,
          s"${item.name}"
        )
      )
    )
  }

  def apply(): HtmlElement = {
    sectionTag(
      div(
        h2("Base"),
        div(
          tw.flex.flex_wrap.gap_2,
          IconCollection.base.map { item =>
            renderIconCard(item)
          }
        )
      ),
      div(
        h2("Business Suite"),
        div(
          tw.flex.flex_wrap.gap_2,
          IconCollection.businessSuite.map { item =>
            renderIconCard(item)
          }
        )
      ),
      div(
        h2("TNT"),
        div(
          tw.flex.flex_wrap.gap_2,
          IconCollection.tnt.map { item =>
            renderIconCard(item)
          }
        )
      )
    )
  }
}
