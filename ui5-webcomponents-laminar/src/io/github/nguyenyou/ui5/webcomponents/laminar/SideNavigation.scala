package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.SideNavigationSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.{
  SideNavigation as SideNavigationComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SideNavigation extends WebComponent("ui5-side-navigation") {

  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigation.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SideNavigation.type

  type Ref = SideNavigationComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since
    * [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines whether the `SideNavigation` is expanded or collapsed.
    *
    * Default: false
    */
  lazy val collapsed: HtmlAttr[Boolean] =
    htmlAttr("collapsed", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the selection has changed via user interaction
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[SideNavigationSelectionChangeEventDetail]
  ] = new EventProp("selection-change")

  // -- Slots --

  /** Defines the fixed items at the bottom of the component.
    *
    * **Note:** In order to achieve the best user experience, it is recommended
    * that you keep the fixed items "flat" (do not pass sub-items)
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="fixedItems"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val fixedItems: Slot = new Slot("fixedItems")

  /** Defines the header of the `SideNavigation`.
    *
    * **Note:** The header is displayed when the component is expanded - the
    * property `collapsed` is false;
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="header"`). Since you can't change the DOM order of slots
    * when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing
    * problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
