package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonItemMod.{
  SegmentedButtonItem as SegmentedButtonItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SegmentedButtonItem extends WebComponent("ui5-segmented-button-item") {

  @JSImport("@ui5/webcomponents/dist/SegmentedButtonItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SegmentedButtonItem.type

  type Ref = SegmentedButtonItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note:** Available since
    * [v1.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] =
    htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is disabled. A disabled component can't be
    * selected or focused, and it is not in the tab chain.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the icon, displayed as graphical element within the component. The
    * SAP-icons font provides numerous options.
    *
    * Example: See all the available icons within the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Determines whether the component is displayed as selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] =
    htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the tooltip of the component.
    *
    * **Note:** A tooltip attribute should be provided for icon-only buttons, in
    * order to represent their exact meaning/function.
    *
    * **Note:** Available since
    * [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
