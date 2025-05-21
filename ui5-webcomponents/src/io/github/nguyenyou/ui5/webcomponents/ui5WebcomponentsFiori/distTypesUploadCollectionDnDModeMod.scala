package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUploadCollectionDnDModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadCollectionDnDMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UploadCollectionDnDOverlayMode & String] = js.native
    
    /* "Drag" */ val Drag: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionDnDModeMod.UploadCollectionDnDOverlayMode.Drag & String = js.native
    
    /* "Drop" */ val Drop: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionDnDModeMod.UploadCollectionDnDOverlayMode.Drop & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionDnDModeMod.UploadCollectionDnDOverlayMode.None & String = js.native
  }
  
  @js.native
  sealed trait UploadCollectionDnDOverlayMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadCollectionDnDMode.js", "UploadCollectionDnDOverlayMode")
  @js.native
  object UploadCollectionDnDOverlayMode extends StObject {
    
    /**
      * Indication that drag can be performed.
      * @private
      */
    @js.native
    sealed trait Drag
      extends StObject
         with UploadCollectionDnDOverlayMode
    
    /**
      * Indication that drop can be performed.
      * @private
      */
    @js.native
    sealed trait Drop
      extends StObject
         with UploadCollectionDnDOverlayMode
    
    /**
      * No drag or drop indication.
      * @private
      */
    @js.native
    sealed trait None
      extends StObject
         with UploadCollectionDnDOverlayMode
  }
}
