package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.AdditionalTextClasses
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.HTMLElementrealTabReferen
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.HTMLElementtabdefaultunde
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PickAccessibilityAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.ITab
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.TabContainerPopoverOwner
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Active
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemTypeMod.ListItemType.Inactive
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`disabled-slot`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`sys-enter-2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.alert
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.error
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.menu
import org.scalajs.dom.DragEvent
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabMod {
  
  /**
    * @class
    * The `ui5-tab` represents a selectable item inside a `ui5-tabcontainer`.
    * It defines both the item in the tab strip (top part of the `ui5-tabcontainer`) and the
    * content that is presented to the user once the tab is selected.
    * @abstract
    * @constructor
    * @extends UI5Element
    * @implements {ITab}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Tab.js", JSImport.Default)
  @js.native
  open class default () extends Tab
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Tab.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Tab.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * The `ui5-tab` represents a selectable item inside a `ui5-tabcontainer`.
    * It defines both the item in the tab strip (top part of the `ui5-tabcontainer`) and the
    * content that is presented to the user once the tab is selected.
    * @abstract
    * @constructor
    * @extends UI5Element
    * @implements {ITab}
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait Tab extends ITab {
    
    def _ariaHasPopup: js.UndefOr[menu] = js.native
    
    def _defaultSlotName: _empty | `disabled-slot` = js.native
    
    def _designDescription: String | Null = js.native
    
    def _effectiveSlotName: js.UndefOr[String] = js.native
    
    var _forcedMixedMode: js.UndefOr[Boolean] = js.native
    
    var _forcedPosinset: js.UndefOr[Double] = js.native
    
    var _forcedSetsize: js.UndefOr[Double] = js.native
    
    var _forcedStyleInOverflow: js.UndefOr[Record[String, Any]] = js.native
    
    var _getElementInOverflow: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.native
    
    var _getElementInStrip: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.native
    
    var _isInline: js.UndefOr[Boolean] = js.native
    
    var _isTopLevelTab: Boolean = js.native
    
    def _ondragend(e: DragEvent): Unit = js.native
    
    def _ondragstart(e: DragEvent): Unit = js.native
    
    def _roleDescription: js.UndefOr[String] = js.native
    
    var _selectedTabReference: js.UndefOr[Tab] = js.native
    
    /**
      * Represents the "additionalText" text, which is displayed in the tab. In the cases when in the same time there are tabs with icons and tabs without icons, if a tab has no icon the "additionalText" is displayed larger.
      * @default undefined
      * @public
      */
    var additionalText: js.UndefOr[String] = js.native
    
    def additionalTextClasses: String = js.native
    
    def ariaLabelledBy: String = js.native
    
    def captureButtonRef(): Unit = js.native
    def captureButtonRef(ref: HTMLElementtabdefaultunde): Unit = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementrealTabReferen): Unit = js.native
    
    /**
      * Holds the content associated with this tab.
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * Defines the component's design color.
      *
      * The design is applied to:
      *
      * - the component icon
      * - the `text` when the component overflows
      * - the tab selection line
      *
      * Available designs are: `"Default"`, `"Neutral"`, `"Positive"`, `"Critical"` and `"Negative"`.
      *
      * **Note:** The design depends on the current theme.
      * @default "Default"
      * @public
      */
    var design: /* template literal string: ${SemanticColor} */ String = js.native
    
    /**
      * Disabled tabs can't be selected.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def displayText: js.UndefOr[String] = js.native
    
    def effectiveDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveHidden: Boolean = js.native
    
    def effectiveSelected: Boolean = js.native
    
    def expandBtnAccessibilityAttributes: PickAccessibilityAttribut = js.native
    
    def expandButtonTitle: String = js.native
    
    def forcedTabIndex: String = js.native
    def forcedTabIndex_=(`val`: String): Unit = js.native
    @JSName("forcedTabIndex")
    var forcedTabIndex_FTab: js.UndefOr[String] = js.native
    
    def hasOwnContent: Boolean = js.native
    
    /**
      * Defines the icon source URI to be displayed as graphical element within the component.
      * The SAP-icons font provides numerous built-in icons.
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    def isIconTab: Boolean = js.native
    
    def isMixedModeTab: js.UndefOr[Boolean] = js.native
    
    def isOnSelectedTabPath: Boolean = js.native
    
    @JSName("isSeparator")
    def isSeparator_MTab: Boolean = js.native
    
    def isSingleClickArea: Boolean = js.native
    
    def isTextOnlyTab: Boolean = js.native
    
    def isTwoClickArea: Boolean = js.native
    
    /**
      * Defines hierarchies with nested sub tabs.
      *
      * **Note:** Use `ui5-tab` and `ui5-tab-separator` for the intended design.
      * @public
      */
    @JSName("items")
    var items_Tab: js.Array[ITab] = js.native
    
    /**
      * Defines if the tab is movable.
      *
      * @default false
      * @public
      * @since 2.0.0
      */
    var movable: Boolean = js.native
    
    def overflowClasses: String = js.native
    
    def overflowPresentation: js.Object = js.native
    
    def overflowState: Inactive | Active = js.native
    
    def requiresExpandButton: Boolean = js.native
    
    /**
      * Specifies if the component is selected.
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    def semanticIconClasses: String = js.native
    
    def semanticIconName: alert | `sys-enter-2` | error | Null = js.native
    
    def stableDomRef: String = js.native
    
    def stripClasses: AdditionalTextClasses = js.native
    
    def stripPresentation: js.Object = js.native
    
    def tabs: js.Array[Tab] = js.native
    
    /**
      * The text to be displayed for the item.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TabInOverflow
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemCustomMod.default {
    
    var realTabReference: Tab = js.native
  }
  
  @js.native
  trait TabInStrip
    extends StObject
       with io.github.nguyenyou.ui5.webcomponents.std.HTMLElement
       with TabContainerPopoverOwner {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var realTabReference: Tab = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
