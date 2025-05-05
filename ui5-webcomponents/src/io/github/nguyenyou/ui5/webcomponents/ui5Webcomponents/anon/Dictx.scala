package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* x */ StringDictionary[Boolean] {
  
  var `ui5-carousel-navigation-with-buttons`: Boolean
  
  var `ui5-carousel-navigation-wrapper`: Boolean
}
object Dictx {
  
  inline def apply(`ui5-carousel-navigation-with-buttons`: Boolean, `ui5-carousel-navigation-wrapper`: Boolean): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-carousel-navigation-with-buttons")(`ui5-carousel-navigation-with-buttons`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-carousel-navigation-wrapper")(`ui5-carousel-navigation-wrapper`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    inline def `setUi5-carousel-navigation-with-buttons`(value: Boolean): Self = StObject.set(x, "ui5-carousel-navigation-with-buttons", value.asInstanceOf[js.Any])
    
    inline def `setUi5-carousel-navigation-wrapper`(value: Boolean): Self = StObject.set(x, "ui5-carousel-navigation-wrapper", value.asInstanceOf[js.Any])
  }
}
