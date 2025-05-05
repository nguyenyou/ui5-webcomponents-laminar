package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  def items(): Unit
}
object Items {
  
  inline def apply(items: () => Unit): Items = {
    val __obj = js.Dynamic.literal(items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    inline def setItems(value: () => Unit): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
  }
}
