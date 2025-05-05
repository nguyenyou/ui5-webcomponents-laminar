package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5uccontent extends StObject {
  
  var `ui5-uc-content`: Boolean
  
  var `ui5-uc-content-no-data`: Boolean
}
object Ui5uccontent {
  
  inline def apply(`ui5-uc-content`: Boolean, `ui5-uc-content-no-data`: Boolean): Ui5uccontent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-uc-content")(`ui5-uc-content`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-uc-content-no-data")(`ui5-uc-content-no-data`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5uccontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5uccontent] (val x: Self) extends AnyVal {
    
    inline def `setUi5-uc-content`(value: Boolean): Self = StObject.set(x, "ui5-uc-content", value.asInstanceOf[js.Any])
    
    inline def `setUi5-uc-content-no-data`(value: Boolean): Self = StObject.set(x, "ui5-uc-content-no-data", value.asInstanceOf[js.Any])
  }
}
