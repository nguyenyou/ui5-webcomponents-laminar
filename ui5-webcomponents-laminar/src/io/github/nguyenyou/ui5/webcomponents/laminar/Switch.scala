package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSwitchMod.Switch as SwitchComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Switch extends WebComponent("ui5-switch") {

  @JSImport("@ui5/webcomponents/dist/Switch.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Switch.type

  type Ref = SwitchComponent with dom.HTMLElement

  // -- Attributes --

  /** Sets the accessible ARIA name of the component.
    *
    * **Note**: We recommend that you set an accessibleNameRef pointing to an external label or at least an
    * `accessibleName`. Providing an `accessibleNameRef` or an `accessibleName` is mandatory in the cases when `textOn`
    * and `textOff` properties aren't set.
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note**: We recommend that you set an accessibleNameRef pointing to an external label or at least an
    * `accessibleName`. Providing an `accessibleNameRef` or an `accessibleName` is mandatory in the cases when `textOn`
    * and `textOff` properties aren't set.
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines if the component is checked.
    *
    * **Note:** The property can be changed with user interaction, either by cliking the component, or by pressing the
    * `Enter` or `Space` key.
    *
    * Default: false
    */
  lazy val checked: HtmlAttr[Boolean] = htmlAttr("checked", BooleanAsAttrPresenceCodec)

  /** Defines the component design.
    *
    * **Note:** If `Graphical` type is set, positive and negative icons will replace the `textOn` and `textOff`.
    *
    * Default: "Textual"
    */
  lazy val design: HtmlAttr[SwitchDesign] = htmlAttr("design", StringUnionCodec[SwitchDesign])
  type SwitchDesign = "Textual" | "Graphical"

  /** Defines whether the component is disabled.
    *
    * **Note:** A disabled component is noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * **Note:** Available since [v1.16.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.16.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the component is required.
    *
    * **Note:** Available since [v1.16.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.16.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines the text, displayed when the component is not checked.
    *
    * **Note:** We recommend using short texts, up to 3 letters (larger texts would be cut off).
    *
    * Default: undefined
    */
  lazy val textOff: HtmlAttr[String] = htmlAttr("text-off", StringAsIsCodec)

  /** Defines the text, displayed when the component is checked.
    *
    * **Note:** We recommend using short texts, up to 3 letters (larger texts would be cut off).
    *
    * Default: undefined
    */
  lazy val textOn: HtmlAttr[String] = htmlAttr("text-on", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * **Note:** If applicable an external label reference should always be the preferred option to provide context to
    * the `Switch` component over a tooltip.
    *
    * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  // -- Events --

  /** Fired when the component checked state changes.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
