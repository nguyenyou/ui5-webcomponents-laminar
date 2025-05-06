package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonBadgeMod.ButtonBadge as ButtonBadgeComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ButtonBadge extends WebComponent("ui5-button-badge") {

  @JSImport("@ui5/webcomponents/dist/ButtonBadge.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ButtonBadge.type

  type Ref = ButtonBadgeComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the badge placement and appearance.
    *   - **InlineText** - displayed inside the button after its text, and recommended for **compact** density.
    *   - **OverlayText** - displayed at the top-end corner of the button, and recommended for **cozy** density.
    *   - **AttentionDot** - displayed at the top-end corner of the button as a dot, and suitable for both **cozy** and
    *     **compact** densities.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "AttentionDot"
    */
  lazy val design: HtmlAttr[ButtonBadgeDesign] = htmlAttr("design", StringUnionCodec[ButtonBadgeDesign])
  type ButtonBadgeDesign = "InlineText" | "OverlayText" | "AttentionDot"

  /** Defines the text of the component.
    *
    * **Note:** Text is not applied when the `design` property is set to `AttentionDot`.
    *
    * **Note:** The badge component only accepts numeric values and the "+" symbol. Using other characters or formats
    * may result in unpredictable behavior, which is not guaranteed or supported.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
