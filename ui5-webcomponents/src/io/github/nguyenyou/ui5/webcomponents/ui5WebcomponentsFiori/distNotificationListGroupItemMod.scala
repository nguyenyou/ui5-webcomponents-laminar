package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Loadmore
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`navigation-down-arrow`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`navigation-right-arrow`
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListGroupItemMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-li-notification-group` is a special type of list item,
    * that unlike others can group items within self, usually `ui5-li-notification` items.
    *
    * The component consists of:
    *
    * - `Toggle` button to expand and collapse the group
    * - `TitleText` to entitle the group
    * - Items of the group
    *
    * ### Usage
    * The component should be used inside a `ui5-notification-list`.
    *
    * ### Keyboard Handling
    * The `ui5-li-notification-group` provides advanced keyboard handling.
    * This component provides fast navigation when the header is focused using the following keyboard shortcuts:
    *
    * - [Space] - toggles expand / collapse of the group
    * - [Plus] - expands the group
    * - [Minus] - collapses the group
    * - [Right] - expands the group
    * - [Left] - collapses the group
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationListGroupItem.js";`
    * @constructor
    * @extends NotificationListItemBase
    * @since 1.0.0-rc.8
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListGroupItem.js", JSImport.Default)
  @js.native
  open class default () extends NotificationListGroupItem
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-li-notification-group` is a special type of list item,
    * that unlike others can group items within self, usually `ui5-li-notification` items.
    *
    * The component consists of:
    *
    * - `Toggle` button to expand and collapse the group
    * - `TitleText` to entitle the group
    * - Items of the group
    *
    * ### Usage
    * The component should be used inside a `ui5-notification-list`.
    *
    * ### Keyboard Handling
    * The `ui5-li-notification-group` provides advanced keyboard handling.
    * This component provides fast navigation when the header is focused using the following keyboard shortcuts:
    *
    * - [Space] - toggles expand / collapse of the group
    * - [Plus] - expands the group
    * - [Minus] - collapses the group
    * - [Right] - expands the group
    * - [Left] - collapses the group
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationListGroupItem.js";`
    * @constructor
    * @extends NotificationListItemBase
    * @since 1.0.0-rc.8
    * @public
    */
  @js.native
  trait NotificationListGroupItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default {
    
    def _expanded: Boolean = js.native
    
    /**
      * Event handlers
      *
      */
    def _onHeaderToggleClick(): Unit = js.native
    
    def _onLoadMore(): Unit = js.native
    
    def accInvisibleText: String = js.native
    
    def ariaLabelledBy: String = js.native
    
    /**
      * Clears child items loading state to show a single loading over the entire group,
      * instead of multiple BusyIndicator instances
      */
    def clearChildBusyIndicator(): Unit = js.native
    
    /**
      * Defines if the group is collapsed or expanded.
      * @default false
      * @public
      */
    var collapsed: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_NotificationListGroupItem: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents.@ui5/webcomponents/dist/ListItemBase.default['eventDetails'] */ js.Any) & Loadmore = js.native
    
    def expandText: String = js.native
    
    def getGrowingButton(): HTMLElement = js.native
    
    def groupCollapsedIcon: `navigation-right-arrow` | `navigation-down-arrow` = js.native
    
    def groupText: String = js.native
    
    /**
      * Defines whether the component will have growing capability by pressing a `More` button.
      * When button is pressed `load-more` event will be fired.
      * @default "None"
      * @public
      * @since 2.2.0
      */
    var growing: /* template literal string: ${NotificationListGrowingMode} */ String = js.native
    
    /**
      * Defines the items of the `ui5-li-notification-group`,
      * usually `ui5-li-notification` items.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemMod.default
      ] = js.native
    
    def toggleCollapsed(): Unit = js.native
    
    def toggleIconAccessibleName: String = js.native
  }
  
  trait NotificationListGroupItemToggleEventDetail extends StObject {
    
    var item: NotificationListGroupItem
  }
  object NotificationListGroupItemToggleEventDetail {
    
    inline def apply(item: NotificationListGroupItem): NotificationListGroupItemToggleEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationListGroupItemToggleEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationListGroupItemToggleEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: NotificationListGroupItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
