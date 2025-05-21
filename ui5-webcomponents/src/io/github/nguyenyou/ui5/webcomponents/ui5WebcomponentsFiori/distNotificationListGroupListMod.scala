package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListGroupListMod {
  
  /**
    * @class
    *
    * Internal `ui5-li-notification-group-list` component,
    * that is used to support keyboard navigation of the notification group internal list.
    *
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListGroupList", JSImport.Default)
  @js.native
  open class default () extends NotificationListGroupList
  
  /**
    * @class
    *
    * Internal `ui5-li-notification-group-list` component,
    * that is used to support keyboard navigation of the notification group internal list.
    *
    * @private
    */
  @js.native
  trait NotificationListGroupList
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default {
    
    def _handleTabNext(): Unit = js.native
    
    def _onkeydown(): Unit = js.native
    
    def onForwardAfter(): Unit = js.native
    
    def onForwardBefore(): Unit = js.native
    
    def onItemFocused(): Unit = js.native
    
    def onItemTabIndexChange(): Unit = js.native
  }
}
