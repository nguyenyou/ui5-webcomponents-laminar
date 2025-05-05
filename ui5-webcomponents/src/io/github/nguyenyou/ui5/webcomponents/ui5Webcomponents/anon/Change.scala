package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var change: Unit
  
  var `value-changed`: Unit
}
object Change {
  
  inline def apply(change: Unit, `value-changed`: Unit): Change = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.updateDynamic("value-changed")(`value-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def `setValue-changed`(value: Unit): Self = StObject.set(x, "value-changed", value.asInstanceOf[js.Any])
  }
}
