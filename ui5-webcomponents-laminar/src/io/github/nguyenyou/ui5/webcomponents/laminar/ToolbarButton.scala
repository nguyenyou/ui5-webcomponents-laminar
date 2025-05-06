package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarButtonMod.ToolbarButtonAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonDesignMod.ButtonDesign
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarButtonMod.ToolbarButton as ToolbarButtonComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToolbarButton extends WebComponent("ui5-toolbar-button") {

  @JSImport("@ui5/webcomponents/dist/ToolbarButton.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ToolbarButton.type

  type Ref = ToolbarButtonComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines the action design.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[ButtonDesign] = htmlAttr("design", StringUnionCodec[ButtonDesign])
  type ButtonDesign = "Default" | "Positive" | "Negative" | "Transparent" | "Emphasized" | "Attention"

  /** Defines if the action is disabled.
    *
    * **Note:** a disabled action can't be pressed or focused, and it is not in the tab chain.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the icon, displayed as graphical element within the component after the button text.
    *
    * **Note:** It is highly recommended to use `endIcon` property only together with `icon` and/or `text` properties.
    * Usage of `endIcon` only should be avoided.
    *
    * The SAP-icons font provides numerous options.
    *
    * Example: See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val endIcon: HtmlAttr[IconName] = htmlAttr("end-icon", IconName.AsStringCodec)

  /** Defines the `icon` source URI.
    *
    * **Note:** SAP-icons font provides numerous buil-in icons. To find all the available icons, see the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Property used to define the access of the item to the overflow Popover. If "NeverOverflow" option is set, the item
    * never goes in the Popover, if "AlwaysOverflow" - it never comes out of it.
    *
    * Default: "Default"
    */
  lazy val overflowPriority: HtmlAttr[ToolbarItemOverflowBehavior] =
    htmlAttr("overflow-priority", StringUnionCodec[ToolbarItemOverflowBehavior])
  type ToolbarItemOverflowBehavior = "Default" | "NeverOverflow" | "AlwaysOverflow"

  /** Defines if the toolbar overflow popup should close upon intereaction with the item. It will close by default.
    *
    * Default: false
    */
  lazy val preventOverflowClosing: HtmlAttr[Boolean] = htmlAttr("prevent-overflow-closing", BooleanAsAttrPresenceCodec)

  /** Button text
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * **Note:** A tooltip attribute should be provided for icon-only buttons, in order to represent their exact
    * meaning/function.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the width of the button.
    *
    * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
    *
    * Default: undefined
    */
  lazy val width: HtmlAttr[String] = htmlAttr("width", StringAsIsCodec)

  // -- Events --

  /** Fired when the component is activated either with a mouse/tap or by using the Enter or Space key.
    *
    * **Note:** The event will not be fired if the `disabled` property is set to `true`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

}
