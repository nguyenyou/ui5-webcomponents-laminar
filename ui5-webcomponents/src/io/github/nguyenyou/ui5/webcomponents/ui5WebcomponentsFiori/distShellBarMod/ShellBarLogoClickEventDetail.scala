package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarLogoClickEventDetail extends StObject {
  
  var targetRef: HTMLElement
}
object ShellBarLogoClickEventDetail {
  
  inline def apply(targetRef: HTMLElement): ShellBarLogoClickEventDetail = {
    val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellBarLogoClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarLogoClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}
