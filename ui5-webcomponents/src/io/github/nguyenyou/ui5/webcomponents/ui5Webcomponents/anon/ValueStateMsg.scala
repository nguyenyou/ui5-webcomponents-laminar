package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueStateMsg extends StObject {
  
  var root: Ui5contentcustomscrollbars
  
  var valueStateMsg: Ui5valuestatemessageheader
}
object ValueStateMsg {
  
  inline def apply(root: Ui5contentcustomscrollbars, valueStateMsg: Ui5valuestatemessageheader): ValueStateMsg = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], valueStateMsg = valueStateMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueStateMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueStateMsg] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Ui5contentcustomscrollbars): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setValueStateMsg(value: Ui5valuestatemessageheader): Self = StObject.set(x, "valueStateMsg", value.asInstanceOf[js.Any])
  }
}
