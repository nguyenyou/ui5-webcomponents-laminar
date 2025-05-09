package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonElementParentNode extends StObject {
  
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
    */
  /* standard dom */
  def getElementById(elementId: String): org.scalajs.dom.Element | Null
}
object NonElementParentNode {
  
  inline def apply(getElementById: String => org.scalajs.dom.Element | Null): NonElementParentNode = {
    val __obj = js.Dynamic.literal(getElementById = js.Any.fromFunction1(getElementById))
    __obj.asInstanceOf[NonElementParentNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonElementParentNode] (val x: Self) extends AnyVal {
    
    inline def setGetElementById(value: String => org.scalajs.dom.Element | Null): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
  }
}
