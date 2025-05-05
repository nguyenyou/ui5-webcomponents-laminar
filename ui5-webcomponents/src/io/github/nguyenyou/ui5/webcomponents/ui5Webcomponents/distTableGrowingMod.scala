package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserver
import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserverEntry
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Loadmore
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.ITableGrowing
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableGrowingMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-growing` component is used inside the `ui5-table` to add a growing/data loading functionalities
    * to the table.
    *
    * The component offers two options:
    * * Button - a More button is displayed, clicking it will load more data.
    * * Scroll - additional data is loaded automatically when the user scrolls to the end of the table.
    *
    * ### Usage
    *
    * The `ui5-table-growing` component is only used inside the `ui5-table` component as a feature.
    * It has to be slotted inside the `ui5-table` in the `features` slot.
    * The component is not intended to be used as a standalone component.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-growing mode="Button" text="More" slot="features"></ui5-table-growing>
    * </ui5-table>
    * ```
    *
    * **Notes**:
    * * When the `ui5-table-growing` component is used with the `Scroll` mode and the table is currently not scrollable,
    * the component will render a growing button instead to ensure growing capabilities until the table becomes scrollable.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableGrowing.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @JSImport("@ui5/webcomponents/dist/TableGrowing", JSImport.Default)
  @js.native
  open class default () extends TableGrowing
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableGrowing", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableGrowing", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-growing` component is used inside the `ui5-table` to add a growing/data loading functionalities
    * to the table.
    *
    * The component offers two options:
    * * Button - a More button is displayed, clicking it will load more data.
    * * Scroll - additional data is loaded automatically when the user scrolls to the end of the table.
    *
    * ### Usage
    *
    * The `ui5-table-growing` component is only used inside the `ui5-table` component as a feature.
    * It has to be slotted inside the `ui5-table` in the `features` slot.
    * The component is not intended to be used as a standalone component.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-growing mode="Button" text="More" slot="features"></ui5-table-growing>
    * </ui5-table>
    * ```
    *
    * **Notes**:
    * * When the `ui5-table-growing` component is used with the `Scroll` mode and the table is currently not scrollable,
    * the component will render a growing button instead to ensure growing capabilities until the table becomes scrollable.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableGrowing.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @js.native
  trait TableGrowing extends ITableGrowing {
    
    /**
      * Defines the active state of the growing button.
      * Used for keyboard interaction.
      * @private
      */
    var _activeState: Boolean = js.native
    
    def _buttonDescription: String = js.native
    
    def _buttonText: String = js.native
    
    var _currentLastRow: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Returns the IntersectionObserver instance. If it does not exist, it will be created.
      * The observer will call the loadMore function when the end of the table is reached.
      * @private
      */
    def _getIntersectionObserver(): IntersectionObserver = js.native
    
    def _hasButton: Boolean = js.native
    
    def _hasScrollToLoad(): Boolean = js.native
    
    var _invalidate: Double = js.native
    
    def _invalidateTable(): Unit = js.native
    
    /**
      * Observes the end of the table.
      * @private
      */
    def _observeTableEnd(): Unit = js.native
    
    var _observer: js.UndefOr[IntersectionObserver] = js.native
    
    def _onFocusout(): Unit = js.native
    
    def _onIntersection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    /**
      * Handles the keydown event on the growing button.
      *
      * Calls the loadMore function when the Enter and Space keys are pressed.
      * @private
      */
    def _onKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onKeyup(e: KeyboardEvent): Unit = js.native
    
    var _renderContent: Boolean = js.native
    
    var _shouldFocusRow: js.UndefOr[Boolean] = js.native
    
    var _table: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default] = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableGrowing: Loadmore = js.native
    
    /**
      * Defines the mode of the <code>ui5-table</code> growing.
      *
      * Available options are:
      *
      * Button - Shows a More button at the bottom of the table, pressing it will load more rows.
      *
      * Scroll - The rows are loaded automatically by scrolling to the bottom of the table. If the table is not scrollable,
      * a growing button will be rendered instead to ensure growing functionality.
      * @default "Button"
      * @public
      */
    var mode: /* template literal string: ${TableGrowingMode} */ String = js.native
    
    @JSName("onTableActivate")
    def onTableActivate_MTableGrowing(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default): Unit = js.native
    
    @JSName("onTableAfterRendering")
    def onTableAfterRendering_MTableGrowing(): Unit = js.native
    
    /**
      * Defines the text that will be displayed below the `text` inside the growing button.
      * Has no effect when mode is set to Scroll.
      *
      * @default undefined
      * @public
      */
    var subtext: js.UndefOr[String] = js.native
    
    /**
      * Defines the text that will be displayed inside the growing button.
      * Has no effect when mode is set to `Scroll`.
      *
      * **Note:** When not provided and the mode is set to Button, a default text is displayed, corresponding to the
      * current language.
      *
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
