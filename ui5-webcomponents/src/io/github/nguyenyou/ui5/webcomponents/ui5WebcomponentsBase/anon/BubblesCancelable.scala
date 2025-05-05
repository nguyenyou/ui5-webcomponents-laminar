package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BubblesCancelable extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
}
object BubblesCancelable {
  
  inline def apply(): BubblesCancelable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BubblesCancelable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BubblesCancelable] (val x: Self) extends AnyVal {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
  }
}
