package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemFocusEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemToggleEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemclose extends StObject {
  
  var `item-click`: ListItemClickEventDetail
  
  var `item-close`: ListItemCloseEventDetail
  
  var `item-delete`: ListItemDeleteEventDetail
  
  var `item-focused`: ListItemFocusEventDetail
  
  var `item-toggle`: ListItemToggleEventDetail
  
  var `load-more`: Unit
  
  var move: ListMoveEventDetail
  
  var `move-over`: ListMoveEventDetail
  
  var `selection-change`: ListSelectionChangeEventDetail
}
object Itemclose {
  
  inline def apply(
    `item-click`: ListItemClickEventDetail,
    `item-close`: ListItemCloseEventDetail,
    `item-delete`: ListItemDeleteEventDetail,
    `item-focused`: ListItemFocusEventDetail,
    `item-toggle`: ListItemToggleEventDetail,
    `load-more`: Unit,
    move: ListMoveEventDetail,
    `move-over`: ListMoveEventDetail,
    `selection-change`: ListSelectionChangeEventDetail
  ): Itemclose = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-close")(`item-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-delete")(`item-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-focused")(`item-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-toggle")(`item-toggle`.asInstanceOf[js.Any])
    __obj.updateDynamic("load-more")(`load-more`.asInstanceOf[js.Any])
    __obj.updateDynamic("move-over")(`move-over`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemclose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemclose] (val x: Self) extends AnyVal {
    
    inline def `setItem-click`(value: ListItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
    
    inline def `setItem-close`(value: ListItemCloseEventDetail): Self = StObject.set(x, "item-close", value.asInstanceOf[js.Any])
    
    inline def `setItem-delete`(value: ListItemDeleteEventDetail): Self = StObject.set(x, "item-delete", value.asInstanceOf[js.Any])
    
    inline def `setItem-focused`(value: ListItemFocusEventDetail): Self = StObject.set(x, "item-focused", value.asInstanceOf[js.Any])
    
    inline def `setItem-toggle`(value: ListItemToggleEventDetail): Self = StObject.set(x, "item-toggle", value.asInstanceOf[js.Any])
    
    inline def `setLoad-more`(value: Unit): Self = StObject.set(x, "load-more", value.asInstanceOf[js.Any])
    
    inline def setMove(value: ListMoveEventDetail): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def `setMove-over`(value: ListMoveEventDetail): Self = StObject.set(x, "move-over", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: ListSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
