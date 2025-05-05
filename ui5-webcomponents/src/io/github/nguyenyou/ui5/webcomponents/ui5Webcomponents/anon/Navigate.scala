package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCarouselMod.CarouselNavigateEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigate extends StObject {
  
  var navigate: CarouselNavigateEventDetail
}
object Navigate {
  
  inline def apply(navigate: CarouselNavigateEventDetail): Navigate = {
    val __obj = js.Dynamic.literal(navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigate] (val x: Self) extends AnyVal {
    
    inline def setNavigate(value: CarouselNavigateEventDetail): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
