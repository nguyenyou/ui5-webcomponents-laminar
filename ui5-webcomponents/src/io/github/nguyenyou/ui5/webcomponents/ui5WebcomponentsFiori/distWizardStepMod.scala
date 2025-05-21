package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWizardStepMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * A component that represents a logical step as part of the `ui5-wizard`.
    * It is meant to aggregate arbitrary HTML elements that form the content of a single step.
    *
    * ### Structure
    *
    * - Each wizard step has arbitrary content.
    * - Each wizard step might have texts - defined by the `titleText` and `subtitleText` properties.
    * - Each wizard step might have an icon - defined by the `icon` property.
    * - Each wizard step might display a number in place of the `icon`, when it's missing.
    *
    * ### Usage
    * The `ui5-wizard-step` component should be used only as slot of the `ui5-wizard` component
    * and should not be used standalone.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.10
    * @public
    * @slot {Node[]} default - Defines the step content.
    */
  @JSImport("@ui5/webcomponents-fiori/dist/WizardStep.js", JSImport.Default)
  @js.native
  open class default () extends WizardStep
  
  /**
    * @class
    *
    * ### Overview
    *
    * A component that represents a logical step as part of the `ui5-wizard`.
    * It is meant to aggregate arbitrary HTML elements that form the content of a single step.
    *
    * ### Structure
    *
    * - Each wizard step has arbitrary content.
    * - Each wizard step might have texts - defined by the `titleText` and `subtitleText` properties.
    * - Each wizard step might have an icon - defined by the `icon` property.
    * - Each wizard step might display a number in place of the `icon`, when it's missing.
    *
    * ### Usage
    * The `ui5-wizard-step` component should be used only as slot of the `ui5-wizard` component
    * and should not be used standalone.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.10
    * @public
    * @slot {Node[]} default - Defines the step content.
    */
  @js.native
  trait WizardStep
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * When `branching` is enabled a dashed line would be displayed after the step,
      * meant to indicate that the next step is not yet known and depends on user choice in the current step.
      *
      * **Note:** It is recommended to use `branching` on the last known step
      * and later add new steps when it becomes clear how the wizard flow should continue.
      * @default false
      * @public
      */
    var branching: Boolean = js.native
    
    /**
      * Defines if the step is `disabled`. When disabled the step is displayed,
      * but the user can't select the step by clicking or navigate to it with scrolling.
      *
      * **Note:** Step can't be `selected` and `disabled` at the same time.
      * In this case the `selected` property would take precedence.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Defines the `icon` of the step.
      *
      * **Note:** The icon is displayed in the `ui5-wizard` navigation header.
      *
      * The SAP-icons font provides numerous options.
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines the step's `selected` state - the step that is currently active.
      *
      * **Note:** Step can't be `selected` and `disabled` at the same time.
      * In this case the `selected` property would take precedence.
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    var stepContentAriaLabel: js.UndefOr[String] = js.native
    
    var stretch: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the `subtitleText` of the step.
      *
      * **Note:** the text is displayed in the `ui5-wizard` navigation header.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var subtitleText: js.UndefOr[String] = js.native
    
    /**
      * Defines the `titleText` of the step.
      *
      * **Note:** The text is displayed in the `ui5-wizard` navigation header.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var titleText: js.UndefOr[String] = js.native
  }
}
