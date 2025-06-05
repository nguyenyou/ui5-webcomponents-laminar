package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootUi5tbitem extends StObject {
  
  var root: Ui5tbitem
}
object RootUi5tbitem {
  
  inline def apply(root: Ui5tbitem): RootUi5tbitem = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootUi5tbitem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootUi5tbitem] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5tbitem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
