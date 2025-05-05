package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.ListItemAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemTypeMod.ListItemType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemStandardMod.{
  ListItemStandard as ListItemStandardComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ListItemStandard extends WebComponent("ui5-li") {

  @JSImport("@ui5/webcomponents/dist/ListItemStandard.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ListItemStandard.type

  type Ref = ListItemStandardComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the text alternative of the component. Note: If not provided a
    * default text alternative will be set, if present.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the `additionalText`, displayed in the end of the list item.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] =
    htmlAttr("additional-text", StringAsIsCodec)

  /** Defines the state of the `additionalText`.
    *
    * Available options are: `"None"` (by default), `"Positive"`, `"Critical"`,
    * `"Information"` and `"Negative"`.
    *
    * Default: "None"
    */
  lazy val additionalTextState: HtmlAttr[ValueState] =
    htmlAttr("additional-text-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" |
    "Information"

  /** Defines the description displayed right under the item text, if such is
    * present.
    *
    * Default: undefined
    */
  lazy val description: HtmlAttr[String] =
    htmlAttr("description", StringAsIsCodec)

  /** Defines the highlight state of the list items. Available options are:
    * `"None"` (by default), `"Positive"`, `"Critical"`, `"Information"` and
    * `"Negative"`.
    *
    * **Note:** Available since
    * [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents**.
    *
    * Default: "None"
    */
  lazy val highlight: HtmlAttr[Highlight] =
    htmlAttr("highlight", StringUnionCodec[Highlight])
  type Highlight = "None" | "Positive" | "Critical" | "Negative" | "Information"

  /** Defines the `icon` source URI.
    *
    * **Note:** SAP-icons font provides numerous built-in icons. To find all the
    * available icons, see the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines whether the `icon` should be displayed in the beginning of the
    * list item or in the end.
    *
    * Default: false
    */
  lazy val iconEnd: HtmlAttr[Boolean] =
    htmlAttr("icon-end", BooleanAsAttrPresenceCodec)

  /** Defines whether the item is movable.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val movable: HtmlAttr[Boolean] =
    htmlAttr("movable", BooleanAsAttrPresenceCodec)

  /** The navigated state of the list item. If set to `true`, a navigation
    * indicator is displayed at the end of the list item.
    *
    * **Note:** Available since
    * [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0)
    * of **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val navigated: HtmlAttr[Boolean] =
    htmlAttr("navigated", BooleanAsAttrPresenceCodec)

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] =
    htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the tooltip that would be displayed for the list item.
    *
    * **Note:** Available since
    * [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0)
    * of **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the visual indication and behavior of the list items. Available
    * options are `Active` (by default), `Inactive`, `Detail` and `Navigation`.
    *
    * **Note:** When set to `Active` or `Navigation`, the item will provide
    * visual response upon press and hover, while with type `Inactive` and
    * `Detail` - will not.
    *
    * Default: "Active"
    */
  lazy val tpe: HtmlAttr[ListItemType] =
    htmlAttr("type", StringUnionCodec[ListItemType])
  type ListItemType = "Inactive" | "Active" | "Detail" | "Navigation"

  // -- Events --

  /** Fired when the user clicks on the detail button when type is `Detail`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onDetailClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp(
    "detail-click"
  )

  // -- Slots --

  /** Defines the delete button, displayed in "Delete" mode. **Note:** While the
    * slot allows custom buttons, to match design guidelines, please use the
    * `Button` component. **Note:** When the slot is not present, a built-in
    * delete button will be displayed.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="deleteButton"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since
    * [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents**.
    */
  lazy val deleteButton: Slot = new Slot("deleteButton")

  /** **Note:** While the slot allows option for setting custom avatar, to match
    * the design guidelines, please use the `Avatar` with it's default size - S.
    *
    * **Note:** If bigger `Avatar` needs to be used, then the size of the
    * `ListItemStandard` should be customized in order to fit.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="image"`). Since you can't change the DOM order of slots
    * when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing
    * problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    */
  lazy val image: Slot = new Slot("image")
}
