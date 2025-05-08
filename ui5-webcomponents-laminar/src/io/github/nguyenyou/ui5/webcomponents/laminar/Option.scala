package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distOptionMod.Option as OptionComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Opt extends WebComponent("ui5-option") {

  @JSImport("@ui5/webcomponents/dist/Option.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Opt.type

  type Ref = OptionComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the `additionalText`, displayed in the end of the option.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] = htmlAttr("additional-text", StringAsIsCodec)

  /** Defines the `icon` source URI.
    *
    * **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the tooltip of the option.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the value of the `Select` inside an HTML Form element when this component is selected. For more
    * information on HTML Form support, see the `name` property of `Select`.
    *
    * Default: undefined
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
