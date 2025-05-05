package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineGrowingModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/TimelineGrowingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TimelineGrowingMode & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesTimelineGrowingModeMod.TimelineGrowingMode.Button & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesTimelineGrowingModeMod.TimelineGrowingMode.None & String = js.native
    
    /* "Scroll" */ val Scroll: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesTimelineGrowingModeMod.TimelineGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TimelineGrowingMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/TimelineGrowingMode", "TimelineGrowingMode")
  @js.native
  object TimelineGrowingMode extends StObject {
    
    /**
      * Event `load-more` is fired
      * upon pressing a "More" button at the end.
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with TimelineGrowingMode
    
    /**
      * The growing feature is not enabled.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with TimelineGrowingMode
    
    /**
      * Event `load-more` is fired upon scroll.
      * @public
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TimelineGrowingMode
  }
}
