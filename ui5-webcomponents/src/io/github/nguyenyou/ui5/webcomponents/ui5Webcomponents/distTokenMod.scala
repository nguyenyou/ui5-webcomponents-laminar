package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Delete
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiInputMod.IToken
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Tokens are small items of information (similar to tags) that mainly serve to visualize previously selected items.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Token.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.9
    * @implements {IToken}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Token", JSImport.Default)
  @js.native
  open class default () extends Token
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Token", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Token", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Tokens are small items of information (similar to tags) that mainly serve to visualize previously selected items.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Token.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.9
    * @implements {IToken}
    * @public
    */
  @js.native
  trait Token extends IToken {
    
    def _delete(): Unit = js.native
    
    def _focusin(): Unit = js.native
    
    def _focusout(): Unit = js.native
    
    def _handleSelect(): Unit = js.native
    
    def _keydown(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    @JSName("ariaDescription")
    def ariaDescription_MToken: String = js.native
    
    /**
      * Defines the close icon for the token. If nothing is provided to this slot, the default close icon will be used.
      * Accepts `ui5-icon`.
      * @public
      * @since 1.0.0-rc.9
      */
    var closeIcon: js.Array[HTMLElement] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Token: Delete = js.native
    
    /**
      * Defines whether the component is focused or not.
      * @default false
      * @private
      */
    var focused: Boolean = js.native
    
    /**
      * Defines the tabIndex of the component.
      * @private
      */
    @JSName("forcedTabIndex")
    var forcedTabIndex_Token: String = js.native
    
    @JSName("isTruncatable")
    def isTruncatable_MToken: Boolean = js.native
    
    /**
      * Set by the tokenizer when a token is in the "more" area (overflowing)
      * @default false
      * @private
      */
    var overflows: Boolean = js.native
    
    var singleToken: Boolean = js.native
    
    def textDom: js.UndefOr[Element | Null] = js.native
    
    /**
      * Defines whether the token is being deleted
      * This flag is used in the ui5-multi-combobox
      * @default false
      * @private
      */
    var toBeDeleted: Boolean = js.native
    
    def tokenDeletableText: String = js.native
  }
  
  trait TokenDeleteEventDetail extends StObject {
    
    var backSpace: js.UndefOr[Boolean] = js.undefined
    
    var delete: js.UndefOr[Boolean] = js.undefined
  }
  object TokenDeleteEventDetail {
    
    inline def apply(): TokenDeleteEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setBackSpace(value: Boolean): Self = StObject.set(x, "backSpace", value.asInstanceOf[js.Any])
      
      inline def setBackSpaceUndefined: Self = StObject.set(x, "backSpace", js.undefined)
      
      inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    }
  }
}
