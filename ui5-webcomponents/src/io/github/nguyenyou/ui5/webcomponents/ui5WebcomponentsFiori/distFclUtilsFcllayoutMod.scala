package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ThreeColumnsEndExpanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFclUtilsFcllayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/fcl-utils/FCLLayout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ui5/webcomponents-fiori/dist/fcl-utils/FCLLayout", "FCLLayout")
  @js.native
  object FCLLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout & String
      ] = js.native
    
    /* "EndColumnFullScreen" */ val EndColumnFullScreen: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.EndColumnFullScreen & String = js.native
    
    /* "MidColumnFullScreen" */ val MidColumnFullScreen: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.MidColumnFullScreen & String = js.native
    
    /* "OneColumn" */ val OneColumn: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.OneColumn & String = js.native
    
    /* "ThreeColumnsEndExpanded" */ val ThreeColumnsEndExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsEndExpanded & String = js.native
    
    /* "ThreeColumnsMidExpanded" */ val ThreeColumnsMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpanded & String = js.native
    
    /* "ThreeColumnsMidExpandedEndHidden" */ val ThreeColumnsMidExpandedEndHidden: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpandedEndHidden & String = js.native
    
    /* "ThreeColumnsStartExpandedEndHidden" */ val ThreeColumnsStartExpandedEndHidden: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartExpandedEndHidden & String = js.native
    
    /* "ThreeColumnsStartHiddenEndExpanded" */ val ThreeColumnsStartHiddenEndExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartHiddenEndExpanded & String = js.native
    
    /* "ThreeColumnsStartHiddenMidExpanded" */ val ThreeColumnsStartHiddenMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartHiddenMidExpanded & String = js.native
    
    /* "TwoColumnsMidExpanded" */ val TwoColumnsMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsMidExpanded & String = js.native
    
    /* "TwoColumnsStartExpanded" */ val TwoColumnsStartExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsStartExpanded & String = js.native
  }
  
  inline def getLayoutsByMedia(): LayoutConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutsByMedia")().asInstanceOf[LayoutConfiguration]
  
  inline def getNextLayoutByArrowPress(): ThreeColumnsEndExpanded = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextLayoutByArrowPress")().asInstanceOf[ThreeColumnsEndExpanded]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ device in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.MEDIA ]: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]: {  layout :std.Array<string>,   separators :std.Array<{  visible :boolean,   gripVisible :boolean | undefined,   arrowVisible :boolean | undefined,   arrowDirection :'forward' | 'backward' | undefined}>}}}
    }}}
    */
  @js.native
  trait LayoutConfiguration extends StObject
}
