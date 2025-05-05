package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarContentItemVisibilityChangeEventDetail extends StObject {
  
  var items: js.Array[HTMLElement]
}
object ShellBarContentItemVisibilityChangeEventDetail {
  
  inline def apply(items: js.Array[HTMLElement]): ShellBarContentItemVisibilityChangeEventDetail = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellBarContentItemVisibilityChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarContentItemVisibilityChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[HTMLElement]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: HTMLElement*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
