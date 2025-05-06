package io.github.nguyenyou.ui5.webcomponents.laminar
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageHeaderMod.DynamicPageHeader as DynamicPageHeaderComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DynamicPageHeader extends WebComponent("ui5-dynamic-page-header") {

  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageHeader.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = DynamicPageHeader.type

  type Ref = DynamicPageHeaderComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
