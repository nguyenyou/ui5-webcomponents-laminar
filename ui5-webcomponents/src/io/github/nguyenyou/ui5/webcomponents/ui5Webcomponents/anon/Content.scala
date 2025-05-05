package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: Ui5carouselcontent
  
  var navigation: Dictx
  
  var viewport: Ui5carouselviewport
}
object Content {
  
  inline def apply(content: Ui5carouselcontent, navigation: Dictx, viewport: Ui5carouselviewport): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Ui5carouselcontent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: Dictx): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Ui5carouselviewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
