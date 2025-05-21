package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ClickLinkClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.link
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaCurrent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLinkMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-link` is a hyperlink component that is used to navigate to other
    * apps and web pages, or to trigger actions.
    * It is a clickable text element, visualized in such a way that it stands out
    * from the standard text.
    * On hover, it changes its style to an underlined text to provide additional feedback to the user.
    *
    * ### Usage
    *
    * You can set the `ui5-link` to be enabled or disabled.
    *
    * To create a visual hierarchy in large lists of links, you can set the less important links as
    * `Subtle` or the more important ones as `Emphasized`,
    * by using the `design` property.
    *
    * If the `href` property is set, the link behaves as the HTML
    * anchor tag (`<a></a>`) and opens the specified URL in the given target frame (`target` property).
    * To specify where the linked content is opened, you can use the `target` property.
    *
    * ### Responsive behavior
    *
    * If there is not enough space, the text of the `ui5-link` becomes truncated.
    * If the `wrappingType` property is set to `"Normal"`, the text is displayed
    * on several lines instead of being truncated.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Link";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart icon - Used to style the provided icon within the link
    * @csspart endIcon - Used to style the provided endIcon within the link
    * @slot {Array<Node>} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @JSImport("@ui5/webcomponents/dist/Link.js", JSImport.Default)
  @js.native
  open class default () extends Link
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Link.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Link.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def typeTextMappings(): Record[String, I18nText] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeTextMappings")().asInstanceOf[Record[String, I18nText]]
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-link` is a hyperlink component that is used to navigate to other
    * apps and web pages, or to trigger actions.
    * It is a clickable text element, visualized in such a way that it stands out
    * from the standard text.
    * On hover, it changes its style to an underlined text to provide additional feedback to the user.
    *
    * ### Usage
    *
    * You can set the `ui5-link` to be enabled or disabled.
    *
    * To create a visual hierarchy in large lists of links, you can set the less important links as
    * `Subtle` or the more important ones as `Emphasized`,
    * by using the `design` property.
    *
    * If the `href` property is set, the link behaves as the HTML
    * anchor tag (`<a></a>`) and opens the specified URL in the given target frame (`target` property).
    * To specify where the linked content is opened, you can use the `target` property.
    *
    * ### Responsive behavior
    *
    * If there is not enough space, the text of the `ui5-link` becomes truncated.
    * If the `wrappingType` property is set to `"Normal"`, the text is displayed
    * on several lines instead of being truncated.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Link";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart icon - Used to style the provided icon within the link
    * @csspart endIcon - Used to style the provided endIcon within the link
    * @slot {Array<Node>} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait Link
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _dummyAnchor: HTMLAnchorElement = js.native
    
    def _hasPopup: js.UndefOr[AriaHasPopup] = js.native
    
    def _isCrossOrigin(href: String): Boolean = js.native
    
    def _onclick(e: KeyboardEvent): Unit = js.native
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    var _rel: js.UndefOr[String] = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following fields are supported:
      *
      * - **expanded**: Indicates whether the button, or another grouping element it controls, is currently expanded or collapsed.
      * Accepts the following string values: `true` or `false`.
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button.
      * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
      *
      * @public
      * @since 1.1.0
      * @default {}
      */
    var accessibilityAttributes: LinkAccessibilityAttributes = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.2.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the ARIA role of the component.
      *
      * **Note:** Use the <code>LinkAccessibleRole.Button</code> role in cases when navigation is not expected to occur and the href property is not defined.
      * @default "Link"
      * @public
      * @since 1.9.0
      */
    var accessibleRole: /* template literal string: ${LinkAccessibleRole} */ String = js.native
    
    def ariaDescriptionText: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Defines the component design.
      *
      * **Note:** Avaialble options are `Default`, `Subtle`, and `Emphasized`.
      * @default "Default"
      * @public
      */
    var design: /* template literal string: ${LinkDesign} */ String = js.native
    
    /**
      * Defines whether the component is disabled.
      *
      * **Note:** When disabled, the click event cannot be triggered by the user.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveAccRole: button | link = js.native
    
    def effectiveTabIndex: Double = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component after the link's text.
      * The SAP-icons font provides numerous options.
      *
      * **Note:** Usage of icon-only link is not supported, the link must always have a text.
      *
      * **Note:** We recommend using аn icon in the beginning or the end only, and with text.
      *
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var endIcon: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Link: ClickLinkClickEventDetail = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    def hasLinkType: Boolean = js.native
    
    /**
      * Defines the component href.
      *
      * **Note:** Standard hyperlink behavior is supported.
      * @default undefined
      * @public
      */
    var href: js.UndefOr[String] = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component before the link's text.
      * The SAP-icons font provides numerous options.
      *
      * **Note:** Usage of icon-only link is not supported, the link must always have a text.
      *
      * **Note:** We recommend using аn icon in the beginning or the end only, and with text.
      *
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines the target area size of the link:
      * - **InteractiveAreaSize.Normal**: The default target area size.
      * - **InteractiveAreaSize.Large**: The target area size is enlarged to 24px in height.
      *
      * **Note:**The property is designed to make links easier to activate and helps meet the WCAG 2.2 Target Size requirement. It is applicable only for the SAP Horizon themes.
      * **Note:**To improve <code>ui5-link</code>'s reliability and usability, it is recommended to use the <code>InteractiveAreaSize.Large</code> value in scenarios where the <code>ui5-link</code> component is placed inside another interactive component, such as a list item or a table cell.
      * Setting the <code>interactiveAreaSize</code> property to <code>InteractiveAreaSize.Large</code> increases the <code>ui5-link</code>'s invisible touch area. As a result, the user's intended one-time selection command is more likely to activate the desired <code>ui5-link</code>, with minimal chance of unintentionally activating the underlying component.
      *
      * @public
      * @since 2.8.0
      * @default "Normal"
      */
    var interactiveAreaSize: /* template literal string: ${InteractiveAreaSize} */ String = js.native
    
    def linkTypeText: String = js.native
    
    def parsedRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the component target.
      *
      * **Notes:**
      *
      * - `_self`
      * - `_top`
      * - `_blank`
      * - `_parent`
      * - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      * @default undefined
      * @public
      */
    var target: js.UndefOr[String] = js.native
    
    /**
      * Defines the tooltip of the component.
      * @default undefined
      * @public
      * @since 2.0.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      *
      * **Note:** By default the text will wrap. If "None" is set - the text will truncate.
      * @default "Normal"
      * @public
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'expanded' | 'hasPopup' | 'current'> */
  trait LinkAccessibilityAttributes extends StObject {
    
    var current: js.UndefOr[AriaCurrent] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object LinkAccessibilityAttributes {
    
    inline def apply(): LinkAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: AriaCurrent): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  trait LinkClickEventDetail extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
    
    var shiftKey: Boolean
  }
  object LinkClickEventDetail {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, shiftKey: Boolean): LinkClickEventDetail = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
}
