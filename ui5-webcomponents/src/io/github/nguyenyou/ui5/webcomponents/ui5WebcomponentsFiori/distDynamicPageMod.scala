package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Pinbuttontoggle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriBooleans.`false`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicPageMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * A layout component, representing a web page, consisting of a title, header with dynamic behavior, a content area, and an optional floating footer.
    *
    * The component consist of several components:
    *
    * - `DynamicPageTitle` - a component, holding the title of the page, the navigation actions and the content. The displayed content changes based on the current mode of the `DynamicPageHeader`.
    * - `DynamicPageHeader` - a generic container, which can contain a single layout component and any other HTML elements. The header works in two modes - expanded and snapped and its behavior can be adjusted with the help of different properties.
    * - `Content area` - a generic container, which can have a single UI5 layout.
    * - `Footer` - positioned at the bottom with a small offset and used for additional actions, the footer floats above the content.
    *
    * ### Usage
    *
    * Use the `DynamicPage` if you need to have a title, that is always visible
    * and a header, that has configurable Expanding/Snapping functionality.
    * If you don't need the Expanding/Snapping functionality it is better to use the
    * `ui5-page` as a lighter component.
    *
    * The app can add to the `default` slot of the ui5-dynamic-page either content that is designed to fit its container (e.g. has 100% height),
    * or content with own height that may overflow its container. In the second case the `DynamicPage` will show a scrollbar that allows the user
    * scroll through the content.
    *
    * ## Notes:
    *
    * - Snapping of the `DynamicPageTitle` is not supported in the following case:
    *  - When the `DynamicPage` has a scroll bar, the component usually scrolls to the snapping point - the point, where the `DynamicPageHeader` is scrolled out completely. However, when there is a scroll bar, but not enough content to reach the snapping point, the snapping is not possible using scrolling.
    *
    * ### Responsive Behavior
    *
    * Dynamic page web component implements the responsive paddings design.
    *
    * ### Keyboard Handling
    *
    *
    * ### Basic Navigation
    *
    * - [SPACE, ENTER, RETURN] - If focus is on a button inside DynamicPageTitle its action is being triggered, once activated.
    * If focus is on the snap header button (arrow button), or on the header itself, once activated, it triggers the associated action (such as snap/expand the header).
    * If focus is on pin button (the button with pin icon on the bottom of the header), once activated, it triggers the associated action (pinning of the header).
    *
    * ### Fast Navigation
    * - This component provides a build in fast navigation group which can be used via `F6 / Shift + F6` or ` Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up`.
    * In order to use this functionality, you need to import the following module:
    *
    * - `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/DynamicPage.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @csspart content - Used to style the content of the component
    * @csspart fit-content - Used to style the fit content container of the component.
    * @csspart footer - Used to style the footer of the component
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPage", JSImport.Default)
  @js.native
  open class default () extends DynamicPage
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPage", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * A layout component, representing a web page, consisting of a title, header with dynamic behavior, a content area, and an optional floating footer.
    *
    * The component consist of several components:
    *
    * - `DynamicPageTitle` - a component, holding the title of the page, the navigation actions and the content. The displayed content changes based on the current mode of the `DynamicPageHeader`.
    * - `DynamicPageHeader` - a generic container, which can contain a single layout component and any other HTML elements. The header works in two modes - expanded and snapped and its behavior can be adjusted with the help of different properties.
    * - `Content area` - a generic container, which can have a single UI5 layout.
    * - `Footer` - positioned at the bottom with a small offset and used for additional actions, the footer floats above the content.
    *
    * ### Usage
    *
    * Use the `DynamicPage` if you need to have a title, that is always visible
    * and a header, that has configurable Expanding/Snapping functionality.
    * If you don't need the Expanding/Snapping functionality it is better to use the
    * `ui5-page` as a lighter component.
    *
    * The app can add to the `default` slot of the ui5-dynamic-page either content that is designed to fit its container (e.g. has 100% height),
    * or content with own height that may overflow its container. In the second case the `DynamicPage` will show a scrollbar that allows the user
    * scroll through the content.
    *
    * ## Notes:
    *
    * - Snapping of the `DynamicPageTitle` is not supported in the following case:
    *  - When the `DynamicPage` has a scroll bar, the component usually scrolls to the snapping point - the point, where the `DynamicPageHeader` is scrolled out completely. However, when there is a scroll bar, but not enough content to reach the snapping point, the snapping is not possible using scrolling.
    *
    * ### Responsive Behavior
    *
    * Dynamic page web component implements the responsive paddings design.
    *
    * ### Keyboard Handling
    *
    *
    * ### Basic Navigation
    *
    * - [SPACE, ENTER, RETURN] - If focus is on a button inside DynamicPageTitle its action is being triggered, once activated.
    * If focus is on the snap header button (arrow button), or on the header itself, once activated, it triggers the associated action (such as snap/expand the header).
    * If focus is on pin button (the button with pin icon on the bottom of the header), once activated, it triggers the associated action (pinning of the header).
    *
    * ### Fast Navigation
    * - This component provides a build in fast navigation group which can be used via `F6 / Shift + F6` or ` Ctrl + Alt(Option) + Down /  Ctrl + Alt(Option) + Up`.
    * In order to use this functionality, you need to import the following module:
    *
    * - `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/DynamicPage.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @csspart content - Used to style the content of the component
    * @csspart fit-content - Used to style the fit content container of the component.
    * @csspart footer - Used to style the footer of the component
    */
  @js.native
  trait DynamicPage
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _headerExpanded: Boolean = js.native
    
    def _headerLabel: String = js.native
    
    var _headerSnapped: Boolean = js.native
    
    def _toggleHeader(): js.Promise[Unit] = js.native
    
    def actionsInTitle: Boolean = js.native
    
    /**
      * Defines the content of the Dynamic Page.
      *
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    def dynamicPageHeader: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageHeaderMod.default | Null = js.native
    
    def dynamicPageTitle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageTitleMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_DynamicPage: Pinbuttontoggle = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * @public
      */
    var footerArea: js.Array[HTMLElement] = js.native
    
    def hasHeading: Boolean = js.native
    
    def hasSnappedTitleOnMobile: js.UndefOr[Double | `false`] = js.native
    
    var headerActions: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageHeaderActionsMod.default
      ] = js.native
    
    /**
      * Defines the header HTML Element.
      *
      * @public
      */
    var headerArea: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageHeaderMod.default
      ] = js.native
    
    def headerAriaHidden: Boolean = js.native
    
    def headerInContent: Boolean = js.native
    
    def headerInTitle: Boolean = js.native
    
    /**
      * Defines if the header is pinned.
      *
      * @default false
      * @public
      */
    var headerPinned: Boolean = js.native
    
    def headerSnapped: Boolean = js.native
    /**
      * Defines if the header is snapped.
      *
      * @default false
      * @public
      */
    def headerSnapped_=(snapped: Boolean): Unit = js.native
    
    def headerTabIndex: `0` | `-1` = js.native
    
    /**
      * Defines if the pin button is hidden.
      *
      * @default false
      * @public
      */
    var hidePinButton: Boolean = js.native
    
    var isToggled: Boolean = js.native
    
    def onExpandClick(): js.Promise[Unit] = js.native
    
    def onExpandHoverIn(): js.Promise[Unit] = js.native
    
    def onExpandHoverOut(): js.Promise[Unit] = js.native
    
    def onPinClick(): js.Promise[Unit] = js.native
    
    def onToggleTitle(): js.Promise[Unit] = js.native
    
    var scrollContainer: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Defines if the footer is shown.
      *
      * @default false
      * @public
      */
    var showFooter: Boolean = js.native
    
    var showHeaderInStickArea: Boolean = js.native
    
    var skipSnapOnScroll: Boolean = js.native
    
    def snapOnScroll(): Unit = js.native
    
    def snapTitleByScroll(): Unit = js.native
    
    /**
      * Defines the title HTML Element.
      *
      * @public
      */
    var titleArea: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageTitleMod.default
      ] = js.native
  }
}
