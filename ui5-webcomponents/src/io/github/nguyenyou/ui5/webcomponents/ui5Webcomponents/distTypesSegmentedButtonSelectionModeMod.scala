package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSegmentedButtonSelectionModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/SegmentedButtonSelectionMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SegmentedButtonSelectionMode & String] = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSegmentedButtonSelectionModeMod.SegmentedButtonSelectionMode.Multiple & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSegmentedButtonSelectionModeMod.SegmentedButtonSelectionMode.Single & String = js.native
  }
  
  @js.native
  sealed trait SegmentedButtonSelectionMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/SegmentedButtonSelectionMode.js", "SegmentedButtonSelectionMode")
  @js.native
  object SegmentedButtonSelectionMode extends StObject {
    
    /**
      * Multiple items can be selected at a time. All items can be deselected.
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with SegmentedButtonSelectionMode
    
    /**
      * There is always one selected. Selecting one deselects the previous one.
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with SegmentedButtonSelectionMode
  }
}
