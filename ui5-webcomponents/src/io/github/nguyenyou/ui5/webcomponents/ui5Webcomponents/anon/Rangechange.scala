package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableVirtualizerMod.RangeChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rangechange extends StObject {
  
  var `range-change`: RangeChangeEventDetail
}
object Rangechange {
  
  inline def apply(`range-change`: RangeChangeEventDetail): Rangechange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("range-change")(`range-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rangechange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rangechange] (val x: Self) extends AnyVal {
    
    inline def `setRange-change`(value: RangeChangeEventDetail): Self = StObject.set(x, "range-change", value.asInstanceOf[js.Any])
  }
}
