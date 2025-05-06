package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.List as ListComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListItemToggleEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.ListSelectionChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object List extends WebComponent("ui5-list") {

  @JSImport("@ui5/webcomponents/dist/List.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = List.type

  type Ref = ListComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible description of the component.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleDescription: HtmlAttr[String] = htmlAttr("accessible-description", StringAsIsCodec)

  /** Defines the IDs of the elements that describe the component.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleDescriptionRef: HtmlAttr[String] = htmlAttr("accessible-description-ref", StringAsIsCodec)

  /** Defines the accessible name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines the accessible role of the component.
    *
    * Default: "List"
    */
  lazy val accessibleRole: HtmlAttr[ListAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[ListAccessibleRole])
  type ListAccessibleRole = "List" | "Menu" | "Tree" | "ListBox"

  /** Defines the footer text.
    *
    * Default: undefined
    */
  lazy val footerText: HtmlAttr[String] = htmlAttr("footer-text", StringAsIsCodec)

  /** Defines whether the component will have growing capability either by pressing a `More` button, or via user scroll.
    * In both cases `load-more` event is fired.
    *
    * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, on IE the component will fallback to
    * `growing="Button"`.
    *
    * Default: "None"
    */
  lazy val growing: HtmlAttr[ListGrowingMode] = htmlAttr("growing", StringUnionCodec[ListGrowingMode])
  type ListGrowingMode = "Button" | "Scroll" | "None"

  /** Defines the text that will be displayed inside the growing button.
    *
    * **Note:** If not specified a built-in text will be displayed.
    *
    * **Note:** This property takes effect if the `growing` property is set to the `Button`.
    *
    * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val growingButtonText: HtmlAttr[String] = htmlAttr("growing-button-text", StringAsIsCodec)

  /** Defines the component header text.
    *
    * **Note:** If `header` is set this property is ignored.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Determines whether the component is indented.
    *
    * Default: false
    */
  lazy val indent: HtmlAttr[Boolean] = htmlAttr("indent", BooleanAsAttrPresenceCodec)

  /** Defines if the component would display a loading indicator over the list.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will show up for this component.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  /** Defines the text that is displayed when the component contains no items.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  /** Defines the selection mode of the component.
    *
    * Default: "None"
    */
  lazy val selectionMode: HtmlAttr[ListSelectionMode] = htmlAttr("selection-mode", StringUnionCodec[ListSelectionMode])
  type ListSelectionMode = "None" | "Single" | "SingleStart" | "SingleEnd" | "SingleAuto" | "Multiple" | "Delete"

  /** Defines the item separator style that is used.
    *
    * Default: "All"
    */
  lazy val separators: HtmlAttr[ListSeparator] = htmlAttr("separators", StringUnionCodec[ListSeparator])
  type ListSeparator = "All" | "Inner" | "None"

  // -- Events --

  /** Fired when an item is activated, unless the item's `type` property is set to `Inactive`.
    *
    * **Note**: This event is not triggered by interactions with selection components such as the checkboxes and radio
    * buttons, associated with non-default `selectionMode` values, or if any other **interactive** component (such as a
    * button or input) within the list item is directly clicked.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  /** Fired when the `Close` button of any item is clicked
    *
    * **Note:** This event is only applicable to list items that can be closed (such as notification list items), not to
    * be confused with `item-delete`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemCloseEventDetail]] = new EventProp(
    "item-close"
  )

  /** Fired when the Delete button of any item is pressed.
    *
    * **Note:** A Delete button is displayed on each item, when the component `selectionMode` property is set to
    * `Delete`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemDelete: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemDeleteEventDetail]] = new EventProp(
    "item-delete"
  )

  /** Fired when the `Toggle` button of any item is clicked.
    *
    * **Note:** This event is only applicable to list items that can be toggled (such as notification group list items).
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemToggle: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListItemToggleEventDetail]] = new EventProp(
    "item-toggle"
  )

  /** Fired when the user scrolls to the bottom of the list.
    *
    * **Note:** The event is fired when the `growing='Scroll'` property is enabled.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLoadMore: EventProp[Ui5CustomEvent[Ref]] = new EventProp("load-more")

  /** Fired when a movable list item is dropped onto a drop target.
    *
    * **Note:** `move` event is fired only if there was a preceding `move-over` with prevented default action.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onMove: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListMoveEventDetail]] = new EventProp("move")

  /** Fired when a movable list item is moved over a potential drop target during a dragging operation.
    *
    * If the new position is valid, prevent the default action of the event using `preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onMoveOver: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListMoveEventDetail]] = new EventProp("move-over")

  /** Fired when selection is changed by user interaction in `Single`, `SingleStart`, `SingleEnd` and `Multiple`
    * selection modes.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[ListSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the component header.
    *
    * **Note:** When `header` is set, the `headerText` property is ignored.
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
