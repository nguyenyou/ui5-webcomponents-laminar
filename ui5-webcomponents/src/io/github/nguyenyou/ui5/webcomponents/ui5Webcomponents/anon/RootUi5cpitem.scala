package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootUi5cpitem extends StObject {
  
  var root: Ui5cpitem
}
object RootUi5cpitem {
  
  inline def apply(root: Ui5cpitem): RootUi5cpitem = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootUi5cpitem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootUi5cpitem] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5cpitem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
