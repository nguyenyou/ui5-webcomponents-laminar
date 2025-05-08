package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.BreadcrumbsItem as BreadcrumbsItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object BreadcrumbsItem extends WebComponent("ui5-breadcrumbs-item") {

  @JSImport("@ui5/webcomponents/dist/BreadcrumbsItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = BreadcrumbsItem.type

  type Ref = BreadcrumbsItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the item.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the link href.
    *
    * **Note:** Standard hyperlink behavior is supported.
    *
    * Default: undefined
    */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Defines the link target.
    *
    * Available options are:
    *
    *   - `_self`
    *   - `_top`
    *   - `_blank`
    *   - `_parent`
    *   - `_search`
    *
    * **Note:** This property must only be used when the `href` property is set.
    *
    * Default: undefined
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
