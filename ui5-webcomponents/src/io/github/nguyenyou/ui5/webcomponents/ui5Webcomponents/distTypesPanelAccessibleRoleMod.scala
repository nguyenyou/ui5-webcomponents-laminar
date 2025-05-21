package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPanelAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PanelAccessibleRole", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PanelAccessibleRole & String] = js.native
    
    /* "Complementary" */ val Complementary: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole.Complementary & String = js.native
    
    /* "Form" */ val Form: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole.Form & String = js.native
    
    /* "Region" */ val Region: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole.Region & String = js.native
  }
  
  @js.native
  sealed trait PanelAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PanelAccessibleRole", "PanelAccessibleRole")
  @js.native
  object PanelAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "complementary".
      * A section of the page, designed to be complementary to the main content at a similar level in the DOM hierarchy.
      * @public
      */
    @js.native
    sealed trait Complementary
      extends StObject
         with PanelAccessibleRole
    
    /**
      * Represents the ARIA role "Form".
      * A landmark region that contains a collection of items and objects that, as a whole, create a form.
      * @public
      */
    @js.native
    sealed trait Form
      extends StObject
         with PanelAccessibleRole
    
    /**
      * Represents the ARIA role "Region".
      * A section of a page, that is important enough to be included in a page summary or table of contents.
      * @public
      */
    @js.native
    sealed trait Region
      extends StObject
         with PanelAccessibleRole
  }
}
