package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BarAccessibleRole.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BarAccessibleRole & String] = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarAccessibleRoleMod.BarAccessibleRole.None & String = js.native
    
    /* "Toolbar" */ val Toolbar: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarAccessibleRoleMod.BarAccessibleRole.Toolbar & String = js.native
  }
  
  @js.native
  sealed trait BarAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BarAccessibleRole.js", "BarAccessibleRole")
  @js.native
  object BarAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "none".
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with BarAccessibleRole
    
    /**
      * Represents the ARIA role "toolbar".
      * @public
      */
    @js.native
    sealed trait Toolbar
      extends StObject
         with BarAccessibleRole
  }
}
