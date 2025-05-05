package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListInternalMod {
  
  /**
    * @class
    *
    * Internal `ui5-li-notification-list-list` component,
    * that is used to support keyboard navigation of the notification list internal list.
    *
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListInternal", JSImport.Default)
  @js.native
  open class default () extends NotificationListInternal
  
  /**
    * @class
    *
    * Internal `ui5-li-notification-list-list` component,
    * that is used to support keyboard navigation of the notification list internal list.
    *
    * @private
    */
  @js.native
  trait NotificationListInternal
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default {
    
    var _allNavigationItems: js.Array[HTMLElement] = js.native
    
    def _focusSameItemOnNextRow(e: KeyboardEvent): Unit = js.native
    
    def _handleEndKey(e: KeyboardEvent): Unit = js.native
    
    def _handleHomeKey(e: KeyboardEvent): Unit = js.native
    
    def _isGrowingButton(): js.UndefOr[Boolean] = js.native
    def _isGrowingButton(item: Element): js.UndefOr[Boolean] = js.native
  }
}
