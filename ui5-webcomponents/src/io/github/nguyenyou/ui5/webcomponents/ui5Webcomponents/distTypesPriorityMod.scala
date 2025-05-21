package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPriorityMod {
  
  @JSImport("@ui5/webcomponents/dist/types/Priority.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Priority & String] = js.native
    
    /* "High" */ val High: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPriorityMod.Priority.High & String = js.native
    
    /* "Low" */ val Low: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPriorityMod.Priority.Low & String = js.native
    
    /* "Medium" */ val Medium: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPriorityMod.Priority.Medium & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPriorityMod.Priority.None & String = js.native
  }
  
  @js.native
  sealed trait Priority extends StObject
  @JSImport("@ui5/webcomponents/dist/types/Priority.js", "Priority")
  @js.native
  object Priority extends StObject {
    
    /**
      * High priority.
      * @public
      */
    @js.native
    sealed trait High
      extends StObject
         with Priority
    
    /**
      * Low priority.
      * @public
      */
    @js.native
    sealed trait Low
      extends StObject
         with Priority
    
    /**
      * Medium priority.
      * @public
      */
    @js.native
    sealed trait Medium
      extends StObject
         with Priority
    
    /**
      * Default, none priority.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with Priority
  }
}
