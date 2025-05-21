package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ButtonDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonDesign & String] = js.native
    
    /* "Attention" */ val Attention: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Attention & String = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Default & String = js.native
    
    /* "Emphasized" */ val Emphasized: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Emphasized & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Negative & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Positive & String = js.native
    
    /* "Transparent" */ val Transparent: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait ButtonDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ButtonDesign", "ButtonDesign")
  @js.native
  object ButtonDesign extends StObject {
    
    /**
      * attention type
      * @public
      */
    @js.native
    sealed trait Attention
      extends StObject
         with ButtonDesign
    
    /**
      * default type (no special styling)
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with ButtonDesign
    
    /**
      * emphasized type
      * @public
      */
    @js.native
    sealed trait Emphasized
      extends StObject
         with ButtonDesign
    
    /**
      * reject style (red button)
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with ButtonDesign
    
    /**
      * accept type (green button)
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with ButtonDesign
    
    /**
      * transparent type
      * @public
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with ButtonDesign
  }
}
