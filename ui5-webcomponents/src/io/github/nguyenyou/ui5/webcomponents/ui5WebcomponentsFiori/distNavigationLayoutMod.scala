package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNavigationLayoutMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-navigation-layout` is a container component that can be used to
    * create a layout with a header, a side navigation and a content area.
    *
    * ### Usage
    *
    * Use the `ui5-navigation-layout` to create whole screen of an application with vertical navigation.
    *
    * ### Responsive Behavior
    *
    * On desktop and tablet devices, the side navigation is visible
    * by default and can be expanded or collapsed using the `mode` property.
    * On phone devices, the side navigation is hidden by default and can
    * be displayed using the `mode` property.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationLayout.js";`
    * @constructor
    * @extends UI5Element
    * @since 2.4.0
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NavigationLayout", JSImport.Default)
  @js.native
  open class default () extends NavigationLayout
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-navigation-layout` is a container component that can be used to
    * create a layout with a header, a side navigation and a content area.
    *
    * ### Usage
    *
    * Use the `ui5-navigation-layout` to create whole screen of an application with vertical navigation.
    *
    * ### Responsive Behavior
    *
    * On desktop and tablet devices, the side navigation is visible
    * by default and can be expanded or collapsed using the `mode` property.
    * On phone devices, the side navigation is hidden by default and can
    * be displayed using the `mode` property.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationLayout.js";`
    * @constructor
    * @extends UI5Element
    * @since 2.4.0
    * @public
    */
  @js.native
  trait NavigationLayout
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _defaultSideCollapsed: Boolean = js.native
    
    def calcSideCollapsed(): Unit = js.native
    
    /**
      * Defines the content.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * @private
      */
    var isPhone: Boolean = js.native
    
    /**
      * Gets whether the side navigation is collapsed.
      * @public
      */
    def isSideCollapsed(): Boolean = js.native
    
    /**
      * @private
      */
    var isTablet: Boolean = js.native
    
    /**
      * Specifies the navigation layout mode.
      * @default "Auto"
      * @public
      */
    var mode: /* template literal string: ${NavigationLayoutMode} */ String = js.native
    
    /**
      * @private
      */
    var sideCollapsed: Boolean = js.native
    
    /**
      * Defines the side content.
      * @public
      */
    var sideContent: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationMod.default
      ] = js.native
  }
}
