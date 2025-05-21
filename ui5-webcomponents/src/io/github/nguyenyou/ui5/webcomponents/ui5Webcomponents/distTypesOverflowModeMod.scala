package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOverflowModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/OverflowMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OverflowMode & String] = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesOverflowModeMod.OverflowMode.End & String = js.native
    
    /* "StartAndEnd" */ val StartAndEnd: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesOverflowModeMod.OverflowMode.StartAndEnd & String = js.native
  }
  
  @js.native
  sealed trait OverflowMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/OverflowMode", "OverflowMode")
  @js.native
  object OverflowMode extends StObject {
    
    /**
      * End type is used if there should be only one overflow with hidden the tabs at the end of the tab container.
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with OverflowMode
    
    /**
      * StartAndEnd type is used if there should be two overflows on both ends of the tab container.
      * @public
      */
    @js.native
    sealed trait StartAndEnd
      extends StObject
         with OverflowMode
  }
}
