package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.SelectionRequestEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectionrequested extends StObject {
  
  var `selection-requested`: SelectionRequestEventDetail
}
object Selectionrequested {
  
  inline def apply(`selection-requested`: SelectionRequestEventDetail): Selectionrequested = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selection-requested")(`selection-requested`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionrequested]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectionrequested] (val x: Self) extends AnyVal {
    
    inline def `setSelection-requested`(value: SelectionRequestEventDetail): Self = StObject.set(x, "selection-requested", value.asInstanceOf[js.Any])
  }
}
