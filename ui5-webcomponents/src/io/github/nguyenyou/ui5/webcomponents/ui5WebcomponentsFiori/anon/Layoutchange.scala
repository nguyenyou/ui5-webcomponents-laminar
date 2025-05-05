package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicSideContentMod.DynamicSideContentLayoutChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layoutchange extends StObject {
  
  var `layout-change`: DynamicSideContentLayoutChangeEventDetail
}
object Layoutchange {
  
  inline def apply(`layout-change`: DynamicSideContentLayoutChangeEventDetail): Layoutchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layout-change")(`layout-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layoutchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Layoutchange] (val x: Self) extends AnyVal {
    
    inline def `setLayout-change`(value: DynamicSideContentLayoutChangeEventDetail): Self = StObject.set(x, "layout-change", value.asInstanceOf[js.Any])
  }
}
