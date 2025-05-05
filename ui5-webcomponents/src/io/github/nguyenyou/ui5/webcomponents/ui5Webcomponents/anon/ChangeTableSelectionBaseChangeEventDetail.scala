package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionBaseMod.TableSelectionBaseChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeTableSelectionBaseChangeEventDetail extends StObject {
  
  var change: TableSelectionBaseChangeEventDetail
}
object ChangeTableSelectionBaseChangeEventDetail {
  
  inline def apply(change: TableSelectionBaseChangeEventDetail): ChangeTableSelectionBaseChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTableSelectionBaseChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeTableSelectionBaseChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: TableSelectionBaseChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
