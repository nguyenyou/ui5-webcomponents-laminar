package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.TablePopinChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.TableSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowF7PressEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowForwardAfterEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowForwardBeforeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowSelectionRequestedEventDetail
import org.scalajs.dom.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait F7pressed extends StObject {
    
    var _focused: FocusEvent
    
    var `f7-pressed`: TableRowF7PressEventDetail
    
    var `forward-after`: TableRowForwardAfterEventDetail
    
    var `forward-before`: TableRowForwardBeforeEventDetail
    
    var `row-click`: TableRowClickEventDetail
    
    var `selection-requested`: TableRowSelectionRequestedEventDetail
  }
  object F7pressed {
    
    inline def apply(
      _focused: FocusEvent,
      `f7-pressed`: TableRowF7PressEventDetail,
      `forward-after`: TableRowForwardAfterEventDetail,
      `forward-before`: TableRowForwardBeforeEventDetail,
      `row-click`: TableRowClickEventDetail,
      `selection-requested`: TableRowSelectionRequestedEventDetail
    ): F7pressed = {
      val __obj = js.Dynamic.literal(_focused = _focused.asInstanceOf[js.Any])
      __obj.updateDynamic("f7-pressed")(`f7-pressed`.asInstanceOf[js.Any])
      __obj.updateDynamic("forward-after")(`forward-after`.asInstanceOf[js.Any])
      __obj.updateDynamic("forward-before")(`forward-before`.asInstanceOf[js.Any])
      __obj.updateDynamic("row-click")(`row-click`.asInstanceOf[js.Any])
      __obj.updateDynamic("selection-requested")(`selection-requested`.asInstanceOf[js.Any])
      __obj.asInstanceOf[F7pressed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: F7pressed] (val x: Self) extends AnyVal {
      
      inline def `setF7-pressed`(value: TableRowF7PressEventDetail): Self = StObject.set(x, "f7-pressed", value.asInstanceOf[js.Any])
      
      inline def `setForward-after`(value: TableRowForwardAfterEventDetail): Self = StObject.set(x, "forward-after", value.asInstanceOf[js.Any])
      
      inline def `setForward-before`(value: TableRowForwardBeforeEventDetail): Self = StObject.set(x, "forward-before", value.asInstanceOf[js.Any])
      
      inline def `setRow-click`(value: TableRowClickEventDetail): Self = StObject.set(x, "row-click", value.asInstanceOf[js.Any])
      
      inline def `setSelection-requested`(value: TableRowSelectionRequestedEventDetail): Self = StObject.set(x, "selection-requested", value.asInstanceOf[js.Any])
      
      inline def set_focused(value: FocusEvent): Self = StObject.set(x, "_focused", value.asInstanceOf[js.Any])
    }
  }
  
  trait Focused extends StObject {
    
    var _focused: FocusEvent
  }
  object Focused {
    
    inline def apply(_focused: FocusEvent): Focused = {
      val __obj = js.Dynamic.literal(_focused = _focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
      
      inline def set_focused(value: FocusEvent): Self = StObject.set(x, "_focused", value.asInstanceOf[js.Any])
    }
  }
  
  trait Loadmore extends StObject {
    
    var `load-more`: Unit
    
    var `popin-change`: TablePopinChangeEventDetail
    
    var `row-click`: TableRowClickEventDetail
    
    var `selection-change`: TableSelectionChangeEventDetail
  }
  object Loadmore {
    
    inline def apply(
      `load-more`: Unit,
      `popin-change`: TablePopinChangeEventDetail,
      `row-click`: TableRowClickEventDetail,
      `selection-change`: TableSelectionChangeEventDetail
    ): Loadmore = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("load-more")(`load-more`.asInstanceOf[js.Any])
      __obj.updateDynamic("popin-change")(`popin-change`.asInstanceOf[js.Any])
      __obj.updateDynamic("row-click")(`row-click`.asInstanceOf[js.Any])
      __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loadmore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Loadmore] (val x: Self) extends AnyVal {
      
      inline def `setLoad-more`(value: Unit): Self = StObject.set(x, "load-more", value.asInstanceOf[js.Any])
      
      inline def `setPopin-change`(value: TablePopinChangeEventDetail): Self = StObject.set(x, "popin-change", value.asInstanceOf[js.Any])
      
      inline def `setRow-click`(value: TableRowClickEventDetail): Self = StObject.set(x, "row-click", value.asInstanceOf[js.Any])
      
      inline def `setSelection-change`(value: TableSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
    }
  }
}
