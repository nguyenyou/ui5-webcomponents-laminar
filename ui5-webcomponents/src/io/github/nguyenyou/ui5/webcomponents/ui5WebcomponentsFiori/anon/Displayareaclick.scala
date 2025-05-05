package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryMod.MediaGallerySelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Displayareaclick extends StObject {
  
  var `display-area-click`: Unit
  
  var `overflow-click`: Unit
  
  var `selection-change`: MediaGallerySelectionChangeEventDetail
}
object Displayareaclick {
  
  inline def apply(
    `display-area-click`: Unit,
    `overflow-click`: Unit,
    `selection-change`: MediaGallerySelectionChangeEventDetail
  ): Displayareaclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("display-area-click")(`display-area-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("overflow-click")(`overflow-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayareaclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Displayareaclick] (val x: Self) extends AnyVal {
    
    inline def `setDisplay-area-click`(value: Unit): Self = StObject.set(x, "display-area-click", value.asInstanceOf[js.Any])
    
    inline def `setOverflow-click`(value: Unit): Self = StObject.set(x, "overflow-click", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: MediaGallerySelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
