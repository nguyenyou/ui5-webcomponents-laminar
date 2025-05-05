package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeVoid extends StObject {
  
  var change: Unit
}
object ChangeVoid {
  
  inline def apply(change: Unit): ChangeVoid = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeVoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeVoid] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
