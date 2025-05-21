package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TagDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TagDesign & String] = js.native
    
    /* "Critical" */ val Critical: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Critical & String = js.native
    
    /* "Information" */ val Information: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Information & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Negative & String = js.native
    
    /* "Neutral" */ val Neutral: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Neutral & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Positive & String = js.native
    
    /* "Set1" */ val Set1: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Set1 & String = js.native
    
    /* "Set2" */ val Set2: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign.Set2 & String = js.native
  }
  
  @js.native
  sealed trait TagDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TagDesign.js", "TagDesign")
  @js.native
  object TagDesign extends StObject {
    
    /**
      * Critical design
      * @public
      */
    @js.native
    sealed trait Critical
      extends StObject
         with TagDesign
    
    /**
      * Information design
      * @public
      */
    @js.native
    sealed trait Information
      extends StObject
         with TagDesign
    
    /**
      * Negative design
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with TagDesign
    
    /**
      * Neutral design
      * @public
      */
    @js.native
    sealed trait Neutral
      extends StObject
         with TagDesign
    
    /**
      * Positive design
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with TagDesign
    
    /**
      * Set1 of generic indication colors that are intended for industry-specific use cases
      * @public
      */
    @js.native
    sealed trait Set1
      extends StObject
         with TagDesign
    
    /**
      * Set2 of generic indication colors that are intended for industry-specific use cases
      * @public
      */
    @js.native
    sealed trait Set2
      extends StObject
         with TagDesign
  }
}
