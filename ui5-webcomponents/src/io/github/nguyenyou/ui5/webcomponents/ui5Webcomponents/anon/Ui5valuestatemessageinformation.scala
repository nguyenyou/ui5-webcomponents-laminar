package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5valuestatemessageinformation extends StObject {
  
  var `ui5-valuestatemessage--error`: Boolean
  
  var `ui5-valuestatemessage--information`: Boolean
  
  var `ui5-valuestatemessage--success`: Boolean
  
  var `ui5-valuestatemessage--warning`: Boolean
  
  var `ui5-valuestatemessage-root`: Boolean
}
object Ui5valuestatemessageinformation {
  
  inline def apply(
    `ui5-valuestatemessage--error`: Boolean,
    `ui5-valuestatemessage--information`: Boolean,
    `ui5-valuestatemessage--success`: Boolean,
    `ui5-valuestatemessage--warning`: Boolean,
    `ui5-valuestatemessage-root`: Boolean
  ): Ui5valuestatemessageinformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-valuestatemessage--error")(`ui5-valuestatemessage--error`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-valuestatemessage--information")(`ui5-valuestatemessage--information`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-valuestatemessage--success")(`ui5-valuestatemessage--success`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-valuestatemessage--warning")(`ui5-valuestatemessage--warning`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-valuestatemessage-root")(`ui5-valuestatemessage-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5valuestatemessageinformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5valuestatemessageinformation] (val x: Self) extends AnyVal {
    
    inline def `setUi5-valuestatemessage--error`(value: Boolean): Self = StObject.set(x, "ui5-valuestatemessage--error", value.asInstanceOf[js.Any])
    
    inline def `setUi5-valuestatemessage--information`(value: Boolean): Self = StObject.set(x, "ui5-valuestatemessage--information", value.asInstanceOf[js.Any])
    
    inline def `setUi5-valuestatemessage--success`(value: Boolean): Self = StObject.set(x, "ui5-valuestatemessage--success", value.asInstanceOf[js.Any])
    
    inline def `setUi5-valuestatemessage--warning`(value: Boolean): Self = StObject.set(x, "ui5-valuestatemessage--warning", value.asInstanceOf[js.Any])
    
    inline def `setUi5-valuestatemessage-root`(value: Boolean): Self = StObject.set(x, "ui5-valuestatemessage-root", value.asInstanceOf[js.Any])
  }
}
