package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupMod.ListItemGroupMoveEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Move extends StObject {
  
  var move: ListItemGroupMoveEventDetail
  
  var `move-over`: ListItemGroupMoveEventDetail
}
object Move {
  
  inline def apply(move: ListItemGroupMoveEventDetail, `move-over`: ListItemGroupMoveEventDetail): Move = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("move-over")(`move-over`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Move]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Move] (val x: Self) extends AnyVal {
    
    inline def setMove(value: ListItemGroupMoveEventDetail): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def `setMove-over`(value: ListItemGroupMoveEventDetail): Self = StObject.set(x, "move-over", value.asInstanceOf[js.Any])
  }
}
