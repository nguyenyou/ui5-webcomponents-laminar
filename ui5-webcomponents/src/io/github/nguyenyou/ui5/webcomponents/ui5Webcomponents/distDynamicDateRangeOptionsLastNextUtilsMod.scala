package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeValue
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.IDynamicDateRangeOption
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeOptionsLastNextUtilsMod {
  
  @JSImport("@ui5/webcomponents/dist/dynamic-date-range-options/LastNextUtils.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatDateRange(startDate: js.Date, endDate: js.Date, operator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDateRange")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatLastNext(value: DynamicDateRangeValue, option: IDynamicDateRangeOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLastNext")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatLastNextValue(value: DynamicDateRangeValue, option: ILastNextOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatLastNextValue")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def handleSelectionChangeLastNext(e: CustomEvent, option: IDynamicDateRangeOption): js.UndefOr[DynamicDateRangeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("handleSelectionChangeLastNext")(e.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DynamicDateRangeValue]]
  
  inline def isSingleDayRange(startDate: js.Date, endDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDayRange")(startDate.asInstanceOf[js.Any], endDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidStringLastNext(value: String, option: IDynamicDateRangeOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidStringLastNext")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseLastNext(value: String, option: IDynamicDateRangeOption): js.UndefOr[DynamicDateRangeValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLastNext")(value.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[DynamicDateRangeValue]]
  
  /**
    * Interface for Last/Next options that have additional methods
    */
  trait ILastNextOption
    extends StObject
       with IDynamicDateRangeOption {
    
    var _operator: String
    
    var availableOptions: js.Array[LastNextOption]
    
    var options: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ILastNextOption {
    
    inline def apply(
      _operator: String,
      availableOptions: js.Array[LastNextOption],
      format: DynamicDateRangeValue => String,
      icon: String,
      isValidString: String => Boolean,
      operator: String,
      parse: String => js.UndefOr[DynamicDateRangeValue],
      text: String,
      toDates: DynamicDateRangeValue => js.Array[js.Date]
    ): ILastNextOption = {
      val __obj = js.Dynamic.literal(_operator = _operator.asInstanceOf[js.Any], availableOptions = availableOptions.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), icon = icon.asInstanceOf[js.Any], isValidString = js.Any.fromFunction1(isValidString), operator = operator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), text = text.asInstanceOf[js.Any], toDates = js.Any.fromFunction1(toDates))
      __obj.asInstanceOf[ILastNextOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILastNextOption] (val x: Self) extends AnyVal {
      
      inline def setAvailableOptions(value: js.Array[LastNextOption]): Self = StObject.set(x, "availableOptions", value.asInstanceOf[js.Any])
      
      inline def setAvailableOptionsVarargs(value: LastNextOption*): Self = StObject.set(x, "availableOptions", js.Array(value*))
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def set_operator(value: String): Self = StObject.set(x, "_operator", value.asInstanceOf[js.Any])
    }
  }
  
  trait LastNextOption extends StObject {
    
    var operator: String
    
    var text: String
    
    var unitText: String
  }
  object LastNextOption {
    
    inline def apply(operator: String, text: String, unitText: String): LastNextOption = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unitText = unitText.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastNextOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LastNextOption] (val x: Self) extends AnyVal {
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUnitText(value: String): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
    }
  }
}
