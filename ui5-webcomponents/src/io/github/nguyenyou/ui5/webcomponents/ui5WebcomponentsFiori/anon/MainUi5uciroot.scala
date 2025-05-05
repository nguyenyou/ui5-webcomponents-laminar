package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainUi5uciroot extends StObject {
  
  var main: Ui5uciroot
}
object MainUi5uciroot {
  
  inline def apply(main: Ui5uciroot): MainUi5uciroot = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainUi5uciroot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MainUi5uciroot] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Ui5uciroot): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
