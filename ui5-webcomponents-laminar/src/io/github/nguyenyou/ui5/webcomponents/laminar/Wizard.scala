package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesWizardContentLayoutMod.WizardContentLayout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardMod.WizardStepChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardMod.Wizard as WizardComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Wizard extends WebComponent("ui5-wizard") {

  @JSImport("@ui5/webcomponents-fiori/dist/Wizard.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Wizard.type

  type Ref = WizardComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines how the content of the `Wizard` would be visualized.
    *
    * **Note:** Available since [v1.14.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.14.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "MultipleSteps"
    */
  lazy val contentLayout: HtmlAttr[WizardContentLayout] =
    htmlAttr("content-layout", StringUnionCodec[WizardContentLayout])
  type WizardContentLayout = "MultipleSteps" | "SingleStep"

  // -- Events --

  /** Fired when the step is changed by user interaction - either with scrolling, or by clicking on the steps within the
    * component header.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onStepChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[WizardStepChangeEventDetail]] = new EventProp(
    "step-change"
  )

  // -- Slots --

}
