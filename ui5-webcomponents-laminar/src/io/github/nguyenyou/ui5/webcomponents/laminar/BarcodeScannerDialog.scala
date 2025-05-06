package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distBarcodeScannerDialogMod.BarcodeScannerDialog as BarcodeScannerDialogComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distBarcodeScannerDialogMod.BarcodeScannerDialogScanErrorEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distBarcodeScannerDialogMod.BarcodeScannerDialogScanSuccessEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object BarcodeScannerDialog extends WebComponent("ui5-barcode-scanner-dialog") {

  @JSImport("@ui5/webcomponents-fiori/dist/BarcodeScannerDialog.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = BarcodeScannerDialog.type

  type Ref = BarcodeScannerDialogComponent with dom.HTMLElement

  // -- Attributes --

  /** Indicates whether the dialog is open.
    *
    * **Note:** Available since [v1.24.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the user closes the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fires when the scan fails with error.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onScanError: EventProp[Ui5CustomEvent[Ref] & EventDetail[BarcodeScannerDialogScanErrorEventDetail]] =
    new EventProp("scan-error")

  /** Fires when the scan is completed successfuuly.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onScanSuccess: EventProp[Ui5CustomEvent[Ref] & EventDetail[BarcodeScannerDialogScanSuccessEventDetail]] =
    new EventProp("scan-success")

  // -- Slots --

  /** Defines the footer HTML Element.
    *
    * **Note:** When you provide custom content for the `footer` slot, the default close button is not rendered. This
    * means you need to include your own mechanism within the custom `footer` to close the dialog, such as a button with
    * an event listener that closes the dialog.
    *
    * **Note:** If the `footer` slot is not provided, a default footer with a close button is rendered automatically,
    * allowing users to close the dialog without any additional implementation.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="footer"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.4.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val footer: Slot = new Slot("footer")

  /** Defines the header HTML Element.
    *
    * **Note:** If `header` slot is provided, the labelling of the dialog is a responsibility of the application
    * developer. `accessibleName` should be used.
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
    *
    * **Note:** Available since [v2.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.4.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val header: Slot = new Slot("header")
}
