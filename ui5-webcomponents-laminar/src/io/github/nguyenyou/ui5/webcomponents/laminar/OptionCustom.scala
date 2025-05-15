package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distOptionCustomMod.OptionCustom as OptionCustomComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object OptionCustom extends WebComponent("ui5-option-custom") {

  @JSImport("@ui5/webcomponents/dist/OptionCustom.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = OptionCustom.type

  type Ref = OptionCustomComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the text, displayed inside the `Select` input filed
   * when the option gets selected.
   *
   * Default: undefined
   */
  lazy val displayText: HtmlAttr[String] = htmlAttr("display-text", StringAsIsCodec)
  /**
   * Defines the selected state of the component.
   *
   * Default: false
   */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  /**
   * Defines the tooltip of the option.
   *
   * Default: undefined
   */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)
  /**
   * Defines the value of the `Select` inside an HTML Form element when this component is selected.
   * For more information on HTML Form support, see the `name` property of `Select`.
   *
   * Default: undefined
   */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --


  // -- Slots --

}

