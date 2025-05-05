package io.github.nguyenyou.ui5.webcomponents.litHtml.mod

import io.github.nguyenyou.ui5.webcomponents.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateResult[T /* <: ResultType */] extends StObject {
  
  @JSName("_$litType$")
  var _DollarlitTypeDollar: T
  
  var strings: TemplateStringsArray
  
  var values: js.Array[Any]
}
object TemplateResult {
  
  inline def apply[T /* <: ResultType */](_DollarlitTypeDollar: T, strings: TemplateStringsArray, values: js.Array[Any]): TemplateResult[T] = {
    val __obj = js.Dynamic.literal(strings = strings.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("_$litType$")(_DollarlitTypeDollar.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateResult[?], T /* <: ResultType */] (val x: Self & TemplateResult[T]) extends AnyVal {
    
    inline def setStrings(value: TemplateStringsArray): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def set_DollarlitTypeDollar(value: T): Self = StObject.set(x, "_$litType$", value.asInstanceOf[js.Any])
  }
}
