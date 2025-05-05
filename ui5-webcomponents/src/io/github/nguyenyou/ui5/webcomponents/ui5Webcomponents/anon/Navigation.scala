package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigation extends StObject {
  
  var content: Boolean
  
  var navigation: Boolean
}
object Navigation {
  
  inline def apply(content: Boolean, navigation: Boolean): Navigation = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
  }
}
