package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarMod.ToolbarMinWidthChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mincontentwidthchange extends StObject {
  
  var `_min-content-width-change`: ToolbarMinWidthChangeEventDetail
}
object Mincontentwidthchange {
  
  inline def apply(`_min-content-width-change`: ToolbarMinWidthChangeEventDetail): Mincontentwidthchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_min-content-width-change")(`_min-content-width-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mincontentwidthchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mincontentwidthchange] (val x: Self) extends AnyVal {
    
    inline def `set_min-content-width-change`(value: ToolbarMinWidthChangeEventDetail): Self = StObject.set(x, "_min-content-width-change", value.asInstanceOf[js.Any])
  }
}
