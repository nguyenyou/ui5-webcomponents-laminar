package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarMenuItemClickEventDetail extends StObject {
  
  var item: HTMLElement
}
object ShellBarMenuItemClickEventDetail {
  
  inline def apply(item: HTMLElement): ShellBarMenuItemClickEventDetail = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellBarMenuItemClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarMenuItemClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
