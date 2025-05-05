package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5uciroot extends StObject {
  
  var `ui5-uci-root`: Boolean
  
  var `ui5-uci-root-editing`: Boolean
  
  var `ui5-uci-root-uploading`: Boolean
}
object Ui5uciroot {
  
  inline def apply(`ui5-uci-root`: Boolean, `ui5-uci-root-editing`: Boolean, `ui5-uci-root-uploading`: Boolean): Ui5uciroot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-uci-root")(`ui5-uci-root`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-uci-root-editing")(`ui5-uci-root-editing`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-uci-root-uploading")(`ui5-uci-root-uploading`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5uciroot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5uciroot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-uci-root`(value: Boolean): Self = StObject.set(x, "ui5-uci-root", value.asInstanceOf[js.Any])
    
    inline def `setUi5-uci-root-editing`(value: Boolean): Self = StObject.set(x, "ui5-uci-root-editing", value.asInstanceOf[js.Any])
    
    inline def `setUi5-uci-root-uploading`(value: Boolean): Self = StObject.set(x, "ui5-uci-root-uploading", value.asInstanceOf[js.Any])
  }
}
