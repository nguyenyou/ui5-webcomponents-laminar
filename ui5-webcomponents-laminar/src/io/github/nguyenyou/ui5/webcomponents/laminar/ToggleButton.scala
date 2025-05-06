package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleButtonMod.ToggleButton as ToggleButtonComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToggleButton extends WebComponent("ui5-toggle-button") {

  @JSImport("@ui5/webcomponents/dist/ToggleButton.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ToggleButton.type

  type Ref = ToggleButtonComponent with dom.HTMLElement

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
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Describes the accessibility role of the button.
    *
    * **Note:** Use <code>ButtonAccessibleRole.Link</code> role only with a press handler, which performs a navigation.
    * In all other scenarios the default button semantics are recommended.
    *
    * **Note:** Available since [v1.23](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23) of
    * **@ui5/webcomponents**.
    *
    * Default: "Button"
    */
  lazy val accessibleRole: HtmlAttr[ButtonAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[ButtonAccessibleRole])
  type ButtonAccessibleRole = "Button" | "Link"

  /** Defines the component design.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[ButtonDesign] = htmlAttr("design", StringUnionCodec[ButtonDesign])
  type ButtonDesign = "Default" | "Positive" | "Negative" | "Transparent" | "Emphasized" | "Attention"

  /** Defines whether the component is disabled. A disabled component can't be pressed or focused, and it is not in the
    * tab chain.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the icon, displayed as graphical element within the component after the button text.
    *
    * **Note:** It is highly recommended to use `endIcon` property only together with `icon` and/or `text` properties.
    * Usage of `endIcon` only should be avoided.
    *
    * The SAP-icons font provides numerous options.
    *
    * Example: See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val endIcon: HtmlAttr[IconName] = htmlAttr("end-icon", IconName.AsStringCodec)

  /** Defines the icon, displayed as graphical element within the component. The SAP-icons font provides numerous
    * options.
    *
    * Example: See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Determines whether the component is displayed as pressed.
    *
    * Default: false
    */
  lazy val pressed: HtmlAttr[Boolean] = htmlAttr("pressed", BooleanAsAttrPresenceCodec)

  /** When set to `true`, the component will automatically submit the nearest HTML form element on `press`.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.`
    *
    * Default: false
    *
    * Deprecated: Set the "type" property to "Submit" to achieve the same result. The "submits" property is ignored if
    * "type" is set to any value other than "Button".
    */
  lazy val submits: HtmlAttr[Boolean] = htmlAttr("submits", BooleanAsAttrPresenceCodec)

  /** Defines the tooltip of the component.
    *
    * **Note:** A tooltip attribute should be provided for icon-only buttons, in order to represent their exact
    * meaning/function.
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines whether the button has special form-related functionality.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * **Note:** Available since [v1.15.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.15.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Button"
    */
  lazy val tpe: HtmlAttr[ButtonType] = htmlAttr("type", StringUnionCodec[ButtonType])
  type ButtonType = "Button" | "Submit" | "Reset"

  // -- Events --

  /** Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
    *
    * **Note:** The event will not be fired if the `disabled` property is set to `true`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[dom.Event] = new EventProp("click")

  // -- Slots --

  /** Adds a badge to the button.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="badge"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    */
  lazy val badge: Slot = new Slot("badge")
}
