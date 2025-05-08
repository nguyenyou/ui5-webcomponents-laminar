package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSplitButtonMod.SplitButton as SplitButtonComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SplitButton extends WebComponent("ui5-split-button") {

  @JSImport("@ui5/webcomponents/dist/SplitButton.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SplitButton.type

  type Ref = SplitButtonComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines whether the arrow button should have the active state styles or not.
    *
    * **Note:** Available since [v1.21.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.21.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val activeArrowButton: HtmlAttr[Boolean] = htmlAttr("active-arrow-button", BooleanAsAttrPresenceCodec)

  /** Defines the component design.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[ButtonDesign] = htmlAttr("design", StringUnionCodec[ButtonDesign])

  /** Defines whether the component is disabled. A disabled component can't be pressed or focused, and it is not in the
    * tab chain.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the icon to be displayed as graphical element within the component. The SAP-icons font provides numerous
    * options.
    *
    * Example:
    *
    * See all available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  // -- Events --

  /** Fired when the user clicks on the arrow action.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onArrowClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("arrow-click")

  /** Fired when the user clicks on the default action.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

}
