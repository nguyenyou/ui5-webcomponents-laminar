package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeValue
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.IDynamicDateRangeOption
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeOptionsSingleDateMod {
  
  /**
    * @class
    * @constructor
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents/dist/dynamic-date-range-options/SingleDate.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SingleDate {
    
    /* CompleteClass */
    override def format(value: DynamicDateRangeValue): String = js.native
    
    /* CompleteClass */
    var icon: String = js.native
    
    /* CompleteClass */
    override def isValidString(value: String): Boolean = js.native
    
    /* CompleteClass */
    var operator: String = js.native
    
    /* CompleteClass */
    override def parse(value: String): js.UndefOr[DynamicDateRangeValue] = js.native
    
    /* CompleteClass */
    var text: String = js.native
    
    /* CompleteClass */
    override def toDates(value: DynamicDateRangeValue): js.Array[js.Date] = js.native
  }
  
  /**
    * @class
    * @constructor
    * @public
    * @since 2.0.0
    */
  @js.native
  trait SingleDate
    extends StObject
       with IDynamicDateRangeOption {
    
    def getFormat(): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDateFormatMod.default = js.native
    
    @JSName("handleSelectionChange")
    def handleSelectionChange_MSingleDate(e: CustomEvent): js.UndefOr[DynamicDateRangeValue] = js.native
    
    @JSName("icon")
    def icon_MSingleDate: String = js.native
    
    @JSName("operator")
    def operator_MSingleDate: String = js.native
    
    @JSName("template")
    def template_MSingleDate(): JsxTemplateResult = js.native
    @JSName("template")
    var template_Original: JsxTemplate = js.native
    
    @JSName("text")
    def text_MSingleDate: String = js.native
  }
}
