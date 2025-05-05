package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationListGrowingModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/NotificationListGrowingMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationListGrowingMode & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesNotificationListGrowingModeMod.NotificationListGrowingMode.Button & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesNotificationListGrowingModeMod.NotificationListGrowingMode.None & String = js.native
  }
  
  @js.native
  sealed trait NotificationListGrowingMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/NotificationListGrowingMode", "NotificationListGrowingMode")
  @js.native
  object NotificationListGrowingMode extends StObject {
    
    /**
      * Component's "load-more" is fired upon pressing a "More" button.
      * at the bottom.
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with NotificationListGrowingMode
    
    /**
      * Component's growing is not enabled.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with NotificationListGrowingMode
  }
}
