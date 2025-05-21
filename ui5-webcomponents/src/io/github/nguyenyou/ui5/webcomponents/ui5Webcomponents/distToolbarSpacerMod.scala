package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Flex
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.FlexWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSpacerMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-spacer` is an element, used for taking needed space for toolbar items to take 100% width.
    * It takes no space in calculating toolbar items width.
    * @constructor
    * @extends ToolbarItem
    * @abstract
    * @since 1.17.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ToolbarSpacer", JSImport.Default)
  @js.native
  open class default () extends ToolbarSpacer
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-spacer` is an element, used for taking needed space for toolbar items to take 100% width.
    * It takes no space in calculating toolbar items width.
    * @constructor
    * @extends ToolbarItem
    * @abstract
    * @since 1.17.0
    * @public
    */
  @js.native
  trait ToolbarSpacer
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default {
    
    def styles: Flex | FlexWidth = js.native
    
    /**
      * Defines the width of the spacer.
      *
      * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
      * @public
      * @default undefined
      */
    var width: js.UndefOr[String] = js.native
  }
}
