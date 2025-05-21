package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFilterItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * For the `ui5-filter-item`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents-fiori/dist/FilterItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.16
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/FilterItem.js", JSImport.Default)
  @js.native
  open class default () extends FilterItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * For the `ui5-filter-item`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents-fiori/dist/FilterItem.js";`
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.0.0-rc.16
    * @public
    */
  @js.native
  trait FilterItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the additional text of the component.
      * @default undefined
      * @public
      */
    var additionalText: js.UndefOr[String] = js.native
    
    /**
      * Defines the text of the component.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Defines the `values` list.
      * @public
      */
    var values: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFilterItemOptionMod.default
      ] = js.native
  }
}
