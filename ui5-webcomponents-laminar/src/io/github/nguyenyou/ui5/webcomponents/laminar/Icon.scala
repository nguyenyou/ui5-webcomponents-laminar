package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distIconMod.Icon as IconComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Icon extends WebComponent("ui5-icon") {

  @JSImport("@ui5/webcomponents/dist/Icon.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Icon.type

  type Ref = IconComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the text alternative of the component. If not provided a default text alternative will be set, if present.
    *
    * **Note:** Every icon should have a text alternative in order to calculate its accessible name.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the component semantic design.
    *
    * **Note:** Available since [v1.9.2](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.2) of
    * **@ui5/webcomponents**.
    *
    * Default: "Default"
    */
  lazy val design: HtmlAttr[IconDesign] = htmlAttr("design", StringUnionCodec[IconDesign])
  type IconDesign = "Contrast" | "Critical" | "Default" | "Information" | "Negative" | "Neutral" | "NonInteractive" |
    "Positive"

  /** Defines the mode of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Decorative"
    */
  lazy val mode: HtmlAttr[IconMode] = htmlAttr("mode", StringUnionCodec[IconMode])
  type IconMode = "Image" | "Decorative" | "Interactive"

  /** Defines the unique identifier (icon name) of the component.
    *
    * To browse all available icons, see the [SAP
    * Icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html), [SAP Fiori
    * Tools](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT)
    * and [SAP Business Suite](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html)
    *
    * Example: `name='add'`, `name='delete'`, `name='employee'`.
    *
    * **Note:** To use the SAP Fiori Tools icons, you need to set the `tnt` prefix in front of the icon's name.
    *
    * Example: `name='tnt/antenna'`, `name='tnt/actor'`, `name='tnt/api'`.
    *
    * **Note:** To use the SAP Business Suite icons, you need to set the `business-suite` prefix in front of the icon's
    * name.
    *
    * Example: `name='business-suite/3d'`, `name='business-suite/1x2-grid-layout'`,
    * `name='business-suite/4x4-grid-layout'`.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[IconName] = htmlAttr("name", IconName.AsStringCodec)

  /** Defines whether the component should have a tooltip.
    *
    * **Note:** The tooltip text should be provided via the `accessible-name` property.
    *
    * Default: false
    */
  lazy val showTooltip: HtmlAttr[Boolean] = htmlAttr("show-tooltip", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

}
