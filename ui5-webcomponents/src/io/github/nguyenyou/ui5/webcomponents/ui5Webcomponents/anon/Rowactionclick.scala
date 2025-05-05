package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.TableMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.TableRowActionClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.TableRowClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rowactionclick extends StObject {
  
  var move: TableMoveEventDetail
  
  var `move-over`: TableMoveEventDetail
  
  var `row-action-click`: TableRowActionClickEventDetail
  
  var `row-click`: TableRowClickEventDetail
}
object Rowactionclick {
  
  inline def apply(
    move: TableMoveEventDetail,
    `move-over`: TableMoveEventDetail,
    `row-action-click`: TableRowActionClickEventDetail,
    `row-click`: TableRowClickEventDetail
  ): Rowactionclick = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("move-over")(`move-over`.asInstanceOf[js.Any])
    __obj.updateDynamic("row-action-click")(`row-action-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("row-click")(`row-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rowactionclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rowactionclick] (val x: Self) extends AnyVal {
    
    inline def setMove(value: TableMoveEventDetail): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def `setMove-over`(value: TableMoveEventDetail): Self = StObject.set(x, "move-over", value.asInstanceOf[js.Any])
    
    inline def `setRow-action-click`(value: TableRowActionClickEventDetail): Self = StObject.set(x, "row-action-click", value.asInstanceOf[js.Any])
    
    inline def `setRow-click`(value: TableRowClickEventDetail): Self = StObject.set(x, "row-click", value.asInstanceOf[js.Any])
  }
}
