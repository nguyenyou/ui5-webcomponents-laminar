package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesExpandableTextOverflowModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ExpandableTextOverflowMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ExpandableTextOverflowMode & String] = js.native
    
    /* "InPlace" */ val InPlace: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesExpandableTextOverflowModeMod.ExpandableTextOverflowMode.InPlace & String = js.native
    
    /* "Popover" */ val Popover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesExpandableTextOverflowModeMod.ExpandableTextOverflowMode.Popover & String = js.native
  }
  
  @js.native
  sealed trait ExpandableTextOverflowMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ExpandableTextOverflowMode.js", "ExpandableTextOverflowMode")
  @js.native
  object ExpandableTextOverflowMode extends StObject {
    
    /**
      * Overflowing text is appended in-place.
      * @public
      */
    @js.native
    sealed trait InPlace
      extends StObject
         with ExpandableTextOverflowMode
    
    /**
      * Full text is displayed in a popover.
      * @public
      */
    @js.native
    sealed trait Popover
      extends StObject
         with ExpandableTextOverflowMode
  }
}
