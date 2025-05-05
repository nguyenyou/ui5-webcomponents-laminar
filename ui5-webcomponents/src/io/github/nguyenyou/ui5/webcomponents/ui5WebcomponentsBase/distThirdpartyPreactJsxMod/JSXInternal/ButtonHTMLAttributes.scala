package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hide
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.reset
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.show
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.submit
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.toggle
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formAction: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formEncType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formMethod: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formNoValidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var formTarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formaction: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formenctype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formmethod: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var formnovalidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var formtarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var popoverTarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var popoverTargetAction: js.UndefOr[Signalish[js.UndefOr[hide | show | toggle]]] = js.undefined
  
  var popovertarget: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var popovertargetaction: js.UndefOr[Signalish[js.UndefOr[hide | show | toggle]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[submit | reset | button]]] = js.undefined
  
  var value: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
}
object ButtonHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): ButtonHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & ButtonHTMLAttributes[T]) extends AnyVal {
    
    inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPopoverTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "popoverTarget", value.asInstanceOf[js.Any])
    
    inline def setPopoverTargetAction(value: Signalish[js.UndefOr[hide | show | toggle]]): Self = StObject.set(x, "popoverTargetAction", value.asInstanceOf[js.Any])
    
    inline def setPopoverTargetActionUndefined: Self = StObject.set(x, "popoverTargetAction", js.undefined)
    
    inline def setPopoverTargetUndefined: Self = StObject.set(x, "popoverTarget", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[submit | reset | button]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
