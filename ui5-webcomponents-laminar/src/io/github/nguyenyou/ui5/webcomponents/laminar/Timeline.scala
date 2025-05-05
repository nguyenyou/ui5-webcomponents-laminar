package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesTimelineGrowingModeMod.TimelineGrowingMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesTimelineLayoutMod.TimelineLayout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTimelineMod.{
  Timeline as TimelineComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Timeline extends WebComponent("ui5-timeline") {

  @JSImport("@ui5/webcomponents-fiori/dist/Timeline.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Timeline.type

  type Ref = TimelineComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since
    * [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines whether the Timeline will have growing capability either by
    * pressing a "More" button, or via user scroll. In both cases a `load-more`
    * event is fired.
    *
    * Available options:
    *
    * `Button` - Displays a button at the end of the Timeline, which when
    * pressed triggers the `load-more` event.
    *
    * `Scroll` -Triggers the `load-more` event when the user scrolls to the end
    * of the Timeline.
    *
    * `None` (default) - The growing functionality is off.
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "None"
    */
  lazy val growing: HtmlAttr[TimelineGrowingMode] =
    htmlAttr("growing", StringUnionCodec[TimelineGrowingMode])
  type TimelineGrowingMode = "Button" | "Scroll" | "None"

  /** Defines the items orientation.
    *
    * Default: "Vertical"
    */
  lazy val layout: HtmlAttr[TimelineLayout] =
    htmlAttr("layout", StringUnionCodec[TimelineLayout])
  type TimelineLayout = "Vertical" | "Horizontal"

  /** Defines if the component should display a loading indicator over the
    * Timeline.
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] =
    htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will
    * show up for this component.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] =
    htmlAttr("loading-delay", DoubleAsStringCodec)

  // -- Events --

  /** Fired when the user presses the `More` button or scrolls to the Timeline's
    * end.
    *
    * **Note:** The event will be fired if `growing` is set to `Button` or
    * `Scroll`.
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLoadMore: EventProp[Ui5CustomEvent[Ref]] = new EventProp(
    "load-more"
  )

  // -- Slots --

}
