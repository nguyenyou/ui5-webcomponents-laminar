package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToastPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ToastPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToastPlacement & String] = js.native
    
    /* "BottomCenter" */ val BottomCenter: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomCenter & String = js.native
    
    /* "BottomEnd" */ val BottomEnd: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomEnd & String = js.native
    
    /* "BottomStart" */ val BottomStart: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.BottomStart & String = js.native
    
    /* "MiddleCenter" */ val MiddleCenter: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleCenter & String = js.native
    
    /* "MiddleEnd" */ val MiddleEnd: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleEnd & String = js.native
    
    /* "MiddleStart" */ val MiddleStart: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.MiddleStart & String = js.native
    
    /* "TopCenter" */ val TopCenter: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopCenter & String = js.native
    
    /* "TopEnd" */ val TopEnd: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopEnd & String = js.native
    
    /* "TopStart" */ val TopStart: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToastPlacementMod.ToastPlacement.TopStart & String = js.native
  }
  
  @js.native
  sealed trait ToastPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ToastPlacement", "ToastPlacement")
  @js.native
  object ToastPlacement extends StObject {
    
    /**
      * Toast is placed at the `BottomCenter` position of its container.
      * Default placement (no selection)
      * @public
      */
    @js.native
    sealed trait BottomCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `BottomEnd` position of its container.
      * @public
      */
    @js.native
    sealed trait BottomEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `BottomStart` position of its container.
      * @public
      */
    @js.native
    sealed trait BottomStart
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `MiddleCenter` position of its container.
      * @public
      */
    @js.native
    sealed trait MiddleCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `MiddleEnd` position of its container.
      * @public
      */
    @js.native
    sealed trait MiddleEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `MiddleStart` position of its container.
      * @public
      */
    @js.native
    sealed trait MiddleStart
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `TopCenter` position of its container.
      * @public
      */
    @js.native
    sealed trait TopCenter
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `TopEnd` position of its container.
      * @public
      */
    @js.native
    sealed trait TopEnd
      extends StObject
         with ToastPlacement
    
    /**
      * Toast is placed at the `TopStart` position of its container.
      * @public
      */
    @js.native
    sealed trait TopStart
      extends StObject
         with ToastPlacement
  }
}
