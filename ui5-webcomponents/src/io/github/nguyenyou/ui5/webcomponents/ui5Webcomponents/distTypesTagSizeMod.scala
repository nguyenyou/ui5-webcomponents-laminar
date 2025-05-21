package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TagSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TagSize & String] = js.native
    
    /* "L" */ val L: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagSizeMod.TagSize.L & String = js.native
    
    /* "S" */ val S: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagSizeMod.TagSize.S & String = js.native
  }
  
  @js.native
  sealed trait TagSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TagSize", "TagSize")
  @js.native
  object TagSize extends StObject {
    
    /**
      * Large size of the tag
      * @public
      */
    @js.native
    sealed trait L
      extends StObject
         with TagSize
    
    /**
      * Small size of the tag
      * @public
      */
    @js.native
    sealed trait S
      extends StObject
         with TagSize
  }
}
