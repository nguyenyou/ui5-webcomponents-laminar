package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Stepchange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ZIndex
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWizardMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-wizard` helps users to complete a complex task by dividing it into sections and guiding them through it.
    * It has two main areas - a navigation area at the top showing the step sequence and a content area below it.
    *
    * ### Structure
    * #### Navigation area
    * The top most area of the `ui5-wizard` is occupied by the navigation area.
    * It shows the sequence of steps, where the recommended number of steps is between 3 and 8 steps.
    *
    * -  Steps can have different visual representations - numbers or icons.
    * -  Steps might have labels for better readability - titleText and subTitleText.
    * -  Steps are defined by using the `ui5-wizard-step` as slotted element within the `ui5-wizard`.
    *
    * **Note:** If no selected step is defined, the first step will be auto selected.
    *
    * **Note:** If multiple selected steps are defined, the last step will be selected.
    *
    * ### Keyboard Handling
    * The user can navigate using the following keyboard shortcuts:
    *
    * #### Wizard Progress Navigation
    *
    * 	- [Left] or [Down] - Focus moves backward to the WizardProgressNavAnchors.
    * 	- [Up] or [Right] - Focus moves forward to the WizardProgressNavAnchor.
    * 	- [Space] / [Enter] or [Return] - Selects an active step
    * 	- [Home] or [PAGE UP] - Focus goes to the first step
    * 	- [End] or [PAGE DOWN] - Focus goes to the last step
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * #### Content
    * The content occupies the main part of the page. It can hold any type of HTML elements.
    * It's defined by using the `ui5-wizard-step` as slotted element within the `ui5-wizard`.
    *
    * ### Scrolling
    * The component handles user scrolling by selecting the closest step, based on the current scroll position
    * and scrolls to particular place, when the user clicks on the step within the navigation area.
    *
    * **Important:** In order the component's scrolling behaviour to work, it has to be limited from the outside parent element in terms of height.
    * The component or its parent has to be given percentage or absolute height. Otherwise, the component will be scrolled out with the entire page.
    *
    * **For example:**
    *
    * ```html
    * <ui5-dialog style="height: 80%">
    * 	<ui5-wizard></ui5-wizard>
    * </ui5-dialog>
    * ```
    *
    * #### Moving to next step
    * The `ui5-wizard-step` provides the necessary API and it's up to the user of the component to use it to move to the next step.
    * You have to set its `selected` property (and remove the `disabled` one if set) to `true`.
    * The `ui5-wizard` will automatically scroll to the content of the newly selected step.
    *
    * The Fiori 3 guidelines recommends having a "nextStep" button in the content area.
    * You can place a button, or any other type of element to trigger step change, inside the `ui5-wizard-step`,
    * and show/hide it when certain fields are filled or user defined criteria is met.
    *
    * ### Usage
    * #### When to use:
    * When the user has to accomplish a long or unfamiliar task.
    *
    * #### When not to use:
    * When the task has less than 3 steps.
    *
    * ### Responsive Behavior
    * On small widths the step's titleText, subtitleText and separators in the navigation area shrink and from particular point the steps are grouped together and overlap.
    * Tapping on them will show a popover to select the step to navigate to. On mobile device, the grouped steps are presented within a dialog.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/Wizard.js";` (includes <ui5-wizard-step/>)
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.10
    * @public
    * @csspart navigator - Used to style the progress navigator of the `ui5-wizard`.
    * @csspart step-content - Used to style a `ui5-wizard-step` container.
    */
  @JSImport("@ui5/webcomponents-fiori/dist/Wizard.js", JSImport.Default)
  @js.native
  open class default () extends Wizard
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/Wizard.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/Wizard.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait AccessibilityInformation extends StObject {
    
    var ariaLabel: String
    
    var ariaPosinset: Double
    
    var ariaSetsize: Double
  }
  object AccessibilityInformation {
    
    inline def apply(ariaLabel: String, ariaPosinset: Double, ariaSetsize: Double): AccessibilityInformation = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaPosinset = ariaPosinset.asInstanceOf[js.Any], ariaSetsize = ariaSetsize.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessibilityInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessibilityInformation] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaPosinset(value: Double): Self = StObject.set(x, "ariaPosinset", value.asInstanceOf[js.Any])
      
      inline def setAriaSetsize(value: Double): Self = StObject.set(x, "ariaSetsize", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepInfo extends StObject {
    
    var accInfo: AccessibilityInformation
    
    var activeSeparator: Boolean
    
    var branchingSeparator: Boolean
    
    var disabled: Boolean
    
    var hideSeparator: Boolean
    
    var icon: js.UndefOr[String] = js.undefined
    
    var number: Double
    
    var pos: Double
    
    var refStepId: String
    
    var selected: Boolean
    
    var styles: ZIndex
    
    var subtitleText: js.UndefOr[String] = js.undefined
    
    var titleText: js.UndefOr[String] = js.undefined
  }
  object StepInfo {
    
    inline def apply(
      accInfo: AccessibilityInformation,
      activeSeparator: Boolean,
      branchingSeparator: Boolean,
      disabled: Boolean,
      hideSeparator: Boolean,
      number: Double,
      pos: Double,
      refStepId: String,
      selected: Boolean,
      styles: ZIndex
    ): StepInfo = {
      val __obj = js.Dynamic.literal(accInfo = accInfo.asInstanceOf[js.Any], activeSeparator = activeSeparator.asInstanceOf[js.Any], branchingSeparator = branchingSeparator.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hideSeparator = hideSeparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], refStepId = refStepId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepInfo] (val x: Self) extends AnyVal {
      
      inline def setAccInfo(value: AccessibilityInformation): Self = StObject.set(x, "accInfo", value.asInstanceOf[js.Any])
      
      inline def setActiveSeparator(value: Boolean): Self = StObject.set(x, "activeSeparator", value.asInstanceOf[js.Any])
      
      inline def setBranchingSeparator(value: Boolean): Self = StObject.set(x, "branchingSeparator", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setHideSeparator(value: Boolean): Self = StObject.set(x, "hideSeparator", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRefStepId(value: String): Self = StObject.set(x, "refStepId", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: ZIndex): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setSubtitleText(value: String): Self = StObject.set(x, "subtitleText", value.asInstanceOf[js.Any])
      
      inline def setSubtitleTextUndefined: Self = StObject.set(x, "subtitleText", js.undefined)
      
      inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-wizard` helps users to complete a complex task by dividing it into sections and guiding them through it.
    * It has two main areas - a navigation area at the top showing the step sequence and a content area below it.
    *
    * ### Structure
    * #### Navigation area
    * The top most area of the `ui5-wizard` is occupied by the navigation area.
    * It shows the sequence of steps, where the recommended number of steps is between 3 and 8 steps.
    *
    * -  Steps can have different visual representations - numbers or icons.
    * -  Steps might have labels for better readability - titleText and subTitleText.
    * -  Steps are defined by using the `ui5-wizard-step` as slotted element within the `ui5-wizard`.
    *
    * **Note:** If no selected step is defined, the first step will be auto selected.
    *
    * **Note:** If multiple selected steps are defined, the last step will be selected.
    *
    * ### Keyboard Handling
    * The user can navigate using the following keyboard shortcuts:
    *
    * #### Wizard Progress Navigation
    *
    * 	- [Left] or [Down] - Focus moves backward to the WizardProgressNavAnchors.
    * 	- [Up] or [Right] - Focus moves forward to the WizardProgressNavAnchor.
    * 	- [Space] / [Enter] or [Return] - Selects an active step
    * 	- [Home] or [PAGE UP] - Focus goes to the first step
    * 	- [End] or [PAGE DOWN] - Focus goes to the last step
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * #### Content
    * The content occupies the main part of the page. It can hold any type of HTML elements.
    * It's defined by using the `ui5-wizard-step` as slotted element within the `ui5-wizard`.
    *
    * ### Scrolling
    * The component handles user scrolling by selecting the closest step, based on the current scroll position
    * and scrolls to particular place, when the user clicks on the step within the navigation area.
    *
    * **Important:** In order the component's scrolling behaviour to work, it has to be limited from the outside parent element in terms of height.
    * The component or its parent has to be given percentage or absolute height. Otherwise, the component will be scrolled out with the entire page.
    *
    * **For example:**
    *
    * ```html
    * <ui5-dialog style="height: 80%">
    * 	<ui5-wizard></ui5-wizard>
    * </ui5-dialog>
    * ```
    *
    * #### Moving to next step
    * The `ui5-wizard-step` provides the necessary API and it's up to the user of the component to use it to move to the next step.
    * You have to set its `selected` property (and remove the `disabled` one if set) to `true`.
    * The `ui5-wizard` will automatically scroll to the content of the newly selected step.
    *
    * The Fiori 3 guidelines recommends having a "nextStep" button in the content area.
    * You can place a button, or any other type of element to trigger step change, inside the `ui5-wizard-step`,
    * and show/hide it when certain fields are filled or user defined criteria is met.
    *
    * ### Usage
    * #### When to use:
    * When the user has to accomplish a long or unfamiliar task.
    *
    * #### When not to use:
    * When the task has less than 3 steps.
    *
    * ### Responsive Behavior
    * On small widths the step's titleText, subtitleText and separators in the navigation area shrink and from particular point the steps are grouped together and overlap.
    * Tapping on them will show a popover to select the step to navigate to. On mobile device, the grouped steps are presented within a dialog.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/Wizard.js";` (includes <ui5-wizard-step/>)
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.10
    * @public
    * @csspart navigator - Used to style the progress navigator of the `ui5-wizard`.
    * @csspart step-content - Used to style a `ui5-wizard-step` container.
    */
  @js.native
  trait Wizard
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Updates the expanded attribute for each ui5-wizard-tab based on the ui5-wizard width
      * @private
      */
    def _adjustHeaderOverflow(): Unit = js.native
    
    def _closeRespPopover(): Unit = js.native
    
    /**
      * Stores references to the grouped steps.
      * @private
      */
    var _groupedTabs: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default
      ] = js.native
    
    def _isGroupAtEnd(selectedStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default): Boolean = js.native
    
    def _isGroupAtStart(selectedStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default): Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onGroupedTabClick(e: MouseEvent): Unit = js.native
    
    @JSName("_onOverflowStepButtonClick")
    def _onOverflowStepButtonClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _onStepResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_onStepResize")
    var _onStepResize_Original: ResizeObserverCallback = js.native
    
    var _prevContentHeight: Double = js.native
    
    var _prevWidth: Double = js.native
    
    def _respPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _showPopover(
      oDomTarget: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default,
      isAtStart: Boolean
    ): Unit = js.native
    
    def _steps: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
      ] = js.native
    
    def _stepsInHeader: js.Array[StepInfo] = js.native
    
    def actionSheetStepsText: String = js.native
    
    def activeStepText: String = js.native
    
    def ariaLabelText: String = js.native
    
    def attachStepsResizeObserver(): Unit = js.native
    
    /**
      * Called upon `onScroll`.
      * Selects the closest step, based on the user scroll position.
      * @param scrollPos the current scroll position
      * @private
      */
    def changeSelectionByScroll(scrollPos: Double): Unit = js.native
    
    /**
      * Called upon `onSelectionChangeRequested`.
      * Selects the external step (ui5-wizard-step),
      * based on the clicked or activated via keyboard step in the header (ui5-wizard-tab).
      * @param stepInHeader the step equivalent in the header
      * @private
      */
    def changeSelectionByStepAction(stepInHeader: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default): js.Promise[Unit] = js.native
    
    def contentDOM: Element = js.native
    
    /**
      * Defines the height of the `ui5-wizard` content.
      * @private
      */
    var contentHeight: js.UndefOr[Double] = js.native
    
    /**
      * Defines how the content of the `ui5-wizard` would be visualized.
      * @public
      * @since 1.14.0
      * @default "MultipleSteps"
      */
    var contentLayout: /* template literal string: ${WizardContentLayout} */ String = js.native
    
    /**
      * Deselects all steps.
      * @private
      */
    def deselectAll(): Unit = js.native
    
    def detachStepsResizeObserver(): Unit = js.native
    
    def effectiveStepSwitchThreshold: Double = js.native
    
    def enabledSteps: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
      ] = js.native
    
    def enabledStepsInHeaderDOM: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default
      ] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Wizard: Stepchange = js.native
    
    /**
      * Returns to closest scroll position for the given step index.
      * @private
      * @param stepIndex the index of a step
      */
    def getClosestScrollPosByStepIndex(stepIndex: Double): Double = js.native
    
    /**
      * Returns the closest step index by given scroll position.
      * @private
      * @param scrollPos the scroll position
      */
    def getClosestStepIndexByScrollPos(scrollPos: Double): Double = js.native
    
    def getContentHeight(): Double = js.native
    
    /**
      * Returns the index of the last enabled step.
      * @private
      */
    def getLastEnabledStepIndex(): Double = js.native
    
    /**
      * Returns the index of the selected step.
      * @private
      */
    def getSelectedStepIndex(): Double = js.native
    
    def getStepAriaLabelText(
      step: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      ariaLabel: String
    ): String = js.native
    
    def getStepByRefId(refId: String): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default = js.native
    
    def getStepWrapperByIdx(idx: Double): HTMLElement = js.native
    
    def getStepWrapperByRefId(refId: String): HTMLElement = js.native
    
    /**
      * Returns an array of data objects, based on the user defined steps
      * to later build the steps (tabs) within the header.
      * @private
      */
    def getStepsInfo(): js.Array[StepInfo] = js.native
    
    def inactiveStepText: String = js.native
    
    def lastSelectedStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default | Null = js.native
    
    def listAriaLabelText: String = js.native
    
    def navAriaDescribedbyText: String = js.native
    
    def navAriaLabelText: String = js.native
    
    def navAriaRoleDescription: String = js.native
    
    def navStepDefaultHeading: String = js.native
    
    /**
      * Handles user scrolling with debouncing.
      * **Note:** the handler is bound in the template.
      * @private
      */
    def onScroll(e: Event): Unit = js.native
    
    /**
      * Handles user click on steps' tabs within the header.
      * **Note:** the handler is bound in the template.
      * @private
      */
    def onSelectionChangeRequested(e: CustomEvent): Unit = js.native
    
    /**
      * Handles when a step in the header is focused in order to update the `ItemNavigation`.
      * **Note:** the handler is bound in the template.
      * @private
      */
    def onStepInHeaderFocused(e: CustomEvent): Unit = js.native
    
    /**
      * Handles resize in order to:
      * (1) sync steps' scroll offset and selection
      * (2) adapt navition step header
      * @private
      */
    def onStepResize(): Unit = js.native
    
    def optionalStepText: String = js.native
    
    var previouslySelectedStepIndex: Double = js.native
    
    def progressNavigatorListDOM: Element = js.native
    
    /**
      * Scrolls to the content item within the `ui5-wizard` shadowDOM
      * by given step index.
      * @private
      * @param stepIndex the index of a step
      */
    def scrollToContentItem(stepIndex: Double): Unit = js.native
    
    /**
      * Scrolls to the content of the selected step, used in `onAfterRendering`.
      * @private
      */
    def scrollToSelectedStep(): Unit = js.native
    
    /**
      * Selects the first step.
      * @private
      */
    def selectFirstStep(): Unit = js.native
    
    /**
      * Selects the last step from multiple selected ones.
      * @private
      */
    def selectLastSelectedStep(): Unit = js.native
    
    def selectedStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default | Null = js.native
    
    var selectedStepIndex: Double = js.native
    
    def selectedSteps: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
      ] = js.native
    
    def selectedStepsCount: Double = js.native
    
    var selectionRequestedByClick: Boolean = js.native
    
    var selectionRequestedByScroll: Boolean = js.native
    
    def slottedSteps: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
      ] = js.native
    
    /**
      * Sorter method for sorting an array in ascending order.
      * @private
      */
    def sortAscending(a: Double, b: Double): `0` | `1` | `-1` = js.native
    
    var stepScrollOffsets: js.Array[Double] = js.native
    
    /**
      * Defines the threshold to switch between steps upon user scrolling.
      *
      * **For Example:**
      *
      * (1) To switch to the next step, when half of the step is scrolled out - set `step-switch-threshold="0.5"`.
      * (2) To switch to the next step, when the entire current step is scrolled out - set `step-switch-threshold="1"`.
      *
      * **Note:** Supported values are between 0.5 and 1
      * and values out of the range will be normalized to 0.5 and 1 respectively.
      * @private
      * @default 0.7
      * @since 1.0.0-rc.13
      */
    var stepSwitchThreshold: Double = js.native
    
    /**
      * Defines the steps.
      *
      * **Note:** Use the available `ui5-wizard-step` component.
      * @public
      */
    var steps: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
      ] = js.native
    
    def stepsCount: Double = js.native
    
    def stepsDOM: js.Array[HTMLElement] = js.native
    
    def stepsInHeaderDOM: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardTabMod.default
      ] = js.native
    
    /**
      * Stores the scroll offsets of the steps,
      * e.g. the steps' starting point.
      *
      * **Note:** the disabled ones has negative offsets.
      * @private
      */
    def storeStepScrollOffsets(): Unit = js.native
    
    /**
      * Switches the selection from the old step to the newly selected step.
      * @param selectedStep the old step
      * @param stepToSelect the step to be selected
      * @param stepToSelectIndex the index of the newly selected step
      * @param withScroll the selection changed due to user scrolling
      * @private
      */
    def switchSelectionFromOldToNewStep(
      selectedStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      stepToSelect: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      stepToSelectIndex: Double,
      withScroll: Boolean
    ): Unit = js.native
    def switchSelectionFromOldToNewStep(
      selectedStep: Null,
      stepToSelect: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      stepToSelectIndex: Double,
      withScroll: Boolean
    ): Unit = js.native
    
    /**
      * Normalizes the step selection as follows:
      * (1) If there is no selected step - the first step is going to be selected.
      * (2) If the selected steps are more than one - the last step is going to be selected.
      * (3) If the selected step is also disabled - log a warning.
      * @private
      */
    def syncSelection(): Unit = js.native
    
    /**
      * Defines the width of the `ui5-wizard`.
      * @private
      */
    var width: js.UndefOr[Double] = js.native
  }
  
  trait WizardStepChangeEventDetail extends StObject {
    
    var previousStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
    
    var step: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default
    
    var withScroll: Boolean
  }
  object WizardStepChangeEventDetail {
    
    inline def apply(
      previousStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      step: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default,
      withScroll: Boolean
    ): WizardStepChangeEventDetail = {
      val __obj = js.Dynamic.literal(previousStep = previousStep.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], withScroll = withScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardStepChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WizardStepChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setPreviousStep(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default): Self = StObject.set(x, "previousStep", value.asInstanceOf[js.Any])
      
      inline def setStep(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardStepMod.default): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setWithScroll(value: Boolean): Self = StObject.set(x, "withScroll", value.asInstanceOf[js.Any])
    }
  }
}
