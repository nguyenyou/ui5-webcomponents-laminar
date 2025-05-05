package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closeinputs extends StObject {
  
  var `close-inputs`: Unit
}
object Closeinputs {
  
  inline def apply(`close-inputs`: Unit): Closeinputs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close-inputs")(`close-inputs`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closeinputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closeinputs] (val x: Self) extends AnyVal {
    
    inline def `setClose-inputs`(value: Unit): Self = StObject.set(x, "close-inputs", value.asInstanceOf[js.Any])
  }
}
