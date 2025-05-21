package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableCellHorizontalAlignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableCellHorizontalAlign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableCellHorizontalAlign & String] = js.native
    
    /* "Center" */ val Center: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableCellHorizontalAlignMod.TableCellHorizontalAlign.Center & String = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableCellHorizontalAlignMod.TableCellHorizontalAlign.End & String = js.native
    
    /* "Left" */ val Left: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableCellHorizontalAlignMod.TableCellHorizontalAlign.Left & String = js.native
    
    /* "Right" */ val Right: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableCellHorizontalAlignMod.TableCellHorizontalAlign.Right & String = js.native
    
    /* "Start" */ val Start: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableCellHorizontalAlignMod.TableCellHorizontalAlign.Start & String = js.native
  }
  
  @js.native
  sealed trait TableCellHorizontalAlign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableCellHorizontalAlign.js", "TableCellHorizontalAlign")
  @js.native
  object TableCellHorizontalAlign extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait Center
      extends StObject
         with TableCellHorizontalAlign
    
    /**
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with TableCellHorizontalAlign
    
    /**
      * @public
      */
    @js.native
    sealed trait Left
      extends StObject
         with TableCellHorizontalAlign
    
    /**
      * @public
      */
    @js.native
    sealed trait Right
      extends StObject
         with TableCellHorizontalAlign
    
    /**
      * @public
      */
    @js.native
    sealed trait Start
      extends StObject
         with TableCellHorizontalAlign
  }
}
