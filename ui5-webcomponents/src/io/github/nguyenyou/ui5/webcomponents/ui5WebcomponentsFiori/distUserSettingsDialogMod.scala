package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.PopupBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Beforeclose
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.HTMLElementassociatedSett
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserSettingsDialogMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-dialog` is an SAP Fiori-specific web component used in the `ui5-user-menu`.
    * It allows the user to easily view information and settings for an account.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserSettingsDialog.js";`
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsDialog.js", JSImport.Default)
  @js.native
  open class default () extends UserSettingsDialog
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsDialog.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsDialog.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  type UserSettingsBeforeCloseEventDetail = PopupBeforeCloseEventDetail
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-dialog` is an SAP Fiori-specific web component used in the `ui5-user-menu`.
    * It allows the user to easily view information and settings for an account.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserSettingsDialog.js";`
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @js.native
  trait UserSettingsDialog
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _collapsed: Boolean = js.native
    
    /**
      * @private
      */
    var _filteredFixedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
      ] = js.native
    
    /**
      * @private
      */
    var _filteredItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
      ] = js.native
    
    def _handleCloseButtonClick(): Unit = js.native
    
    def _handleCollapseClick(): Unit = js.native
    
    def _handleDialogAfterClose(): Unit = js.native
    
    def _handleDialogAfterOpen(): Unit = js.native
    
    def _handleDialogBeforeClose(e: CustomEvent): Unit = js.native
    
    def _handleInput(e: CustomEvent): Unit = js.native
    
    def _handleItemClick(e: CustomEvent): Unit = js.native
    
    /**
      * Defines the current media query size.
      * @private
      */
    var _mediaRange: js.UndefOr[Any] = js.native
    
    /**
      * @private
      */
    var _searchValue: String = js.native
    
    def _selectedItemSlotName: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var _selectedSetting: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
      ] = js.native
    
    /**
      * @private
      */
    var _showNoSearchResult: Boolean = js.native
    
    def _showSettingWithNavigation: Boolean = js.native
    
    def accessibleNameText: String = js.native
    
    def ariaRoleDescList: String = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementassociatedSett): Unit = js.native
    
    def closeButtonText: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_UserSettingsDialog: Beforeclose = js.native
    
    /**
      * Defines the fixed user settings items.
      *
      * @public
      */
    var fixedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
      ] = js.native
    
    /**
      * Defines the headerText of the item.
      *
      * @public
      * @default undefined
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Defines the user settings items.
      *
      * **Note:**  If no setting item is set as `selected`, the first one will be selected.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
      ] = js.native
    
    def noSearchResultsText: String = js.native
    
    /**
      * Defines, if the User Settings Dialog is opened.
      *
      * @default false
      * @public
      */
    var open: Boolean = js.native
    
    /**
      * Defines if the Search Field would be displayed.
      *
      * **Note:** By default the Search Field is not displayed.
      * @default false
      * @public
      */
    var showSearchField: Boolean = js.native
  }
  
  trait UserSettingsItemSelectEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default
  }
  object UserSettingsItemSelectEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default): UserSettingsItemSelectEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserSettingsItemSelectEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserSettingsItemSelectEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
