package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Beforeopen
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.FilterItems
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Index
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Selected
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.VSDItemfilterOptionsArray
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.VSDItemindexnumber
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distViewSettingsDialogMod {
  
  /**
    * @class
    * ### Overview
    * The `ui5-view-settings-dialog` component helps the user to sort data within a list or a table.
    * It consists of several lists like `Sort order` which is built-in and `Sort By` and `Filter By` lists,
    * for which you must be provide items(`ui5-sort-item` & `ui5-filter-item` respectively)
    * These options can be used to create sorters for a table.
    *
    * The `ui5-view-settings-dialog` interrupts the current application processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The `ui5-view-settings-dialog` is modal, which means that user action is required before returning to the parent window is possible.
    *
    * ### Structure
    * A `ui5-view-settings-dialog` consists of a header, content, and a footer for action buttons.
    * The `ui5-view-settings-dialog` is usually displayed at the center of the screen.
    *
    * ### Responsive Behavior
    * `ui5-view-settings-dialog` stretches on full screen on phones.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/ViewSettingsDialog.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.16
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", JSImport.Default)
  @js.native
  open class default () extends ViewSettingsDialog
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/ViewSettingsDialog", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  type VSDFilter = Record[String, js.Array[String]]
  
  type VSDFilters = js.Array[VSDFilter]
  
  trait VSDInternalSettings extends StObject {
    
    var filters: js.Array[VSDItemfilterOptionsArray]
    
    var sortBy: js.Array[VSDItemindexnumber]
    
    var sortOrder: js.Array[VSDItem]
  }
  object VSDInternalSettings {
    
    inline def apply(
      filters: js.Array[VSDItemfilterOptionsArray],
      sortBy: js.Array[VSDItemindexnumber],
      sortOrder: js.Array[VSDItem]
    ): VSDInternalSettings = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDInternalSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDInternalSettings] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: js.Array[VSDItemfilterOptionsArray]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: VSDItemfilterOptionsArray*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setSortBy(value: js.Array[VSDItemindexnumber]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByVarargs(value: VSDItemindexnumber*): Self = StObject.set(x, "sortBy", js.Array(value*))
      
      inline def setSortOrder(value: js.Array[VSDItem]): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderVarargs(value: VSDItem*): Self = StObject.set(x, "sortOrder", js.Array(value*))
    }
  }
  
  trait VSDItem extends StObject {
    
    var selected: Boolean
    
    var text: js.UndefOr[String] = js.undefined
  }
  object VSDItem {
    
    inline def apply(selected: Boolean): VSDItem = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDItem] (val x: Self) extends AnyVal {
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait VSDSettings extends StObject {
    
    var filters: VSDFilters
    
    var sortBy: String
    
    var sortOrder: String
  }
  object VSDSettings {
    
    inline def apply(filters: VSDFilters, sortBy: String, sortOrder: String): VSDSettings = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[VSDSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VSDSettings] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: VSDFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersVarargs(value: VSDFilter*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    * ### Overview
    * The `ui5-view-settings-dialog` component helps the user to sort data within a list or a table.
    * It consists of several lists like `Sort order` which is built-in and `Sort By` and `Filter By` lists,
    * for which you must be provide items(`ui5-sort-item` & `ui5-filter-item` respectively)
    * These options can be used to create sorters for a table.
    *
    * The `ui5-view-settings-dialog` interrupts the current application processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The `ui5-view-settings-dialog` is modal, which means that user action is required before returning to the parent window is possible.
    *
    * ### Structure
    * A `ui5-view-settings-dialog` consists of a header, content, and a footer for action buttons.
    * The `ui5-view-settings-dialog` is usually displayed at the center of the screen.
    *
    * ### Responsive Behavior
    * `ui5-view-settings-dialog` stretches on full screen on phones.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/ViewSettingsDialog.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.16
    * @public
    */
  @js.native
  trait ViewSettingsDialog
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ascendingLabel: String = js.native
    
    def _cancelButtonLabel: String = js.native
    
    /**
      * Sets current settings to recently confirmed ones and fires `cancel` event.
      */
    def _cancelSettings(): Unit = js.native
    
    def _changeCurrentFilter(e: CustomEvent): Unit = js.native
    
    /**
      * Stores current settings as confirmed and fires `confirm` event.
      */
    def _confirmSettings(): Unit = js.native
    
    /**
      * Stores settings of the dialog after confirmation.
      * @private
      */
    var _confirmedSettings: VSDInternalSettings = js.native
    
    /**
      * Defnies the current mode of the component.
      * @since 1.0.0-rc.16
      * @private
      */
    var _currentMode: /* template literal string: ${ViewSettingsDialogMode} */ String = js.native
    
    /**
      * Stores current settings of the dialog.
      * @private
      */
    var _currentSettings: VSDInternalSettings = js.native
    
    def _descendingLabel: String = js.native
    
    var _dialog: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDialogMod.default] = js.native
    
    def _dialogDomRef: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDialogMod.default = js.native
    
    def _dialogTitle: String = js.native
    
    /**
      * Determines disabled state of the `Reset` button.
      */
    def _disableResetButton: js.UndefOr[Boolean] = js.native
    
    def _filterButtonTooltip: String = js.native
    
    def _filterByLabel: String = js.native
    
    def _filterByTitle: String = js.native
    
    /**
      * When in Filter By mode, defines whether we need to show the list of keys, or the list with values.
      * @since 1.0.0-rc.16
      * @private
      */
    var _filterStepTwo: Boolean = js.native
    
    def _filteresAreInitial: Boolean = js.native
    
    /**
      * Sets focus on recently used control within the dialog.
      */
    def _focusRecentlyUsedControl(): Unit = js.native
    
    def _handleFilterValueItemClick(e: CustomEvent): Unit = js.native
    
    def _handleModeChange(e: CustomEvent): Unit = js.native
    
    /**
      * Stores settings of the dialog before the initial open.
      * @private
      */
    var _initialSettings: VSDInternalSettings = js.native
    
    def _isPhone: Boolean = js.native
    
    def _navigateToFilters(): Unit = js.native
    
    def _okButtonLabel: String = js.native
    
    /**
      * Stores `Sort By` list as recently used control and its selected item in current state.
      */
    def _onSortByChange(e: CustomEvent): Unit = js.native
    
    /**
      * Stores `Sort Order` list as recently used control and its selected item in current state.
      */
    def _onSortOrderChange(e: CustomEvent): Unit = js.native
    
    /**
      * Keeps recently focused list in order to focus it on next dialog open.
      * @private
      */
    var _recentlyFocused: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default] = js.native
    
    def _resetButtonAction: String = js.native
    
    def _resetButtonLabel: String = js.native
    
    /**
      * Resets the control settings to their initial state.
      */
    def _resetSettings(): Unit = js.native
    
    /**
      * If the dialog is closed by [Escape] key, do the same as if the `Cancel` button is pressed.
      * @param evt
      */
    def _restoreConfirmedOnEscape(evt: CustomEvent): Unit = js.native
    
    /**
      * Sets current settings to ones passed as `settings` argument.
      * @param settings
      */
    def _restoreSettings(settings: VSDInternalSettings): Unit = js.native
    
    def _selectedFilter: js.UndefOr[VSDItemfilterOptionsArray] = js.native
    
    def _selectedFiltersLabel(item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFilterItemMod.default): String = js.native
    
    def _setAdditionalTexts(): Unit = js.native
    
    /**
      * Sets the selected property of the clicked item.
      * @private
      */
    def _setSelectedProp(itemText: String): Unit = js.native
    
    /**
      * Returns the current settings (current state of all lists).
      */
    def _settings: VSDInternalSettings = js.native
    
    def _sortAscending: Boolean = js.native
    
    def _sortButtonTooltip: String = js.native
    
    var _sortBy: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default] = js.native
    
    def _sortByLabel: String = js.native
    
    def _sortByList: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    var _sortOrder: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default] = js.native
    
    def _sortOrderLabel: String = js.native
    
    def _sortOrderListDomRef: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _sortSetttingsAreInitial: Boolean = js.native
    
    def _title: String = js.native
    
    def afterDialogClose(): Unit = js.native
    
    def afterDialogOpen(): Unit = js.native
    
    /**
      * Shows the dialog.
      */
    def beforeDialogOpen(): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_ViewSettingsDialog: Beforeopen = js.native
    
    def eventsParams: FilterItems = js.native
    
    def expandContent: Boolean = js.native
    
    /**
      * Defines the `filterItems` list.
      *
      * **Note:** If you want to use this slot, you need to import used item: `import "@ui5/webcomponents-fiori/dist/FilterItem.js";`
      * @public
      */
    var filterItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFilterItemMod.default
      ] = js.native
    
    def hasPagination: Boolean = js.native
    
    def initSortByItems: js.Array[Index] = js.native
    
    def initSortOrderItems: js.Array[Selected] = js.native
    
    def isModeFilter: Boolean = js.native
    
    def isModeSort: Boolean = js.native
    
    /**
      * Indicates if the dialog is open.
      * @public
      * @default false
      * @since 2.0.0
      */
    var open: Boolean = js.native
    
    def selectedFilters: VSDFilters = js.native
    
    /**
      * Sets a JavaScript object, as settings to the `ui5-view-settings-dialog`.
      * This method can be used after the dialog is initially open, as the dialog needs
      * to set its initial settings.
      * The `ui5-view-settings-dialog` throws an event called "before-open",
      * which can be used as a trigger point.
      * The object should have the following format:
      * @param settings - predefined settings.
      * @public
      */
    def setConfirmedSettings(settings: VSDSettings): Unit = js.native
    
    def shouldBuildFilter: Boolean = js.native
    
    def shouldBuildSort: Boolean = js.native
    
    def showBackButton: Boolean = js.native
    
    /**
      * Defines the initial sort order.
      * @default false
      * @public
      */
    var sortDescending: Boolean = js.native
    
    /**
      * Defines the list of items against which the user could sort data.
      *
      * **Note:** If you want to use this slot, you need to import used item: `import "@ui5/webcomponents-fiori/dist/SortItem.js";`
      * @public
      */
    var sortItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default
      ] = js.native
  }
  
  trait ViewSettingsDialogCancelEventDetail
    extends StObject
       with VSDSettings {
    
    var sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default
    
    var sortDescending: Boolean
  }
  object ViewSettingsDialogCancelEventDetail {
    
    inline def apply(
      filters: VSDFilters,
      sortBy: String,
      sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default,
      sortDescending: Boolean,
      sortOrder: String
    ): ViewSettingsDialogCancelEventDetail = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortByItem = sortByItem.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewSettingsDialogCancelEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsDialogCancelEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSortByItem(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewSettingsDialogConfirmEventDetail
    extends StObject
       with VSDSettings {
    
    var sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default
    
    var sortDescending: Boolean
  }
  object ViewSettingsDialogConfirmEventDetail {
    
    inline def apply(
      filters: VSDFilters,
      sortBy: String,
      sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default,
      sortDescending: Boolean,
      sortOrder: String
    ): ViewSettingsDialogConfirmEventDetail = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortByItem = sortByItem.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewSettingsDialogConfirmEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsDialogConfirmEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSortByItem(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    }
  }
}
