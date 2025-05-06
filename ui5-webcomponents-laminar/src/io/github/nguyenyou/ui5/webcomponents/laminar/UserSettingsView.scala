package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsViewMod.{
  UserSettingsView as UserSettingsViewComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserSettingsView extends WebComponent("ui5-user-settings-view") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsView.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UserSettingsView.type

  type Ref = UserSettingsViewComponent with dom.HTMLElement

  // -- Attributes --

  /** Indicates whether the view is secondary. It is relevant only if the view is used in `pages` slot of
    * `UserSettingsItem` and controls the visibility of the back button.
    *
    * Default: false
    */
  lazy val secondary: HtmlAttr[Boolean] = htmlAttr("secondary", BooleanAsAttrPresenceCodec)

  /** Defines whether the view is selected. There can be just one selected view at a time.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the title text of the user settings view.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
