package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarGroupTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/AvatarGroupType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AvatarGroupType & String] = js.native
    
    /* "Group" */ val Group: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarGroupTypeMod.AvatarGroupType.Group & String = js.native
    
    /* "Individual" */ val Individual: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarGroupTypeMod.AvatarGroupType.Individual & String = js.native
  }
  
  @js.native
  sealed trait AvatarGroupType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/AvatarGroupType", "AvatarGroupType")
  @js.native
  object AvatarGroupType extends StObject {
    
    /**
      * The avatars are displayed as partially overlapped on top of each other and the entire group has one click or tap area.
      * @public
      */
    @js.native
    sealed trait Group
      extends StObject
         with AvatarGroupType
    
    /**
      * The avatars are displayed side-by-side and each avatar has its own click or tap area.
      * @public
      */
    @js.native
    sealed trait Individual
      extends StObject
         with AvatarGroupType
  }
}
