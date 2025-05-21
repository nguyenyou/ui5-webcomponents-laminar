package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUploadCollectionSelectionModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadCollectionSelectionMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UploadCollectionSelectionMode & String] = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.Multiple & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.None & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.Single & String = js.native
    
    /* "SingleAuto" */ val SingleAuto: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.SingleAuto & String = js.native
    
    /* "SingleEnd" */ val SingleEnd: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.SingleEnd & String = js.native
    
    /* "SingleStart" */ val SingleStart: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode.SingleStart & String = js.native
  }
  
  @js.native
  sealed trait UploadCollectionSelectionMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadCollectionSelectionMode", "UploadCollectionSelectionMode")
  @js.native
  object UploadCollectionSelectionMode extends StObject {
    
    /**
      * Multi selection mode (more than one list item can be selected).
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with UploadCollectionSelectionMode
    
    /**
      * Default mode (no selection).
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with UploadCollectionSelectionMode
    
    /**
      * Right-positioned single selection mode (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with UploadCollectionSelectionMode
    
    /**
      * Selected item is highlighted and selection is changed upon arrow navigation
      * (only one list item can be selected - this is always the focused item).
      * @public
      */
    @js.native
    sealed trait SingleAuto
      extends StObject
         with UploadCollectionSelectionMode
    
    /**
      * Selected item is highlighted but no selection element is visible
      * (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait SingleEnd
      extends StObject
         with UploadCollectionSelectionMode
    
    /**
      * Left-positioned single selection mode (only one list item can be selected).
      * @public
      */
    @js.native
    sealed trait SingleStart
      extends StObject
         with UploadCollectionSelectionMode
  }
}
