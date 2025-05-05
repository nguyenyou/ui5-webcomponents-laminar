package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickVoid extends StObject {
  
  var click: Unit
}
object ClickVoid {
  
  inline def apply(click: Unit): ClickVoid = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickVoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickVoid] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Unit): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
