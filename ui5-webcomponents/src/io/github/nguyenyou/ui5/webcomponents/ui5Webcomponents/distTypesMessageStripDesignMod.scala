package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageStripDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/MessageStripDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageStripDesign & String] = js.native
    
    /* "ColorSet1" */ val ColorSet1: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.ColorSet1 & String = js.native
    
    /* "ColorSet2" */ val ColorSet2: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.ColorSet2 & String = js.native
    
    /* "Critical" */ val Critical: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Critical & String = js.native
    
    /* "Information" */ val Information: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Information & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Negative & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign.Positive & String = js.native
  }
  
  @js.native
  sealed trait MessageStripDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/MessageStripDesign", "MessageStripDesign")
  @js.native
  object MessageStripDesign extends StObject {
    
    /**
      * Message uses custom color set 1
      * @public
      */
    @js.native
    sealed trait ColorSet1
      extends StObject
         with MessageStripDesign
    
    /**
      *  Message uses custom color set 2
      * @public
      */
    @js.native
    sealed trait ColorSet2
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is a warning
      * @public
      */
    @js.native
    sealed trait Critical
      extends StObject
         with MessageStripDesign
    
    /**
      * Message should be just an information
      * @public
      */
    @js.native
    sealed trait Information
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is an error
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with MessageStripDesign
    
    /**
      * Message is a success message
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with MessageStripDesign
  }
}
