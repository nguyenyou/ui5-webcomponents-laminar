package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaCurrent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Selectionchangerequested
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWizardTabMod {
  
  /**
    * @class
    *
    * ### Overview
    * Private component, used internally by the `ui5-wizard`
    * to represent a "step" in the navigation header of the `ui5-wizard`.
    *
    * ### Usage
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/WizardTab.js";` (imported with <ui5-wizard>)
    * @constructor
    * @extends UI5Element
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/WizardTab.js", JSImport.Default)
  @js.native
  open class default () extends WizardTab
  
  /**
    * @class
    *
    * ### Overview
    * Private component, used internally by the `ui5-wizard`
    * to represent a "step" in the navigation header of the `ui5-wizard`.
    *
    * ### Usage
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/WizardTab.js";` (imported with <ui5-wizard>)
    * @constructor
    * @extends UI5Element
    * @private
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait WizardTab
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _onclick(): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * @private
      */
    var _wizardTabAccInfo: js.UndefOr[WizardTabAccessibilityAttributes] = js.native
    
    def accInfo: WizardTabAccessibilityAttributes = js.native
    
    /**
      * Defines if the step's separator is active or not.
      * @default false
      * @private
      */
    var activeSeparator: Boolean = js.native
    
    /**
      * Defines if the step's separator is dashed or not.
      * @default false
      * @private
      */
    var branchingSeparator: Boolean = js.native
    
    /**
      * Defines if the step is `disabled` - the step is not responding to user interaction.
      * @default false
      * @private
      */
    var disabled: Boolean = js.native
    
    def effectiveTabIndex: js.UndefOr[`0` | `-1`] = js.native
    
    @JSName("eventDetails")
    var eventDetails_WizardTab: Selectionchangerequested = js.native
    
    /**
      * Defines the tabindex of the step.
      * @default "-1"
      * @private
      */
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    def hasTexts: js.UndefOr[String] = js.native
    
    /**
      * Defines if the step's separator is hidden or not.
      * @default false
      * @private
      */
    var hideSeparator: Boolean = js.native
    
    /**
      * Defines the `icon` of the step.
      * @default undefined
      * @private
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines the number that will be displayed in place of the `icon`, when it's missing.
      * @default undefined
      * @private
      */
    var number: js.UndefOr[String] = js.native
    
    /**
      * Defines if the step is `selected`.
      * @default false
      * @private
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the `subtitleText` of the step.
      * @default undefined
      * @private
      * @since 1.0.0-rc.15
      */
    var subtitleText: js.UndefOr[String] = js.native
    
    /**
      * Defines the `titleText` of the step.
      * @default undefined
      * @private
      * @since 1.0.0-rc.15
      */
    var titleText: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'ariaSetsize' | 'ariaPosinset' | 'ariaLabel' | 'ariaCurrent'> */
  trait WizardTabAccessibilityAttributes extends StObject {
    
    var ariaCurrent: js.UndefOr[AriaCurrent] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaPosinset: js.UndefOr[Double] = js.undefined
    
    var ariaSetsize: js.UndefOr[Double] = js.undefined
  }
  object WizardTabAccessibilityAttributes {
    
    inline def apply(): WizardTabAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardTabAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardTabAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setAriaCurrent(value: AriaCurrent): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaPosinset(value: Double): Self = StObject.set(x, "ariaPosinset", value.asInstanceOf[js.Any])
      
      inline def setAriaPosinsetUndefined: Self = StObject.set(x, "ariaPosinset", js.undefined)
      
      inline def setAriaSetsize(value: Double): Self = StObject.set(x, "ariaSetsize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetsizeUndefined: Self = StObject.set(x, "ariaSetsize", js.undefined)
    }
  }
}
