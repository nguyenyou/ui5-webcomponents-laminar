package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Main extends StObject {
  
  var main: Ui5checkboxhoverable
}
object Main {
  
  inline def apply(main: Ui5checkboxhoverable): Main = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[Main]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Main] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Ui5checkboxhoverable): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
