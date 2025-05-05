package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.SelectionRequestEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detailclick extends StObject {
  
  var `detail-click`: Item
  
  var `selection-requested`: SelectionRequestEventDetail
}
object Detailclick {
  
  inline def apply(`detail-click`: Item, `selection-requested`: SelectionRequestEventDetail): Detailclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detail-click")(`detail-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-requested")(`selection-requested`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detailclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detailclick] (val x: Self) extends AnyVal {
    
    inline def `setDetail-click`(value: Item): Self = StObject.set(x, "detail-click", value.asInstanceOf[js.Any])
    
    inline def `setSelection-requested`(value: SelectionRequestEventDetail): Self = StObject.set(x, "selection-requested", value.asInstanceOf[js.Any])
  }
}
