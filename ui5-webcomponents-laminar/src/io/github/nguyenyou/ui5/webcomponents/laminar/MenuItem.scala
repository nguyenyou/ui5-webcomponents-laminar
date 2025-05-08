package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuBeforeOpenEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuItem as MenuItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MenuItem extends WebComponent("ui5-menu-item") {

  @JSImport("@ui5/webcomponents/dist/MenuItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MenuItem.type

  type Ref = MenuItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.7.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the `additionalText`, displayed in the end of the menu item.
    *
    * **Note:** The additional text will not be displayed if there are items added in `items` slot or there are
    * components added to `endContent` slot.
    *
    * The priority of what will be displayed at the end of the menu item is as follows: sub-menu arrow (if there are
    * items added in `items` slot) -> components added in `endContent` -> text set to `additionalText`.
    *
    * **Note:** Available since [v1.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] = htmlAttr("additional-text", StringAsIsCodec)

  /** Defines whether `MenuItem` is in disabled state.
    *
    * **Note:** A disabled `MenuItem` is noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the highlight state of the list items. Available options are: `"None"` (by default), `"Positive"`,
    * `"Critical"`, `"Information"` and `"Negative"`.
    *
    * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents**.
    *
    * Default: "None"
    */
  lazy val highlight: HtmlAttr[Highlight] = htmlAttr("highlight", StringUnionCodec[Highlight])

  /** Defines the icon to be displayed as graphical element within the component. The SAP-icons font provides numerous
    * options.
    *
    * **Example:**
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will be displayed inside the corresponding
    * ui5-menu popover.
    *
    * **Note:** If set to `true` a `BusyIndicator` component will be displayed into the related one to the current
    * `MenuItem` sub-menu popover.
    *
    * **Note:** Available since [v1.13.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.13.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will be displayed inside the corresponding
    * ui5-menu popover.
    *
    * **Note:** Available since [v1.13.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.13.0) of
    * **@ui5/webcomponents**.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  /** The navigated state of the list item. If set to `true`, a navigation indicator is displayed at the end of the list
    * item.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val navigated: HtmlAttr[Boolean] = htmlAttr("navigated", BooleanAsAttrPresenceCodec)

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the tree item.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the text of the tooltip for the menu item.
    *
    * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the visual indication and behavior of the list items. Available options are `Active` (by default),
    * `Inactive`, `Detail` and `Navigation`.
    *
    * **Note:** When set to `Active` or `Navigation`, the item will provide visual response upon press and hover, while
    * with type `Inactive` and `Detail` - will not.
    *
    * Default: "Active"
    */
  lazy val tpe: HtmlAttr[ListItemType] = htmlAttr("type", StringUnionCodec[ListItemType])

  // -- Events --

  /** Fired before the menu is closed. This event can be cancelled, which will prevent the menu from closing.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[MenuBeforeCloseEventDetail]] = new EventProp(
    "before-close"
  )

  /** Fired before the menu is opened. This event can be cancelled, which will prevent the menu from opening.
    *
    * **Note:** Since 1.14.0 the event is also fired before a sub-menu opens.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeOpen: EventProp[Ui5CustomEvent[Ref] & EventDetail[MenuBeforeOpenEventDetail]] = new EventProp(
    "before-open"
  )

  /** Fired after the menu is closed.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when the user clicks on the detail button when type is `Detail`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onDetailClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("detail-click")

  /** Fired after the menu is opened.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

  /** Defines the delete button, displayed in "Delete" mode. **Note:** While the slot allows custom buttons, to match
    * design guidelines, please use the `Button` component. **Note:** When the slot is not present, a built-in delete
    * button will be displayed.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="deleteButton"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents**.
    */
  lazy val deleteButton: Slot = new Slot("deleteButton")

  /** Defines the components that should be displayed at the end of the menu item.
    *
    * **Note:** It is highly recommended to slot only components of type `Button`,`Link` or `Icon` in order to preserve
    * the intended design. If there are components added to this slot, and there is text set in `additionalText`, it
    * will not be displayed. If there are items added to `items` slot, nether `additionalText` nor components added to
    * this slot would be displayed.
    *
    * The priority of what will be displayed at the end of the menu item is as follows: sub-menu arrow (if there are
    * items added in `items` slot) -> components added in `endContent` -> text set to `additionalText`.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="endContent"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    */
  lazy val endContent: Slot = new Slot("endContent")
}
