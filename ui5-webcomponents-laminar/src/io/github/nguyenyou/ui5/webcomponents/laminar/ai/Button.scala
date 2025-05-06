package io.github.nguyenyou.ui5.webcomponents.laminar.ai

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.laminar.IconName
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distButtonMod.{Button as ButtonComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Button extends WebComponent("ui5-ai-button") {

  @JSImport("@ui5/webcomponents-ai/dist/Button.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Button.type

  type Ref = ButtonComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the active state of the arrow button in split mode. Set to true when the button is in split mode and a
    * menu with additional options is opened by the arrow button. Set back to false when the menu is closed.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val arrowButtonPressed: HtmlAttr[Boolean] = htmlAttr("arrow-button-pressed", BooleanAsAttrPresenceCodec)

  /** Defines the component design.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[ButtonDesign] = htmlAttr("design", StringUnionCodec[ButtonDesign])
  type ButtonDesign = "Default" | "Positive" | "Negative" | "Transparent" | "Emphasized" | "Attention"

  /** Defines whether the component is disabled. A disabled component can't be pressed or focused, and it is not in the
    * tab chain.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the current state of the component.
    *
    * Default: undefined
    */
  lazy val state: HtmlAttr[String] = htmlAttr("state", StringAsIsCodec)

  // -- Events --

  /** Fired when the component is in split mode and after the arrow button is activated either by clicking or tapping it
    * or by using the [Arrow Up] / [Arrow Down], [Alt] + [Arrow Up]/ [Arrow Down], or [F4] keyboard keys.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onArrowButtonClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("arrow-button-click")

  /** Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

}
