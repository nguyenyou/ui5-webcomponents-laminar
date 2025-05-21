package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonStateMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-ai-button-state` is the item to use for defining states of `ui5-ai-button` components.
    *
    * ### Usage
    *
    * `ui5-ai-button-state` is an abstract element, representing a state of `ui5-ai-button`. It is meant to be used in the `default` slot
    * of `ui5-ai-button` and should not be used as standalone component.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/AiButtonState.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 2.0.0
    * @public
    * @experimental The Button and ButtonState web components are available since 2.0 under an experimental flag and their API and behaviour are subject to change.
    */
  @JSImport("@ui5/webcomponents-ai/dist/ButtonState", JSImport.Default)
  @js.native
  open class default () extends ButtonState
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-ai-button-state` is the item to use for defining states of `ui5-ai-button` components.
    *
    * ### Usage
    *
    * `ui5-ai-button-state` is an abstract element, representing a state of `ui5-ai-button`. It is meant to be used in the `default` slot
    * of `ui5-ai-button` and should not be used as standalone component.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/AiButtonState.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 2.0.0
    * @public
    * @experimental The Button and ButtonState web components are available since 2.0 under an experimental flag and their API and behaviour are subject to change.
    */
  @js.native
  trait ButtonState
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the icon to be displayed as graphical element within the component after the text.
      * The SAP-icons font provides numerous options.
      *
      * **Example:**
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var endIcon: js.UndefOr[String] = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the component before the text.
      * The SAP-icons font provides numerous options.
      *
      * **Example:**
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines the name of the button state.
      * @default undefined
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Defines if the component is in split button mode.
      * @default false
      * @since 2.6.0
      * @public
      */
    var showArrowButton: Boolean = js.native
    
    /**
      * Defines the text of the button in this state.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
