package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarSearchFieldToggleEventDetail extends StObject {
  
  var expanded: Boolean
}
object ShellBarSearchFieldToggleEventDetail {
  
  inline def apply(expanded: Boolean): ShellBarSearchFieldToggleEventDetail = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellBarSearchFieldToggleEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarSearchFieldToggleEventDetail] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
  }
}
