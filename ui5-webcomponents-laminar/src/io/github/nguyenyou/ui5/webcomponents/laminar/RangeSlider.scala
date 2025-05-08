package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distRangeSliderMod.RangeSlider as RangeSliderComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object RangeSlider extends WebComponent("ui5-range-slider") {

  @JSImport("@ui5/webcomponents/dist/RangeSlider.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = RangeSlider.type

  type Ref = RangeSliderComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.4.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines whether the slider is in disabled state.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Indicates whether input fields should be used as tooltips for the handles.
    *
    * **Note:** Setting this option to true will only work if showTooltip is set to true. **Note:** In order for the
    * component to comply with the accessibility standard, it is recommended to set the editableTooltip property to
    * true.
    *
    * Default: false
    */
  lazy val editableTooltip: HtmlAttr[Boolean] = htmlAttr("editable-tooltip", BooleanAsAttrPresenceCodec)

  /** Defines end point of a selection - position of a second handle on the slider.
    *
    * Default: 100
    */
  lazy val endValue: HtmlAttr[Double] = htmlAttr("end-value", DoubleAsStringCodec)

  /** Displays a label with a value on every N-th step.
    *
    * **Note:** The step and tickmarks properties must be enabled. Example - if the step value is set to 2 and the label
    * interval is also specified to 2 - then every second tickmark will be labelled, which means every 4th value number.
    *
    * Default: 0
    */
  lazy val labelInterval: HtmlAttr[Double] = htmlAttr("label-interval", DoubleAsStringCodec)

  /** Defines the maximum value of the slider.
    *
    * Default: 100
    */
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)

  /** Defines the minimum value of the slider.
    *
    * Default: 0
    */
  lazy val min: HtmlAttr[Double] = htmlAttr("min", DoubleAsStringCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Enables tickmarks visualization for each step.
    *
    * **Note:** The step must be a positive number.
    *
    * Default: false
    */
  lazy val showTickmarks: HtmlAttr[Boolean] = htmlAttr("show-tickmarks", BooleanAsAttrPresenceCodec)

  /** Enables handle tooltip displaying the current value.
    *
    * Default: false
    */
  lazy val showTooltip: HtmlAttr[Boolean] = htmlAttr("show-tooltip", BooleanAsAttrPresenceCodec)

  /** Defines start point of a selection - position of a first handle on the slider.
    *
    * Default: 0
    */
  lazy val startValue: HtmlAttr[Double] = htmlAttr("start-value", DoubleAsStringCodec)

  /** Defines the size of the slider's selection intervals (e.g. min = 0, max = 10, step = 5 would result in possible
    * selection of the values 0, 5, 10).
    *
    * **Note:** If set to 0 the slider handle movement is disabled. When negative number or value other than a number,
    * the component fallbacks to its default value.
    *
    * Default: 1
    */
  lazy val step: HtmlAttr[Double] = htmlAttr("step", DoubleAsStringCodec)

  // -- Events --

  /** Fired when the value changes and the user has finished interacting with the slider.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  /** Fired when the value changes due to user interaction that is not yet finished - during mouse/touch dragging.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  // -- Slots --

}
