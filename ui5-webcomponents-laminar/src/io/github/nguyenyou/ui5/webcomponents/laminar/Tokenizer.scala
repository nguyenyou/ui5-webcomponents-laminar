package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.{
  TokenizerSelectionChangeEventDetail,
  TokenizerTokenDeleteEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.{Tokenizer as TokenizerComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Tokenizer extends WebComponent("ui5-tokenizer") {

  @JSImport("@ui5/webcomponents/dist/Tokenizer.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Tokenizer.type

  type Ref = TokenizerComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is disabled.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines whether tokens are displayed on multiple lines.
    *
    * **Note:** The `multiLine` property is in an experimental state and is a subject to change.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val multiLine: HtmlAttr[Boolean] = htmlAttr("multi-line", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether "Clear All" button is present. Ensure `multiLine` is enabled, otherwise `showClearAll` will have
    * no effect.
    *
    * **Note:** The `showClearAll` property is in an experimental state and is a subject to change.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val showClearAll: HtmlAttr[Boolean] = htmlAttr("show-clear-all", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when token selection is changed by user interaction
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[TokenizerSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  /** Fired when tokens are being deleted (delete icon, delete or backspace is pressed)
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onTokenDelete: EventProp[Ui5CustomEvent[Ref] & EventDetail[TokenizerTokenDeleteEventDetail]] = new EventProp(
    "token-delete"
  )

  // -- Slots --

}
