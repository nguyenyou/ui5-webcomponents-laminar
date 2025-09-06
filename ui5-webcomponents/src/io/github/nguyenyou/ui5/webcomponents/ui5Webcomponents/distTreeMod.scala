package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Element
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Itemdelete
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Placement
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListAccessibleRoleMod.ListAccessibleRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-tree` component provides a tree structure for displaying data in a hierarchy.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - To display hierarchically structured items.
    * - To select one or more items out of a set of hierarchically structured items.
    *
    * #### When not to use:
    *
    * - To display items not hierarchically structured. In this case, use the List component.
    * - To select one item from a very small number of non-hierarchical items. Select or ComboBox might be more appropriate.
    * - The hierarchy turns out to have only two levels. In this case, use List with group items.
    *
    * ### Keyboard Handling
    *
    * The `ui5-tree` provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    *
    * - [Up] or [Down] - Navigates up and down the tree items that are currently visible.
    * - [Right] - Drills down the tree by expanding the tree nodes.
    * - [Left] - Goes up the tree and collapses the tree nodes.
    *
    * The user can use the following keyboard shortcuts to perform selection,
    * when the `selectionMode` property is in use:
    *
    * - [Space] - Selects the currently focused item upon keyup.
    * - [Enter]  - Selects the currently focused item upon keydown.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Tree.js";`
    *
    * `import "@ui5/webcomponents/dist/TreeItem.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents/dist/Tree.js", JSImport.Default)
  @js.native
  open class default () extends Tree
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-tree` component provides a tree structure for displaying data in a hierarchy.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - To display hierarchically structured items.
    * - To select one or more items out of a set of hierarchically structured items.
    *
    * #### When not to use:
    *
    * - To display items not hierarchically structured. In this case, use the List component.
    * - To select one item from a very small number of non-hierarchical items. Select or ComboBox might be more appropriate.
    * - The hierarchy turns out to have only two levels. In this case, use List with group items.
    *
    * ### Keyboard Handling
    *
    * The `ui5-tree` provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    *
    * - [Up] or [Down] - Navigates up and down the tree items that are currently visible.
    * - [Right] - Drills down the tree by expanding the tree nodes.
    * - [Left] - Goes up the tree and collapses the tree nodes.
    *
    * The user can use the following keyboard shortcuts to perform selection,
    * when the `selectionMode` property is in use:
    *
    * - [Space] - Selects the currently focused item upon keyup.
    * - [Enter]  - Selects the currently focused item upon keydown.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Tree.js";`
    *
    * `import "@ui5/webcomponents/dist/TreeItem.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait Tree
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _dragAndDropHandler: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDelegateDragAndDropHandlerMod.default = js.native
    
    def _filterPlacements(placements: js.Array[MovePlacement], draggedElement: HTMLElement, targetElement: HTMLElement): js.Array[MovePlacement] = js.native
    
    def _getItems(): js.Array[HTMLElement] = js.native
    
    /**
      * Returns the corresponding list item for a given tree item
      * @param item The tree item
      * @protected
      */
    def _getListItemForTreeItem(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ] = js.native
    
    def _hasHeader: Boolean = js.native
    
    def _isInstanceOfTreeItemBase(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/TreeItemBase.default */ Boolean = js.native
    
    def _onListItemClick(e: CustomEvent): Unit = js.native
    
    def _onListItemDelete(e: CustomEvent): Unit = js.native
    
    def _onListItemFocus(e: CustomEvent): Unit = js.native
    
    def _onListItemMouseOut(e: MouseEvent): Unit = js.native
    
    def _onListItemMouseOver(e: MouseEvent): Unit = js.native
    
    def _onListItemStepIn(e: CustomEvent): Unit = js.native
    
    def _onListItemStepOut(e: CustomEvent): Unit = js.native
    
    def _onListItemToggle(e: CustomEvent): Unit = js.native
    
    def _onListSelectionChange(e: CustomEvent): Unit = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(e: DragEvent): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def _prepareTreeItems(): Unit = js.native
    
    def _role: ListAccessibleRole = js.native
    
    def _transformElement(element: HTMLElement): HTMLElement = js.native
    
    def _validateDraggedElement(draggedElement: HTMLElement, targetElement: HTMLElement): Boolean = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that describe the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescriptionRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible name of the component.
      * @default undefined
      * @public
      * @since 1.8.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.8.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def dropIndicatorDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_Tree: Itemdelete = js.native
    
    /**
      * Focus a tree item by its index in the flat array of all tree items
      * @protected
      * @param index
      */
    def focusItemByIndex(index: Double): Unit = js.native
    
    /**
      * Defines the component footer text.
      * @default undefined
      * @public
      */
    var footerText: js.UndefOr[String] = js.native
    
    /**
      * Returns the a flat array of all tree items
      * @protected
      * @returns array of the tree items
      */
    def getItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ] = js.native
    
    /**
      * Defines the component header.
      *
      * **Note:** When the `header` slot is set, the
      * `headerText` property is ignored.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the component header text.
      *
      * **Note:** If the `header` slot is set, this property is ignored.
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Defines the items of the component. Tree items may have other tree items as children.
      *
      * **Note:** Use `ui5-tree-item` for the intended design.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ] = js.native
    
    def list: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeListMod.default = js.native
    
    /**
      * Defines the text that is displayed when the component contains no items.
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
    
    /**
      * Defines the selection mode of the component. Since the tree uses a `ui5-list` to display its structure,
      * the tree modes are exactly the same as the list modes, and are all applicable.
      * @public
      * @default "None"
      */
    var selectionMode: js.UndefOr[/* template literal string: ${ListSelectionMode} */ String] = js.native
    
    /**
      * Perform Depth-First-Search walk on the tree and run a callback on each node
      * @public
      * @param callback function to execute on each node of the tree with 3 arguments: the node, the level and the index
      */
    def walk(callback: WalkCallback): Unit = js.native
  }
  
  type TreeItemClickEventDetail = TreeItemEventDetail
  
  type TreeItemDeleteEventDetail = TreeItemEventDetail
  
  trait TreeItemEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
  }
  object TreeItemEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default): TreeItemEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeItemEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeItemFocusEventDetail = TreeItemEventDetail
  
  type TreeItemMouseoutEventDetail = TreeItemEventDetail
  
  type TreeItemMouseoverEventDetail = TreeItemEventDetail
  
  type TreeItemToggleEventDetail = TreeItemEventDetail
  
  trait TreeMoveEventDetail extends StObject {
    
    var destination: Placement
    
    var source: Element
  }
  object TreeMoveEventDetail {
    
    inline def apply(destination: Placement, source: Element): TreeMoveEventDetail = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeMoveEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeMoveEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: Placement): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait TreeSelectionChangeEventDetail extends StObject {
    
    var previouslySelectedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ]
    
    var selectedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ]
    
    var targetItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
  }
  object TreeSelectionChangeEventDetail {
    
    inline def apply(
      previouslySelectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
        ],
      selectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
        ],
      targetItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
    ): TreeSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(previouslySelectedItems = previouslySelectedItems.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], targetItem = targetItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setPreviouslySelectedItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
            ]
      ): Self = StObject.set(x, "previouslySelectedItems", value.asInstanceOf[js.Any])
      
      inline def setPreviouslySelectedItemsVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default*): Self = StObject.set(x, "previouslySelectedItems", js.Array(value*))
      
      inline def setSelectedItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
            ]
      ): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setTargetItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default): Self = StObject.set(x, "targetItem", value.asInstanceOf[js.Any])
    }
  }
  
  type WalkCallback = js.Function3[
    /* item */ io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default, 
    /* level */ Double, 
    /* index */ Double, 
    Unit
  ]
}
