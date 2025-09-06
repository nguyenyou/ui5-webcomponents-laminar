package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Main extends StObject {
  
  var main: Ui5dscmain
  
  var root: Ui5dscroot
  
  var side: Ui5dscside
}
object Main {
  
  inline def apply(main: Ui5dscmain, root: Ui5dscroot, side: Ui5dscside): Main = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[Main]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Main] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Ui5dscmain): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Ui5dscroot): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSide(value: Ui5dscside): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
