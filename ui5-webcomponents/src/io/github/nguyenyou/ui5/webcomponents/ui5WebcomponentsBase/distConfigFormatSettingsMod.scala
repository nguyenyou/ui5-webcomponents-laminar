package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesLegacyDateFormatsMod.IslamicToGregorianMapping
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesLegacyDateFormatsMod.LegacyDateCalendarCustomizing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigFormatSettingsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/FormatSettings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the first day of the week from the configured format settings or based on the current locale.
    * @public
    * @returns {Number} 0 (Sunday) through 6 (Saturday)
    */
  inline def getFirstDayOfWeek(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[js.UndefOr[Double]]
  
  /**
    * Returns the currently set customizing data for Islamic calendar support
    *
    * @return {object[]} Returns an array that contains the customizing data.
    * @public
    */
  /* static member */
  /* was `typeof LegacyDateFormats.getLegacyDateCalendarCustomizing` */
  inline def getLegacyDateCalendarCustomizing(): LegacyDateCalendarCustomizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyDateCalendarCustomizing")().asInstanceOf[LegacyDateCalendarCustomizing]
  
  trait FormatSettings extends StObject {
    
    var firstDayOfWeek: js.UndefOr[Double] = js.undefined
    
    var legacyDateCalendarCustomizing: js.UndefOr[LegacyDateCalendarCustomizing] = js.undefined
  }
  object FormatSettings {
    
    inline def apply(): FormatSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatSettings] (val x: Self) extends AnyVal {
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setLegacyDateCalendarCustomizing(value: LegacyDateCalendarCustomizing): Self = StObject.set(x, "legacyDateCalendarCustomizing", value.asInstanceOf[js.Any])
      
      inline def setLegacyDateCalendarCustomizingUndefined: Self = StObject.set(x, "legacyDateCalendarCustomizing", js.undefined)
      
      inline def setLegacyDateCalendarCustomizingVarargs(value: IslamicToGregorianMapping*): Self = StObject.set(x, "legacyDateCalendarCustomizing", js.Array(value*))
    }
  }
}
