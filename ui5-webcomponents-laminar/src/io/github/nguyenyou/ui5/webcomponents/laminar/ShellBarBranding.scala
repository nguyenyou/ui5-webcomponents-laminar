package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarBrandingMod.ShellBarBranding as ShellBarBrandingComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ShellBarBranding extends WebComponent("ui5-shellbar-branding") {

  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarBranding.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ShellBarBranding.type

  type Ref = ShellBarBrandingComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the text alternative of the component. If not provided a default text alternative will be set, if present.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the component href.
    *
    * **Note:** Standard hyperlink behavior is supported.
    *
    * Default: undefined
    */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Defines the component target.
    *
    * **Notes:**
    *
    *   - `_self`
    *   - `_top`
    *   - `_blank`
    *   - `_parent`
    *   - `_search`
    *
    * **This property must only be used when the `href` property is set.**
    *
    * Default: undefined
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  // -- Events --

  /** Fired, when the logo is activated.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

  /** Defines the logo of the `ShellBar`. For example, you can use `ui5-avatar` or `img` elements as logo.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="logo"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val logo: Slot = new Slot("logo")
}
