package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.left
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.top
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDropIndicatorMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DropIndicator.js";`
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/DropIndicator.js", JSImport.Default)
  @js.native
  open class default () extends DropIndicator
  
  /**
    * @class
    *
    * ### Overview
    *
    * ### Usage
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DropIndicator.js";`
    *
    * @constructor
    * @extends UI5Element
    * @private
    */
  @js.native
  trait DropIndicator
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _positionProperty: top | left = js.native
    
    /**
      * Orientation of the indicator.
      *
      * @default "Vertical"
      * @public
      */
    var orientation: /* template literal string: ${Orientation} */ String = js.native
    
    /**
      * Owner of the indicator and the target.
      * @public
      * @default null
      */
    var ownerReference: HTMLElement | Null = js.native
    
    /**
      * Placement of the indicator relative to the target.
      *
      * @default "Before"
      * @public
      */
    var placement: /* template literal string: ${MovePlacement} */ String = js.native
    
    /**
      * Element where the drop indicator will be shown.
      *
      * @public
      * @default null
      */
    var targetReference: HTMLElement | Null = js.native
  }
}
