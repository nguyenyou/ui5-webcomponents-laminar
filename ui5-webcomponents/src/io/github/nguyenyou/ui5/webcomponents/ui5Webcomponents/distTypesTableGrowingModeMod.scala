package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableGrowingModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableGrowingMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableGrowingMode & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode.Button & String = js.native
    
    /* "Scroll" */ val Scroll: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableGrowingModeMod.TableGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TableGrowingMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableGrowingMode.js", "TableGrowingMode")
  @js.native
  object TableGrowingMode extends StObject {
    
    /**
      * Renders a growing button, which can be pressed to load more data.
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with TableGrowingMode
    
    /**
      * Scroll to load more data.
      *
      * **Note:** If the table is not scrollable, a growing button will be rendered instead to ensure growing functionality.
      * @public
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TableGrowingMode
  }
}
