package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ButtonAccessibleRole.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonAccessibleRole & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonAccessibleRoleMod.ButtonAccessibleRole.Button & String = js.native
    
    /* "Link" */ val Link: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonAccessibleRoleMod.ButtonAccessibleRole.Link & String = js.native
  }
  
  @js.native
  sealed trait ButtonAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ButtonAccessibleRole.js", "ButtonAccessibleRole")
  @js.native
  object ButtonAccessibleRole extends StObject {
    
    /**
      * Represents Default (button) ARIA role.
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with ButtonAccessibleRole
    
    /**
      * Represents the ARIA role "link".
      * @public
      */
    @js.native
    sealed trait Link
      extends StObject
         with ButtonAccessibleRole
  }
}
