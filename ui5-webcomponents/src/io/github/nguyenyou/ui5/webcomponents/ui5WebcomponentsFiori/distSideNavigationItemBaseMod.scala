package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ClickVoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationItemBaseMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItemBase", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    * Base class for the items that are accepted by the `ui5-side-navigation` component.
    *
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.19.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItemBase", JSImport.Default)
  @js.native
  open class default () extends SideNavigationItemBase
  
  inline def isInstanceOfSideNavigationItemBase(`object`: Any): /* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationItemBase.SideNavigationItemBase */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfSideNavigationItemBase")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationItemBase.SideNavigationItemBase */ Boolean]
  
  /**
    * @class
    * Base class for the items that are accepted by the `ui5-side-navigation` component.
    *
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.19.0
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait SideNavigationItemBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _classes: String = js.native
    
    var _sideNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.default = js.native
    
    def _tooltip: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    def applyInitialFocusInPopover(): Unit = js.native
    
    def classesArray: js.Array[String] = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      *
      * @default false
      * @public
      * @since 1.19.0
      */
    var disabled: Boolean = js.native
    
    def effectiveTabIndex: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_SideNavigationItemBase: ClickVoid = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var inPopover: Boolean = js.native
    
    def isFixedItem: Boolean = js.native
    
    def isSideNavigationItemBase: Boolean = js.native
    
    var sideNavCollapsed: Boolean = js.native
    
    def sideNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.default = js.native
    def sideNavigation_=(
      sideNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.default
    ): Unit = js.native
    
    /**
      * Defines the text of the item.
      *
      * @public
      * @default undefined
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Defines the tooltip of the component.
      *
      * A tooltip attribute should be provided, in order to represent meaning/function, when the component is collapsed(icon only is visualized).
      * @default undefined
      * @public
      * @since 2.0.0
      */
    var tooltip: js.UndefOr[String] = js.native
  }
}
