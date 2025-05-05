package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.{WizardStep as WizardStepComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object WizardStep extends WebComponent("ui5-wizard-step") {

  @JSImport("@ui5/webcomponents-fiori/dist/WizardStep.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = WizardStep.type

  type Ref = WizardStepComponent with dom.HTMLElement

  // -- Attributes --

  /** When `branching` is enabled a dashed line would be displayed after the step, meant to indicate that the next step
    * is not yet known and depends on user choice in the current step.
    *
    * **Note:** It is recommended to use `branching` on the last known step and later add new steps when it becomes
    * clear how the wizard flow should continue.
    *
    * Default: false
    */
  lazy val branching: HtmlAttr[Boolean] = htmlAttr("branching", BooleanAsAttrPresenceCodec)

  /** Defines if the step is `disabled`. When disabled the step is displayed, but the user can't select the step by
    * clicking or navigate to it with scrolling.
    *
    * **Note:** Step can't be `selected` and `disabled` at the same time. In this case the `selected` property would
    * take precedence.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the `icon` of the step.
    *
    * **Note:** The icon is displayed in the `Wizard` navigation header.
    *
    * The SAP-icons font provides numerous options. See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the step's `selected` state - the step that is currently active.
    *
    * **Note:** Step can't be `selected` and `disabled` at the same time. In this case the `selected` property would
    * take precedence.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the `subtitleText` of the step.
    *
    * **Note:** the text is displayed in the `Wizard` navigation header.
    *
    * Default: undefined
    */
  lazy val subtitleText: HtmlAttr[String] = htmlAttr("subtitle-text", StringAsIsCodec)

  /** Defines the `titleText` of the step.
    *
    * **Note:** The text is displayed in the `Wizard` navigation header.
    *
    * Default: undefined
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
