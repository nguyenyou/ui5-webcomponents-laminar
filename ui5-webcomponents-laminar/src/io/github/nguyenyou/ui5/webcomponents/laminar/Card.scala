package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCardMod.Card as CardComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Card extends WebComponent("ui5-card") {

  @JSImport("@ui5/webcomponents/dist/Card.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Card.type

  type Ref = CardComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible name of the component, which is used as the name of the card region and should be unique
    * per card.
    *
    * **Note:** `accessibleName` should be always set, unless `accessibleNameRef` is set.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines if a loading indicator would be displayed over the card.
    *
    * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will show up for this card.
    *
    * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of
    * **@ui5/webcomponents**.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  // -- Events --

  // -- Slots --

  /** Defines the header of the component.
    *
    * **Note:** Use `CardHeader` for the intended design.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="header"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
