package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nameclick extends StObject {
  
  var `name-click`: Unit
}
object Nameclick {
  
  inline def apply(`name-click`: Unit): Nameclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name-click")(`name-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nameclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nameclick] (val x: Self) extends AnyVal {
    
    inline def `setName-click`(value: Unit): Self = StObject.set(x, "name-click", value.asInstanceOf[js.Any])
  }
}
