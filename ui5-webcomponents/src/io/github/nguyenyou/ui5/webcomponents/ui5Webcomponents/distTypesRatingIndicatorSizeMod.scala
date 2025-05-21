package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRatingIndicatorSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/RatingIndicatorSize.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RatingIndicatorSize & String] = js.native
    
    /* "L" */ val L: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesRatingIndicatorSizeMod.RatingIndicatorSize.L & String = js.native
    
    /* "M" */ val M: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesRatingIndicatorSizeMod.RatingIndicatorSize.M & String = js.native
    
    /* "S" */ val S: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesRatingIndicatorSizeMod.RatingIndicatorSize.S & String = js.native
  }
  
  @js.native
  sealed trait RatingIndicatorSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/RatingIndicatorSize.js", "RatingIndicatorSize")
  @js.native
  object RatingIndicatorSize extends StObject {
    
    /**
      * Large size for prominent or spacious layouts.
      * @public
      */
    @js.native
    sealed trait L
      extends StObject
         with RatingIndicatorSize
    
    /**
      * Medium size, used as the default option.
      * Offers a balanced appearance for most scenarios.
      * @public
      */
    @js.native
    sealed trait M
      extends StObject
         with RatingIndicatorSize
    
    /**
      * Small size for compact layouts.
      * @public
      */
    @js.native
    sealed trait S
      extends StObject
         with RatingIndicatorSize
  }
}
