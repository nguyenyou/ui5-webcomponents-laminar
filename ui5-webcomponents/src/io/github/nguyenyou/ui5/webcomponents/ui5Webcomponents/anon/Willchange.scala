package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Willchange extends StObject {
  
  var transform: js.UndefOr[String] = js.undefined
  
  var `will-change`: js.UndefOr[String] = js.undefined
}
object Willchange {
  
  inline def apply(): Willchange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Willchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Willchange] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def `setWill-change`(value: String): Self = StObject.set(x, "will-change", value.asInstanceOf[js.Any])
    
    inline def `setWill-changeUndefined`: Self = StObject.set(x, "will-change", js.undefined)
  }
}
