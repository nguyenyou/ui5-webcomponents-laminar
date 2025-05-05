package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  var click: Item
}
object Click {
  
  inline def apply(click: Item): Click = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Item): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
