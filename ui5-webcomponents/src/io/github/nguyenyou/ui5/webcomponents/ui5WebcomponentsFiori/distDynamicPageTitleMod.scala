package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Toggletitle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.heading
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.snappedHeading
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.snappedSubheading
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.subheading
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicPageTitleMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Title of the `DynamicPage`.
    *
    * The `DynamicPageTitle` component is part of the `DynamicPage`
    * family and is used to serve as title of the `DynamicPage`.
    *
    * ### Usage
    *
    * The `DynamicPageTitle` can hold any component and displays the most important
    * information regarding the object that will always remain visible while scrolling.
    *
    * **Note:** The `actions` slot accepts any UI5 web component, but it's
    * recommended to use `ui5-toolbar`.
    *
    * The user can switch between the expanded/collapsed states of the
    * `DynamicPage` by clicking on the `DynamicPageTitle`
    * or by using the expand/collapse visual indicators, positioned at the bottom of the
    * `DynamicPageTitle` and the `DynamicPageHeader` inside `ui5-dynamic-page-header-actions`.
    *
    * ### Responsive Behavior
    *
    * The responsive behavior of the `DynamicPageTitle` depends on the behavior of the
    * content that is displayed.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageTitle.js", JSImport.Default)
  @js.native
  open class default () extends DynamicPageTitle
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageTitle.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageTitle.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Title of the `DynamicPage`.
    *
    * The `DynamicPageTitle` component is part of the `DynamicPage`
    * family and is used to serve as title of the `DynamicPage`.
    *
    * ### Usage
    *
    * The `DynamicPageTitle` can hold any component and displays the most important
    * information regarding the object that will always remain visible while scrolling.
    *
    * **Note:** The `actions` slot accepts any UI5 web component, but it's
    * recommended to use `ui5-toolbar`.
    *
    * The user can switch between the expanded/collapsed states of the
    * `DynamicPage` by clicking on the `DynamicPageTitle`
    * or by using the expand/collapse visual indicators, positioned at the bottom of the
    * `DynamicPageTitle` and the `DynamicPageHeader` inside `ui5-dynamic-page-header-actions`.
    *
    * ### Responsive Behavior
    *
    * The responsive behavior of the `DynamicPageTitle` depends on the behavior of the
    * content that is displayed.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @js.native
  trait DynamicPageTitle
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDescribedbyText: String = js.native
    
    def _ariaLabelledBy: js.UndefOr[String] = js.native
    
    def _handleResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResize")
    var _handleResize_Original: ResizeObserverCallback = js.native
    
    def _headerExpanded: Boolean = js.native
    
    def _needsSeparator: Boolean = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _tabIndex: js.UndefOr[`0`] = js.native
    
    /**
      * Defines the bar with actions in the Dynamic page title.
      *
      * @public
      */
    var actionsBar: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content of the breadcrumbs inside Dynamic Page Title.
      *
      * @public
      */
    var breadcrumbs: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content of the Dynamic page title.
      *
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    @JSName("eventDetails")
    var eventDetails_DynamicPageTitle: Toggletitle = js.native
    
    /**
      * Indicates if the elements is on focus
      * @private
      */
    var focused: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    def hasContent: Boolean = js.native
    
    /**
      * Indicates whether the title has snapped on mobile devices.
      * @private
      */
    var hasSnappedTitleOnMobile: Boolean = js.native
    
    /**
      * Defines the content of the Heading of the Dynamic Page.
      *
      * The font size of the title within the `heading` slot can be adjusted to the recommended values using the following CSS variables:
      *
      * **Expanded:** `var(--sapObjectHeader_Title_FontSize)`
      *
      * **Collapsed:** `var(--sapObjectHeader_Title_SnappedFontSize)`
      *
      * @public
      */
    var heading: js.Array[HTMLElement] = js.native
    
    def headingSlotName: heading | snappedHeading = js.native
    
    /**
      * @private
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines the minimum width of the actions area.
      * @private
      */
    var minActionsWidth: js.UndefOr[Double] = js.native
    
    /**
      * Defines the minimum width of the content area.
      * @private
      */
    var minContentWidth: js.UndefOr[Double] = js.native
    
    /**
      * Defines if the mobileNavigationActions are shown.
      *
      * @private
      */
    var mobileNavigationActions: Boolean = js.native
    
    /**
      * Defines the bar with navigation actions in the Dynamic page title.
      *
      * @public
      */
    var navigationBar: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarMod.default] = js.native
    
    def onMinContentWidthChange(e: CustomEvent): Unit = js.native
    
    def onTitleClick(): Unit = js.native
    
    def prepareLayoutActions(): Unit = js.native
    
    /**
      * Defines if the title is snapped.
      *
      * @protected
      * @default false
      */
    var snapped: Boolean = js.native
    
    /**
      * Defines the heading that is shown only when the header is snapped.
      *
      * @public
      */
    var snappedHeading: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content of the title that is shown only when the header is snapped.
      *
      * @public
      */
    var snappedSubheading: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content of the snapped title on mobile devices.
      *
      * This slot is displayed only when the `DynamicPageTitle` is in the snapped state on mobile devices.
      * It should be used to provide a simplified, single-line title that takes up less space on smaller screens.
      *
      * **Note:**
      * - The content set in this slot **overrides** all other content set in the `DynamicPageTitle` slots when displayed.
      * - The slot is intended for a single `ui5-title` component.
      *
      * @public
      * @since 2.3.0
      */
    var snappedTitleOnMobile: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTitleMod.default] = js.native
    
    /**
      * Defines the content of the title that is shown only when the header is not snapped.
      *
      * @public
      */
    var subheading: js.Array[HTMLElement] = js.native
    
    def subheadingSlotName: subheading | snappedSubheading = js.native
  }
}
