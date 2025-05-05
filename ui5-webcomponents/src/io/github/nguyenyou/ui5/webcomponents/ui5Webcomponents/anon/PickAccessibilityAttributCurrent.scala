package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaCurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'current'> */
trait PickAccessibilityAttributCurrent extends StObject {
  
  var current: js.UndefOr[AriaCurrent] = js.undefined
}
object PickAccessibilityAttributCurrent {
  
  inline def apply(): PickAccessibilityAttributCurrent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickAccessibilityAttributCurrent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickAccessibilityAttributCurrent] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: AriaCurrent): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
  }
}
