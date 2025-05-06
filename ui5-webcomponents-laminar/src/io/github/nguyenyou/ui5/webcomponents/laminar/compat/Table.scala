package io.github.nguyenyou.ui5.webcomponents.laminar.compat

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.Table as TableComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.TablePopinChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.TableSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRowClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Table extends WebComponent("ui5-table") {

  @JSImport("@ui5/webcomponents-compat/dist/Table.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Table.type

  type Ref = TableComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines if the table is in busy state.
    *
    * In this state the component's opacity is reduced and busy indicator is displayed at the bottom of the table.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: false
    */
  lazy val busy: HtmlAttr[Boolean] = htmlAttr("busy", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the busy indicator will show up for this component.
    *
    * Default: 1000
    */
  lazy val busyDelay: HtmlAttr[Double] = htmlAttr("busy-delay", DoubleAsStringCodec)

  /** Defines whether the table will have growing capability either by pressing a `More` button, or via user scroll. In
    * both cases `load-more` event is fired.
    *
    * Available options:
    *
    * `Button` - Shows a `More` button at the bottom of the table, pressing of which triggers the `load-more` event.
    *
    * `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the table;
    *
    * `None` (default) - The growing is off.
    *
    * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, and the component will fallback to
    * `growing="Button"`.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: "None"
    */
  lazy val growing: HtmlAttr[TableGrowingMode] = htmlAttr("growing", StringUnionCodec[TableGrowingMode])
  type TableGrowingMode = "Button" | "Scroll" | "None"

  /** Defines the subtext that will be displayed under the `growingButtonText`.
    *
    * **Note:** This property takes effect if `growing` is set to `Button`.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: undefined
    */
  lazy val growingButtonSubtext: HtmlAttr[String] = htmlAttr("growing-button-subtext", StringAsIsCodec)

  /** Defines the text that will be displayed inside the growing button at the bottom of the table, meant for loading
    * more rows upon press.
    *
    * **Note:** If not specified a built-in text will be displayed.
    *
    * **Note:** This property takes effect if `growing` is set to `Button`.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: undefined
    */
  lazy val growingButtonText: HtmlAttr[String] = htmlAttr("growing-button-text", StringAsIsCodec)

  /** Defines if the value of `noDataText` will be diplayed when there is no rows present in the table.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: false
    */
  lazy val hideNoData: HtmlAttr[Boolean] = htmlAttr("hide-no-data", BooleanAsAttrPresenceCodec)

  /** Defines the mode of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: "None"
    */
  lazy val mode: HtmlAttr[TableMode] = htmlAttr("mode", StringUnionCodec[TableMode])
  type TableMode = "None" | "SingleSelect" | "MultiSelect"

  /** Defines the text that will be displayed when there is no data and `hideNoData` is not present.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  /** Determines whether the column headers remain fixed at the top of the page during vertical scrolling as long as the
    * Web Component is in the viewport.
    *
    * **Restrictions:**
    *
    *   - Browsers that do not support this feature:
    *
    *   - Internet Explorer
    *   - Microsoft Edge lower than version 41 (EdgeHTML 16)
    *   - Mozilla Firefox lower than version 59
    *
    *   - Scrolling behavior:
    *
    *   - If the Web Component is placed in layout containers that have the `overflow: hidden` or `overflow: auto` style
    *     definition, this can prevent the sticky elements of the Web Component from becoming fixed at the top of the
    *     viewport.
    *
    * Default: false
    */
  lazy val stickyColumnHeader: HtmlAttr[Boolean] = htmlAttr("sticky-column-header", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the user presses the `More` button or scrolls to the table's end.
    *
    * **Note:** The event will be fired if `growing` is set to `Button` or `Scroll`.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLoadMore: EventProp[Ui5CustomEvent[Ref]] = new EventProp("load-more")

  /** Fired when `TableColumn` is shown as a pop-in instead of hiding it.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onPopinChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[TablePopinChangeEventDetail]] = new EventProp(
    "popin-change"
  )

  /** Fired when a row in `Active` mode is clicked or `Enter` key is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onRowClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableRowClickEventDetail]] = new EventProp(
    "row-click"
  )

  /** Fired when selection is changed by user interaction in `SingleSelect` and `MultiSelect` modes.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the configuration for the columns of the component.
    *
    * **Note:** Use `TableColumn` for the intended design.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="columns"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val columns: Slot = new Slot("columns")
}
