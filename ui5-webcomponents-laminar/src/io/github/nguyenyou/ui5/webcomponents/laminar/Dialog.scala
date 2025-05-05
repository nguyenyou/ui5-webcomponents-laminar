package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.PopupBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopupAccessibleRoleMod.PopupAccessibleRole
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDialogMod.{Dialog as DialogComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Dialog extends WebComponent("ui5-dialog") {

  @JSImport("@ui5/webcomponents/dist/Dialog.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Dialog.type

  type Ref = DialogComponent with dom.HTMLElement

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
  type PopupAccessibleRole = "None" | "Dialog" | "AlertDialog"

  /** Determines whether the component is draggable. If this property is set to true, the Dialog will be draggable by
    * its header.
    *
    * **Note:** The component can be draggable only in desktop mode.
    *
    * **Note:** This property overrides the default HTML "draggable" attribute native behavior. When "draggable" is set
    * to true, the native browser "draggable" behavior is prevented and only the Dialog custom logic ("draggable by its
    * header") works.
    *
    * Default: false
    */
  lazy val draggable: HtmlAttr[Boolean] = htmlAttr("draggable", BooleanAsAttrPresenceCodec)

  /** Defines the header text.
    *
    * **Note:** If `header` slot is provided, the `headerText` is ignored.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Defines the ID of the HTML Element, which will get the initial focus.
    *
    * **Note:** If an element with `autofocus` attribute is added inside the component, `initialFocus` won't take
    * effect.
    *
    * Default: undefined
    */
  lazy val initialFocus: HtmlAttr[String] = htmlAttr("initial-focus", StringAsIsCodec)

  /** Indicates if the element is open
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

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

  /** Configures the component to be resizable. If this property is set to true, the Dialog will have a resize handle in
    * its bottom right corner in LTR languages. In RTL languages, the resize handle will be placed in the bottom left
    * corner.
    *
    * **Note:** The component can be resizable only in desktop mode.
    *
    * **Note:** Upon resizing, externally defined height and width styling will be ignored.
    *
    * Default: false
    */
  lazy val resizable: HtmlAttr[Boolean] = htmlAttr("resizable", BooleanAsAttrPresenceCodec)

  /** Defines the state of the `Dialog`.
    *
    * **Note:** If `"Negative"` and `"Critical"` states is set, it will change the accessibility role to "alertdialog",
    * if the accessibleRole property is set to `"Dialog"`.
    *
    * Default: "None"
    */
  lazy val state: HtmlAttr[ValueState] = htmlAttr("state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" | "Information"

  /** Determines if the dialog will be stretched to full screen on mobile. On desktop, the dialog will be stretched to
    * approximately 90% of the viewport.
    *
    * **Note:** For better usability of the component it is recommended to set this property to "true" when the dialog
    * is opened on phone.
    *
    * Default: false
    */
  lazy val stretch: HtmlAttr[Boolean] = htmlAttr("stretch", BooleanAsAttrPresenceCodec)

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
    * **Note:** When a `Bar` is used in the footer, you should remove the default dialog's paddings.
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
    * **Note:** When a `Bar` is used in the header, you should remove the default dialog's paddings.
    *
    * **Note:** If `header` slot is provided, the labelling of the dialog is a responsibility of the application
    * developer. `accessibleName` should be used.
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
