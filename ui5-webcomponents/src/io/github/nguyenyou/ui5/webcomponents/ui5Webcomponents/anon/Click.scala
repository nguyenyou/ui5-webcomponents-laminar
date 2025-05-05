package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Click extends StObject {
  
  var click: Unit
}
object Click {
  
  inline def apply(click: Unit): Click = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[Click]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Click] (val x: Self) extends AnyVal {
    
    inline def setClick(value: Unit): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
