package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.ListItemAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemCustomMod.ListItemCustom as ListItemCustomComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ListItemCustom extends WebComponent("ui5-li-custom") {

  @JSImport("@ui5/webcomponents/dist/ListItemCustom.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = ListItemCustom.type

  type Ref = ListItemCustomComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the text alternative of the component.
   * 
   * **Note**: If not provided a default text alternative will be set, if present.
   *
   * Default: undefined
   */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)
  /**
   * Defines the highlight state of the list items.
   * Available options are: `"None"` (by default), `"Positive"`, `"Critical"`, `"Information"` and `"Negative"`.
   *
   * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of **@ui5/webcomponents**.
   *
   * Default: "None"
   */
  lazy val highlight: HtmlAttr[Highlight] = htmlAttr("highlight", StringUnionCodec[Highlight])
  /**
   * Defines whether the item is movable.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
   * Default: false
   */
  lazy val movable: HtmlAttr[Boolean] = htmlAttr("movable", BooleanAsAttrPresenceCodec)
  /**
   * The navigated state of the list item.
   * If set to `true`, a navigation indicator is displayed at the end of the list item.
   *
   * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of **@ui5/webcomponents**.
   *
   * Default: false
   */
  lazy val navigated: HtmlAttr[Boolean] = htmlAttr("navigated", BooleanAsAttrPresenceCodec)
  /**
   * Defines the selected state of the component.
   *
   * Default: false
   */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  /**
   * Defines the text of the tooltip that would be displayed for the list item.
   *
   * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of **@ui5/webcomponents**.
   *
   * Default: undefined
   */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)
  /**
   * Defines the visual indication and behavior of the list items.
   * Available options are `Active` (by default), `Inactive`, `Detail` and `Navigation`.
   * 
   * **Note:** When set to `Active` or `Navigation`, the item will provide visual response upon press and hover,
   * while with type `Inactive` and `Detail` - will not.
   *
   * Default: "Active"
   */
  lazy val tpe: HtmlAttr[ListItemType] = htmlAttr("type", StringUnionCodec[ListItemType])

  // -- Events --

  /**
   * Fired when the user clicks on the detail button when type is `Detail`.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onDetailClick: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("detail-click")

  // -- Slots --

  /**
   * Defines the delete button, displayed in "Delete" mode.
   * **Note:** While the slot allows custom buttons, to match
   * design guidelines, please use the `Button` component.
   * **Note:** When the slot is not present, a built-in delete button will be displayed.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="deleteButton"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   *
   * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of **@ui5/webcomponents**.
   */
  lazy val deleteButton: Slot = new Slot("deleteButton")
}

