package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/AvatarSize", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarSize & String] = js.native
    
    /* "L" */ val L: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize.L & String = js.native
    
    /* "M" */ val M: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize.M & String = js.native
    
    /* "S" */ val S: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize.S & String = js.native
    
    /* "XL" */ val XL: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize.XL & String = js.native
    
    /* "XS" */ val XS: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize.XS & String = js.native
  }
  
  @js.native
  sealed trait AvatarSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/AvatarSize", "AvatarSize")
  @js.native
  object AvatarSize extends StObject {
    
    /**
      * component size - 5rem
      * font size - 2.5rem
      * @public
      */
    @js.native
    sealed trait L
      extends StObject
         with AvatarSize
    
    /**
      * component size - 4rem
      * font size - 2rem
      * @public
      */
    @js.native
    sealed trait M
      extends StObject
         with AvatarSize
    
    /**
      * component size - 3rem
      * font size - 1.5rem
      * @public
      */
    @js.native
    sealed trait S
      extends StObject
         with AvatarSize
    
    /**
      * component size - 7rem
      * font size - 3rem
      * @public
      */
    @js.native
    sealed trait XL
      extends StObject
         with AvatarSize
    
    /**
      * component size - 2rem
      * font size - 1rem
      * @public
      */
    @js.native
    sealed trait XS
      extends StObject
         with AvatarSize
  }
}
