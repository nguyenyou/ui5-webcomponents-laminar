package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarGroupMod.AvatarGroupClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overflow extends StObject {
  
  var click: AvatarGroupClickEventDetail
  
  var overflow: Unit
}
object Overflow {
  
  inline def apply(click: AvatarGroupClickEventDetail, overflow: Unit): Overflow = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overflow] (val x: Self) extends AnyVal {
    
    inline def setClick(value: AvatarGroupClickEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: Unit): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
