package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsMod.BreadcrumbsItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsDesignMod.BreadcrumbsDesign
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsMod.{Breadcrumbs as BreadcrumbsComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Breadcrumbs extends WebComponent("ui5-breadcrumbs") {

  @JSImport("@ui5/webcomponents/dist/Breadcrumbs.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Breadcrumbs.type

  type Ref = BreadcrumbsComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the visual appearance of the last BreadcrumbsItem.
    *
    * The Breadcrumbs supports two visual appearances for the last BreadcrumbsItem:
    *   - "Standard" - displaying the last item as "current page" (bold and without separator)
    *   - "NoCurrentPage" - displaying the last item as a regular BreadcrumbsItem, followed by separator
    *
    * Default: "Standard"
    */
  lazy val design: HtmlAttr[BreadcrumbsDesign] = htmlAttr("design", StringUnionCodec[BreadcrumbsDesign])
  type BreadcrumbsDesign = "Standard" | "NoCurrentPage"

  /** Determines the visual style of the separator between the breadcrumb items.
    *
    * Default: "Slash"
    */
  lazy val separators: HtmlAttr[BreadcrumbsSeparator] = htmlAttr("separators", StringUnionCodec[BreadcrumbsSeparator])
  type BreadcrumbsSeparator = "Slash" | "BackSlash" | "DoubleBackSlash" | "DoubleGreaterThan" | "DoubleSlash" |
    "GreaterThan"

  // -- Events --

  /** Fires when a `BreadcrumbsItem` is clicked.
    *
    * **Note:** You can prevent browser location change by calling `event.preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[BreadcrumbsItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  // -- Slots --

}
