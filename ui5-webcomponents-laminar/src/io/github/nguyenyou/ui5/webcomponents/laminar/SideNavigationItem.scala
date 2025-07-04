package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.SideNavigationItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.SideNavigationItem as SideNavigationItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SideNavigationItem extends WebComponent("ui5-side-navigation-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SideNavigationItem.type

  type Ref = SideNavigationItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Item design.
    *
    * **Note:** Items with "Action" design must not have sub-items.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[SideNavigationItemDesign] = htmlAttr("design", StringUnionCodec[SideNavigationItemDesign])

  /** Defines whether the component is disabled. A disabled component can't be pressed or focused, and it is not in the
    * tab chain.
    *
    * **Note:** Available since [v1.19.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.19.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines if the item is expanded
    *
    * Default: false
    */
  lazy val expanded: HtmlAttr[Boolean] = htmlAttr("expanded", BooleanAsAttrPresenceCodec)

  /** Defines the link target URI. Supports standard hyperlink behavior. If a JavaScript action should be triggered,
    * this should not be set, but instead an event handler for the `click` event should be registered.
    *
    * **Note:** Available since [v1.19.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.19.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Defines the icon of the item.
    *
    * The SAP-icons font provides numerous options.
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines whether the item is selected.
    *
    * **Note:** Items that have a set `href` and `target` set to `_blank` should not be selectable.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the component target.
    *
    * Possible values:
    *
    *   - `_self`
    *   - `_top`
    *   - `_blank`
    *   - `_parent`
    *   - `framename`
    *
    * **Note:** Items that have a defined `href` and `target` attribute set to `_blank` should not be selectable.
    *
    * **Note:** Available since [v1.19.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.19.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  /** Defines the text of the item.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * A tooltip attribute should be provided, in order to represent meaning/function, when the component is collapsed
    * ("icon only" design is visualized) or the item text is truncated.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Indicates whether the navigation item is selectable. By default, all items are selectable unless specifically
    * marked as unselectable.
    *
    * When a parent item is marked as unselectable, selecting it will only expand or collapse its sub-items. To improve
    * user experience do not mix unselectable parent items with selectable parent items in a single side navigation.
    *
    * **Guidelines**:
    *   - Items with an assigned `href` and a target of `_blank` should be marked as unselectable.
    *   - Items that trigger actions (with design "Action") should be marked as unselectable.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val unselectable: HtmlAttr[Boolean] = htmlAttr("unselectable", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the component is activated either with a click/tap or by using the [Enter] or [Space] keys.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[SideNavigationItemClickEventDetail]] = new EventProp(
    "click"
  )

  // -- Slots --

}
