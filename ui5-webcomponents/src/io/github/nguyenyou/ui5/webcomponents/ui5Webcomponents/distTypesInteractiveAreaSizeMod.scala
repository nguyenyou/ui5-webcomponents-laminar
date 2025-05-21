package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInteractiveAreaSizeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/InteractiveAreaSize.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InteractiveAreaSize & String] = js.native
    
    /* "Large" */ val Large: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInteractiveAreaSizeMod.InteractiveAreaSize.Large & String = js.native
    
    /* "Normal" */ val Normal: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInteractiveAreaSizeMod.InteractiveAreaSize.Normal & String = js.native
  }
  
  @js.native
  sealed trait InteractiveAreaSize extends StObject
  @JSImport("@ui5/webcomponents/dist/types/InteractiveAreaSize.js", "InteractiveAreaSize")
  @js.native
  object InteractiveAreaSize extends StObject {
    
    /**
      * Enlarged target area size (up to 24px in height) provides users with an enhanced dedicated space to interact with the component.
      * @public
      */
    @js.native
    sealed trait Large
      extends StObject
         with InteractiveAreaSize
    
    /**
      * The default target area size (the area taken by the component itself without any extra invisible touch area).
      * @public
      */
    @js.native
    sealed trait Normal
      extends StObject
         with InteractiveAreaSize
  }
}
