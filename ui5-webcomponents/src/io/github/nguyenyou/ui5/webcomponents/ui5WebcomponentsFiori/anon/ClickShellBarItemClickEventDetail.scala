package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarItemMod.ShellBarItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickShellBarItemClickEventDetail extends StObject {
  
  var click: ShellBarItemClickEventDetail
}
object ClickShellBarItemClickEventDetail {
  
  inline def apply(click: ShellBarItemClickEventDetail): ClickShellBarItemClickEventDetail = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickShellBarItemClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickShellBarItemClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setClick(value: ShellBarItemClickEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
