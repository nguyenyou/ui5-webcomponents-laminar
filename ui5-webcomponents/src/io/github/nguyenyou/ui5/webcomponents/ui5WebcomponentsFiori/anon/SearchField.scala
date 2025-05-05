package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchField extends StObject {
  
  var searchField: Display
}
object SearchField {
  
  inline def apply(searchField: Display): SearchField = {
    val __obj = js.Dynamic.literal(searchField = searchField.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchField] (val x: Self) extends AnyVal {
    
    inline def setSearchField(value: Display): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
  }
}
