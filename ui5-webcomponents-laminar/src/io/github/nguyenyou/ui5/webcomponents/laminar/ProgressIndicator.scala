package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distProgressIndicatorMod.{
  ProgressIndicator as ProgressIndicatorComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ProgressIndicator extends WebComponent("ui5-progress-indicator") {

  @JSImport("@ui5/webcomponents/dist/ProgressIndicator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ProgressIndicator.type

  type Ref = ProgressIndicatorComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since
    * [v1.16.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.16.0)
    * of **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Specifies the text value to be displayed in the bar.
    *
    * **Note:**
    *
    *   - If there is no value provided or the value is empty, the default
    *     percentage value is shown.
    *   - If `hideValue` property is `true` both the `displayValue` and `value`
    *     property values are not shown.
    *
    * Default: undefined
    */
  lazy val displayValue: HtmlAttr[String] =
    htmlAttr("display-value", StringAsIsCodec)

  /** Defines whether the component value is shown.
    *
    * Default: false
    */
  lazy val hideValue: HtmlAttr[Boolean] =
    htmlAttr("hide-value", BooleanAsAttrPresenceCodec)

  /** Specifies the numerical value in percent for the length of the component.
    *
    * **Note:** If a value greater than 100 is provided, the percentValue is set
    * to 100. In other cases of invalid value, percentValue is set to its
    * default of 0.
    *
    * Default: 0
    */
  lazy val value: HtmlAttr[Double] = htmlAttr("value", DoubleAsStringCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] =
    htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" |
    "Information"

  // -- Events --

  // -- Slots --

}
