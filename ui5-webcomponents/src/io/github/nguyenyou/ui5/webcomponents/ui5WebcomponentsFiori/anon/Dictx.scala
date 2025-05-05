package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* x */ StringDictionary[Boolean] {
  
  var `ui5-dsc-main`: Boolean
}
object Dictx {
  
  inline def apply(`ui5-dsc-main`: Boolean): Dictx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-dsc-main")(`ui5-dsc-main`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
    
    inline def `setUi5-dsc-main`(value: Boolean): Self = StObject.set(x, "ui5-dsc-main", value.asInstanceOf[js.Any])
  }
}
