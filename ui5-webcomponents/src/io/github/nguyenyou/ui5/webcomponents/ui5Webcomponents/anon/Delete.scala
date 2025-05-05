package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.TokenDeleteEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var delete: TokenDeleteEventDetail
  
  var select: Unit
}
object Delete {
  
  inline def apply(delete: TokenDeleteEventDetail, select: Unit): Delete = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: TokenDeleteEventDetail): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Unit): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
