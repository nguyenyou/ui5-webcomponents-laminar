package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Operator
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeValue
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.IDynamicDateRangeOption
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeOptionsNextOptionsMod {
  
  /**
    * @class
    * @constructor
    * @public
    * @since 2.14.0
    */
  @JSImport("@ui5/webcomponents/dist/dynamic-date-range-options/NextOptions.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NextOptions {
    def this(operators: js.Array[String]) = this()
    
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
    * @since 2.14.0
    */
  @js.native
  trait NextOptions
    extends StObject
       with IDynamicDateRangeOption {
    
    def _getI18nKeyForOperator(operator: String): I18nText = js.native
    
    var _operator: String = js.native
    
    def availableOptions: js.Array[Operator] = js.native
    
    @JSName("handleSelectionChange")
    def handleSelectionChange_MNextOptions(e: CustomEvent): js.UndefOr[DynamicDateRangeValue] = js.native
    
    var i18nKey: I18nText = js.native
    
    @JSName("icon")
    def icon_MNextOptions: String = js.native
    
    @JSName("operator")
    def operator_MNextOptions: String = js.native
    
    var options: js.UndefOr[js.Array[String]] = js.native
    
    @JSName("template")
    def template_MNextOptions(): JsxTemplateResult = js.native
    @JSName("template")
    var template_Original: JsxTemplate = js.native
    
    @JSName("text")
    def text_MNextOptions: String = js.native
  }
}
