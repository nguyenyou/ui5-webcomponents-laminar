package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSortItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * For the `ui5-sort-item`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents-fiori/dist/SortItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.16
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SortItem", JSImport.Default)
  @js.native
  open class default () extends SortItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * For the `ui5-sort-item`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents-fiori/dist/SortItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.16
    * @public
    */
  @js.native
  trait SortItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines if the component is selected.
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the text of the component.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
