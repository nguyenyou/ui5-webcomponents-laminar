package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.{
  ViewSettingsDialogCancelEventDetail,
  ViewSettingsDialogConfirmEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.{
  ViewSettingsDialog as ViewSettingsDialogComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ViewSettingsDialog extends WebComponent("ui5-view-settings-dialog") {

  @JSImport(
    "@ui5/webcomponents-fiori/dist/ViewSettingsDialog.js",
    JSImport.Default
  )
  @js.native
  object RawImport extends js.Object

  type Self = ViewSettingsDialog.type

  type Ref = ViewSettingsDialogComponent with dom.HTMLElement

  // -- Attributes --

  /** Indicates if the dialog is open.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] =
    htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines the initial sort order.
    *
    * Default: false
    */
  lazy val sortDescending: HtmlAttr[Boolean] =
    htmlAttr("sort-descending", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired before the component is opened.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp(
    "before-open"
  )

  /** Fired when cancel button is activated.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onCancel: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ViewSettingsDialogCancelEventDetail]
  ] = new EventProp("cancel")

  /** Fired after the dialog is closed.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when confirmation button is activated.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onConfirm: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ViewSettingsDialogConfirmEventDetail]
  ] = new EventProp("confirm")

  /** Fired after the dialog is opened.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

  /** Defines the `filterItems` list.
    *
    * **Note:** If you want to use this slot, you need to import used item:
    * `import "@ui5/webcomponents-fiori/dist/FilterItem.js";`
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="filterItems"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val filterItems: Slot = new Slot("filterItems")

  /** Defines the list of items against which the user could sort data.
    *
    * **Note:** If you want to use this slot, you need to import used item:
    * `import "@ui5/webcomponents-fiori/dist/SortItem.js";`
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="sortItems"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val sortItems: Slot = new Slot("sortItems")
}
