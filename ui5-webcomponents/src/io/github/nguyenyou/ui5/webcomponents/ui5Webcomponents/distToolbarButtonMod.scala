package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.DisplayString
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.LowercaseString
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-button` represents an abstract action,
    * used in the `ui5-toolbar`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ToolbarButton.js";`
    * @constructor
    * @abstract
    * @extends ToolbarItem
    * @public
    * @since 1.17.0
    */
  @JSImport("@ui5/webcomponents/dist/ToolbarButton", JSImport.Default)
  @js.native
  open class default () extends ToolbarButton
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-button` represents an abstract action,
    * used in the `ui5-toolbar`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ToolbarButton.js";`
    * @constructor
    * @abstract
    * @extends ToolbarItem
    * @public
    * @since 1.17.0
    */
  @js.native
  trait ToolbarButton
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default {
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      *
      * The following fields are supported:
      *
      * - **expanded**: Indicates whether the button, or another grouping element it controls, is currently expanded or collapsed.
      * Accepts the following string values: `true` or `false`
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button.
      * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
      *
      * - **controls**: Identifies the element (or elements) whose contents or presence are controlled by the button element.
      * Accepts a lowercase string value.
      *
      * @default {}
      * @public
      */
    var accessibilityAttributes: ToolbarButtonAccessibilityAttributes = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the action design.
      * @default "Default"
      * @public
      */
    var design: /* template literal string: ${ButtonDesign} */ String = js.native
    
    /**
      * Defines if the action is disabled.
      *
      * **Note:** a disabled action can't be pressed or focused, and it is not in the tab chain.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component after the button text.
      *
      * **Note:** It is highly recommended to use `endIcon` property only together with `icon` and/or `text` properties.
      * Usage of `endIcon` only should be avoided.
      *
      * The SAP-icons font provides numerous options.
      *
      * Example:
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var endIcon: js.UndefOr[String] = js.native
    
    /**
      * Defines the `icon` source URI.
      *
      * **Note:** SAP-icons font provides numerous buil-in icons. To find all the available icons, see the
      * [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    def onClick(e: Event): Unit = js.native
    
    def styles: DisplayString = js.native
    
    /**
      * Button text
      * @public
      * @default undefined
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Defines the tooltip of the component.
      *
      * **Note:** A tooltip attribute should be provided for icon-only buttons, in order to represent their exact meaning/function.
      * @default undefined
      * @public
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines the width of the button.
      *
      * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
      * @default undefined
      * @public
      */
    var width: js.UndefOr[String] = js.native
  }
  
  /* Inlined @ui5/webcomponents.@ui5/webcomponents/dist/Button.ButtonAccessibilityAttributes */
  trait ToolbarButtonAccessibilityAttributes extends StObject {
    
    var controls: js.UndefOr[LowercaseString[String]] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object ToolbarButtonAccessibilityAttributes {
    
    inline def apply(): ToolbarButtonAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarButtonAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarButtonAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setControls(value: LowercaseString[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
}
