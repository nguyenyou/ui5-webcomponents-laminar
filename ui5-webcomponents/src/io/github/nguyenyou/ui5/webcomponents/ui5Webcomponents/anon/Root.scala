package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var root: Backgroundcolor
}
object Root {
  
  inline def apply(root: Backgroundcolor): Root = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Backgroundcolor): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
