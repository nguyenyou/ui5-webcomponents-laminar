package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.FlexibleColumnLayout as FlexibleColumnLayoutComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.FlexibleColumnLayoutLayoutChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FlexibleColumnLayout extends WebComponent("ui5-flexible-column-layout") {

  @JSImport("@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FlexibleColumnLayout.type

  type Ref = FlexibleColumnLayoutComponent with dom.HTMLElement

  // -- Attributes --

  /** Specifies if the user is allowed to change the columns layout by dragging the separator between the columns.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val disableResizing: HtmlAttr[Boolean] = htmlAttr("disable-resizing", BooleanAsAttrPresenceCodec)

  /** Defines the columns layout and their proportion.
    *
    * **Note:** The layout also depends on the screen size - one column for screens smaller than 599px, two columns
    * between 599px and 1023px and three columns for sizes bigger than 1023px.
    *
    * **For example:** layout=`TwoColumnsStartExpanded` means the layout will display up to two columns in 67%/33%
    * proportion.
    *
    * Default: "OneColumn"
    */
  lazy val layout: HtmlAttr[FCLLayout] = htmlAttr("layout", StringUnionCodec[FCLLayout])
  type FCLLayout = "OneColumn" | "TwoColumnsStartExpanded" | "TwoColumnsMidExpanded" | "ThreeColumnsMidExpanded" |
    "ThreeColumnsEndExpanded" | "ThreeColumnsStartExpandedEndHidden" | "ThreeColumnsMidExpandedEndHidden" |
    "ThreeColumnsStartHiddenMidExpanded" | "ThreeColumnsStartHiddenEndExpanded" | "MidColumnFullScreen" |
    "EndColumnFullScreen"

  // -- Events --

  /** Fired when the layout changes via user interaction by dragging the separators or by changing the component size
    * due to resizing.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLayoutChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[FlexibleColumnLayoutLayoutChangeEventDetail]] =
    new EventProp("layout-change")

  // -- Slots --

  /** Defines the content in the end column.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="endColumn"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val endColumn: Slot = new Slot("endColumn")

  /** Defines the content in the middle column.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="midColumn"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val midColumn: Slot = new Slot("midColumn")

  /** Defines the content in the start column.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="startColumn"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val startColumn: Slot = new Slot("startColumn")
}
