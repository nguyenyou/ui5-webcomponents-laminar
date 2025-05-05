package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: End
}
object Columns {
  
  inline def apply(columns: End): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    inline def setColumns(value: End): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
  }
}
