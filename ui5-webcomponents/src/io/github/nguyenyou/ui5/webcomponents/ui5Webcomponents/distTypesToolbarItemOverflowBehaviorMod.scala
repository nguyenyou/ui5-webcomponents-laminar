package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToolbarItemOverflowBehaviorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ToolbarItemOverflowBehavior", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToolbarItemOverflowBehavior & String] = js.native
    
    /* "AlwaysOverflow" */ val AlwaysOverflow: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior.AlwaysOverflow & String = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior.Default & String = js.native
    
    /* "NeverOverflow" */ val NeverOverflow: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior.NeverOverflow & String = js.native
  }
  
  @js.native
  sealed trait ToolbarItemOverflowBehavior extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ToolbarItemOverflowBehavior", "ToolbarItemOverflowBehavior")
  @js.native
  object ToolbarItemOverflowBehavior extends StObject {
    
    /**
      * When set, the item will be always part of the overflow part of ui5-toolbar.
      * @public
      */
    @js.native
    sealed trait AlwaysOverflow
      extends StObject
         with ToolbarItemOverflowBehavior
    
    /**
      * The item is presented inside the toolbar and goes in the popover, when there is not enough space.
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with ToolbarItemOverflowBehavior
    
    /**
      * When set, the item will never go to the overflow popover.
      * @public
      */
    @js.native
    sealed trait NeverOverflow
      extends StObject
         with ToolbarItemOverflowBehavior
  }
}
