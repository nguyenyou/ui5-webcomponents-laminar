package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.LinkClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickLinkClickEventDetail extends StObject {
  
  var click: LinkClickEventDetail
}
object ClickLinkClickEventDetail {
  
  inline def apply(click: LinkClickEventDetail): ClickLinkClickEventDetail = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLinkClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickLinkClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setClick(value: LinkClickEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
