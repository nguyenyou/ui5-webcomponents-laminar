package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormGroupMod.{FormGroup as FormGroupComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FormGroup extends WebComponent("ui5-form-group") {

  @JSImport("@ui5/webcomponents/dist/FormGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FormGroup.type

  type Ref = FormGroupComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines column span of the component, e.g how many columns the group should span to.
    *
    * Default: undefined
    */
  lazy val columnSpan: HtmlAttr[Double] = htmlAttr("column-span", DoubleAsStringCodec)

  /** Defines header text of the component.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
