package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBusyIndicatorSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BusyIndicatorSize & String] = js.native
    
    /* "L" */ val L: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.L & String = js.native
    
    /* "M" */ val M: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.M & String = js.native
    
    /* "S" */ val S: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize.S & String = js.native
  }
  
  @js.native
  sealed trait BusyIndicatorSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorSize", "BusyIndicatorSize")
  @js.native
  object BusyIndicatorSize extends StObject {
    
    /**
      * large size
      * @public
      */
    @js.native
    sealed trait L
      extends StObject
         with BusyIndicatorSize
    
    /**
      * medium size
      * @public
      */
    @js.native
    sealed trait M
      extends StObject
         with BusyIndicatorSize
    
    /**
      * small size
      * @public
      */
    @js.native
    sealed trait S
      extends StObject
         with BusyIndicatorSize
  }
}
