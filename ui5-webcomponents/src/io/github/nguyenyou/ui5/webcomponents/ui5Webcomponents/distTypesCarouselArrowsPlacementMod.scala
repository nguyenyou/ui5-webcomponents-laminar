package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselArrowsPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CarouselArrowsPlacement.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CarouselArrowsPlacement & String] = js.native
    
    /* "Content" */ val Content: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCarouselArrowsPlacementMod.CarouselArrowsPlacement.Content & String = js.native
    
    /* "Navigation" */ val Navigation: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCarouselArrowsPlacementMod.CarouselArrowsPlacement.Navigation & String = js.native
  }
  
  @js.native
  sealed trait CarouselArrowsPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CarouselArrowsPlacement.js", "CarouselArrowsPlacement")
  @js.native
  object CarouselArrowsPlacement extends StObject {
    
    /**
      * Carousel arrows are placed on the sides of the current Carousel page.
      * @public
      */
    @js.native
    sealed trait Content
      extends StObject
         with CarouselArrowsPlacement
    
    /**
      * Carousel arrows are placed on the sides of the page indicator of the Carousel.
      * @public
      */
    @js.native
    sealed trait Navigation
      extends StObject
         with CarouselArrowsPlacement
  }
}
