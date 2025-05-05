package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChild
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenComponentChildren extends StObject {
  
  var children: ComponentChildren
}
object ChildrenComponentChildren {
  
  inline def apply(): ChildrenComponentChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildrenComponentChildren]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildrenComponentChildren] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
  }
}
