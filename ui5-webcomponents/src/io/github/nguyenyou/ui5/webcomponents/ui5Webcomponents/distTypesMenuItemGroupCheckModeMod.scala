package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMenuItemGroupCheckModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/MenuItemGroupCheckMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MenuItemGroupCheckMode & String] = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMenuItemGroupCheckModeMod.MenuItemGroupCheckMode.Multiple & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMenuItemGroupCheckModeMod.MenuItemGroupCheckMode.None & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMenuItemGroupCheckModeMod.MenuItemGroupCheckMode.Single & String = js.native
  }
  
  @js.native
  sealed trait MenuItemGroupCheckMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/MenuItemGroupCheckMode.js", "MenuItemGroupCheckMode")
  @js.native
  object MenuItemGroupCheckMode extends StObject {
    
    /**
      * Multiple items check mode (multiple items in a group can be checked at a time)
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with MenuItemGroupCheckMode
    
    /**
      * default type (items in a group cannot be checked)
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with MenuItemGroupCheckMode
    
    /**
      * Single item check mode (only one item in a group can be checked at a time)
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with MenuItemGroupCheckMode
  }
}
