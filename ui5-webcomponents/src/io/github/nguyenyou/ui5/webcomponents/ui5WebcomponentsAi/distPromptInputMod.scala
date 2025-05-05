package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.IInputSuggestionItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.anon.Change
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.ui5WebcomponentsAiStrings.`type-ahead`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.ui5WebcomponentsAiStrings.input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPromptInputMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-ai-prompt-input` component allows the user to write custom instructions in natural language, so that AI is guided to generate content tailored to user needs.
    *
    * **Note:** The web component is in an experimental state
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-ai/dist/PromptInput.js"`
    * @class
    * @constructor
    * @public
    * @extends UI5Element
    * @experimental The **@ui5/webcomponents-ai** package is under development and considered experimental - components' APIs are subject to change.
    */
  @JSImport("@ui5/webcomponents-ai/dist/PromptInput", JSImport.Default)
  @js.native
  open class default () extends PromptInput
  object default {
    
    @JSImport("@ui5/webcomponents-ai/dist/PromptInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-ai/dist/PromptInput", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-ai-prompt-input` component allows the user to write custom instructions in natural language, so that AI is guided to generate content tailored to user needs.
    *
    * **Note:** The web component is in an experimental state
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-ai/dist/PromptInput.js"`
    * @class
    * @constructor
    * @public
    * @extends UI5Element
    * @experimental The **@ui5/webcomponents-ai** package is under development and considered experimental - components' APIs are subject to change.
    */
  @js.native
  trait PromptInput
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _exceededText: js.UndefOr[String] = js.native
    
    def _maxLenght: js.UndefOr[Double] = js.native
    
    def _onButtonClick(): Unit = js.native
    
    def _onInnerChange(): Unit = js.native
    
    @JSName("_onInnerInput")
    def _onInnerInput_input(
      e: UI5CustomEvent[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default, input]
    ): Unit = js.native
    
    @JSName("_onTypeAhead")
    def _onTypeAhead_typeahead(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default, 
          `type-ahead`
        ]
    ): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _submitButtonDisabled: Boolean = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      * @since 2.0.0
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_PromptInput: Change = js.native
    
    /**
      * Defines the label of the input field.
      *
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Sets the maximum number of characters available in the input field.
      *
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the
      * component has no value.
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      * @default false
      * @public
      * @since 2.0.0
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the clear icon of the input will be shown.
      * @default false
      * @public
      * @since 2.0.0
      */
    var showClearIcon: Boolean = js.native
    
    /**
      * Determines whether the characters exceeding the maximum allowed character count are visible
      * in the component.
      *
      * If set to `false`, the user is not allowed to enter more characters than what is set in the
      * `maxlength` property.
      * If set to `true` the characters exceeding the `maxlength` value are selected on
      * paste and the counter below the component displays their number.
      * @default false
      * @public
      * @since 2.0.0
      */
    var showExceededText: Boolean = js.native
    
    /**
      * Defines whether the component should show suggestions, if such are present.
      *
      * @default false
      * @public
      */
    var showSuggestions: Boolean = js.native
    
    /**
      * Defines the suggestion items.
      *
      * **Note:** The suggestions would be displayed only if the `showSuggestions`
      * property is set to `true`.
      *
      * **Note:** The `<ui5-suggestion-item>`, `<ui5-suggestion-item-group>` and `ui5-suggestion-item-custom` are recommended to be used as suggestion items.
      *
      * @public
      */
    var suggestionItems: js.Array[IInputSuggestionItem] = js.native
    
    /**
      * Defines the value of the component.
      *
      * @default ""
      * @since 2.0.0
      * @public
      */
    var value: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @since 2.0.0
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * The value state message slot should contain only one root element.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      *
      * @since 2.0.0
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
  }
}
