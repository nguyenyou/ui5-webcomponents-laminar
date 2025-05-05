package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNavigationLayoutModeMod.NavigationLayoutMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNavigationLayoutMod.{
  NavigationLayout as NavigationLayoutComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object NavigationLayout extends WebComponent("ui5-navigation-layout") {

  @JSImport("@ui5/webcomponents-fiori/dist/NavigationLayout.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = NavigationLayout.type

  type Ref = NavigationLayoutComponent with dom.HTMLElement

  // -- Attributes --

  /** Specifies the navigation layout mode.
    *
    * Default: "Auto"
    */
  lazy val mode: HtmlAttr[NavigationLayoutMode] = htmlAttr("mode", StringUnionCodec[NavigationLayoutMode])
  type NavigationLayoutMode = "Auto" | "Collapsed" | "Expanded"

  // -- Events --

  // -- Slots --

  /** Defines the header.
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

  /** Defines the side content.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="sideContent"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val sideContent: Slot = new Slot("sideContent")
}
