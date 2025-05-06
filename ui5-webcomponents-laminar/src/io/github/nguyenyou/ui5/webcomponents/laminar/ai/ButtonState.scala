package io.github.nguyenyou.ui5.webcomponents.laminar.ai

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.IconName
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distButtonStateMod.ButtonState as ButtonStateComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ButtonState extends WebComponent("ui5-ai-button-state") {

  @JSImport("@ui5/webcomponents-ai/dist/ButtonState.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ButtonState.type

  type Ref = ButtonStateComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the icon to be displayed as graphical element within the component after the text. The SAP-icons font
    * provides numerous options.
    *
    * **Example:**
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val endIcon: HtmlAttr[IconName] = htmlAttr("end-icon", IconName.AsStringCodec)

  /** Defines the icon to be displayed as graphical element within the component before the text. The SAP-icons font
    * provides numerous options.
    *
    * **Example:**
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the name of the button state.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines if the component is in split button mode.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val showArrowButton: HtmlAttr[Boolean] = htmlAttr("show-arrow-button", BooleanAsAttrPresenceCodec)

  /** Defines the text of the button in this state.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
