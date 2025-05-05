package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'hasPopup'> */
trait PickAccessibilityAttribut extends StObject {
  
  var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
}
object PickAccessibilityAttribut {
  
  inline def apply(): PickAccessibilityAttribut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAccessibilityAttribut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAccessibilityAttribut] (val x: Self) extends AnyVal {
    
    inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
    
    inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
  }
}
