package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarType extends StObject {
  
  var animationMode: String
  
  var calendarType: String
  
  var formatSettings: FirstDayOfWeek
  
  var language: String
  
  var rtl: String
  
  var theme: String
  
  var themeRoot: String
  
  var timezone: String
}
object CalendarType {
  
  inline def apply(
    animationMode: String,
    calendarType: String,
    formatSettings: FirstDayOfWeek,
    language: String,
    rtl: String,
    theme: String,
    themeRoot: String,
    timezone: String
  ): CalendarType = {
    val __obj = js.Dynamic.literal(animationMode = animationMode.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], formatSettings = formatSettings.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeRoot = themeRoot.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarType] (val x: Self) extends AnyVal {
    
    inline def setAnimationMode(value: String): Self = StObject.set(x, "animationMode", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: String): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setFormatSettings(value: FirstDayOfWeek): Self = StObject.set(x, "formatSettings", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: String): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeRoot(value: String): Self = StObject.set(x, "themeRoot", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
