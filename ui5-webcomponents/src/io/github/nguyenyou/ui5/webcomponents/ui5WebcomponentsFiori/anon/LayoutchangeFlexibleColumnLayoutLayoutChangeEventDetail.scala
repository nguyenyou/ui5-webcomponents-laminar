package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.FlexibleColumnLayoutLayoutChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail extends StObject {
  
  var `layout-change`: FlexibleColumnLayoutLayoutChangeEventDetail
}
object LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail {
  
  inline def apply(`layout-change`: FlexibleColumnLayoutLayoutChangeEventDetail): LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layout-change")(`layout-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def `setLayout-change`(value: FlexibleColumnLayoutLayoutChangeEventDetail): Self = StObject.set(x, "layout-change", value.asInstanceOf[js.Any])
  }
}
