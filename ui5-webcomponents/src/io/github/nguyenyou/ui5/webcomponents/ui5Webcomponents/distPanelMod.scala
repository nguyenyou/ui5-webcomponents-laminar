package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Lowercase
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.AriaControls
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Toggle
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.heading
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPanelMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-panel` component is a container which has a header and a
    * content area and is used
    * for grouping and displaying information. It can be collapsed to save space on the screen.
    *
    * ### Guidelines:
    *
    * - Nesting two or more panels is not recommended.
    * - Do not stack too many panels on one page.
    *
    * ### Structure
    * The panel's header area consists of a title bar with a header text or custom header.
    *
    * The header is clickable and can be used to toggle between the expanded and collapsed state. It includes an icon which rotates depending on the state.
    *
    * The custom header can be set through the `header` slot and it may contain arbitraray content, such as: title, buttons or any other HTML elements.
    *
    * The content area can contain an arbitrary set of controls.
    *
    * **Note:** The custom header is not clickable out of the box, but in this case the icon is interactive and allows to show/hide the content area.
    *
    * ### Responsive Behavior
    *
    * - If the width of the panel is set to 100% (default), the panel and its children are
    * resized responsively,
    * depending on its parent container.
    * - If the panel has a fixed height, it will take up the space even if the panel is
    * collapsed.
    * - When the panel is expandable (the `fixed` property is set to `false`),
    * an arrow icon (pointing to the right) appears in front of the header.
    * - When the animation is activated, expand/collapse uses a smooth animation to open or
    * close the content area.
    * - When the panel expands/collapses, the arrow icon rotates 90 degrees
    * clockwise/counter-clockwise.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Panel.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Defines the content of the component. The content is visible only when the component is expanded.
    * @csspart header - Used to style the wrapper of the header.
    * @csspart content - Used to style the wrapper of the content.
    */
  @JSImport("@ui5/webcomponents/dist/Panel", JSImport.Default)
  @js.native
  open class default () extends Panel
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Panel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Panel", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-panel` component is a container which has a header and a
    * content area and is used
    * for grouping and displaying information. It can be collapsed to save space on the screen.
    *
    * ### Guidelines:
    *
    * - Nesting two or more panels is not recommended.
    * - Do not stack too many panels on one page.
    *
    * ### Structure
    * The panel's header area consists of a title bar with a header text or custom header.
    *
    * The header is clickable and can be used to toggle between the expanded and collapsed state. It includes an icon which rotates depending on the state.
    *
    * The custom header can be set through the `header` slot and it may contain arbitraray content, such as: title, buttons or any other HTML elements.
    *
    * The content area can contain an arbitrary set of controls.
    *
    * **Note:** The custom header is not clickable out of the box, but in this case the icon is interactive and allows to show/hide the content area.
    *
    * ### Responsive Behavior
    *
    * - If the width of the panel is set to 100% (default), the panel and its children are
    * resized responsively,
    * depending on its parent container.
    * - If the panel has a fixed height, it will take up the space even if the panel is
    * collapsed.
    * - When the panel is expandable (the `fixed` property is set to `false`),
    * an arrow icon (pointing to the right) appears in front of the header.
    * - When the animation is activated, expand/collapse uses a smooth animation to open or
    * close the content area.
    * - When the panel expands/collapses, the arrow icon rotates 90 degrees
    * clockwise/counter-clockwise.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Panel.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Defines the content of the component. The content is visible only when the component is expanded.
    * @csspart header - Used to style the wrapper of the header.
    * @csspart content - Used to style the wrapper of the content.
    */
  @js.native
  trait Panel
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _animationRunning: Boolean = js.native
    
    var _contentExpanded: Boolean = js.native
    
    /**
      * @private
      */
    var _hasHeader: Boolean = js.native
    
    def _headerClick(e: MouseEvent): Unit = js.native
    
    def _headerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _headerKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _headerOnTarget(target: HTMLElement): Boolean = js.native
    
    def _toggleButtonClick(e: MouseEvent): Unit = js.native
    
    def _toggleOpen(): Unit = js.native
    
    def accInfo: AriaControls = js.native
    
    def accRole: Lowercase[PanelAccessibleRole] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Sets the accessible ARIA role of the component.
      * Depending on the usage, you can change the role from the default `Form`
      * to `Region` or `Complementary`.
      * @default "Form"
      * @public
      */
    var accessibleRole: /* template literal string: ${PanelAccessibleRole} */ String = js.native
    
    def ariaLabelledbyReference: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the component is collapsed and only the header is displayed.
      * @default false
      * @public
      */
    var collapsed: Boolean = js.native
    
    def effectiveAccessibleName: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Panel: Toggle = js.native
    
    def expanded: Boolean = js.native
    
    /**
      * Determines whether the component is in a fixed state that is not
      * expandable/collapsible by user interaction.
      * @default false
      * @public
      */
    var fixed: Boolean = js.native
    
    def fixedPanelAriaLabelledbyReference: js.UndefOr[String] = js.native
    
    def hasHeaderOrHeaderText: js.UndefOr[String | `true`] = js.native
    
    /**
      * Defines the component header area.
      *
      * **Note:** When a header is provided, the `headerText` property is ignored.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    def headerAriaLevel: Double = js.native
    
    /**
      * Defines the "aria-level" of component heading,
      * set by the `headerText`.
      * @default "H2"
      * @public
      */
    var headerLevel: /* template literal string: ${TitleLevel} */ String = js.native
    
    def headerTabIndex: `0` | `-1` = js.native
    
    /**
      * This property is used to set the header text of the component.
      * The text is visible in both expanded and collapsed states.
      *
      * **Note:** This property is overridden by the `header` slot.
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    def headingWrapperAriaLevel: js.UndefOr[Double] = js.native
    
    def headingWrapperRole: js.UndefOr[heading] = js.native
    
    /**
      * Indicates whether the transition between the expanded and the collapsed state of the component is animated. By default the animation is enabled.
      * @default false
      * @public
      * @since 1.0.0-rc.16
      */
    var noAnimation: Boolean = js.native
    
    def nonFixedInternalHeader: Boolean = js.native
    
    def nonFocusableButton: Boolean = js.native
    
    def shouldNotAnimate: Boolean = js.native
    
    def shouldToggle(element: HTMLElement): Boolean = js.native
    
    /**
      * Indicates whether the Panel header is sticky or not.
      * If stickyHeader is set to true, then whenever you scroll the content or
      * the application, the header of the panel will be always visible and
      * a solid color will be used for its design.
      * @default false
      * @public
      * @since 1.16.0-rc.1
      */
    var stickyHeader: Boolean = js.native
    
    def toggleButtonTitle: String = js.native
    
    /**
      * When set to `true`, the `accessibleName` property will be
      * applied not only on the panel root itself, but on its toggle button too.
      * **Note:** This property only has effect if `accessibleName` is set and a header slot is provided.
      * @default false
      * @private
      */
    var useAccessibleNameForToggleButton: Boolean = js.native
  }
}
