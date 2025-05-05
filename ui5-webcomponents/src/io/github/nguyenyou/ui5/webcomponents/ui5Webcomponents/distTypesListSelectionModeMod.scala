package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListSelectionModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListSelectionMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListSelectionMode & String] = js.native
    
    /* "Delete" */ val Delete: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.Delete & String = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.Multiple & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.None & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.Single & String = js.native
    
    /* "SingleAuto" */ val SingleAuto: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.SingleAuto & String = js.native
    
    /* "SingleEnd" */ val SingleEnd: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.SingleEnd & String = js.native
    
    /* "SingleStart" */ val SingleStart: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.SingleStart & String = js.native
  }
  
  @js.native
  sealed trait ListSelectionMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListSelectionMode", "ListSelectionMode")
  @js.native
  object ListSelectionMode extends StObject {
    
    /**
      * Delete mode (only one list item can be deleted via provided delete button)
      * @public
      */
    @js.native
    sealed trait Delete
      extends StObject
         with ListSelectionMode
    
    /**
      * Multi selection mode (more than one list item can be selected).
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with ListSelectionMode
    
    /**
      * Default mode (no selection).
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with ListSelectionMode
    
    /**
      * Right-positioned single selection mode (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with ListSelectionMode
    
    /**
      * Selected item is highlighted and selection is changed upon arrow navigation
      * (only one list item can be selected - this is always the focused item).
      * @public
      */
    @js.native
    sealed trait SingleAuto
      extends StObject
         with ListSelectionMode
    
    /**
      * Selected item is highlighted but no selection element is visible
      * (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait SingleEnd
      extends StObject
         with ListSelectionMode
    
    /**
      * Left-positioned single selection mode (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait SingleStart
      extends StObject
         with ListSelectionMode
  }
}
