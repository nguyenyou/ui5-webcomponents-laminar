package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPanelAccessibleRoleMod.PanelAccessibleRole
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPanelMod.Panel as PanelComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Panel extends WebComponent("ui5-panel") {

  @JSImport("@ui5/webcomponents/dist/Panel.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Panel.type

  type Ref = PanelComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Sets the accessible ARIA role of the component. Depending on the usage, you can change the role from the default
    * `Form` to `Region` or `Complementary`.
    *
    * Default: "Form"
    */
  lazy val accessibleRole: HtmlAttr[PanelAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[PanelAccessibleRole])
  type PanelAccessibleRole = "Complementary" | "Form" | "Region"

  /** Indicates whether the component is collapsed and only the header is displayed.
    *
    * Default: false
    */
  lazy val collapsed: HtmlAttr[Boolean] = htmlAttr("collapsed", BooleanAsAttrPresenceCodec)

  /** Determines whether the component is in a fixed state that is not expandable/collapsible by user interaction.
    *
    * Default: false
    */
  lazy val fixed: HtmlAttr[Boolean] = htmlAttr("fixed", BooleanAsAttrPresenceCodec)

  /** Defines the "aria-level" of component heading, set by the `headerText`.
    *
    * Default: "H2"
    */
  lazy val headerLevel: HtmlAttr[TitleLevel] = htmlAttr("header-level", StringUnionCodec[TitleLevel])
  type TitleLevel = "H1" | "H2" | "H3" | "H4" | "H5" | "H6"

  /** This property is used to set the header text of the component. The text is visible in both expanded and collapsed
    * states.
    *
    * **Note:** This property is overridden by the `header` slot.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Indicates whether the transition between the expanded and the collapsed state of the component is animated. By
    * default the animation is enabled.
    *
    * Default: false
    */
  lazy val noAnimation: HtmlAttr[Boolean] = htmlAttr("no-animation", BooleanAsAttrPresenceCodec)

  /** Indicates whether the Panel header is sticky or not. If stickyHeader is set to true, then whenever you scroll the
    * content or the application, the header of the panel will be always visible and a solid color will be used for its
    * design.
    *
    * Default: false
    */
  lazy val stickyHeader: HtmlAttr[Boolean] = htmlAttr("sticky-header", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the component is expanded/collapsed by user interaction.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onToggle: EventProp[Ui5CustomEvent[Ref]] = new EventProp("toggle")

  // -- Slots --

  /** Defines the component header area.
    *
    * **Note:** When a header is provided, the `headerText` property is ignored.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="header"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
