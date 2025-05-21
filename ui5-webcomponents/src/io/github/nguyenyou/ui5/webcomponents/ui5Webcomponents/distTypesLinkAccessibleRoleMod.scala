package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLinkAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/LinkAccessibleRole", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LinkAccessibleRole & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesLinkAccessibleRoleMod.LinkAccessibleRole.Button & String = js.native
    
    /* "Link" */ val Link: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesLinkAccessibleRoleMod.LinkAccessibleRole.Link & String = js.native
  }
  
  @js.native
  sealed trait LinkAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/LinkAccessibleRole", "LinkAccessibleRole")
  @js.native
  object LinkAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "button".
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with LinkAccessibleRole
    
    /**
      * Represents Default (link) ARIA role.
      * @public
      */
    @js.native
    sealed trait Link
      extends StObject
         with LinkAccessibleRole
  }
}
