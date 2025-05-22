package www.views.icons

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Acc
import www.components.CustomIcons
import www.libs.scalawind.*

import scala.scalajs.js.WrappedDictionary

object IconsView {
  def renderIcon(icon: HtmlElement, name: String) = {
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
          icon
        )
      ),
      div(
        tw.text_center,
        div(
          tw.text_xs.truncate,
          s"${name}"
        )
      )
    )
  }
  def renderIconCard(item: IconCollection.IconItem) = {
    renderIcon(
      icon = Icon(
        _.accessibleName := item.name,
        _.name           := item.iconName,
        _.showTooltip    := true
      )(
        width.rem(2),
        height.rem(2)
      ),
      name = item.name
    )
  }

  def renderCustomIcons(data: WrappedDictionary[Acc]) = {
    div(
      tw.flex.flex_wrap.gap_2,
      data.keys.toList.map { iconName =>
        iconName match
          case name: CustomIcons.CustomIcon =>
            renderIcon(
              icon = Icon()(
                CustomIcons.name := name,
                width.rem(2),
                height.rem(2)
              ),
              name = iconName
            )
          case _ => emptyNode
      }
    )

  }

  def apply(): HtmlElement = {
    sectionTag(
      div(
        h2("Custom"),
        renderCustomIcons(CustomIcons.iconData)
      )
    )
  }
}
