package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.LowercaseString
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Expandbuttonclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`pushpin-off`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`pushpin-on`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`slim-arrow-down`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`slim-arrow-up`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicPageHeaderActionsMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `DynamicPageHeaderActions` component is part of the `DynamicPage`
    * family and is holding the action buttons behind the `DynamicPageTitle` and the `DynamicPageHeader`.
    *
    * The "pin" action is used to attach the header to a certain state (expanded/collapsed).
    * The expand/collapse action is used to switch between the two states of `DynamicPageHeader`.
    *
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageHeaderActions", JSImport.Default)
  @js.native
  open class default () extends DynamicPageHeaderActions
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageHeaderActions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageHeaderActions", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `DynamicPageHeaderActions` component is part of the `DynamicPage`
    * family and is holding the action buttons behind the `DynamicPageTitle` and the `DynamicPageHeader`.
    *
    * The "pin" action is used to attach the header to a certain state (expanded/collapsed).
    * The expand/collapse action is used to switch between the two states of `DynamicPageHeader`.
    *
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @js.native
  trait DynamicPageHeaderActions
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Contains attributes to be added to HTML to gain accessibility.
      *
      * @protected
      * @default {}
      */
    var accessibilityAttributes: DynamicPageHeaderActionsAccessibilityAttributes = js.native
    
    def arrowButtonIcon: `slim-arrow-down` | `slim-arrow-up` = js.native
    
    @JSName("eventDetails")
    var eventDetails_DynamicPageHeaderActions: Expandbuttonclick = js.native
    
    def expandButton: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    def expandLabel: String = js.native
    
    def focusExpandButton(): Unit = js.native
    
    def focusPinButton(): Unit = js.native
    
    /**
      * Defines whether the pin button is hidden.
      *
      * @protected
      * @default false
      */
    var hidePinButton: Boolean = js.native
    
    def onExpandClick(): Unit = js.native
    
    def onExpandHoverIn(): Unit = js.native
    
    def onExpandHoverOut(): Unit = js.native
    
    def onPinClick(): Unit = js.native
    
    def pinButton: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleButtonMod.default | Null = js.native
    
    def pinButtonIcon: `pushpin-off` | `pushpin-on` = js.native
    
    def pinLabel: String = js.native
    
    /**
      * Defines whether the header is pinned.
      *
      * @protected
      * @default false
      */
    var pinned: Boolean = js.native
    
    def showPinButton: Boolean = js.native
    
    /**
      * Defines whether the header is snapped.
      *
      * @protected
      * @default false
      */
    var snapped: Boolean = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'controls'> */
  trait DynamicPageHeaderActionsAccessibilityAttributes extends StObject {
    
    var controls: js.UndefOr[LowercaseString[String]] = js.undefined
  }
  object DynamicPageHeaderActionsAccessibilityAttributes {
    
    inline def apply(): DynamicPageHeaderActionsAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicPageHeaderActionsAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicPageHeaderActionsAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setControls(value: LowercaseString[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    }
  }
}
