package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expanded extends StObject {
  
  var expanded: Boolean
}
object Expanded {
  
  inline def apply(expanded: Boolean): Expanded = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expanded] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
