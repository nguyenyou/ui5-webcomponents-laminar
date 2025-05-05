package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListItemAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListItemAccessibleRole", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListItemAccessibleRole & String] = js.native
    
    /* "Group" */ val Group: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.Group & String = js.native
    
    /* "ListItem" */ val ListItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.ListItem & String = js.native
    
    /* "MenuItem" */ val MenuItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.MenuItem & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.None & String = js.native
    
    /* "Option" */ val Option: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.Option & String = js.native
    
    /* "TreeItem" */ val TreeItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemAccessibleRoleMod.ListItemAccessibleRole.TreeItem & String = js.native
  }
  
  @js.native
  sealed trait ListItemAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListItemAccessibleRole", "ListItemAccessibleRole")
  @js.native
  object ListItemAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "group".
      * @private
      */
    @js.native
    sealed trait Group
      extends StObject
         with ListItemAccessibleRole
    
    /**
      * Represents the ARIA role "listitem". (by default)
      * @public
      */
    @js.native
    sealed trait ListItem
      extends StObject
         with ListItemAccessibleRole
    
    /**
      * Represents the ARIA role "menuitem".
      * @public
      */
    @js.native
    sealed trait MenuItem
      extends StObject
         with ListItemAccessibleRole
    
    /**
      * Represents the ARIA role "none".
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with ListItemAccessibleRole
    
    /**
      * Represents the ARIA role "option".
      * @public
      */
    @js.native
    sealed trait Option
      extends StObject
         with ListItemAccessibleRole
    
    /**
      * Represents the ARIA role "treeitem".
      * @public
      */
    @js.native
    sealed trait TreeItem
      extends StObject
         with ListItemAccessibleRole
  }
}
