package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableOverflowModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableOverflowMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableOverflowMode & String] = js.native
    
    /* "Popin" */ val Popin: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableOverflowModeMod.TableOverflowMode.Popin & String = js.native
    
    /* "Scroll" */ val Scroll: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableOverflowModeMod.TableOverflowMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TableOverflowMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableOverflowMode.js", "TableOverflowMode")
  @js.native
  object TableOverflowMode extends StObject {
    
    /**
      * Pops in columns, that do not fit into the table anymore.
      * @public
      */
    @js.native
    sealed trait Popin
      extends StObject
         with TableOverflowMode
    
    /**
      * Shows a scrollbar, when the table cannot fit all columns.
      * @public
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TableOverflowMode
  }
}
