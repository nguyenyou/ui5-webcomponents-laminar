package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarMod.Toolbar as ToolbarComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Toolbar extends WebComponent("ui5-toolbar") {

  @JSImport("@ui5/webcomponents/dist/Toolbar.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Toolbar.type

  type Ref = ToolbarComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the input.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Indicated the direction in which the Toolbar items will be aligned.
    *
    * Default: "End"
    */
  lazy val alignContent: HtmlAttr[ToolbarAlign] = htmlAttr("align-content", StringUnionCodec[ToolbarAlign])

  /** Defines the toolbar design.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Solid"
    */
  lazy val design: HtmlAttr[ToolbarDesign] = htmlAttr("design", StringUnionCodec[ToolbarDesign])

  // -- Events --

  // -- Slots --

}
