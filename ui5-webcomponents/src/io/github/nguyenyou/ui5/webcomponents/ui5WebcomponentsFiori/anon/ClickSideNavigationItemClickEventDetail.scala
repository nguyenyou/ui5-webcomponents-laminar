package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.SideNavigationItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickSideNavigationItemClickEventDetail extends StObject {
  
  var click: SideNavigationItemClickEventDetail
}
object ClickSideNavigationItemClickEventDetail {
  
  inline def apply(click: SideNavigationItemClickEventDetail): ClickSideNavigationItemClickEventDetail = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickSideNavigationItemClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickSideNavigationItemClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setClick(value: SideNavigationItemClickEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
