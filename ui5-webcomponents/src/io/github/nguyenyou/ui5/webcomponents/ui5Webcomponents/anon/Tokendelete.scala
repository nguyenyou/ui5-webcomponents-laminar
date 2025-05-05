package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiInputMod.MultiInputTokenDeleteEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokendelete extends StObject {
  
  var `token-delete`: MultiInputTokenDeleteEventDetail
  
  var `value-help-trigger`: Unit
}
object Tokendelete {
  
  inline def apply(`token-delete`: MultiInputTokenDeleteEventDetail, `value-help-trigger`: Unit): Tokendelete = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token-delete")(`token-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("value-help-trigger")(`value-help-trigger`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokendelete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tokendelete] (val x: Self) extends AnyVal {
    
    inline def `setToken-delete`(value: MultiInputTokenDeleteEventDetail): Self = StObject.set(x, "token-delete", value.asInstanceOf[js.Any])
    
    inline def `setValue-help-trigger`(value: Unit): Self = StObject.set(x, "value-help-trigger", value.asInstanceOf[js.Any])
  }
}
