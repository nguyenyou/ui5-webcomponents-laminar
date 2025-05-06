package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRatingIndicatorMod.RatingIndicator as RatingIndicatorComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object RatingIndicator extends WebComponent("ui5-rating-indicator") {

  @JSImport("@ui5/webcomponents/dist/RatingIndicator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = RatingIndicator.type

  type Ref = RatingIndicatorComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note:** Available since [v1.15.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.15.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is disabled.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** The number of displayed rating symbols.
    *
    * Default: 5
    */
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * **Note:** Available since [v1.15.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.15.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines the size of the component.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "M"
    */
  lazy val size: HtmlAttr[RatingIndicatorSize] = htmlAttr("size", StringUnionCodec[RatingIndicatorSize])
  type RatingIndicatorSize = "S" | "M" | "L"

  /** Defines the tooltip of the component.
    *
    * **Note:** Available since [v1.19.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.19.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** The indicated value of the rating.
    *
    * **Note:** If you set a number which is not round, it would be shown as follows:
    *
    *   - 1.0 - 1.2 -> 1
    *   - 1.3 - 1.7 -> 1.5
    *   - 1.8 - 1.9 -> 2
    *
    * Default: 0
    */
  lazy val value: HtmlAttr[Double] = htmlAttr("value", DoubleAsStringCodec)

  // -- Events --

  /** The event is fired when the value changes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
