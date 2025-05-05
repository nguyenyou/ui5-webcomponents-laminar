package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5popoverwithvaluestateheader extends StObject {
  
  var `ui5-popover-with-value-state-header`: Boolean
  
  var `ui5-popover-with-value-state-header-phone`: Boolean
  
  var `ui5-suggestions-popover`: Boolean
}
object Ui5popoverwithvaluestateheader {
  
  inline def apply(
    `ui5-popover-with-value-state-header`: Boolean,
    `ui5-popover-with-value-state-header-phone`: Boolean,
    `ui5-suggestions-popover`: Boolean
  ): Ui5popoverwithvaluestateheader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-popover-with-value-state-header")(`ui5-popover-with-value-state-header`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-popover-with-value-state-header-phone")(`ui5-popover-with-value-state-header-phone`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-suggestions-popover")(`ui5-suggestions-popover`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5popoverwithvaluestateheader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5popoverwithvaluestateheader] (val x: Self) extends AnyVal {
    
    inline def `setUi5-popover-with-value-state-header`(value: Boolean): Self = StObject.set(x, "ui5-popover-with-value-state-header", value.asInstanceOf[js.Any])
    
    inline def `setUi5-popover-with-value-state-header-phone`(value: Boolean): Self = StObject.set(x, "ui5-popover-with-value-state-header-phone", value.asInstanceOf[js.Any])
    
    inline def `setUi5-suggestions-popover`(value: Boolean): Self = StObject.set(x, "ui5-suggestions-popover", value.asInstanceOf[js.Any])
  }
}
