package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxItemGroupMod.ComboBoxItemGroup as ComboBoxItemGroupComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupMod.ListItemGroupMoveEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ComboBoxItemGroup extends WebComponent("ui5-cb-item-group") {

  @JSImport("@ui5/webcomponents/dist/ComboBoxItemGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ComboBoxItemGroup.type

  type Ref = ComboBoxItemGroupComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible name of the header.
    *
    * Default: undefined
    */
  lazy val headerAccessibleName: HtmlAttr[String] = htmlAttr("header-accessible-name", StringAsIsCodec)

  /** Defines the header text of the <code>ui5-li-group</code>.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  // -- Events --

  /** Fired when a movable list item is dropped onto a drop target.
    *
    * **Note:** `move` event is fired only if there was a preceding `move-over` with prevented default action.
    *
    * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onMove: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemGroupMoveEventDetail]] = new EventProp("move")

  /** Fired when a movable list item is moved over a potential drop target during a dragging operation.
    *
    * If the new position is valid, prevent the default action of the event using `preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onMoveOver: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemGroupMoveEventDetail]] = new EventProp(
    "move-over"
  )

  // -- Slots --

  /** Defines the header of the component.
    *
    * **Note:** Using this slot, the default header text of group and the value of `headerText` property will be
    * overwritten.
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
