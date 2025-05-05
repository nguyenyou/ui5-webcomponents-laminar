package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionMod.UploadCollectionItemDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionMod.UploadCollectionSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemdelete extends StObject {
  
  var `item-delete`: UploadCollectionItemDeleteEventDetail
  
  var `selection-change`: UploadCollectionSelectionChangeEventDetail
}
object Itemdelete {
  
  inline def apply(
    `item-delete`: UploadCollectionItemDeleteEventDetail,
    `selection-change`: UploadCollectionSelectionChangeEventDetail
  ): Itemdelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item-delete")(`item-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemdelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemdelete] (val x: Self) extends AnyVal {
    
    inline def `setItem-delete`(value: UploadCollectionItemDeleteEventDetail): Self = StObject.set(x, "item-delete", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: UploadCollectionSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
