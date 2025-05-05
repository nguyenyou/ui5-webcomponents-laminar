package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadmoreVoid extends StObject {
  
  var `load-more`: Unit
}
object LoadmoreVoid {
  
  inline def apply(`load-more`: Unit): LoadmoreVoid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load-more")(`load-more`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadmoreVoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadmoreVoid] (val x: Self) extends AnyVal {
    
    inline def `setLoad-more`(value: Unit): Self = StObject.set(x, "load-more", value.asInstanceOf[js.Any])
  }
}
