package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarItemMod.ShellBarItem as ShellBarItemComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarItemMod.ShellBarItemClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ShellBarItem extends WebComponent("ui5-shellbar-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ShellBarItem.type

  type Ref = ShellBarItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the count displayed in the top-right corner.
    *
    * Default: undefined
    */
  lazy val count: HtmlAttr[String] = htmlAttr("count", StringAsIsCodec)

  /** Defines the name of the item's icon.
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the item text.
    *
    * **Note:** The text is only displayed inside the overflow popover list view.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  /** Fired, when the item is pressed.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[ShellBarItemClickEventDetail]] = new EventProp("click")

  // -- Slots --

}
