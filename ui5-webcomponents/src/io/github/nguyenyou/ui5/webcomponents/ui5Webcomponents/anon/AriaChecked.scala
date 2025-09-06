package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.mixed
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.Booleanish
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaChecked extends StObject {
  
  var ariaChecked: Signalish[js.UndefOr[Booleanish | mixed]]
  
  var ariaDisabled: Signalish[js.UndefOr[Booleanish]]
  
  var ariaReadonly: Signalish[js.UndefOr[Booleanish]]
  
  var ariaRequired: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[AriaRole] = js.undefined
  
  var tabindex: js.UndefOr[Double] = js.undefined
}
object AriaChecked {
  
  inline def apply(): AriaChecked = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaChecked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaChecked] (val x: Self) extends AnyVal {
    
    inline def setAriaChecked(value: Signalish[js.UndefOr[Booleanish | mixed]]): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
    
    inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
    
    inline def setAriaDisabled(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
    
    inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
    
    inline def setAriaReadonly(value: Signalish[js.UndefOr[Booleanish]]): Self = StObject.set(x, "ariaReadonly", value.asInstanceOf[js.Any])
    
    inline def setAriaReadonlyUndefined: Self = StObject.set(x, "ariaReadonly", js.undefined)
    
    inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
    
    inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
  }
}
