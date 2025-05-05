package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaGalleryMenuVerticalAlignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryMenuVerticalAlign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaGalleryMenuVerticalAlign & String] = js.native
    
    /* "Bottom" */ val Bottom: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuVerticalAlignMod.MediaGalleryMenuVerticalAlign.Bottom & String = js.native
    
    /* "Top" */ val Top: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuVerticalAlignMod.MediaGalleryMenuVerticalAlign.Top & String = js.native
  }
  
  @js.native
  sealed trait MediaGalleryMenuVerticalAlign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryMenuVerticalAlign", "MediaGalleryMenuVerticalAlign")
  @js.native
  object MediaGalleryMenuVerticalAlign extends StObject {
    
    /**
      * Displays the menu at the bottom of the reference control.
      * @public
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with MediaGalleryMenuVerticalAlign
    
    /**
      * Displays the menu at the top of the reference control.
      * @public
      */
    @js.native
    sealed trait Top
      extends StObject
         with MediaGalleryMenuVerticalAlign
  }
}
