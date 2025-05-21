package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCarouselPageIndicatorTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CarouselPageIndicatorType.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CarouselPageIndicatorType & String] = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCarouselPageIndicatorTypeMod.CarouselPageIndicatorType.Default & String = js.native
    
    /* "Numeric" */ val Numeric: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCarouselPageIndicatorTypeMod.CarouselPageIndicatorType.Numeric & String = js.native
  }
  
  @js.native
  sealed trait CarouselPageIndicatorType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CarouselPageIndicatorType.js", "CarouselPageIndicatorType")
  @js.native
  object CarouselPageIndicatorType extends StObject {
    
    /**
      * The page indicator will be visualized as dots if there are fewer than 9 pages.
      * If there are more pages, the page indicator will switch to displaying the current page and the total number of pages. (e.g. X of Y)
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with CarouselPageIndicatorType
    
    /**
      * The page indicator will display the current page and the total number of pages. (e.g. X of Y)
      * @public
      */
    @js.native
    sealed trait Numeric
      extends StObject
         with CarouselPageIndicatorType
  }
}
