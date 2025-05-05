package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicPageHeaderMod {
  
  /**
    * @class
    *
    * Header of the DynamicPage.
    *
    * ### Overview
    *
    * The DynamicPageHeader `ui5-dynamic-page-header` is part of the DynamicPage family
    * and is used to serve as header of the `DynamicPage`.
    *
    * ### Usage
    *
    * The `DynamicPageHeader` can hold any layout control and has two states - expanded
    * and collapsed (snapped). The switching between these states happens when:
    *	- the user scrolls below its bottom margin
    *	- the user clicks on the `DynamicPageTitle`
    *	- through the `DynamicPage` property `headerSnapped`
    *
    * ### Responsive Behavior
    *
    * The responsive behavior of the `DynamicPageHeader` depends on the behavior of the
    * content that is displayed.
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPageHeader", JSImport.Default)
  @js.native
  open class default () extends DynamicPageHeader
  
  /**
    * @class
    *
    * Header of the DynamicPage.
    *
    * ### Overview
    *
    * The DynamicPageHeader `ui5-dynamic-page-header` is part of the DynamicPage family
    * and is used to serve as header of the `DynamicPage`.
    *
    * ### Usage
    *
    * The `DynamicPageHeader` can hold any layout control and has two states - expanded
    * and collapsed (snapped). The switching between these states happens when:
    *	- the user scrolls below its bottom margin
    *	- the user clicks on the `DynamicPageTitle`
    *	- through the `DynamicPage` property `headerSnapped`
    *
    * ### Responsive Behavior
    *
    * The responsive behavior of the `DynamicPageHeader` depends on the behavior of the
    * content that is displayed.
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @js.native
  trait DynamicPageHeader
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the content of the Dynamic Page Header.
      *
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
  }
}
