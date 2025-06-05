package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeOptionsToDatesMod {
  
  @JSImport("@ui5/webcomponents/dist/dynamic-date-range-options/toDates.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dateOptionToDates(value: DynamicDateRangeValue): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("dateOptionToDates")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def dateRangeOptionToDates(value: DynamicDateRangeValue): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("dateRangeOptionToDates")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Date]]
  
  inline def todayToDates(): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("todayToDates")().asInstanceOf[js.Array[js.Date]]
  
  inline def tomorrowToDates(): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("tomorrowToDates")().asInstanceOf[js.Array[js.Date]]
  
  inline def yesterdayToDates(): js.Array[js.Date] = ^.asInstanceOf[js.Dynamic].applyDynamic("yesterdayToDates")().asInstanceOf[js.Array[js.Date]]
}
