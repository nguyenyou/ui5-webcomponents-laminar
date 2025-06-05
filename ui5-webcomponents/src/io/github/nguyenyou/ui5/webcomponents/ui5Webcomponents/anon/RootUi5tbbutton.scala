package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootUi5tbbutton extends StObject {
  
  var root: Ui5tbbutton
}
object RootUi5tbbutton {
  
  inline def apply(root: Ui5tbbutton): RootUi5tbbutton = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootUi5tbbutton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootUi5tbbutton] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5tbbutton): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
