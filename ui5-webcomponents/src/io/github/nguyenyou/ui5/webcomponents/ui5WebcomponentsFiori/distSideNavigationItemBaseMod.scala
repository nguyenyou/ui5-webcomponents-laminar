package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ClickSideNavigationItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationItemBaseMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItemBase.js", JSImport.Namespace)
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
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItemBase.js", JSImport.Default)
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
    
    /**
      * Defines if the item's group is disabled.
      * @private
      * @default false
      * @since 2.10.0
      */
    var _groupDisabled: Boolean = js.native
    
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
    
    def effectiveDisabled: Boolean = js.native
    
    def effectiveTabIndex: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_SideNavigationItemBase: ClickSideNavigationItemClickEventDetail = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    def hasSubItems: Boolean = js.native
    
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
      * A tooltip attribute should be provided, in order to represent meaning/function,
      * when the component is collapsed ("icon only" design is visualized) or the item text is truncated.
      *
      * @default undefined
      * @public
      * @since 2.0.0
      */
    var tooltip: js.UndefOr[String] = js.native
  }
  
  trait SideNavigationItemClickEventDetail extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
  }
  object SideNavigationItemClickEventDetail {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): SideNavigationItemClickEventDetail = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavigationItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
