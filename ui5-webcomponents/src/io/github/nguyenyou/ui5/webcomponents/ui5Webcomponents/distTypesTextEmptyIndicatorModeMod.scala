package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextEmptyIndicatorModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TextEmptyIndicatorMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TextEmptyIndicatorMode & String] = js.native
    
    /* "Off" */ val Off: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTextEmptyIndicatorModeMod.TextEmptyIndicatorMode.Off & String = js.native
    
    /* "On" */ val On: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTextEmptyIndicatorModeMod.TextEmptyIndicatorMode.On & String = js.native
  }
  
  @js.native
  sealed trait TextEmptyIndicatorMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TextEmptyIndicatorMode.js", "TextEmptyIndicatorMode")
  @js.native
  object TextEmptyIndicatorMode extends StObject {
    
    /**
      * Empty indicator is never rendered.
      * @public
      */
    @js.native
    sealed trait Off
      extends StObject
         with TextEmptyIndicatorMode
    
    /**
      * Empty indicator is rendered always when the component's content is empty.
      * @public
      */
    @js.native
    sealed trait On
      extends StObject
         with TextEmptyIndicatorMode
  }
}
