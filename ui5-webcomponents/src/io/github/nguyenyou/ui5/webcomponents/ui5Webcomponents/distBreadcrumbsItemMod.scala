package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PickAccessibilityAttributCurrent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign.Default
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesLinkDesignMod.LinkDesign.Emphasized
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBreadcrumbsItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-breadcrumbs-item` component defines the content of an item in `ui5-breadcrumbs`.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    * @abstract
    */
  @JSImport("@ui5/webcomponents/dist/BreadcrumbsItem.js", JSImport.Default)
  @js.native
  open class default () extends BreadcrumbsItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-breadcrumbs-item` component defines the content of an item in `ui5-breadcrumbs`.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    * @abstract
    */
  @js.native
  trait BreadcrumbsItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _accessibleNameText: js.UndefOr[String] = js.native
    
    var _isCurrentPageItem: js.UndefOr[Boolean] = js.native
    
    def _linkDesign: Default | Emphasized = js.native
    
    var _needsSeparator: js.UndefOr[Boolean] = js.native
    
    def accessibilityAttributes: PickAccessibilityAttributCurrent = js.native
    
    /**
      * Defines the accessible ARIA name of the item.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the link href.
      *
      * **Note:** Standard hyperlink behavior is supported.
      * @default undefined
      * @public
      */
    var href: js.UndefOr[String] = js.native
    
    def stableDomRef: String = js.native
    
    /**
      * Defines the link target.
      *
      * Available options are:
      *
      * - `_self`
      * - `_top`
      * - `_blank`
      * - `_parent`
      * - `_search`
      *
      * **Note:** This property must only be used when the `href` property is set.
      * @default undefined
      * @public
      */
    var target: js.UndefOr[String] = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
