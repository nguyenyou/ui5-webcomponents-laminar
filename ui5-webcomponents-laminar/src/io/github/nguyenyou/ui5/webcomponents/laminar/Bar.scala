package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBarMod.Bar as BarComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Bar extends WebComponent("ui5-bar") {

  @JSImport("@ui5/webcomponents/dist/Bar.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Bar.type

  type Ref = BarComponent & dom.HTMLElement

  // -- Attributes --

  /** Specifies the ARIA role applied to the component for accessibility purposes.
    *
    * **Note:**
    *
    *   - Set accessibleRole to "toolbar" only when the component contains two or more active, interactive elements
    *     (such as buttons, links, or input fields) within the bar.
    *
    *   - If there is only one or no active element, it is recommended to avoid using the "toolbar" role, as it implies
    *     a grouping of multiple interactive controls.
    *
    * **Note:** Available since [v2.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Toolbar"
    */
  lazy val accessibleRole: HtmlAttr[BarAccessibleRole] =
    htmlAttr("accessible-role", StringUnionCodec[BarAccessibleRole])

  /** Defines the component's design.
    *
    * Default: "Header"
    */
  lazy val design: HtmlAttr[BarDesign] = htmlAttr("design", StringUnionCodec[BarDesign])

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
