package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesLegacyDateFormatsMod.IslamicToGregorianMapping
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesLegacyDateFormatsMod.LegacyDateCalendarCustomizing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirstDayOfWeek extends StObject {
  
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  
  var legacyDateCalendarCustomizing: LegacyDateCalendarCustomizing
}
object FirstDayOfWeek {
  
  inline def apply(legacyDateCalendarCustomizing: LegacyDateCalendarCustomizing): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(legacyDateCalendarCustomizing = legacyDateCalendarCustomizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    
    inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setLegacyDateCalendarCustomizing(value: LegacyDateCalendarCustomizing): Self = StObject.set(x, "legacyDateCalendarCustomizing", value.asInstanceOf[js.Any])
    
    inline def setLegacyDateCalendarCustomizingVarargs(value: IslamicToGregorianMapping*): Self = StObject.set(x, "legacyDateCalendarCustomizing", js.Array(value*))
  }
}
