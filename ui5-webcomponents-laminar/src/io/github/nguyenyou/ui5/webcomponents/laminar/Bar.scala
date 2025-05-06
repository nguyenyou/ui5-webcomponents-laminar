package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarDesignMod.BarDesign
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBarMod.Bar as BarComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Bar extends WebComponent("ui5-bar") {

  @JSImport("@ui5/webcomponents/dist/Bar.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Bar.type

  type Ref = BarComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the component's design.
    *
    * Default: "Header"
    */
  lazy val design: HtmlAttr[BarDesign] = htmlAttr("design", StringUnionCodec[BarDesign])
  type BarDesign = "Header" | "Subheader" | "Footer" | "FloatingFooter"

  // -- Events --

  // -- Slots --

  /** Defines the content at the end of the bar.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="endContent"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val endContent: Slot = new Slot("endContent")

  /** Defines the content at the start of the bar.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="startContent"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val startContent: Slot = new Slot("startContent")
}
