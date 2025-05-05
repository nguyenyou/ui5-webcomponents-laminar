package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchFieldMod.SearchFieldScopeSelectionChangeDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var input: Unit
  
  var `scope-change`: SearchFieldScopeSelectionChangeDetails
  
  var search: js.Object
}
object Input {
  
  inline def apply(input: Unit, `scope-change`: SearchFieldScopeSelectionChangeDetails, search: js.Object): Input = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.updateDynamic("scope-change")(`scope-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def `setScope-change`(value: SearchFieldScopeSelectionChangeDetails): Self = StObject.set(x, "scope-change", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: js.Object): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
