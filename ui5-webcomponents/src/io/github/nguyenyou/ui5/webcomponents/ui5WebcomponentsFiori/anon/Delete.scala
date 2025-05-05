package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var delete: Unit
}
object Delete {
  
  inline def apply(delete: Unit): Delete = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Unit): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
