package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaGalleryMenuHorizontalAlignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryMenuHorizontalAlign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaGalleryMenuHorizontalAlign & String] = js.native
    
    /* "Left" */ val Left: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuHorizontalAlignMod.MediaGalleryMenuHorizontalAlign.Left & String = js.native
    
    /* "Right" */ val Right: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuHorizontalAlignMod.MediaGalleryMenuHorizontalAlign.Right & String = js.native
  }
  
  @js.native
  sealed trait MediaGalleryMenuHorizontalAlign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryMenuHorizontalAlign.js", "MediaGalleryMenuHorizontalAlign")
  @js.native
  object MediaGalleryMenuHorizontalAlign extends StObject {
    
    /**
      * Displays the menu on the left side of the target.
      * @public
      */
    @js.native
    sealed trait Left
      extends StObject
         with MediaGalleryMenuHorizontalAlign
    
    /**
      * Displays the menu on the right side of the target.
      * @public
      */
    @js.native
    sealed trait Right
      extends StObject
         with MediaGalleryMenuHorizontalAlign
  }
}
