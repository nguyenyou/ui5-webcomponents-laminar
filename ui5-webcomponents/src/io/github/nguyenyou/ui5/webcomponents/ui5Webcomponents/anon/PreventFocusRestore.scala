package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventFocusRestore extends StObject {
  
  var preventFocusRestore: Boolean
}
object PreventFocusRestore {
  
  inline def apply(preventFocusRestore: Boolean): PreventFocusRestore = {
    val __obj = js.Dynamic.literal(preventFocusRestore = preventFocusRestore.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventFocusRestore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreventFocusRestore] (val x: Self) extends AnyVal {
    
    inline def setPreventFocusRestore(value: Boolean): Self = StObject.set(x, "preventFocusRestore", value.asInstanceOf[js.Any])
  }
}
