package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/ViewSettingsDialog.VSDItem & {  index :number} */
trait VSDItemindexnumber extends StObject {
  
  var index: Double
  
  var selected: Boolean
  
  var text: js.UndefOr[String] = js.undefined
}
object VSDItemindexnumber {
  
  inline def apply(index: Double, selected: Boolean): VSDItemindexnumber = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[VSDItemindexnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VSDItemindexnumber] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
