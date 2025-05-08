package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRadioButtonMod.RadioButton as RadioButtonComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object RadioButton extends WebComponent("ui5-radio-button") {

  @JSImport("@ui5/webcomponents/dist/RadioButton.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = RadioButton.type

  type Ref = RadioButtonComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.6.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the component.
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is checked or not.
    *
    * **Note:** The property value can be changed with user interaction, either by clicking/tapping on the component, or
    * by using the Space or Enter key.
    *
    * **Note:** Only enabled radio buttons can be checked. Read-only radio buttons are not selectable, and therefore are
    * always unchecked.
    *
    * Default: false
    */
  lazy val checked: HtmlAttr[Boolean] = htmlAttr("checked", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is disabled.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * Radio buttons with the same `name` will form a radio button group.
    *
    * **Note:** By this name the component will be identified upon submission in an HTML form.
    *
    * **Note:** The selection can be changed with `ARROW_UP/DOWN` and `ARROW_LEFT/RIGHT` keys between radio buttons in
    * same group.
    *
    * **Note:** Only one radio button can be selected per group.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component isn't editable or selectable. However, because it's focusable, it still provides
    * visual feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines the text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the form value of the component. When a form with a radio button group is submitted, the group's value
    * will be the value of the currently selected radio button.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])

  /** Defines whether the component text wraps when there is not enough space.
    *
    * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])

  // -- Events --

  /** Fired when the component checked state changes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
