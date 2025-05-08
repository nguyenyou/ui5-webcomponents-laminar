package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`ui5-sn-item-group-below-group`
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationGroupMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * Represents a group of navigation actions within `ui5-side-navigation`.
    * The `ui5-side-navigation-group` can only be used inside a `ui5-side-navigation`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationGroup.js";`
    *
    * @constructor
    * @extends SideNavigationItemBase
    * @public
    * @abstract
    * @since 1.24.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationGroup", JSImport.Default)
  @js.native
  open class default () extends SideNavigationGroup
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationGroup", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  inline def isInstanceOfSideNavigationGroup(`object`: Any): /* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationGroup.SideNavigationGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfSideNavigationGroup")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationGroup.SideNavigationGroup */ Boolean]
  
  /**
    * @class
    *
    * ### Overview
    *
    * Represents a group of navigation actions within `ui5-side-navigation`.
    * The `ui5-side-navigation-group` can only be used inside a `ui5-side-navigation`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationGroup.js";`
    *
    * @constructor
    * @extends SideNavigationItemBase
    * @public
    * @abstract
    * @since 1.24.0
    */
  @js.native
  trait SideNavigationGroup
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default {
    
    def _arrowTooltip: String = js.native
    
    def _expanded: js.UndefOr[Boolean] = js.native
    
    def _groupId: js.UndefOr[String] = js.native
    
    def _onclick(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _toggle(): Unit = js.native
    
    def allItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def belowGroupClassName: _empty | `ui5-sn-item-group-below-group` = js.native
    
    /**
      * Defines if the item is expanded
      *
      * @public
      * @default false
      */
    var expanded: Boolean = js.native
    
    def focusableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def isSideNavigationGroup: Boolean = js.native
    
    /**
      * Defines nested items by passing `ui5-side-navigation-item` to the default slot.
      *
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default
      ] = js.native
    
    def overflowItems: js.Array[HTMLElement] = js.native
    
    def selectableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
  }
}
