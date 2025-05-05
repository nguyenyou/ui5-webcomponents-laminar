package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPopup extends StObject {
  
  var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
}
object HasPopup {
  
  inline def apply(): HasPopup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasPopup] (val x: Self) extends AnyVal {
    
    inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
    
    inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
  }
}
