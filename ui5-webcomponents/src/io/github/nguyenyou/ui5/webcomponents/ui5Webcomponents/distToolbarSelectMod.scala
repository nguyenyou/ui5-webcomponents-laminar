package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.CloseOpen
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Closeoverflow
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.IOption
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.SelectChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.ToolbarItemEventDetail
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSelectMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-select` component is used to create a toolbar drop-down list.
    * The items inside the `ui5-toolbar-select` define the available options by using the `ui5-toolbar-select-option` component.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ToolbarSelect.js";`
    *
    * `import "@ui5/webcomponents/dist/ToolbarSelectOption.js";` (comes with `ui5-toolbar-select`)
    * @constructor
    * @abstract
    * @extends ToolbarItem
    * @public
    * @since 1.17.0
    */
  @JSImport("@ui5/webcomponents/dist/ToolbarSelect.js", JSImport.Default)
  @js.native
  open class default () extends ToolbarSelect
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-select` component is used to create a toolbar drop-down list.
    * The items inside the `ui5-toolbar-select` define the available options by using the `ui5-toolbar-select-option` component.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ToolbarSelect.js";`
    *
    * `import "@ui5/webcomponents/dist/ToolbarSelectOption.js";` (comes with `ui5-toolbar-select`)
    * @constructor
    * @abstract
    * @extends ToolbarItem
    * @public
    * @since 1.17.0
    */
  @js.native
  trait ToolbarSelect
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default {
    
    def _syncOptions(selectedOption: HTMLElement): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @public
      * @default undefined
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the select.
      * @default undefined
      * @public
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_ToolbarSelect: Closeoverflow & CloseOpen = js.native
    
    def onChange(e: CustomEvent): Unit = js.native
    
    def onClick(e: Event): Unit = js.native
    
    def onClose(e: Event): Unit = js.native
    
    def onOpen(e: Event): Unit = js.native
    
    /**
      * Defines the component options.
      *
      * **Note:** Only one selected option is allowed.
      * If more than one option is defined as selected, the last one would be considered as the selected one.
      *
      * **Note:** Use the `ui5-toolbar-select-option` component to define the desired options.
      * @public
      */
    var options: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSelectOptionMod.default
      ] = js.native
    
    def styles: `0` = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the width of the select.
      *
      * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
      * @default undefined
      * @public
      */
    var width: js.UndefOr[String] = js.native
  }
  
  trait ToolbarSelectChangeEventDetail
    extends StObject
       with ToolbarItemEventDetail
       with SelectChangeEventDetail
  object ToolbarSelectChangeEventDetail {
    
    inline def apply(selectedOption: IOption, targetRef: HTMLElement): ToolbarSelectChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedOption = selectedOption.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarSelectChangeEventDetail]
    }
  }
}
