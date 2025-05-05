package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var classID: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var data: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var height: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var useMap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var usemap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var width: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var wmode: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object ObjectHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): ObjectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & ObjectHTMLAttributes[T]) extends AnyVal {
    
    inline def setClassID(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
    
    inline def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
    
    inline def setData(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeight(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseMap(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWmode(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
    
    inline def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
  }
}
