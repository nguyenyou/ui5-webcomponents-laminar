package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemFocusEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemMouseoutEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemMouseoverEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemToggleEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemdelete extends StObject {
  
  var `item-click`: TreeItemClickEventDetail
  
  var `item-delete`: TreeItemDeleteEventDetail
  
  var `item-focus`: TreeItemFocusEventDetail
  
  var `item-mouseout`: TreeItemMouseoutEventDetail
  
  var `item-mouseover`: TreeItemMouseoverEventDetail
  
  var `item-toggle`: TreeItemToggleEventDetail
  
  var move: TreeMoveEventDetail
  
  var `move-over`: TreeMoveEventDetail
  
  var `selection-change`: TreeSelectionChangeEventDetail
}
object Itemdelete {
  
  inline def apply(
    `item-click`: TreeItemClickEventDetail,
    `item-delete`: TreeItemDeleteEventDetail,
    `item-focus`: TreeItemFocusEventDetail,
    `item-mouseout`: TreeItemMouseoutEventDetail,
    `item-mouseover`: TreeItemMouseoverEventDetail,
    `item-toggle`: TreeItemToggleEventDetail,
    move: TreeMoveEventDetail,
    `move-over`: TreeMoveEventDetail,
    `selection-change`: TreeSelectionChangeEventDetail
  ): Itemdelete = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-delete")(`item-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-focus")(`item-focus`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-mouseout")(`item-mouseout`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-mouseover")(`item-mouseover`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-toggle")(`item-toggle`.asInstanceOf[js.Any])
    __obj.updateDynamic("move-over")(`move-over`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemdelete] (val x: Self) extends AnyVal {
    
    inline def `setItem-click`(value: TreeItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
    
    inline def `setItem-delete`(value: TreeItemDeleteEventDetail): Self = StObject.set(x, "item-delete", value.asInstanceOf[js.Any])
    
    inline def `setItem-focus`(value: TreeItemFocusEventDetail): Self = StObject.set(x, "item-focus", value.asInstanceOf[js.Any])
    
    inline def `setItem-mouseout`(value: TreeItemMouseoutEventDetail): Self = StObject.set(x, "item-mouseout", value.asInstanceOf[js.Any])
    
    inline def `setItem-mouseover`(value: TreeItemMouseoverEventDetail): Self = StObject.set(x, "item-mouseover", value.asInstanceOf[js.Any])
    
    inline def `setItem-toggle`(value: TreeItemToggleEventDetail): Self = StObject.set(x, "item-toggle", value.asInstanceOf[js.Any])
    
    inline def setMove(value: TreeMoveEventDetail): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def `setMove-over`(value: TreeMoveEventDetail): Self = StObject.set(x, "move-over", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: TreeSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
