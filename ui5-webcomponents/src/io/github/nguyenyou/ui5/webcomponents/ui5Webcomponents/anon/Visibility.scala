package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visibility extends StObject {
  
  var visibility: String
}
object Visibility {
  
  inline def apply(visibility: String): Visibility = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visibility] (val x: Self) extends AnyVal {
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
