package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Layoutchange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Root
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicSideContentMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The DynamicSideContent (`ui5-dynamic-side-content`) is a layout component that allows additional content
    * to be displayed in a way that flexibly adapts to different screen sizes. The side
    * content appears in a container next to or directly below the main content
    * (it doesn't overlay). When the side content is triggered, the main content becomes
    * narrower (if appearing side-by-side). The side content contains a separate scrollbar
    * when appearing next to the main content.
    *
    * ### Usage
    *
    * *When to use?*
    *
    * Use this component if you want to display relevant information that is not critical
    * for users to complete a task. Users should have access to all the key functions and
    * critical information in the app even if they do not see the side content. This is
    * important because on smaller screen sizes it may be difficult to display the side
    * content in a way that is easily accessible for the user.
    *
    * *When not to use?*
    *
    * Don't use it if you want to display navigation or critical information that prevents
    * users from completing a task when they have no access to the side content.
    *
    * ### Responsive Behavior
    *
    * Screen width \> 1440px
    *
    * - Main vs. side content ratio is 75 vs. 25 percent (with a minimum of 320px
    * each).
    * - If the application defines a trigger, the side content can be hidden.
    *
    * Screen width \<\= 1440px and \> 1024px
    *
    * - Main vs. side content ratio is 66.666 vs. 33.333 percent (with a minimum of
    * 320px each). If the side content width falls below 320 px, it automatically slides
    * under the main content, unless the app development team specifies that it should
    * disappear.
    *
    * Screen width \<\= 1024px and \> 720px
    *
    * - The side content ratio is fixed to 340px, and the main content takes the rest
    * of the width. Only if the `sideContentFallDown` is set to `OnMinimumWidth`
    * and screen width is \<\= 960px and \> 720px the side content falls below the main content.
    *
    * Screen width \<\= 720px (for example on a mobile device)
    *
    * - In this case, the side content automatically disappears from the screen (unless
    * specified to stay under the content by setting of `sideContentVisibility`
    * property to `AlwaysShow`) and can be triggered from a pre-set trigger
    * (specified within the app). When the side content is triggered, it replaces the main
    * content. We recommend that you always place the trigger for the side content in the
    * same location, such as in the app footer.
    *
    * A special case allows switching the comparison mode between the main and side content.
    * In this case, the screen is split into 50:50 percent for main vs. side content. The
    * responsive behavior of the equal split is the same as in the standard view - the
    * side content disappears on screen widths of less than 720 px and can only be
    * viewed by triggering it.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/DynamicSideContent.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    * @slot {Array<HTMLElement>} default - Defines the main content.
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent.js", JSImport.Default)
  @js.native
  open class default () extends DynamicSideContent
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/DynamicSideContent.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The DynamicSideContent (`ui5-dynamic-side-content`) is a layout component that allows additional content
    * to be displayed in a way that flexibly adapts to different screen sizes. The side
    * content appears in a container next to or directly below the main content
    * (it doesn't overlay). When the side content is triggered, the main content becomes
    * narrower (if appearing side-by-side). The side content contains a separate scrollbar
    * when appearing next to the main content.
    *
    * ### Usage
    *
    * *When to use?*
    *
    * Use this component if you want to display relevant information that is not critical
    * for users to complete a task. Users should have access to all the key functions and
    * critical information in the app even if they do not see the side content. This is
    * important because on smaller screen sizes it may be difficult to display the side
    * content in a way that is easily accessible for the user.
    *
    * *When not to use?*
    *
    * Don't use it if you want to display navigation or critical information that prevents
    * users from completing a task when they have no access to the side content.
    *
    * ### Responsive Behavior
    *
    * Screen width \> 1440px
    *
    * - Main vs. side content ratio is 75 vs. 25 percent (with a minimum of 320px
    * each).
    * - If the application defines a trigger, the side content can be hidden.
    *
    * Screen width \<\= 1440px and \> 1024px
    *
    * - Main vs. side content ratio is 66.666 vs. 33.333 percent (with a minimum of
    * 320px each). If the side content width falls below 320 px, it automatically slides
    * under the main content, unless the app development team specifies that it should
    * disappear.
    *
    * Screen width \<\= 1024px and \> 720px
    *
    * - The side content ratio is fixed to 340px, and the main content takes the rest
    * of the width. Only if the `sideContentFallDown` is set to `OnMinimumWidth`
    * and screen width is \<\= 960px and \> 720px the side content falls below the main content.
    *
    * Screen width \<\= 720px (for example on a mobile device)
    *
    * - In this case, the side content automatically disappears from the screen (unless
    * specified to stay under the content by setting of `sideContentVisibility`
    * property to `AlwaysShow`) and can be triggered from a pre-set trigger
    * (specified within the app). When the side content is triggered, it replaces the main
    * content. We recommend that you always place the trigger for the side content in the
    * same location, such as in the app footer.
    *
    * A special case allows switching the comparison mode between the main and side content.
    * In this case, the screen is split into 50:50 percent for main vs. side content. The
    * responsive behavior of the equal split is the same as in the standard view - the
    * side content disappears on screen widths of less than 720 px and can only be
    * viewed by triggering it.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/DynamicSideContent.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    * @slot {Array<HTMLElement>} default - Defines the main content.
    */
  @js.native
  trait DynamicSideContent
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _currentBreakpoint: js.UndefOr[String] = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    def _isSideContentFirst: Boolean = js.native
    
    /**
      * @private
      */
    var _mcSpan: String = js.native
    
    def _resizeContents(): Unit = js.native
    
    /**
      * @private
      */
    var _scSpan: String = js.native
    
    def _setSpanSizes(mainSize: String, sideSize: String): Unit = js.native
    
    /**
      * @private
      */
    var _toggled: Boolean = js.native
    
    def accInfo: DynamicSideContentAccessibilityAttributes = js.native
    
    /**
      * Defines additional accessibility attributes on different areas of the component.
      *
      * The accessibilityAttributes object has the following fields:
      *
      *  - **mainContent**: `mainContent.ariaLabel` defines the aria-label of the main content area. Accepts any string.
      *  - **sideContent**: `sideContent.ariaLabel` defines the aria-label of the side content area. Accepts any string.
      *
      * @default {}
      * @public
      * @since 2.6.0
      */
    var accessibilityAttributes: DynamicSideContentAccessibilityAttributes = js.native
    
    def breakpoint: String = js.native
    
    def containerWidth: Double = js.native
    
    /**
      * Defines whether the component is in equal split mode. In this mode, the side and
      * the main content take 50:50 percent of the container on all screen sizes
      * except for phone, where the main and side contents are switching visibility
      * using the toggle method.
      * @default false
      * @public
      *
      */
    var equalSplit: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_DynamicSideContent: Layoutchange = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines the visibility of the main content.
      * @default false
      * @public
      *
      */
    var hideMainContent: Boolean = js.native
    
    /**
      * Defines the visibility of the side content.
      * @default false
      * @public
      *
      */
    var hideSideContent: Boolean = js.native
    
    /**
      * Defines the side content.
      * @public
      */
    var sideContent: js.Array[HTMLElement] = js.native
    
    /**
      * Defines on which breakpoints the side content falls down below the main content.
      * @default "OnMinimumWidth"
      * @public
      *
      */
    var sideContentFallDown: /* template literal string: ${SideContentFallDown} */ String = js.native
    
    /**
      * Defines whether the side content is positioned before the main content (left side
      * in LTR mode), or after the the main content (right side in LTR mode).
      * @default "End"
      * @public
      *
      */
    var sideContentPosition: /* template literal string: ${SideContentPosition} */ String = js.native
    
    /**
      * Defines on which breakpoints the side content is visible.
      * @default "ShowAboveS"
      * @public
      *
      */
    var sideContentVisibility: /* template literal string: ${SideContentVisibility} */ String = js.native
    
    def sizeL: String = js.native
    
    def sizeM: String = js.native
    
    def sizeS: String = js.native
    
    def sizeXL: String = js.native
    
    def span0: String = js.native
    
    def span12: String = js.native
    
    def span3: String = js.native
    
    def span4: String = js.native
    
    def span6: String = js.native
    
    def span8: String = js.native
    
    def span9: String = js.native
    
    def spanFixed: String = js.native
    
    def styles: Root = js.native
    
    /**
      * Toggles visibility of main and side contents on S screen size (mobile device).
      * @public
      */
    def toggleContents(): Unit = js.native
  }
  
  trait DynamicSideContentAccessibilityAttributes extends StObject {
    
    var mainContent: js.UndefOr[DynamicSideContentAriaAccessibilityAttributes] = js.undefined
    
    var sideContent: js.UndefOr[DynamicSideContentAriaAccessibilityAttributes] = js.undefined
  }
  object DynamicSideContentAccessibilityAttributes {
    
    inline def apply(): DynamicSideContentAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicSideContentAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicSideContentAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setMainContent(value: DynamicSideContentAriaAccessibilityAttributes): Self = StObject.set(x, "mainContent", value.asInstanceOf[js.Any])
      
      inline def setMainContentUndefined: Self = StObject.set(x, "mainContent", js.undefined)
      
      inline def setSideContent(value: DynamicSideContentAriaAccessibilityAttributes): Self = StObject.set(x, "sideContent", value.asInstanceOf[js.Any])
      
      inline def setSideContentUndefined: Self = StObject.set(x, "sideContent", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'ariaLabel'> */
  trait DynamicSideContentAriaAccessibilityAttributes extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
  }
  object DynamicSideContentAriaAccessibilityAttributes {
    
    inline def apply(): DynamicSideContentAriaAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicSideContentAriaAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicSideContentAriaAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    }
  }
  
  trait DynamicSideContentLayoutChangeEventDetail extends StObject {
    
    var currentBreakpoint: String
    
    var mainContentVisible: Boolean
    
    var previousBreakpoint: js.UndefOr[String] = js.undefined
    
    var sideContentVisible: Boolean
  }
  object DynamicSideContentLayoutChangeEventDetail {
    
    inline def apply(currentBreakpoint: String, mainContentVisible: Boolean, sideContentVisible: Boolean): DynamicSideContentLayoutChangeEventDetail = {
      val __obj = js.Dynamic.literal(currentBreakpoint = currentBreakpoint.asInstanceOf[js.Any], mainContentVisible = mainContentVisible.asInstanceOf[js.Any], sideContentVisible = sideContentVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicSideContentLayoutChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicSideContentLayoutChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setCurrentBreakpoint(value: String): Self = StObject.set(x, "currentBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setMainContentVisible(value: Boolean): Self = StObject.set(x, "mainContentVisible", value.asInstanceOf[js.Any])
      
      inline def setPreviousBreakpoint(value: String): Self = StObject.set(x, "previousBreakpoint", value.asInstanceOf[js.Any])
      
      inline def setPreviousBreakpointUndefined: Self = StObject.set(x, "previousBreakpoint", js.undefined)
      
      inline def setSideContentVisible(value: Boolean): Self = StObject.set(x, "sideContentVisible", value.asInstanceOf[js.Any])
    }
  }
}
