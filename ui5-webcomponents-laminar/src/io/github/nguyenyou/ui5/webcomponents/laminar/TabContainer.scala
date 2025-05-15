package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.{TabContainerMoveEventDetail,TabContainerTabSelectEventDetail}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.TabContainer as TabContainerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TabContainer extends WebComponent("ui5-tabcontainer") {

  @JSImport("@ui5/webcomponents/dist/TabContainer.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = TabContainer.type

  type Ref = TabContainerComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines whether the tab content is collapsed.
   *
   * Default: false
   */
  lazy val collapsed: HtmlAttr[Boolean] = htmlAttr("collapsed", BooleanAsAttrPresenceCodec)
  /**
   * Sets the background color of the Tab Container's content as `Solid`, `Transparent`, or `Translucent`.
   *
   * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of **@ui5/webcomponents**.
   *
   * Default: "Solid"
   */
  lazy val contentBackgroundDesign: HtmlAttr[BackgroundDesign] = htmlAttr("content-background-design", StringUnionCodec[BackgroundDesign])
  /**
   * Sets the background color of the Tab Container's header as `Solid`, `Transparent`, or `Translucent`.
   *
   * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of **@ui5/webcomponents**.
   *
   * Default: "Solid"
   */
  lazy val headerBackgroundDesign: HtmlAttr[BackgroundDesign] = htmlAttr("header-background-design", StringUnionCodec[BackgroundDesign])
  /**
   * Defines if automatic tab selection is deactivated.
   * 
   * **Note:** By default, if none of the child tabs have the `selected` property set, the first tab will be automatically selected.
   * Setting this property to `true` allows preventing this behavior.
   *
   * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of **@ui5/webcomponents**.
   *
   * Default: false
   */
  lazy val noAutoSelection: HtmlAttr[Boolean] = htmlAttr("no-auto-selection", BooleanAsAttrPresenceCodec)
  /**
   * Defines the overflow mode of the header (the tab strip). If you have a large number of tabs, only the tabs that can fit on screen will be visible.
   * All other tabs that can 't fit on the screen are available in an overflow tab "More".
   * 
   * **Note:**
   * Only one overflow at the end would be displayed by default,
   * but when set to `StartAndEnd`, there will be two overflows on both ends, and tab order will not change on tab selection.
   *
   * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of **@ui5/webcomponents**.
   *
   * Default: "End"
   */
  lazy val overflowMode: HtmlAttr[OverflowMode] = htmlAttr("overflow-mode", StringUnionCodec[OverflowMode])
  /**
   * Defines the alignment of the content and the `additionalText` of a tab.
   * 
   * **Note:**
   * The content and the `additionalText` would be displayed vertically by default,
   * but when set to `Inline`, they would be displayed horizontally.
   *
   * Default: "Standard"
   */
  lazy val tabLayout: HtmlAttr[TabLayout] = htmlAttr("tab-layout", StringUnionCodec[TabLayout])

  // -- Events --

  /**
   * Fired when element is moved to the tab container.
   * 
   * **Note:** `move` event is fired only if there was a preceding `move-over` with prevented default action.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onMove: EventProp[Ui5CustomEvent[Ref] & EventDetail[TabContainerMoveEventDetail]]  = new EventProp("move")
  /**
   * Fired when element is being moved over the tab container.
   * 
   * If the new position is valid, prevent the default action of the event using `preventDefault()`.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|✅|
   */
  lazy val onMoveOver: EventProp[Ui5CustomEvent[Ref] & EventDetail[TabContainerMoveEventDetail]]  = new EventProp("move-over")
  /**
   * Fired when a tab is selected.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|✅|
   */
  lazy val onTabSelect: EventProp[Ui5CustomEvent[Ref] & EventDetail[TabContainerTabSelectEventDetail]]  = new EventProp("tab-select")

  // -- Slots --

  /**
   * Defines the button which will open the overflow menu. If nothing is provided to this slot,
   * the default button will be used.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="overflowButton"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val overflowButton: Slot = new Slot("overflowButton")
  /**
   * Defines the button which will open the start overflow menu if available. If nothing is provided to this slot,
   * the default button will be used.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="startOverflowButton"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   *
   * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of **@ui5/webcomponents**.
   */
  lazy val startOverflowButton: Slot = new Slot("startOverflowButton")
}

