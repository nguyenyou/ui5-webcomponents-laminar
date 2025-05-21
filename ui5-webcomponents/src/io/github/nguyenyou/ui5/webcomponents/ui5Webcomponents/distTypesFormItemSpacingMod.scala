package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormItemSpacingMod {
  
  @JSImport("@ui5/webcomponents/dist/types/FormItemSpacing.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FormItemSpacing & String] = js.native
    
    /* "Large" */ val Large: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesFormItemSpacingMod.FormItemSpacing.Large & String = js.native
    
    /* "Normal" */ val Normal: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesFormItemSpacingMod.FormItemSpacing.Normal & String = js.native
  }
  
  @js.native
  sealed trait FormItemSpacing extends StObject
  @JSImport("@ui5/webcomponents/dist/types/FormItemSpacing.js", "FormItemSpacing")
  @js.native
  object FormItemSpacing extends StObject {
    
    /**
      * Large spacing (larger vertical space between form items).
      * @public
      */
    @js.native
    sealed trait Large
      extends StObject
         with FormItemSpacing
    
    /**
      * Normal spacing (smaller vertical space between form items).
      * @public
      */
    @js.native
    sealed trait Normal
      extends StObject
         with FormItemSpacing
  }
}
