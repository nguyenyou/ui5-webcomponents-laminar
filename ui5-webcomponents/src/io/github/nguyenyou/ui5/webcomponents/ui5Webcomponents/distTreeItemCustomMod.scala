package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeItemCustomMod {
  
  /**
    * @class
    * The `ui5-tree-item-custom` represents a node in a tree structure, shown as a `ui5-list`.
    *
    * This is the item to use inside a `ui5-tree`.
    * You can represent an arbitrary tree structure by recursively nesting tree items.
    *
    * You can use this item to put any custom content inside the tree item.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TreeItemCustom.js";`
    * @csspart title - Used to style the title of the tree list item
    * @csspart additionalText - Used to style the additionalText of the tree list item
    * @csspart icon - Used to style the icon of the tree list item
    * @constructor
    * @extends TreeItemBase
    * @public
    * @since 1.9.2
    */
  @JSImport("@ui5/webcomponents/dist/TreeItemCustom", JSImport.Default)
  @js.native
  open class default () extends TreeItemCustom
  
  /**
    * @class
    * The `ui5-tree-item-custom` represents a node in a tree structure, shown as a `ui5-list`.
    *
    * This is the item to use inside a `ui5-tree`.
    * You can represent an arbitrary tree structure by recursively nesting tree items.
    *
    * You can use this item to put any custom content inside the tree item.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TreeItemCustom.js";`
    * @csspart title - Used to style the title of the tree list item
    * @csspart additionalText - Used to style the additionalText of the tree list item
    * @csspart icon - Used to style the icon of the tree list item
    * @constructor
    * @extends TreeItemBase
    * @public
    * @since 1.9.2
    */
  @js.native
  trait TreeItemCustom
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default {
    
    /**
      * Defines the content of the `ui5-tree-item`.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines whether the tree list item should display the selection element.
      * @public
      * @default false
      */
    var hideSelectionElement: Boolean = js.native
  }
}
