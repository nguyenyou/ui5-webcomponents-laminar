package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.SideNavigationGroup as SideNavigationGroupComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SideNavigationGroup extends WebComponent("ui5-side-navigation-group") {

  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SideNavigationGroup.type

  type Ref = SideNavigationGroupComponent with dom.HTMLElement

  // -- Attributes --

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

  /** Defines the text of the item.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * A tooltip attribute should be provided, in order to represent meaning/function, when the component is
    * collapsed(icon only is visualized).
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
