package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  contentArea :typeof contentArea}> */
trait PartialcontentAreatypeofc extends StObject {
  
  var contentArea: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof contentArea */ js.Any
  ] = js.undefined
}
object PartialcontentAreatypeofc {
  
  inline def apply(): PartialcontentAreatypeofc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialcontentAreatypeofc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialcontentAreatypeofc] (val x: Self) extends AnyVal {
    
    inline def setContentArea(
      value: /* import warning: importer.ImportType#apply Failed type conversion: typeof contentArea */ js.Any
    ): Self = StObject.set(x, "contentArea", value.asInstanceOf[js.Any])
    
    inline def setContentAreaUndefined: Self = StObject.set(x, "contentArea", js.undefined)
  }
}
