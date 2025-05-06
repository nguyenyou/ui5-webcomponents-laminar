package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPickerMod.{ColorPicker as ColorPickerComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ColorPicker extends WebComponent("ui5-color-picker") {

  @JSImport("@ui5/webcomponents/dist/ColorPicker.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ColorPicker.type

  type Ref = ColorPickerComponent with dom.HTMLElement

  // -- Attributes --

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

  /** When set to `true`, the alpha slider and inputs for RGB values will not be displayed.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val simplified: HtmlAttr[Boolean] = htmlAttr("simplified", BooleanAsAttrPresenceCodec)

  /** Defines the currently selected color of the component.
    *
    * **Note**: use HEX, RGB, RGBA, HSV formats or a CSS color name when modifying this property.
    *
    * Default: "rgba(255,255,255,1)"
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  /** Fired when the the selected color is changed
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
