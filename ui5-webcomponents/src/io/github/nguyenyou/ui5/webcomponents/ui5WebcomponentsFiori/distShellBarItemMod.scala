package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.LowercaseString
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ClickShellBarItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShellBarItemMod {
  
  /**
    * Interface for components that may be slotted inside `ui5-shellbar` as items
    * @public
    */
  /**
    * @class
    * The `ui5-shellbar-item` represents a custom item, that
    * might be added to the `ui5-shellbar`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/ShellBarItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarItem.js", JSImport.Default)
  @js.native
  open class default () extends ShellBarItem
  
  /**
    * Interface for components that may be slotted inside `ui5-shellbar` as items
    * @public
    */
  /**
    * @class
    * The `ui5-shellbar-item` represents a custom item, that
    * might be added to the `ui5-shellbar`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/ShellBarItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    */
  @js.native
  trait ShellBarItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines additional accessibility attributes on Shellbar Items.
      *
      * The accessibility attributes support the following values:
      *
      * - **expanded**: Indicates whether the button, or another grouping element it controls,
      * is currently expanded or collapsed.
      * Accepts the following string values: `true` or `false`.
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element,
      * such as menu or dialog, that can be triggered by the button.
      *
      * - **controls**: Identifies the element (or elements) whose contents
      * or presence are controlled by the component.
      * Accepts a lowercase string value, referencing the ID of the element it controls.
      *
      * @default {}
      * @public
      * @since 2.9.0
      */
    var accessibilityAttributes: ShellBarItemAccessibilityAttributes = js.native
    
    /**
      * Defines the count displayed in the top-right corner.
      * @default undefined
      * @since 1.0.0-rc.6
      * @public
      */
    var count: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_ShellBarItem: ClickShellBarItemClickEventDetail = js.native
    
    @JSName("fireClickEvent")
    def fireClickEvent_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Boolean = js.native
    
    /**
      * Defines the name of the item's icon.
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    def stableDomRef: String = js.native
    
    /**
      * Defines the item text.
      *
      * **Note:** The text is only displayed inside the overflow popover list view.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'expanded' | 'hasPopup' | 'controls'> */
  trait ShellBarItemAccessibilityAttributes extends StObject {
    
    var controls: js.UndefOr[LowercaseString[String]] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object ShellBarItemAccessibilityAttributes {
    
    inline def apply(): ShellBarItemAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellBarItemAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarItemAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setControls(value: LowercaseString[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  trait ShellBarItemClickEventDetail extends StObject {
    
    var targetRef: HTMLElement
  }
  object ShellBarItemClickEventDetail {
    
    inline def apply(targetRef: HTMLElement): ShellBarItemClickEventDetail = {
      val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShellBarItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellBarItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
