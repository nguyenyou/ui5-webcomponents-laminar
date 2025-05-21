package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopupAccessibleRoleMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopupAccessibleRole.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopupAccessibleRole & String] = js.native
    
    /* "AlertDialog" */ val AlertDialog: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopupAccessibleRoleMod.PopupAccessibleRole.AlertDialog & String = js.native
    
    /* "Dialog" */ val Dialog: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopupAccessibleRoleMod.PopupAccessibleRole.Dialog & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopupAccessibleRoleMod.PopupAccessibleRole.None & String = js.native
  }
  
  @js.native
  sealed trait PopupAccessibleRole extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopupAccessibleRole.js", "PopupAccessibleRole")
  @js.native
  object PopupAccessibleRole extends StObject {
    
    /**
      * Represents the ARIA role "alertdialog".
      * @public
      */
    @js.native
    sealed trait AlertDialog
      extends StObject
         with PopupAccessibleRole
    
    /**
      * Represents the ARIA role "dialog".
      * @public
      */
    @js.native
    sealed trait Dialog
      extends StObject
         with PopupAccessibleRole
    
    /**
      * Represents no ARIA role.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with PopupAccessibleRole
  }
}
