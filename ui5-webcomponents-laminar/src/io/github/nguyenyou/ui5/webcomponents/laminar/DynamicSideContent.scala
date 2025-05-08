package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicSideContentMod.DynamicSideContent as DynamicSideContentComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicSideContentMod.DynamicSideContentAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicSideContentMod.DynamicSideContentLayoutChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DynamicSideContent extends WebComponent("ui5-dynamic-side-content") {

  @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = DynamicSideContent.type

  type Ref = DynamicSideContentComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines whether the component is in equal split mode. In this mode, the side and the main content take 50:50
    * percent of the container on all screen sizes except for phone, where the main and side contents are switching
    * visibility using the toggle method.
    *
    * Default: false
    */
  lazy val equalSplit: HtmlAttr[Boolean] = htmlAttr("equal-split", BooleanAsAttrPresenceCodec)

  /** Defines the visibility of the main content.
    *
    * Default: false
    */
  lazy val hideMainContent: HtmlAttr[Boolean] = htmlAttr("hide-main-content", BooleanAsAttrPresenceCodec)

  /** Defines the visibility of the side content.
    *
    * Default: false
    */
  lazy val hideSideContent: HtmlAttr[Boolean] = htmlAttr("hide-side-content", BooleanAsAttrPresenceCodec)

  /** Defines on which breakpoints the side content falls down below the main content.
    *
    * Default: "OnMinimumWidth"
    */
  lazy val sideContentFallDown: HtmlAttr[SideContentFallDown] =
    htmlAttr("side-content-fall-down", StringUnionCodec[SideContentFallDown])

  /** Defines whether the side content is positioned before the main content (left side in LTR mode), or after the the
    * main content (right side in LTR mode).
    *
    * Default: "End"
    */
  lazy val sideContentPosition: HtmlAttr[SideContentPosition] =
    htmlAttr("side-content-position", StringUnionCodec[SideContentPosition])

  /** Defines on which breakpoints the side content is visible.
    *
    * Default: "ShowAboveS"
    */
  lazy val sideContentVisibility: HtmlAttr[SideContentVisibility] =
    htmlAttr("side-content-visibility", StringUnionCodec[SideContentVisibility])

  // -- Events --

  /** Fires when the current breakpoint has been changed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLayoutChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[DynamicSideContentLayoutChangeEventDetail]] =
    new EventProp("layout-change")

  // -- Slots --

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
