package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTitleLevelMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TitleLevel.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TitleLevel & String] = js.native
    
    /* "H1" */ val H1: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H1 & String = js.native
    
    /* "H2" */ val H2: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H2 & String = js.native
    
    /* "H3" */ val H3: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H3 & String = js.native
    
    /* "H4" */ val H4: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H4 & String = js.native
    
    /* "H5" */ val H5: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H5 & String = js.native
    
    /* "H6" */ val H6: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel.H6 & String = js.native
  }
  
  @js.native
  sealed trait TitleLevel extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TitleLevel.js", "TitleLevel")
  @js.native
  object TitleLevel extends StObject {
    
    /**
      * Renders `h1` tag.
      * @public
      */
    @js.native
    sealed trait H1
      extends StObject
         with TitleLevel
    
    /**
      * Renders `h2` tag.
      * @public
      */
    @js.native
    sealed trait H2
      extends StObject
         with TitleLevel
    
    /**
      * Renders `h3` tag.
      * @public
      */
    @js.native
    sealed trait H3
      extends StObject
         with TitleLevel
    
    /**
      * Renders `h4` tag.
      * @public
      */
    @js.native
    sealed trait H4
      extends StObject
         with TitleLevel
    
    /**
      * Renders `h5` tag.
      * @public
      */
    @js.native
    sealed trait H5
      extends StObject
         with TitleLevel
    
    /**
      * Renders `h6` tag.
      * @public
      */
    @js.native
    sealed trait H6
      extends StObject
         with TitleLevel
  }
}
