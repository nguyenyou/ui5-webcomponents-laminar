package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListAccessibleRole.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListAccessibleRole & String] = js.native
    
    /* "List" */ val List: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListAccessibleRoleMod.ListAccessibleRole.List & String = js.native
    
    /* "ListBox" */ val ListBox: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListAccessibleRoleMod.ListAccessibleRole.ListBox & String = js.native
    
    /* "Menu" */ val Menu: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListAccessibleRoleMod.ListAccessibleRole.Menu & String = js.native
    
    /* "Tree" */ val Tree: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListAccessibleRoleMod.ListAccessibleRole.Tree & String = js.native
  }
  
  @js.native
  sealed trait ListAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListAccessibleRole.js", "ListAccessibleRole")
  @js.native
  object ListAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "list". (by default)
      * @public
      */
    @js.native
    sealed trait List
      extends StObject
         with ListAccessibleRole
    
    /**
      * Represents the ARIA role "listbox".
      * @public
      */
    @js.native
    sealed trait ListBox
      extends StObject
         with ListAccessibleRole
    
    /**
      * Represents the ARIA role "menu".
      * @public
      */
    @js.native
    sealed trait Menu
      extends StObject
         with ListAccessibleRole
    
    /**
      * Represents the ARIA role "tree".
      * @public
      */
    @js.native
    sealed trait Tree
      extends StObject
         with ListAccessibleRole
  }
}
