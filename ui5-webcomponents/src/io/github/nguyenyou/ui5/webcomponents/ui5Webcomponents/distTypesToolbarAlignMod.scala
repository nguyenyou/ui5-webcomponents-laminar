package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToolbarAlignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ToolbarAlign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToolbarAlign & String] = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarAlignMod.ToolbarAlign.End & String = js.native
    
    /* "Start" */ val Start: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarAlignMod.ToolbarAlign.Start & String = js.native
  }
  
  @js.native
  sealed trait ToolbarAlign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ToolbarAlign", "ToolbarAlign")
  @js.native
  object ToolbarAlign extends StObject {
    
    /**
      * Toolbar items are situated at the `end` of the Toolbar
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with ToolbarAlign
    
    /**
      * Toolbar items are situated at the `start` of the Toolbar
      * @public
      */
    @js.native
    sealed trait Start
      extends StObject
         with ToolbarAlign
  }
}
