package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearIcon extends StObject {
  
  var clearIcon: String
  
  var scope: String
  
  var searchFieldAriaLabel: String
  
  var searchIcon: String
}
object ClearIcon {
  
  inline def apply(clearIcon: String, scope: String, searchFieldAriaLabel: String, searchIcon: String): ClearIcon = {
    val __obj = js.Dynamic.literal(clearIcon = clearIcon.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], searchFieldAriaLabel = searchFieldAriaLabel.asInstanceOf[js.Any], searchIcon = searchIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearIcon] (val x: Self) extends AnyVal {
    
    inline def setClearIcon(value: String): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldAriaLabel(value: String): Self = StObject.set(x, "searchFieldAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setSearchIcon(value: String): Self = StObject.set(x, "searchIcon", value.asInstanceOf[js.Any])
  }
}
