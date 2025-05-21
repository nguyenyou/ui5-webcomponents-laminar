package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormMod.IFormItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormGroupMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The FormGroup (ui5-form-group) represents a group inside the Form (ui5-form) component
    * and it consists of FormItem (ui5-form-item) components.
    *
    * The layout of the FormGroup is mostly defined and controlled by the overarching Form (ui5-form) component.
    * Still, one can influence the layout via the FormGroup's `columnSpan` property,
    * that defines how many columns the group should expand to.
    *
    * ### Usage
    *
    * Тhe FormGroup (ui5-form-group) allows to split a Form into groups,
    * e.g to group FormItems that logically belong together.
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/FormGroup.js";
    *
    * @public
    * @implements {IFormItem}
    * @since 2.0.0
    * @extends UI5Element
    */
  @JSImport("@ui5/webcomponents/dist/FormGroup.js", JSImport.Default)
  @js.native
  open class default () extends FormGroup
  
  /**
    * @class
    *
    * ### Overview
    *
    * The FormGroup (ui5-form-group) represents a group inside the Form (ui5-form) component
    * and it consists of FormItem (ui5-form-item) components.
    *
    * The layout of the FormGroup is mostly defined and controlled by the overarching Form (ui5-form) component.
    * Still, one can influence the layout via the FormGroup's `columnSpan` property,
    * that defines how many columns the group should expand to.
    *
    * ### Usage
    *
    * Тhe FormGroup (ui5-form-group) allows to split a Form into groups,
    * e.g to group FormItems that logically belong together.
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/FormGroup.js";
    *
    * @public
    * @implements {IFormItem}
    * @since 2.0.0
    * @extends UI5Element
    */
  @js.native
  trait FormGroup extends IFormItem {
    
    @JSName("colsL")
    var colsL_FormGroup: Double = js.native
    
    @JSName("colsM")
    var colsM_FormGroup: Double = js.native
    
    /**
      * @private
      */
    @JSName("colsS")
    var colsS_FormGroup: Double = js.native
    
    @JSName("colsXl")
    var colsXl_FormGroup: Double = js.native
    
    /**
      * Defines the compoennt heading level,
      * set by the `headerText`.
      * @default "H3"
      * @public
      * @since 2.10.0
      */
    @JSName("headerLevel")
    var headerLevel_FormGroup: /* template literal string: ${TitleLevel} */ String = js.native
    
    @JSName("isGroup")
    def isGroup_MFormGroup: Boolean = js.native
    
    /**
      * Defines the items of the component.
      * @public
      */
    var items: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormItemMod.default] = js.native
    
    def processFormItems(): Unit = js.native
  }
}
