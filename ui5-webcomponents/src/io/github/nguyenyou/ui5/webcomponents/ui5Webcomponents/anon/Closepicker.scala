package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closepicker extends StObject {
  
  var `close-picker`: Unit
}
object Closepicker {
  
  inline def apply(`close-picker`: Unit): Closepicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close-picker")(`close-picker`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closepicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closepicker] (val x: Self) extends AnyVal {
    
    inline def `setClose-picker`(value: Unit): Self = StObject.set(x, "close-picker", value.asInstanceOf[js.Any])
  }
}
