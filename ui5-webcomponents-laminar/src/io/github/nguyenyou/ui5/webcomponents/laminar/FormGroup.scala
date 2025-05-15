package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormGroupMod.FormGroup as FormGroupComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FormGroup extends WebComponent("ui5-form-group") {

  @JSImport("@ui5/webcomponents/dist/FormGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FormGroup.type

  type Ref = FormGroupComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines column span of the component, e.g how many columns the group should span to.
    *
    * Default: undefined
    */
  lazy val columnSpan: HtmlAttr[Double] = htmlAttr("column-span", DoubleAsStringCodec)

  /** Defines the compoennt heading level, set by the `headerText`.
    *
    * **Note:** Available since [v2.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "H3"
    */
  lazy val headerLevel: HtmlAttr[TitleLevel] = htmlAttr("header-level", StringUnionCodec[TitleLevel])

  /** Defines header text of the component.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
