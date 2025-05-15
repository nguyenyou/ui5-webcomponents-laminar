package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormMod.Form as FormComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Form extends WebComponent("ui5-form") {

  @JSImport("@ui5/webcomponents/dist/Form.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Form.type

  type Ref = FormComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v2.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the number of cells that are empty at the end of each form item, configurable by breakpoint.
    *
    * By default, a form item spans 12 cells, fully divided between its label (4 cells) and field (8 cells), with no
    * empty space at the end. The `emptySpan` provides additional layout flexibility by defining empty space at the form
    * item’s end.
    *
    * **Note:**
    *   - The maximum allowable empty space is 10 cells. At least 1 cell each must remain for the label and the field.
    *   - When `emptySpan` is specified (greater than 0), ensure that the combined value of `emptySpan` and `labelSpan`
    *     does not exceed 11. This guarantees a minimum of 1 cell for the field.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "S0 M0 L0 XL0"
    */
  lazy val emptySpan: HtmlAttr[String] = htmlAttr("empty-span", StringAsIsCodec)

  /** Defines the compoennt heading level, set by the `headerText`.
    *
    * **Note:** Available since [v2.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "H2"
    */
  lazy val headerLevel: HtmlAttr[TitleLevel] = htmlAttr("header-level", StringUnionCodec[TitleLevel])

  /** Defines the header text of the component.
    *
    * **Note:** The property gets overridden by the `header` slot.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Defines the vertical spacing between form items.
    *
    * **Note:** If the Form is meant to be switched between "non-edit" and "edit" modes, we recommend using "Large" item
    * spacing in "non-edit" mode, and "Normal" - for "edit" mode, to avoid "jumping" effect, caused by the hight
    * difference between texts in "non-edit" mode and the input fields in "edit" mode.
    *
    * Default: "Normal"
    */
  lazy val itemSpacing: HtmlAttr[FormItemSpacing] = htmlAttr("item-spacing", StringUnionCodec[FormItemSpacing])

  /** Defines the width proportion of the labels and fields of a form item by breakpoint.
    *
    * By default, the labels take 4/12 (or 1/3) of the form item in M,L and XL sizes, and 12/12 in S size, e.g in S the
    * label is on top of its associated field.
    *
    * The supported values are between 1 and 12. Greater the number, more space the label will use.
    *
    * **Note:** If "12" is set, the label will be displayed on top of its assosiated field.
    *
    * Default: "S12 M4 L4 XL4"
    */
  lazy val labelSpan: HtmlAttr[String] = htmlAttr("label-span", StringAsIsCodec)

  /** Defines the number of columns to distribute the form content by breakpoint.
    *
    * Supported values:
    *   - `S` - 1 column by default (1 column is recommended)
    *   - `M` - 1 column by default (up to 2 columns are recommended)
    *   - `L` - 2 columns by default (up to 3 columns are recommended)
    *   - `XL` - 3 columns by default (up to 6 columns are recommended)
    *
    * Default: "S1 M1 L2 XL3"
    */
  lazy val layout: HtmlAttr[String] = htmlAttr("layout", StringAsIsCodec)

  // -- Events --

  // -- Slots --

  /** Defines the component header area.
    *
    * **Note:** When a `header` is provided, the `headerText` property is ignored.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="header"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
