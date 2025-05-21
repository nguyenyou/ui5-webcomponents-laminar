package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormMod.IFormItem
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The FormItem (ui5-form-item) represents pair of a label and
    * one or more components (text or text fields), associated to it.
    *
    * ### Usage
    *
    * The FormItem is being used in FormGroup (ui5-form-group) or directly in Form (ui5-form).
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/FormItem.js";
    *
    * @csspart layout - Used to style the parent element of the label and content parts.
    * @csspart label - Used to style the label part of the form item.
    * @csspart content - Used to style the content part of the form item.
    *
    * @constructor
    * @implements {IFormItem}
    * @public
    * @since 2.0.0
    * @extends UI5Element
    */
  @JSImport("@ui5/webcomponents/dist/FormItem", JSImport.Default)
  @js.native
  open class default () extends FormItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * The FormItem (ui5-form-item) represents pair of a label and
    * one or more components (text or text fields), associated to it.
    *
    * ### Usage
    *
    * The FormItem is being used in FormGroup (ui5-form-group) or directly in Form (ui5-form).
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/FormItem.js";
    *
    * @csspart layout - Used to style the parent element of the label and content parts.
    * @csspart label - Used to style the label part of the form item.
    * @csspart content - Used to style the content part of the form item.
    *
    * @constructor
    * @implements {IFormItem}
    * @public
    * @since 2.0.0
    * @extends UI5Element
    */
  @js.native
  trait FormItem extends IFormItem {
    
    /**
      * Defines the content of the component,
      * associated to `labelContent`.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    @JSName("isGroup")
    def isGroup_MFormItem: Boolean = js.native
    
    /**
      * Defines the label of the component.
      * @public
      */
    var labelContent: js.Array[HTMLElement] = js.native
  }
}
