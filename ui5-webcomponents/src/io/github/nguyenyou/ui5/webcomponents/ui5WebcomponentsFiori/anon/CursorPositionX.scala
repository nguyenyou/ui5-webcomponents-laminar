package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorPositionX extends StObject {
  
  var cursorPositionX: Double
  
  var separator: HTMLElement
  
  var tmpFCLLayout: FCLLayout
}
object CursorPositionX {
  
  inline def apply(cursorPositionX: Double, separator: HTMLElement, tmpFCLLayout: FCLLayout): CursorPositionX = {
    val __obj = js.Dynamic.literal(cursorPositionX = cursorPositionX.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], tmpFCLLayout = tmpFCLLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorPositionX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CursorPositionX] (val x: Self) extends AnyVal {
    
    inline def setCursorPositionX(value: Double): Self = StObject.set(x, "cursorPositionX", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: HTMLElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setTmpFCLLayout(value: FCLLayout): Self = StObject.set(x, "tmpFCLLayout", value.asInstanceOf[js.Any])
  }
}
