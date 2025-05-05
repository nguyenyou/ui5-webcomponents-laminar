package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paddinginlinestart extends StObject {
  
  var `padding-inline-start`: String
}
object Paddinginlinestart {
  
  inline def apply(`padding-inline-start`: String): Paddinginlinestart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("padding-inline-start")(`padding-inline-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paddinginlinestart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paddinginlinestart] (val x: Self) extends AnyVal {
    
    inline def `setPadding-inline-start`(value: String): Self = StObject.set(x, "padding-inline-start", value.asInstanceOf[js.Any])
  }
}
