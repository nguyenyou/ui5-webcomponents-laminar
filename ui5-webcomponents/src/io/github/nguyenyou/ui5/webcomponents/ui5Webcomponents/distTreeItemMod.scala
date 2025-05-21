package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeItemMod {
  
  /**
    * @class
    * ### Overview
    * The `ui5-tree-item` represents a node in a tree structure, shown as a `ui5-list`.
    *
    * This is the item to use inside a `ui5-tree`.
    * You can represent an arbitrary tree structure by recursively nesting tree items.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TreeItem.js";`
    * @csspart title - Used to style the title of the tree list item
    * @csspart additionalText - Used to style the additionalText of the tree list item
    * @csspart icon - Used to style the icon of the tree list item
    * @constructor
    * @extends TreeItemBase
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents/dist/TreeItem.js", JSImport.Default)
  @js.native
  open class default () extends TreeItem
  
  /**
    * @class
    * ### Overview
    * The `ui5-tree-item` represents a node in a tree structure, shown as a `ui5-list`.
    *
    * This is the item to use inside a `ui5-tree`.
    * You can represent an arbitrary tree structure by recursively nesting tree items.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TreeItem.js";`
    * @csspart title - Used to style the title of the tree list item
    * @csspart additionalText - Used to style the additionalText of the tree list item
    * @csspart icon - Used to style the icon of the tree list item
    * @constructor
    * @extends TreeItemBase
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait TreeItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default {
    
    def _showTitle: js.UndefOr[Double] = js.native
    
    /**
      * Defines the `additionalText`, displayed in the end of the tree item.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalText: js.UndefOr[String] = js.native
    
    /**
      * Defines the text of the tree item.
      * @public
      * @default undefined
      */
    var text: js.UndefOr[String] = js.native
  }
}
