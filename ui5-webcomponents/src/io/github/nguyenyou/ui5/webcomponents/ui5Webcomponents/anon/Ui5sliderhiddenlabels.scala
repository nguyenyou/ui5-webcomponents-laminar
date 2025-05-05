package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5sliderhiddenlabels extends StObject {
  
  var `ui5-slider-hidden-labels`: Boolean
}
object Ui5sliderhiddenlabels {
  
  inline def apply(`ui5-slider-hidden-labels`: Boolean): Ui5sliderhiddenlabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-slider-hidden-labels")(`ui5-slider-hidden-labels`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5sliderhiddenlabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5sliderhiddenlabels] (val x: Self) extends AnyVal {
    
    inline def `setUi5-slider-hidden-labels`(value: Boolean): Self = StObject.set(x, "ui5-slider-hidden-labels", value.asInstanceOf[js.Any])
  }
}
