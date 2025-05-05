package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spacer extends StObject {
  
  var spacer: Willchange
  
  var table: Gridtemplatecolumns
}
object Spacer {
  
  inline def apply(spacer: Willchange, table: Gridtemplatecolumns): Spacer = {
    val __obj = js.Dynamic.literal(spacer = spacer.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spacer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spacer] (val x: Self) extends AnyVal {
    
    inline def setSpacer(value: Willchange): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
    
    inline def setTable(value: Gridtemplatecolumns): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
