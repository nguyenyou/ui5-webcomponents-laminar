package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.{
  UserMenuAccount as UserMenuAccountComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserMenuAccount extends WebComponent("ui5-user-menu-account") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserMenuAccount.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UserMenuAccount.type

  type Ref = UserMenuAccountComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the avatar initials of the user.
    *
    * Default: undefined
    */
  lazy val avatarInitials: HtmlAttr[String] = htmlAttr("avatar-initials", StringAsIsCodec)

  /** Defines the avatar image url of the user.
    */
  lazy val avatarSrc: HtmlAttr[String] = htmlAttr("avatar-src", StringAsIsCodec)

  /** Defines description of the user.
    */
  lazy val description: HtmlAttr[String] = htmlAttr("description", StringAsIsCodec)

  /** Indicates whether a loading indicator should be shown.
    *
    * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines if the user is selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines additional text of the user.
    */
  lazy val subtitleText: HtmlAttr[String] = htmlAttr("subtitle-text", StringAsIsCodec)

  /** Defines the title text of the user.
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
