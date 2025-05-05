package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchMod.SearchEventDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  var close: Unit
  
  var open: Unit
  
  var `popup-action-press`: Unit
  
  var search: SearchEventDetails
}
object Open {
  
  inline def apply(close: Unit, open: Unit, `popup-action-press`: Unit, search: SearchEventDetails): Open = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.updateDynamic("popup-action-press")(`popup-action-press`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setPopup-action-press`(value: Unit): Self = StObject.set(x, "popup-action-press", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: SearchEventDetails): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
