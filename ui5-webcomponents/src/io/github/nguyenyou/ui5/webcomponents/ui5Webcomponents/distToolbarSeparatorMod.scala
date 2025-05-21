package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSeparatorMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-separator` is an element, used for visual separation between two elements.
    * It takes no space in calculating toolbar items width.
    * @constructor
    * @extends ToolbarItem
    * @since 1.17.0
    * @abstract
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ToolbarSeparator.js", JSImport.Default)
  @js.native
  open class default () extends ToolbarSeparator
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-toolbar-separator` is an element, used for visual separation between two elements.
    * It takes no space in calculating toolbar items width.
    * @constructor
    * @extends ToolbarItem
    * @since 1.17.0
    * @abstract
    * @public
    */
  @js.native
  trait ToolbarSeparator
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default {
    
    var visible: Boolean = js.native
  }
}
