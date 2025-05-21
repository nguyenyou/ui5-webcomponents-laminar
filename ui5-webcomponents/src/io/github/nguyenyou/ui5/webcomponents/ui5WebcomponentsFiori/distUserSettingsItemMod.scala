package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Backclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.HTMLElementassociatedSettATTRIBUTENODE
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserSettingsItemMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-item` represents an item in the `ui5-user-settings-dialog`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserSettingsItem.js";`
    *
    * You can disable the <code>UserSettingsItem</code> by setting the <code>enabled</code> property to <code>false</code>,
    * or use the <code>UserSettingsItem</code> in read-only mode by setting the <code>editable</code> property to false.
    *
    * <b>Note:</b> Disabled and read-only states shouldn't be used together.
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsItem.js", JSImport.Default)
  @js.native
  open class default () extends UserSettingsItem
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-item` represents an item in the `ui5-user-settings-dialog`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserSettingsItem.js";`
    *
    * You can disable the <code>UserSettingsItem</code> by setting the <code>enabled</code> property to <code>false</code>,
    * or use the <code>UserSettingsItem</code> in read-only mode by setting the <code>editable</code> property to false.
    *
    * <b>Note:</b> Disabled and read-only states shouldn't be used together.
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @js.native
  trait UserSettingsItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _handleBackButtonClick(): Unit = js.native
    
    def _handleTabSelect(e: CustomEvent): Unit = js.native
    
    def _hasSelectedPageView: Boolean = js.native
    
    def _icon: String = js.native
    
    def _selectedPageView: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default = js.native
    
    def _shouldShowBackButton: Boolean = js.native
    
    def _tooltip: String = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def ariaLabelledByText: String = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementassociatedSettATTRIBUTENODE): Unit = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_UserSettingsItem: Backclick = js.native
    
    /**
      * Defines the headerText of the item.
      *
      * @public
      * @default ""
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Defines the icon of the component.
      *
      * @default "globe"
      * @public
      */
    var icon: String = js.native
    
    /**
      * Indicates whether a loading indicator should be shown.
      * @default false
      * @public
      */
    var loading: Boolean = js.native
    
    /**
      * Indicates why the control is in loading state.
      * @default undefined
      * @public
      */
    var loadingReason: js.UndefOr[String] = js.native
    
    /**
      * Defines the page views of the user settings item.
      *
      * If there are no tab views, the first page view will be shown unless there is selected one. If there is selected page
      * view it will be shown no matter if there are tab views.
      *
      * @public
      */
    var pages: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default
      ] = js.native
    
    /**
      * Shows item tab.
      *
      * @public
      * @default false
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the tab views of the user settings item.
      *
      * The tab views are displayed by default if there is no selected page view.
      * @public
      */
    var tabs: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default
      ] = js.native
    
    /**
      * Defines the text of the user settings item.
      *
      * @public
      * @default ""
      */
    var text: String = js.native
    
    /**
      * Defines the tooltip of the component.
      *
      * A tooltip attribute should be provided to represent the meaning or function when the component is collapsed and only the icon is visible.
      * @default ""
      * @public
      */
    var tooltip: String = js.native
  }
  
  trait UserSettingsItemBackClickEventDetail extends StObject {
    
    var view: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default
  }
  object UserSettingsItemBackClickEventDetail {
    
    inline def apply(view: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default): UserSettingsItemBackClickEventDetail = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserSettingsItemBackClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSettingsItemBackClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setView(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserSettingsItemViewSelectEventDetail extends StObject {
    
    var view: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default
  }
  object UserSettingsItemViewSelectEventDetail {
    
    inline def apply(view: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default): UserSettingsItemViewSelectEventDetail = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserSettingsItemViewSelectEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSettingsItemViewSelectEventDetail] (val x: Self) extends AnyVal {
      
      inline def setView(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
