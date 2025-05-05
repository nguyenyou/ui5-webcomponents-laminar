package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5carouselviewport extends StObject {
  
  var `ui5-carousel-viewport`: Boolean
  
  var `ui5-carousel-viewport--single`: Boolean
}
object Ui5carouselviewport {
  
  inline def apply(`ui5-carousel-viewport`: Boolean, `ui5-carousel-viewport--single`: Boolean): Ui5carouselviewport = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-carousel-viewport")(`ui5-carousel-viewport`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-carousel-viewport--single")(`ui5-carousel-viewport--single`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5carouselviewport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5carouselviewport] (val x: Self) extends AnyVal {
    
    inline def `setUi5-carousel-viewport`(value: Boolean): Self = StObject.set(x, "ui5-carousel-viewport", value.asInstanceOf[js.Any])
    
    inline def `setUi5-carousel-viewport--single`(value: Boolean): Self = StObject.set(x, "ui5-carousel-viewport--single", value.asInstanceOf[js.Any])
  }
}
