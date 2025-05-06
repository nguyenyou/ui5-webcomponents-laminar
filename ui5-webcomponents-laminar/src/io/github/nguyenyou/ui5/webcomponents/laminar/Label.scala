package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLabelMod.Label as LabelComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Label extends WebComponent("ui5-label") {

  @JSImport("@ui5/webcomponents/dist/Label.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Label.type

  type Ref = LabelComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the labeled input by providing its ID.
    *
    * **Note:** Can be used with both `Input` and native input.
    *
    * Default: undefined
    */
  lazy val forId: HtmlAttr[String] = htmlAttr("for", StringAsIsCodec)

  /** Defines whether an asterisk character is added to the component text.
    *
    * **Note:** Usually indicates that user input (bound with the `for` property) is required. In that case the
    * `required` property of the corresponding input should also be set.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines whether colon is added to the component text.
    *
    * **Note:** Usually used in forms.
    *
    * Default: false
    */
  lazy val showColon: HtmlAttr[Boolean] = htmlAttr("show-colon", BooleanAsAttrPresenceCodec)

  /** Defines how the text of a component will be displayed when there is not enough space.
    *
    * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])
  type WrappingType = "None" | "Normal"

  // -- Events --

  // -- Slots --

}
