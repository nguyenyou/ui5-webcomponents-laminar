package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.Tree as TreeComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemMouseoutEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemMouseoverEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeItemToggleEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeMoveEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeMod.TreeSelectionChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Tree extends WebComponent("ui5-tree") {

  @JSImport("@ui5/webcomponents/dist/Tree.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Tree.type

  type Ref = TreeComponent & dom.HTMLElement

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
    * **Note:** Available since [v1.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the component.
    *
    * **Note:** Available since [v1.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines the component footer text.
    *
    * Default: undefined
    */
  lazy val footerText: HtmlAttr[String] = htmlAttr("footer-text", StringAsIsCodec)

  /** Defines the component header text.
    *
    * **Note:** If the `header` slot is set, this property is ignored.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Defines the text that is displayed when the component contains no items.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  /** Defines the selection mode of the component. Since the tree uses a `List` to display its structure, the tree modes
    * are exactly the same as the list modes, and are all applicable.
    *
    * Default: "None"
    */
  lazy val selectionMode: HtmlAttr[ListSelectionMode] = htmlAttr("selection-mode", StringUnionCodec[ListSelectionMode])

  // -- Events --

  /** Fired when a tree item is activated.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  /** Fired when the Delete button of any tree item is pressed.
    *
    * **Note:** A Delete button is displayed on each item, when the component `selectionMode` property is set to
    * `Delete`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemDelete: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeItemDeleteEventDetail]] = new EventProp(
    "item-delete"
  )

  /** Fired when the mouse cursor leaves the tree item borders.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemMouseout: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeItemMouseoutEventDetail]] = new EventProp(
    "item-mouseout"
  )

  /** Fired when the mouse cursor enters the tree item borders.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemMouseover: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeItemMouseoverEventDetail]] = new EventProp(
    "item-mouseover"
  )

  /** Fired when a tree item is expanded or collapsed.
    *
    * **Note:** You can call `preventDefault()` on the event object to suppress the event, if needed. This may be handy
    * for example if you want to dynamically load tree items upon the user expanding a node. Even if you prevented the
    * event's default behavior, you can always manually call `toggle()` on a tree item.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemToggle: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeItemToggleEventDetail]] = new EventProp(
    "item-toggle"
  )

  /** Fired when a movable tree item is moved over a potential drop target during a drag-and-drop operation.
    *
    * If the new position is valid, prevent the default action of the event using `preventDefault()`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onMove: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeMoveEventDetail]] = new EventProp("move")

  /** Fired when a movable tree item is dropped onto a drop target.
    *
    * **Note:** The `move` event is fired only if there was a preceding `move-over` event with prevented default action.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onMoveOver: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeMoveEventDetail]] = new EventProp("move-over")

  /** Fired when selection is changed by user interaction in `Single`, `SingleStart`, `SingleEnd` and `Multiple` modes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[TreeSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the component header.
    *
    * **Note:** When the `header` slot is set, the `headerText` property is ignored.
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
