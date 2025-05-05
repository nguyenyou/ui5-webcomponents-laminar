package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activestatechange extends StObject {
  
  var `active-state-change`: Unit
}
object Activestatechange {
  
  inline def apply(`active-state-change`: Unit): Activestatechange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active-state-change")(`active-state-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activestatechange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Activestatechange] (val x: Self) extends AnyVal {
    
    inline def `setActive-state-change`(value: Unit): Self = StObject.set(x, "active-state-change", value.asInstanceOf[js.Any])
  }
}
