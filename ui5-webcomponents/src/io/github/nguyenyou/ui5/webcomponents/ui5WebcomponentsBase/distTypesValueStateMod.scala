package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValueStateMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/ValueState.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValueState & String] = js.native
    
    /* "Critical" */ val Critical: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Critical & String = js.native
    
    /* "Information" */ val Information: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Information & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Negative & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.Positive & String = js.native
  }
  
  @js.native
  sealed trait ValueState extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/ValueState.js", "ValueState")
  @js.native
  object ValueState extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait Critical
      extends StObject
         with ValueState
    
    /**
      * @public
      */
    @js.native
    sealed trait Information
      extends StObject
         with ValueState
    
    /**
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with ValueState
    
    /**
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with ValueState
    
    /**
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with ValueState
  }
}
