package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesLegacyDateFormatsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/LegacyDateFormats.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LegacyDateFormats
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/LegacyDateFormats.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the currently set customizing data for Islamic calendar support
      *
      * @return {object[]} Returns an array that contains the customizing data.
      * @public
      */
    /* static member */
    inline def getLegacyDateCalendarCustomizing(): LegacyDateCalendarCustomizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyDateCalendarCustomizing")().asInstanceOf[LegacyDateCalendarCustomizing]
  }
  
  trait IslamicToGregorianMapping extends StObject {
    
    var dateFormat: String
    
    var gregDate: String
    
    var islamicMonthStart: String
  }
  object IslamicToGregorianMapping {
    
    inline def apply(dateFormat: String, gregDate: String, islamicMonthStart: String): IslamicToGregorianMapping = {
      val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], gregDate = gregDate.asInstanceOf[js.Any], islamicMonthStart = islamicMonthStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[IslamicToGregorianMapping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IslamicToGregorianMapping] (val x: Self) extends AnyVal {
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setGregDate(value: String): Self = StObject.set(x, "gregDate", value.asInstanceOf[js.Any])
      
      inline def setIslamicMonthStart(value: String): Self = StObject.set(x, "islamicMonthStart", value.asInstanceOf[js.Any])
    }
  }
  
  type LegacyDateCalendarCustomizing = js.Array[IslamicToGregorianMapping]
  
  trait LegacyDateFormats extends StObject
}
