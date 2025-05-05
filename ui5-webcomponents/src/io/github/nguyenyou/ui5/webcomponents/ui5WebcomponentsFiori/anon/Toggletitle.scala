package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toggletitle extends StObject {
  
  var `toggle-title`: Unit
}
object Toggletitle {
  
  inline def apply(`toggle-title`: Unit): Toggletitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toggle-title")(`toggle-title`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toggletitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toggletitle] (val x: Self) extends AnyVal {
    
    inline def `setToggle-title`(value: Unit): Self = StObject.set(x, "toggle-title", value.asInstanceOf[js.Any])
  }
}
