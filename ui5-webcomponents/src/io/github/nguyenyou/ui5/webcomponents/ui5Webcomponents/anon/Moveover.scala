package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.TabContainerMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.TabContainerTabSelectEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Moveover extends StObject {
  
  var move: TabContainerMoveEventDetail
  
  var `move-over`: TabContainerMoveEventDetail
  
  var `tab-select`: TabContainerTabSelectEventDetail
}
object Moveover {
  
  inline def apply(
    move: TabContainerMoveEventDetail,
    `move-over`: TabContainerMoveEventDetail,
    `tab-select`: TabContainerTabSelectEventDetail
  ): Moveover = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("move-over")(`move-over`.asInstanceOf[js.Any])
    __obj.updateDynamic("tab-select")(`tab-select`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Moveover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Moveover] (val x: Self) extends AnyVal {
    
    inline def setMove(value: TabContainerMoveEventDetail): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def `setMove-over`(value: TabContainerMoveEventDetail): Self = StObject.set(x, "move-over", value.asInstanceOf[js.Any])
    
    inline def `setTab-select`(value: TabContainerTabSelectEventDetail): Self = StObject.set(x, "tab-select", value.asInstanceOf[js.Any])
  }
}
