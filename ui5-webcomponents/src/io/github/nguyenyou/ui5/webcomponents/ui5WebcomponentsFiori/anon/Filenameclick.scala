package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filenameclick extends StObject {
  
  var `_uci-delete`: Unit
  
  var `file-name-click`: Unit
  
  var `focus-requested`: Unit
  
  var rename: Unit
  
  var `request-delete`: Unit
  
  var retry: Unit
  
  var terminate: Unit
}
object Filenameclick {
  
  inline def apply(
    `_uci-delete`: Unit,
    `file-name-click`: Unit,
    `focus-requested`: Unit,
    rename: Unit,
    `request-delete`: Unit,
    retry: Unit,
    terminate: Unit
  ): Filenameclick = {
    val __obj = js.Dynamic.literal(rename = rename.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], terminate = terminate.asInstanceOf[js.Any])
    __obj.updateDynamic("_uci-delete")(`_uci-delete`.asInstanceOf[js.Any])
    __obj.updateDynamic("file-name-click")(`file-name-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("focus-requested")(`focus-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-delete")(`request-delete`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filenameclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filenameclick] (val x: Self) extends AnyVal {
    
    inline def `setFile-name-click`(value: Unit): Self = StObject.set(x, "file-name-click", value.asInstanceOf[js.Any])
    
    inline def `setFocus-requested`(value: Unit): Self = StObject.set(x, "focus-requested", value.asInstanceOf[js.Any])
    
    inline def setRename(value: Unit): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def `setRequest-delete`(value: Unit): Self = StObject.set(x, "request-delete", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Unit): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setTerminate(value: Unit): Self = StObject.set(x, "terminate", value.asInstanceOf[js.Any])
    
    inline def `set_uci-delete`(value: Unit): Self = StObject.set(x, "_uci-delete", value.asInstanceOf[js.Any])
  }
}
