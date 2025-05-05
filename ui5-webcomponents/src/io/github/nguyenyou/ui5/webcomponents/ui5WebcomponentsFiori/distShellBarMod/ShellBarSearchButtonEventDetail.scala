package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarSearchButtonEventDetail extends StObject {
  
  var searchFieldVisible: Boolean
  
  var targetRef: HTMLElement
}
object ShellBarSearchButtonEventDetail {
  
  inline def apply(searchFieldVisible: Boolean, targetRef: HTMLElement): ShellBarSearchButtonEventDetail = {
    val __obj = js.Dynamic.literal(searchFieldVisible = searchFieldVisible.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellBarSearchButtonEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarSearchButtonEventDetail] (val x: Self) extends AnyVal {
    
    inline def setSearchFieldVisible(value: Boolean): Self = StObject.set(x, "searchFieldVisible", value.asInstanceOf[js.Any])
    
    inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
