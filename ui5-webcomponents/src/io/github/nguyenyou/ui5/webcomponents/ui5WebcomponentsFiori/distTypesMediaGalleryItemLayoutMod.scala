package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaGalleryItemLayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryItemLayout.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MediaGalleryItemLayout & String] = js.native
    
    /* "Square" */ val Square: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryItemLayoutMod.MediaGalleryItemLayout.Square & String = js.native
    
    /* "Wide" */ val Wide: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryItemLayoutMod.MediaGalleryItemLayout.Wide & String = js.native
  }
  
  @js.native
  sealed trait MediaGalleryItemLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/MediaGalleryItemLayout.js", "MediaGalleryItemLayout")
  @js.native
  object MediaGalleryItemLayout extends StObject {
    
    /**
      * Recommended to use when the item contains an image.
      *
      * When a thumbnail is selected, it makes the corresponding enlarged content appear in a square display area.
      * @public
      */
    @js.native
    sealed trait Square
      extends StObject
         with MediaGalleryItemLayout
    
    /**
      * Recommended to use when the item contains video content.
      *
      * When a thumbnail is selected, it makes the corresponding enlarged content appear in a wide display area
      * (stretched to fill all of the available width) for optimal user experiance.
      * @public
      */
    @js.native
    sealed trait Wide
      extends StObject
         with MediaGalleryItemLayout
  }
}
