package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTimelineItemMod.{
  TimelineItem as TimelineItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TimelineItem extends WebComponent("ui5-timeline-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/TimelineItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TimelineItem.type

  type Ref = TimelineItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the icon to be displayed as graphical element within the
    * `TimelineItem`. SAP-icons font provides numerous options.
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the name of the item, displayed before the `title-text`.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines if the `name` is clickable.
    *
    * Default: false
    */
  lazy val nameClickable: HtmlAttr[Boolean] =
    htmlAttr("name-clickable", BooleanAsAttrPresenceCodec)

  /** Defines the state of the icon displayed in the `TimelineItem`.
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "None"
    */
  lazy val state: HtmlAttr[ValueState] =
    htmlAttr("state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" |
    "Information"

  /** Defines the subtitle text of the component.
    *
    * Default: undefined
    */
  lazy val subtitleText: HtmlAttr[String] =
    htmlAttr("subtitle-text", StringAsIsCodec)

  /** Defines the title text of the component.
    *
    * Default: undefined
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --

  /** Fired when the item name is pressed either with a click/tap or by using
    * the Enter or Space key.
    *
    * **Note:** The event will not be fired if the `name-clickable` attribute is
    * not set.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onNameClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp(
    "name-click"
  )

  // -- Slots --

}
