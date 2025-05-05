package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Closeoverflow
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarItemMod {
  
  @JSImport("@ui5/webcomponents/dist/ToolbarItem", JSImport.Default)
  @js.native
  open class default () extends ToolbarItem
  
  trait IEventOptions extends StObject {
    
    var preventClosing: Boolean
  }
  object IEventOptions {
    
    inline def apply(preventClosing: Boolean): IEventOptions = {
      val __obj = js.Dynamic.literal(preventClosing = preventClosing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEventOptions] (val x: Self) extends AnyVal {
      
      inline def setPreventClosing(value: Boolean): Self = StObject.set(x, "preventClosing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToolbarItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Returns if the item contains text. Used to position the text properly inside the popover.
      * Aligned left if the item has text, default aligned otherwise.
      * @protected
      */
    def containsText: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_ToolbarItem: Closeoverflow = js.native
    
    /**
      * Returns if the item is flexible. An item that is returning true for this property will make
      * the toolbar expand to fill the 100% width of its container.
      * @protected
      */
    def hasFlexibleWidth: Boolean = js.native
    
    /**
      * Defines if the width of the item should be ignored in calculating the whole width of the toolbar
      * @protected
      */
    def ignoreSpace: Boolean = js.native
    
    /**
      * Returns if the item is interactive.
      * This value is used to determinate if the toolbar should have its accessibility role and attributes set.
      * At least two interactive items are needed for the toolbar to have the role="toolbar" attribute set.
      * @protected
      */
    def isInteractive: Boolean = js.native
    
    /**
      * Returns if the item is separator.
      * @protected
      */
    def isSeparator: Boolean = js.native
    
    /**
      * Property used to define the access of the item to the overflow Popover. If "NeverOverflow" option is set,
      * the item never goes in the Popover, if "AlwaysOverflow" - it never comes out of it.
      * @public
      * @default "Default"
      */
    var overflowPriority: /* template literal string: ${ToolbarItemOverflowBehavior} */ String = js.native
    
    /**
      * Defines if the toolbar overflow popup should close upon intereaction with the item.
      * It will close by default.
      * @default false
      * @public
      */
    var preventOverflowClosing: Boolean = js.native
    
    def stableDomRef: String = js.native
  }
  
  trait ToolbarItemEventDetail extends StObject {
    
    var targetRef: HTMLElement
  }
  object ToolbarItemEventDetail {
    
    inline def apply(targetRef: HTMLElement): ToolbarItemEventDetail = {
      val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarItemEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarItemEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
