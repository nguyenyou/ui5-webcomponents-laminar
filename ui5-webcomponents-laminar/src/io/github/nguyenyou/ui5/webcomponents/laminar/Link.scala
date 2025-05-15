package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.Link as LinkComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.LinkClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Link extends WebComponent("ui5-link") {

  @JSImport("@ui5/webcomponents/dist/Link.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Link.type

  type Ref = LinkComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible description of the component.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleDescription: HtmlAttr[String] = htmlAttr("accessible-description", StringAsIsCodec)

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the input
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines the ARIA role of the component.
    *
    * **Note:** Use the <code>LinkAccessibleRole.Button</code> role in cases when navigation is not expected to occur
    * and the href property is not defined.
    *
    * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Link"
    */
  lazy val accessibleRole: HtmlAttr[LinkAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[LinkAccessibleRole])

  /** Defines the component design.
    *
    * **Note:** Avaialble options are `Default`, `Subtle`, and `Emphasized`.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[LinkDesign] = htmlAttr("design", StringUnionCodec[LinkDesign])

  /** Defines whether the component is disabled.
    *
    * **Note:** When disabled, the click event cannot be triggered by the user.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the icon, displayed as graphical element within the component after the link's text. The SAP-icons font
    * provides numerous options.
    *
    * **Note:** Usage of icon-only link is not supported, the link must always have a text.
    *
    * **Note:** We recommend using аn icon in the beginning or the end only, and with text.
    *
    * See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val endIcon: HtmlAttr[IconName] = htmlAttr("end-icon", IconName.AsStringCodec)

  /** Defines the component href.
    *
    * **Note:** Standard hyperlink behavior is supported.
    *
    * Default: undefined
    */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Defines the icon, displayed as graphical element within the component before the link's text. The SAP-icons font
    * provides numerous options.
    *
    * **Note:** Usage of icon-only link is not supported, the link must always have a text.
    *
    * **Note:** We recommend using аn icon in the beginning or the end only, and with text.
    *
    * See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the target area size of the link:
    *   - **InteractiveAreaSize.Normal**: The default target area size.
    *   - **InteractiveAreaSize.Large**: The target area size is enlarged to 24px in height.
    *
    * **Note:**The property is designed to make links easier to activate and helps meet the WCAG 2.2 Target Size
    * requirement. It is applicable only for the SAP Horizon themes. **Note:**To improve <code>ui5-link</code>'s
    * reliability and usability, it is recommended to use the <code>InteractiveAreaSize.Large</code> value in scenarios
    * where the <code>ui5-link</code> component is placed inside another interactive component, such as a list item or a
    * table cell. Setting the <code>interactiveAreaSize</code> property to <code>InteractiveAreaSize.Large</code>
    * increases the <code>ui5-link</code>'s invisible touch area. As a result, the user's intended one-time selection
    * command is more likely to activate the desired <code>ui5-link</code>, with minimal chance of unintentionally
    * activating the underlying component.
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Normal"
    */
  lazy val interactiveAreaSize: HtmlAttr[InteractiveAreaSize] =
    htmlAttr("interactive-area-size", StringUnionCodec[InteractiveAreaSize])

  /** Defines the component target.
    *
    * **Notes:**
    *
    *   - `_self`
    *   - `_top`
    *   - `_blank`
    *   - `_parent`
    *   - `_search`
    *
    * **This property must only be used when the `href` property is set.**
    *
    * Default: undefined
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines how the text of a component will be displayed when there is not enough space.
    *
    * **Note:** By default the text will wrap. If "None" is set - the text will truncate.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])

  // -- Events --

  /** Fired when the component is triggered either with a mouse/tap or by using the Enter key.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[LinkClickEventDetail]] = new EventProp("click")

  // -- Slots --

}
