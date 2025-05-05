package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gridtemplatecolumns extends StObject {
  
  var `--row-height`: String
  
  var `grid-template-columns`: js.UndefOr[String] = js.undefined
}
object Gridtemplatecolumns {
  
  inline def apply(`--row-height`: String): Gridtemplatecolumns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("--row-height")(`--row-height`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gridtemplatecolumns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gridtemplatecolumns] (val x: Self) extends AnyVal {
    
    inline def `set--row-height`(value: String): Self = StObject.set(x, "--row-height", value.asInstanceOf[js.Any])
    
    inline def `setGrid-template-columns`(value: String): Self = StObject.set(x, "grid-template-columns", value.asInstanceOf[js.Any])
    
    inline def `setGrid-template-columnsUndefined`: Self = StObject.set(x, "grid-template-columns", js.undefined)
  }
}
