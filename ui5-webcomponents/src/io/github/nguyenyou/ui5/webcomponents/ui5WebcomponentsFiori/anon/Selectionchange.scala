package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.SideNavigationSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectionchange extends StObject {
  
  var `selection-change`: SideNavigationSelectionChangeEventDetail
}
object Selectionchange {
  
  inline def apply(`selection-change`: SideNavigationSelectionChangeEventDetail): Selectionchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectionchange] (val x: Self) extends AnyVal {
    
    inline def `setSelection-change`(value: SideNavigationSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
