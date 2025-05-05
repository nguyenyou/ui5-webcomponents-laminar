package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationMode extends StObject {
  
  var animationMode: Unit
  
  var calendarType: Unit
  
  var formatSettings: Unit
  
  var language: Unit
  
  var rtl: Unit
  
  var theme: Unit
  
  var themeRoot: Unit
  
  var timezone: Unit
}
object AnimationMode {
  
  inline def apply(
    animationMode: Unit,
    calendarType: Unit,
    formatSettings: Unit,
    language: Unit,
    rtl: Unit,
    theme: Unit,
    themeRoot: Unit,
    timezone: Unit
  ): AnimationMode = {
    val __obj = js.Dynamic.literal(animationMode = animationMode.asInstanceOf[js.Any], calendarType = calendarType.asInstanceOf[js.Any], formatSettings = formatSettings.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], themeRoot = themeRoot.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationMode] (val x: Self) extends AnyVal {
    
    inline def setAnimationMode(value: Unit): Self = StObject.set(x, "animationMode", value.asInstanceOf[js.Any])
    
    inline def setCalendarType(value: Unit): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
    
    inline def setFormatSettings(value: Unit): Self = StObject.set(x, "formatSettings", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Unit): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setRtl(value: Unit): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: Unit): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeRoot(value: Unit): Self = StObject.set(x, "themeRoot", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: Unit): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
