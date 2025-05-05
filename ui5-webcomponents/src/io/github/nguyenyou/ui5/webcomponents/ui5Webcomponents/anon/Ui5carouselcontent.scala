package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5carouselcontent extends StObject {
  
  var `ui5-carousel-content`: Boolean
  
  var `ui5-carousel-content-has-navigation`: Boolean
  
  var `ui5-carousel-content-has-navigation-and-buttons`: Boolean
  
  var `ui5-carousel-content-no-animation`: Boolean
}
object Ui5carouselcontent {
  
  inline def apply(
    `ui5-carousel-content`: Boolean,
    `ui5-carousel-content-has-navigation`: Boolean,
    `ui5-carousel-content-has-navigation-and-buttons`: Boolean,
    `ui5-carousel-content-no-animation`: Boolean
  ): Ui5carouselcontent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-carousel-content")(`ui5-carousel-content`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-carousel-content-has-navigation")(`ui5-carousel-content-has-navigation`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-carousel-content-has-navigation-and-buttons")(`ui5-carousel-content-has-navigation-and-buttons`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-carousel-content-no-animation")(`ui5-carousel-content-no-animation`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5carouselcontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5carouselcontent] (val x: Self) extends AnyVal {
    
    inline def `setUi5-carousel-content`(value: Boolean): Self = StObject.set(x, "ui5-carousel-content", value.asInstanceOf[js.Any])
    
    inline def `setUi5-carousel-content-has-navigation`(value: Boolean): Self = StObject.set(x, "ui5-carousel-content-has-navigation", value.asInstanceOf[js.Any])
    
    inline def `setUi5-carousel-content-has-navigation-and-buttons`(value: Boolean): Self = StObject.set(x, "ui5-carousel-content-has-navigation-and-buttons", value.asInstanceOf[js.Any])
    
    inline def `setUi5-carousel-content-no-animation`(value: Boolean): Self = StObject.set(x, "ui5-carousel-content-no-animation", value.asInstanceOf[js.Any])
  }
}
