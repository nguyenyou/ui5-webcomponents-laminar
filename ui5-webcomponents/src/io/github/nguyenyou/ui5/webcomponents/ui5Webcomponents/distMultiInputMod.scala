package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Select
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Tokendelete
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`hiddenText-value-help`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMultiInputMod {
  
  /**
    * @class
    * ### Overview
    * A `ui5-multi-input` field allows the user to enter multiple values, which are displayed as `ui5-token`.
    *
    * User can choose interaction for creating tokens.
    * Fiori Guidelines say that user should create tokens when:
    *
    * - Type a value in the input and press enter or focus out the input field (`change` event is fired)
    * - Move between suggestion items (`selection-change` event is fired)
    * - Clicking on a suggestion item (`selection-change` event is fired if the clicked item is different than the current value. Also `change` event is fired )
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MultiInput.js";`
    * @constructor
    * @extends Input
    * @since 1.0.0-rc.9
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/MultiInput", JSImport.Default)
  @js.native
  open class default () extends MultiInput
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IToken
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var isTruncatable: Boolean = js.native
    
    var readonly: Boolean = js.native
    
    var selected: Boolean = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    * ### Overview
    * A `ui5-multi-input` field allows the user to enter multiple values, which are displayed as `ui5-token`.
    *
    * User can choose interaction for creating tokens.
    * Fiori Guidelines say that user should create tokens when:
    *
    * - Type a value in the input and press enter or focus out the input field (`change` event is fired)
    * - Move between suggestion items (`selection-change` event is fired)
    * - Clicking on a suggestion item (`selection-change` event is fired if the clicked item is different than the current value. Also `change` event is fired )
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MultiInput.js";`
    * @constructor
    * @extends Input
    * @since 1.0.0-rc.9
    * @public
    */
  @js.native
  trait MultiInput
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default {
    
    def _focusFirstToken(e: KeyboardEvent): Unit = js.native
    
    def _handleBackspace(e: KeyboardEvent): Unit = js.native
    
    def _handleLeft(e: KeyboardEvent): Unit = js.native
    
    def _onTokenizerKeydown(e: KeyboardEvent): Unit = js.native
    
    var _skipOpenSuggestions: Boolean = js.native
    
    def _tokenizerFocusOut(e: FocusEvent): Unit = js.native
    
    def _tokensCountText: String = js.native
    
    def _tokensCountTextId: String = js.native
    
    var _valueHelpIconPressed: Boolean = js.native
    
    def _valueHelpText: String = js.native
    
    def _valueHelpTextId: _empty | `hiddenText-value-help` = js.native
    
    @JSName("ariaRoleDescription")
    def ariaRoleDescription_MMultiInput: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_MultiInput: Select & Tokendelete = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MMultiInput: FormData | String | Null = js.native
    
    @JSName("formValidity")
    def formValidity_MMultiInput: ValidityStateFlags = js.native
    
    def morePopoverOpener: HTMLElement = js.native
    
    /**
      * Determines the name by which the component will be identified upon submission in an HTML form.
      *
      * **Note:** This property is only applicable within the context of an HTML Form element.
      * **Note:** When the component is used inside a form element,
      * the value is sent as the first element in the form data, even if it's empty.
      * @default undefined
      * @public
      */
    @JSName("name")
    var name_MultiInput: js.UndefOr[String] = js.native
    
    /**
      * Determines whether a value help icon will be visualized in the end of the input.
      * Pressing the icon will fire `value-help-trigger` event.
      * @default false
      * @public
      */
    var showValueHelpIcon: Boolean = js.native
    
    def tokenDelete(e: CustomEvent): Unit = js.native
    
    def tokenizer: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.default = js.native
    
    /**
      * Indicates whether the tokenizer has tokens
      * @default false
      * @private
      */
    var tokenizerAvailable: Boolean = js.native
    
    def tokenizerExpanded: Boolean = js.native
    
    /**
      * Defines the component tokens.
      * @public
      */
    var tokens: js.Array[IToken] = js.native
    
    def valueHelpLabel: String = js.native
    
    def valueHelpMouseDown(e: MouseEvent): Unit = js.native
    
    def valueHelpMouseUp(): Unit = js.native
    
    def valueHelpPress(): Unit = js.native
  }
  
  trait MultiInputTokenDeleteEventDetail extends StObject {
    
    var tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]
  }
  object MultiInputTokenDeleteEventDetail {
    
    inline def apply(tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): MultiInputTokenDeleteEventDetail = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiInputTokenDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiInputTokenDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTokens(value: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
