package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Itemclick
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListMod {
  
  /**
    * @class
    * ### Overview
    * The `ui5-notification-list` web component represents
    * a container for `ui5-li-notification-group` and `ui5-li-notification`.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-notification-list` provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Up] or [Left] - Navigates up the items
    * - [Down] or [Right] - Navigates down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationList.js";``
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationList.js", JSImport.Default)
  @js.native
  open class default () extends NotificationList
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/NotificationList.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/NotificationList.js", "default.i18nFioriBundle")
    @js.native
    def i18nFioriBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nFioriBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nFioriBundle")(x.asInstanceOf[js.Any])
  }
  
  type NotificationItemClickEventDetail = NotificationItemEventDetail
  
  type NotificationItemCloseEventDetail = NotificationItemEventDetail
  
  trait NotificationItemEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default
  }
  object NotificationItemEventDetail {
    
    inline def apply(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default
    ): NotificationItemEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationItemEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationItemEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default
      ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type NotificationItemToggleEventDetail = NotificationItemEventDetail
  
  /**
    * @class
    * ### Overview
    * The `ui5-notification-list` web component represents
    * a container for `ui5-li-notification-group` and `ui5-li-notification`.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-notification-list` provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Up] or [Left] - Navigates up the items
    * - [Down] or [Right] - Navigates down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationList.js";``
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @js.native
  trait NotificationList
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _accessibleName: String = js.native
    
    def _onItemClick(e: CustomEvent): Unit = js.native
    
    def _onItemClose(e: CustomEvent): Unit = js.native
    
    def _onItemToggle(e: CustomEvent): Unit = js.native
    
    def _onLoadMore(): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_NotificationList: Itemclick = js.native
    
    def getEnabledItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    def innerList: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListInternalMod.default = js.native
    
    /**
      * Defines the items of the component.
      *
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default
      ] = js.native
    
    /**
      * Defines the text that is displayed when the component contains no items.
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
  }
}
