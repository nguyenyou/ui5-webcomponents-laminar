package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCheckBoxMod.CheckBox as CheckBoxComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object CheckBox extends WebComponent("ui5-checkbox") {

  @JSImport("@ui5/webcomponents/dist/CheckBox.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = CheckBox.type

  type Ref = CheckBoxComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines if the component is checked.
    *
    * **Note:** The property can be changed with user interaction, either by cliking/tapping on the component, or by
    * pressing the Enter or Space key.
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

  /** Determines whether the `CheckBox` is in display only state.
    *
    * When set to `true`, the `CheckBox` is not interactive, not editable, not focusable and not in the tab chain. This
    * setting is used for forms in review mode.
    *
    * **Note:** When the property `disabled` is set to `true` this property has no effect.
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val displayOnly: HtmlAttr[Boolean] = htmlAttr("display-only", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is displayed as partially checked.
    *
    * **Note:** The indeterminate state can be set only programmatically and can’t be achieved by user interaction and
    * the resulting visual state depends on the values of the `indeterminate` and `checked` properties:
    *
    *   - If the component is checked and indeterminate, it will be displayed as partially checked
    *   - If the component is checked and it is not indeterminate, it will be displayed as checked
    *   - If the component is not checked, it will be displayed as not checked regardless value of the indeterminate
    *     attribute
    *
    * Default: false
    */
  lazy val indeterminate: HtmlAttr[Boolean] = htmlAttr("indeterminate", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * **Note:** We advise against using the text property of the checkbox when there is a label associated with it to
    * avoid having two required asterisks.
    *
    * **Note:** Available since [v1.3.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.3.0) of
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

  /** Defines the form value of the component that is submitted when the checkbox is checked.
    *
    * When a form containing `CheckBox` elements is submitted, only the values of the **checked** checkboxes are
    * included in the form data sent to the server. Unchecked checkboxes do not contribute any data to the form
    * submission.
    *
    * This property is particularly useful for **checkbox groups**, where multiple checkboxes with the same `name` but
    * different `value` properties can be used to represent a set of related options.
    *
    * Default: "on"
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])

  /** Defines whether the component text wraps when there is not enough space.
    *
    * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation. **Note:**
    * for option "None" the text will be truncated with an ellipsis.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])

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
