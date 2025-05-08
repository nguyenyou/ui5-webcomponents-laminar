package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.InputEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ClearIcon
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Expanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.HTMLElementscopeOptiondef
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchFieldMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search-field` is an input field, used for user search.
    *
    * The `ui5-search-field` consists of several elements parts:
    * - Scope - displays a select in the beggining of the component, used for filtering results by their scope.
    * - Input field - for user input value
    * - Clear button - gives the possibility for deleting the entered value
    * - Search button - a primary button for performing search, when the user has entered a search term
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchField.js";`
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchField", JSImport.Default)
  @js.native
  open class default () extends SearchField
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/SearchField", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/SearchField", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-search`
    * @public
    */
  @js.native
  trait ISearchScope
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var selected: Boolean = js.native
    
    var stableDomRef: String = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search-field` is an input field, used for user search.
    *
    * The `ui5-search-field` consists of several elements parts:
    * - Scope - displays a select in the beggining of the component, used for filtering results by their scope.
    * - Input field - for user input value
    * - Clear button - gives the possibility for deleting the entered value
    * - Search button - a primary button for performing search, when the user has entered a search term
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchField.js";`
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @js.native
  trait SearchField
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _effectiveIconTooltip: String = js.native
    
    /**
      * @private
      */
    var _effectiveShowClearIcon: Boolean = js.native
    
    def _handleClear(): Unit = js.native
    
    def _handleEnter(): Unit = js.native
    
    def _handleInnerClick(): Unit = js.native
    
    def _handleInput(e: InputEvent): Unit = js.native
    
    def _handleScopeChange(e: CustomEvent): Unit = js.native
    
    def _handleSearchEvent(): Unit = js.native
    
    def _handleSearchIconPress(): Unit = js.native
    
    def _isSearchIcon: Boolean | `0` = js.native
    
    def _onFocusOutSearch(e: FocusEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _searchButtonAccessibilityAttributes: Expanded = js.native
    
    def _translations: ClearIcon = js.native
    
    /**
      * Defines the accessible ARIA description of the field.
      * @public
      * @default undefined
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @public
      * @default undefined
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementscopeOptiondef): Unit = js.native
    
    /**
      * Defines whether the component is collapsed.
      *
      * @default false
      * @private
      */
    var collapsed: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_SearchField: Input = js.native
    
    /**
      * @private
      */
    var focusedInnerInput: Boolean = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the
      * component has no value.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Defines the component scope options.
      * @public
      */
    var scopes: js.Array[ISearchScope] = js.native
    
    /**
      * Defines whether the clear icon of the search will be shown.
      * @default false
      * @public
      */
    var showClearIcon: Boolean = js.native
    
    /**
      * Defines the value of the component.
      *
      * **Note:** The property is updated upon typing.
      * @default ""
      * @public
      */
    var value: String = js.native
  }
  
  trait SearchFieldScopeSelectionChangeDetails extends StObject {
    
    var scope: js.UndefOr[ISearchScope] = js.undefined
  }
  object SearchFieldScopeSelectionChangeDetails {
    
    inline def apply(): SearchFieldScopeSelectionChangeDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchFieldScopeSelectionChangeDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchFieldScopeSelectionChangeDetails] (val x: Self) extends AnyVal {
      
      inline def setScope(value: ISearchScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
