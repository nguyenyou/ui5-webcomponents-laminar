package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.InputEvent
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.CalcedMaxLength
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Information
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Last
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Scroll
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextAreaMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-textarea` component is used to enter multiple rows of text.
    *
    * When empty, it can hold a placeholder similar to a `ui5-input`.
    * You can define the rows of the `ui5-textarea` and also determine specific behavior when handling long texts.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TextArea.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart textarea - Used to style the native textarea
    */
  @JSImport("@ui5/webcomponents/dist/TextArea.js", JSImport.Default)
  @js.native
  open class default () extends TextArea
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TextArea.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TextArea.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait ExceededText extends StObject {
    
    var calcedMaxLength: js.UndefOr[Double] = js.undefined
    
    var exceededText: js.UndefOr[String] = js.undefined
    
    var leftCharactersCount: js.UndefOr[Double] = js.undefined
  }
  object ExceededText {
    
    inline def apply(): ExceededText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceededText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExceededText] (val x: Self) extends AnyVal {
      
      inline def setCalcedMaxLength(value: Double): Self = StObject.set(x, "calcedMaxLength", value.asInstanceOf[js.Any])
      
      inline def setCalcedMaxLengthUndefined: Self = StObject.set(x, "calcedMaxLength", js.undefined)
      
      inline def setExceededText(value: String): Self = StObject.set(x, "exceededText", value.asInstanceOf[js.Any])
      
      inline def setExceededTextUndefined: Self = StObject.set(x, "exceededText", js.undefined)
      
      inline def setLeftCharactersCount(value: Double): Self = StObject.set(x, "leftCharactersCount", value.asInstanceOf[js.Any])
      
      inline def setLeftCharactersCountUndefined: Self = StObject.set(x, "leftCharactersCount", js.undefined)
    }
  }
  
  type IndexedTokenizedText = js.Array[Last]
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-textarea` component is used to enter multiple rows of text.
    *
    * When empty, it can hold a placeholder similar to a `ui5-input`.
    * You can define the rows of the `ui5-textarea` and also determine specific behavior when handling long texts.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TextArea.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart textarea - Used to style the native textarea
    */
  @js.native
  trait TextArea extends IFormInputElement {
    
    def _ariaInvalid: js.UndefOr[`true`] = js.native
    
    def _calcExceededText(): CalcedMaxLength = js.native
    
    var _exceededTextProps: ExceededText = js.native
    
    var _firstRendering: Boolean = js.native
    
    def _fnOnResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_fnOnResize")
    var _fnOnResize_Original: ResizeObserverCallback = js.native
    
    def _getPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    var _keyDown: js.UndefOr[Boolean] = js.native
    
    def _mapTokenizedTextToObject(tokenizedText: TokenizedText): js.Array[Last] = js.native
    
    /**
      * @private
      */
    var _maxHeight: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var _mirrorText: IndexedTokenizedText = js.native
    
    def _onResize(): Unit = js.native
    
    def _onchange(): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _oninput(e: InputEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(): Unit = js.native
    
    def _onscroll(): Unit = js.native
    
    def _onselect(): Unit = js.native
    
    var _openValueStateMsgPopover: Boolean = js.native
    
    def _setCSSParams(): Unit = js.native
    
    def _tokenizeText(value: String): js.Array[Last] = js.native
    
    def _valueStatePopoverHorizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    /**
      * @private
      */
    var _width: js.UndefOr[Double] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the textarea.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaDescribedBy: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def ariaValueStateHiddenText: js.UndefOr[String] = js.native
    
    def closePopover(): Unit = js.native
    
    /**
      * Indicates whether the user can interact with the component or not.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def displayValueStateMessagePopover: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_TextArea: Scroll = js.native
    
    /**
      * @private
      */
    var exceeding: Boolean = js.native
    
    /**
      * @private
      */
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MTextArea(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MTextArea: FormData | String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MTextArea: String = js.native
    
    @JSName("formValidity")
    def formValidity_MTextArea: ValidityStateFlags = js.native
    
    def getInputDomRef(): HTMLTextAreaElement = js.native
    
    /**
      * Enables the component to automatically grow and shrink dynamically with its content.
      * @default false
      * @public
      */
    var growing: Boolean = js.native
    
    /**
      * Defines the maximum number of rows that the component can grow.
      * @default 0
      * @public
      */
    var growingMaxRows: Double = js.native
    
    def hasCustomValueState: Boolean = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines the maximum number of characters that the `value` can have.
      * @default undefined
      * @public
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    def openPopover(): Unit = js.native
    
    def openValueStateMsgPopover: Boolean = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    var previousValue: String = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 1.0.0-rc.3
      */
    var required: Boolean = js.native
    
    /**
      * Defines the number of visible text rows for the component.
      *
      * **Notes:**
      *
      * - If the `growing` property is enabled, this property defines the minimum rows to be displayed
      * in the textarea.
      * - The CSS `height` property wins over the `rows` property, if both are set.
      * @default 0
      * @public
      */
    var rows: Double = js.native
    
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
      */
    var showExceededText: Boolean = js.native
    
    @JSName("tabIndex")
    def tabIndex_MTextArea: `0` | `-1` = js.native
    
    def toggleValueStateMessage(toggle: Boolean): Unit = js.native
    
    /**
      * Defines the value of the component.
      * @formEvents change input
      * @formProperty
      * @default ""
      * @public
      */
    var value: String = js.native
    
    /**
      * Defines the value state of the component.
      *
      * **Note:** If `maxlength` property is set,
      * the component turns into "Critical" state once the characters exceeds the limit.
      * In this case, only the "Negative" state is considered and can be applied.
      * @default "None"
      * @since 1.0.0-rc.7
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateDefaultText: String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * The value state message slot should contain only one root element.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed if the component has
      * `valueState` of type `Information`, `Critical` or `Negative`.
      * @since 1.0.0-rc.7
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    var valueStatePopover: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default] = js.native
    
    def valueStateTextMappings: Information = js.native
    
    def valueStateTypeMappings: Information = js.native
  }
  
  type TokenizedText = js.Array[String]
}
