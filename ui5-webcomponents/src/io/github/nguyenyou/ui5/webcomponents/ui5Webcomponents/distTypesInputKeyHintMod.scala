package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputKeyHintMod {
  
  @JSImport("@ui5/webcomponents/dist/types/InputKeyHint", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[InputKeyHint & String] = js.native
    
    /* "done" */ val Done: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Done & String = js.native
    
    /* "enter" */ val Enter: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Enter & String = js.native
    
    /* "go" */ val Go: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Go & String = js.native
    
    /* "next" */ val Next: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Next & String = js.native
    
    /* "previous" */ val Previous: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Previous & String = js.native
    
    /* "search" */ val Search: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Search & String = js.native
    
    /* "send" */ val Send: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputKeyHintMod.InputKeyHint.Send & String = js.native
  }
  
  @js.native
  sealed trait InputKeyHint extends StObject
  @JSImport("@ui5/webcomponents/dist/types/InputKeyHint", "InputKeyHint")
  @js.native
  object InputKeyHint extends StObject {
    
    @js.native
    sealed trait Done
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Enter
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Go
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Next
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Previous
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Search
      extends StObject
         with InputKeyHint
    
    @js.native
    sealed trait Send
      extends StObject
         with InputKeyHint
  }
}
