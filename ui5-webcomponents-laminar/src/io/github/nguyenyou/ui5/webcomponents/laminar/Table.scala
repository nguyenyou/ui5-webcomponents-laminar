package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.{
  TableMoveEventDetail,
  TableRowActionClickEventDetail,
  TableRowClickEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableOverflowModeMod.TableOverflowMode
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.Table as TableComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Table extends WebComponent("ui5-table") {

  @JSImport("@ui5/webcomponents/dist/Table.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Table.type

  type Ref = TableComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Identifies the element (or elements) that labels the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines if the loading indicator should be shown.
    *
    * **Note:** When the component is loading, it is not interactive.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will show up for this component.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  /** Defines the text to be displayed when there are no rows in the component.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  /** Defines the mode of the <code>ui5-table</code> overflow behavior.
    *
    * Available options are:
    *
    * <code>Scroll</code> - Columns are shown as regular columns and horizontal scrolling is enabled. <code>Popin</code>
    * \- Columns are shown as pop-ins instead of regular columns.
    *
    * Default: "Scroll"
    */
  lazy val overflowMode: HtmlAttr[TableOverflowMode] = htmlAttr("overflow-mode", StringUnionCodec[TableOverflowMode])
  type TableOverflowMode = "Scroll" | "Popin"

  /** Defines the maximum number of row actions that is displayed, which determines the width of the row action column.
    *
    * **Note:** It is recommended to use a maximum of 3 row actions, as exceeding this limit may take up too much space
    * on smaller screens.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    *
    * Default: 0
    */
  lazy val rowActionCount: HtmlAttr[Double] = htmlAttr("row-action-count", DoubleAsStringCodec)

  // -- Events --

  /** Fired when a movable list item is dropped onto a drop target.
    *
    * **Notes:**
    *
    * The `move` event is fired only if there was a preceding `move-over` with prevented default action.
    *
    * If the dragging operation is a cross-browser operation or files are moved to a potential drop target, the `source`
    * parameter will be `null`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onMove: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableMoveEventDetail]] = new EventProp("move")

  /** Fired when a movable item is moved over a potential drop target during a dragging operation.
    *
    * If the new position is valid, prevent the default action of the event using `preventDefault()`.
    *
    * **Note:** If the dragging operation is a cross-browser operation or files are moved to a potential drop target,
    * the `source` parameter will be `null`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onMoveOver: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableMoveEventDetail]] = new EventProp("move-over")

  /** Fired when a row action is clicked.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onRowActionClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableRowActionClickEventDetail]] =
    new EventProp("row-action-click")

  /** Fired when an interactive row is clicked.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onRowClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableRowClickEventDetail]] = new EventProp(
    "row-click"
  )

  // -- Slots --

  /** Defines the features of the component.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="features"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val features: Slot = new Slot("features")

  /** Defines the header row of the component.
    *
    * **Note:** Use `TableHeaderRow` for the intended design.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="headerRow"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val headerRow: Slot = new Slot("headerRow")

  /** Defines the custom visualization if there is no data available.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="noData"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val noData: Slot = new Slot("noData")
}
