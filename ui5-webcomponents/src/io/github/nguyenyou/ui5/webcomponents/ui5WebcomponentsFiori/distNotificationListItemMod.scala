package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.ButtonAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconDesignMod.IconDesign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Expanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Press
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ShowDivider
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListItemMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-li-notification` is a type of list item, meant to display notifications.
    *
    * The component has a rich set of various properties that allows the user to set `avatar`, `menu`, `titleText`, descriptive `content`
    * and `footnotes` to fully describe a notification.
    *
    * The user can:
    *
    * - display a `Close` button
    * - can control whether the `titleText` and `description` should wrap or truncate
    * and display a `ShowMore` button to switch between less and more information
    * - add actions by using the `ui5-menu` component
    *
    * **Note:** Adding custom actions by using the `ui5-notification-action` component is deprecated as of version 2.0!
    *
    * ### Usage
    * The component should be used inside a `ui5-notification-list`.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete):
    *
    * - [Enter] - select an item (trigger "item-click" event)
    * - [Delete] - close an item (trigger "item-close" event)
    *
    * #### Fast Navigation
    * This component provides a fast navigation using the following keyboard shortcuts:
    *
    * - [Shift] + [Enter] - 'More'/'Less' link will be triggered
    * - [Shift] + [F10] - 'Menu' (Actions) button will be triggered (clicked)
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationListItem.js";`
    *
    * @constructor
    * @extends NotificationListItemBase
    * @since 1.0.0-rc.8
    * @public
    * @csspart title-text - Used to style the titleText of the notification list item
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListItem.js", JSImport.Default)
  @js.native
  open class default () extends NotificationListItem
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-li-notification` is a type of list item, meant to display notifications.
    *
    * The component has a rich set of various properties that allows the user to set `avatar`, `menu`, `titleText`, descriptive `content`
    * and `footnotes` to fully describe a notification.
    *
    * The user can:
    *
    * - display a `Close` button
    * - can control whether the `titleText` and `description` should wrap or truncate
    * and display a `ShowMore` button to switch between less and more information
    * - add actions by using the `ui5-menu` component
    *
    * **Note:** Adding custom actions by using the `ui5-notification-action` component is deprecated as of version 2.0!
    *
    * ### Usage
    * The component should be used inside a `ui5-notification-list`.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete):
    *
    * - [Enter] - select an item (trigger "item-click" event)
    * - [Delete] - close an item (trigger "item-close" event)
    *
    * #### Fast Navigation
    * This component provides a fast navigation using the following keyboard shortcuts:
    *
    * - [Shift] + [Enter] - 'More'/'Less' link will be triggered
    * - [Shift] + [F10] - 'Menu' (Actions) button will be triggered (clicked)
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NotificationListItem.js";`
    *
    * @constructor
    * @extends NotificationListItemBase
    * @since 1.0.0-rc.8
    * @public
    * @csspart title-text - Used to style the titleText of the notification list item
    */
  @js.native
  trait NotificationListItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemBaseMod.default {
    
    var _ariaLevel: js.UndefOr[Double] = js.native
    
    var _descOverflowHeight: Double = js.native
    
    def _onBtnCloseClick(): Unit = js.native
    
    def _onBtnMenuClick(): Unit = js.native
    
    def _onResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_onResizeBound")
    var _onResizeBound_Original: ResizeObserverCallback = js.native
    
    @JSName("_onShowMoreClick")
    def _onShowMoreClick_click(
      e: UI5CustomEvent[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.default, click]
    ): Unit = js.native
    
    /**
      * Event handlers
      */
    def _onclick(): Unit = js.native
    
    /**
      * Defines the visibility of the `showMore` button.
      * @private
      */
    var _showMore: Boolean = js.native
    
    /**
      * Defines the state of the `titleText` and `description`,
      * if less or more information is displayed.
      * @private
      */
    var _showMorePressed: Boolean = js.native
    
    var _titleTextOverflowHeight: Double = js.native
    
    def _toggleShowMorePressed(): Unit = js.native
    
    def ariaLabelledBy: String = js.native
    
    /**
      * Defines the avatar, displayed in the `ui5-li-notification`.
      *
      * **Note:** Consider using the `ui5-avatar` to display icons, initials or images.
      *
      * **Note:** In order to be complaint with the UX guidlines and for best experience,
      * we recommend using avatars with 2rem X 2rem in size (32px X 32px). In case you are using the `ui5-avatar`
      * you can set its `size` property to `XS` to get the required size - `<ui5-avatar size="XS"></ui5-avatar>`.
      * @public
      */
    var avatar: js.Array[HTMLElement] = js.native
    
    def closeBtnAccessibleName: String = js.native
    
    /**
      * Defines the content of the `ui5-li-notification`,
      * usually a description of the notification.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var description: js.Array[Node] = js.native
    
    var descriptionDOM: js.UndefOr[HTMLElement] = js.native
    
    def descriptionHeight: Double = js.native
    
    def descriptionOverflows: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_NotificationListItem: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents.@ui5/webcomponents/dist/ListItemBase.default['eventDetails'] */ js.Any) & Press = js.native
    
    /**
      * Private
      */
    def fireItemPress(): Unit = js.native
    
    def footerItems: js.Array[ShowDivider] = js.native
    
    /**
      * Defines the elements, displayed in the footer of the of the component.
      * @public
      */
    var footnotes: js.Array[HTMLElement] = js.native
    
    def getMenu(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.default = js.native
    
    def hasDesc: Boolean = js.native
    
    def hasFootNotes: Boolean = js.native
    
    def hasImportance: Boolean = js.native
    
    def hasState: Boolean = js.native
    
    def hideShowMore: js.UndefOr[`true`] = js.native
    
    /**
      * Defines the `Important` label of the item.
      * @default "Standard"
      * @public
      */
    var importance: /* template literal string: ${NotificationListItemImportance} */ String = js.native
    
    def importanceText: String = js.native
    
    def itemClasses: String = js.native
    
    /**
      * Defines the menu, displayed in the `ui5-li-notification`.
      *
      * **Note:** Use this for implementing actions.
      *
      * **Note:** Should be used instead `u5-notification-action`, which is deprecated as of version 2.0.
      * @public
      */
    var menu: js.Array[HTMLElement] = js.native
    
    def menuBtnAccessibleName: String = js.native
    
    def menuButtonAccessibilityAttributes: ButtonAccessibilityAttributes = js.native
    
    var menuButtonDOM: js.UndefOr[HTMLElement] = js.native
    
    def moreLinkAccessibilityAttributes: Expanded = js.native
    
    def moreLinkAccessibleName: String = js.native
    
    def onResize(): Unit = js.native
    
    def openMenu(): Unit = js.native
    
    def readText: String = js.native
    
    /**
      * Defines if the `Close` button would be displayed.
      * @default false
      * @public
      */
    var showClose: Boolean = js.native
    
    def showMenu: Boolean = js.native
    
    def showMoreText: String = js.native
    
    /**
      * Defines the status indicator of the item.
      * @default "None"
      * @public
      */
    var state: /* template literal string: ${ValueState} */ String = js.native
    
    def stateText: String = js.native
    
    def statusIconDesign: js.UndefOr[IconDesign] = js.native
    
    def statusIconName: String = js.native
    
    var titleTextDOM: js.UndefOr[HTMLElement] = js.native
    
    def titleTextHeight: Double = js.native
    
    def titleTextOverflows: Boolean = js.native
    
    /**
      * Defines if the `titleText` and `description` should wrap,
      * they truncate by default.
      *
      * **Note:** by default the `titleText` and `description`,
      * and a `ShowMore/Less` button would be displayed.
      * @default "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
  
  trait NotificationListItemCloseEventDetail extends StObject {
    
    var item: HTMLElement
  }
  object NotificationListItemCloseEventDetail {
    
    inline def apply(item: HTMLElement): NotificationListItemCloseEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationListItemCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationListItemCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: HTMLElement): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotificationListItemPressEventDetail extends StObject {
    
    var item: NotificationListItem
  }
  object NotificationListItemPressEventDetail {
    
    inline def apply(item: NotificationListItem): NotificationListItemPressEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationListItemPressEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NotificationListItemPressEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: NotificationListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
