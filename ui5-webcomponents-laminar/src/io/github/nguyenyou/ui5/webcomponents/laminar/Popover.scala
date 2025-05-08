package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.Popover as PopoverComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.PopupBeforeCloseEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Popover extends WebComponent("ui5-popover") {

  @JSImport("@ui5/webcomponents/dist/Popover.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Popover.type

  type Ref = PopoverComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the component.
    *
    * **Note:** Available since [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Allows setting a custom role.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Dialog"
    */
  lazy val accessibleRole: HtmlAttr[PopupAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[PopupAccessibleRole])

  /** Determines if there is no enough space, the component can be placed over the target.
    *
    * Default: false
    */
  lazy val allowTargetOverlap: HtmlAttr[Boolean] = htmlAttr("allow-target-overlap", BooleanAsAttrPresenceCodec)

  /** Defines the header text.
    *
    * **Note:** If `header` slot is provided, the `headerText` is ignored.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Determines whether the component arrow is hidden.
    *
    * Default: false
    */
  lazy val hideArrow: HtmlAttr[Boolean] = htmlAttr("hide-arrow", BooleanAsAttrPresenceCodec)

  /** Determines the horizontal alignment of the component.
    *
    * Default: "Center"
    */
  lazy val horizontalAlign: HtmlAttr[PopoverHorizontalAlign] =
    htmlAttr("horizontal-align", StringUnionCodec[PopoverHorizontalAlign])

  /** Defines the ID of the HTML Element, which will get the initial focus.
    *
    * **Note:** If an element with `autofocus` attribute is added inside the component, `initialFocus` won't take
    * effect.
    *
    * Default: undefined
    */
  lazy val initialFocus: HtmlAttr[String] = htmlAttr("initial-focus", StringAsIsCodec)

  /** Defines whether the component should close when clicking/tapping outside of the popover. If enabled, it blocks any
    * interaction with the background.
    *
    * Default: false
    */
  lazy val modal: HtmlAttr[Boolean] = htmlAttr("modal", BooleanAsAttrPresenceCodec)

  /** Indicates if the element is open
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines the ID or DOM Reference of the element at which the popover is shown. When using this attribute in a
    * declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
    * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val openerId: HtmlAttr[String] = htmlAttr("opener", StringAsIsCodec)

  /** Determines on which side the component is placed at.
    *
    * Default: "End"
    */
  lazy val placement: HtmlAttr[PopoverPlacement] = htmlAttr("placement", StringUnionCodec[PopoverPlacement])

  /** Defines if the focus should be returned to the previously focused element, when the popup closes.
    *
    * Default: false
    */
  lazy val preventFocusRestore: HtmlAttr[Boolean] = htmlAttr("prevent-focus-restore", BooleanAsAttrPresenceCodec)

  /** Indicates whether initial focus should be prevented.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val preventInitialFocus: HtmlAttr[Boolean] = htmlAttr("prevent-initial-focus", BooleanAsAttrPresenceCodec)

  /** Determines the vertical alignment of the component.
    *
    * Default: "Center"
    */
  lazy val verticalAlign: HtmlAttr[PopoverVerticalAlign] =
    htmlAttr("vertical-align", StringUnionCodec[PopoverVerticalAlign])

  // -- Events --

  /** Fired before the component is closed. This event can be cancelled, which will prevent the popup from closing.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[PopupBeforeCloseEventDetail]] = new EventProp(
    "before-close"
  )

  /** Fired before the component is opened. This event can be cancelled, which will prevent the popup from opening.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("before-open")

  /** Fired after the component is closed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired after the component is opened.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

  /** Defines the footer HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="footer"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val footer: Slot = new Slot("footer")

  /** Defines the header HTML Element.
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
