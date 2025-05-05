package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Detailclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PreContent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Stepin
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`navigation-down-arrow`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`navigation-right-arrow`
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeItemBaseMod {
  
  /**
    * A class to serve as a foundation
    * for the `TreeItem` and `TreeItemCustom` classes.
    * @abstract
    * @constructor
    * @extends ListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TreeItemBase", JSImport.Default)
  @js.native
  open class default () extends TreeItemBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TreeItemBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TreeItemBase", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * A class to serve as a foundation
    * for the `TreeItem` and `TreeItemCustom` classes.
    * @abstract
    * @constructor
    * @extends ListItem
    * @public
    */
  @js.native
  trait TreeItemBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.default {
    
    def _ariaLabel: String = js.native
    
    /**
      * Defines if the item should be collapsible or not.
      * @private
      * @default false
      * @since 1.10.0
      */
    var _fixed: Boolean = js.native
    
    def _toggleClick(e: KeyboardEvent): Unit = js.native
    def _toggleClick(e: MouseEvent): Unit = js.native
    
    def _toggleIconName: `navigation-right-arrow` | `navigation-down-arrow` = js.native
    
    /**
      * Defines the state of the `additionalText`.
      *
      * Available options are: `"None"` (by default), `"Positive"`, `"Critical"`, `"Information"` and `"Negative"`.
      * @default "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalTextState: /* template literal string: ${ValueState} */ String = js.native
    
    def effectiveLevel: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_TreeItemBase: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents.@ui5/webcomponents/dist/ListItemBase.default['eventDetails'] */ js.Any) & Detailclick & Stepin = js.native
    
    /**
      * Defines whether the tree list item will show a collapse or expand icon inside its toggle button.
      * @default false
      * @public
      */
    var expanded: Boolean = js.native
    
    /**
      * @private
      * @since 1.0.0-rc.11
      */
    var forcedPosinset: Double = js.native
    
    /**
      * @private
      * @since 1.0.0-rc.11
      */
    var forcedSetsize: Double = js.native
    
    /**
      * Defines whether the tree node has children, even if currently no other tree nodes are slotted inside.
      *
      * **Note:** This property is useful for showing big tree structures where not all nodes are initially loaded due to performance reasons.
      * Set this to `true` for nodes you intend to load lazily, when the user clicks the expand button.
      * It is not necessary to set this property otherwise. If a tree item has children, the expand button will be displayed anyway.
      * @default false
      * @public
      */
    var hasChildren: Boolean = js.native
    
    def hasParent: Boolean = js.native
    
    /**
      * If set, an icon will be displayed before the text of the tree list item.
      * @public
      * @default undefined
      */
    var icon: js.UndefOr[String] = js.native
    
    def iconAccessibleName: String = js.native
    
    /**
      * Defines whether the selection of a tree node is displayed as partially selected.
      *
      * **Note:** The indeterminate state can be set only programmatically and can’t be achieved by user
      * interaction, meaning that the resulting visual state depends on the values of the `indeterminate`
      * and `selected` properties:
      *
      * -  If a tree node has both `selected` and `indeterminate` set to `true`, it is displayed as partially selected.
      * -  If a tree node has `selected` set to `true` and `indeterminate` set to `false`, it is displayed as selected.
      * -  If a tree node has `selected` set to `false`, it is displayed as not selected regardless of the value of the `indeterminate` property.
      *
      * **Note:** This property takes effect only when the `ui5-tree` is in `Multiple` mode.
      * @default false
      * @public
      * @since 1.1.0
      */
    @JSName("indeterminate")
    var indeterminate_TreeItemBase: Boolean = js.native
    
    /**
      * Used to duck-type TreeItem elements without using instanceof
      * @default true
      * @protected
      */
    def isTreeItem: Boolean = js.native
    
    /**
      * Defines the items of the component.
      *
      * **Note:** Use `ui5-tree-item` or `ui5-tree-item-custom`
      * @public
      */
    var items: js.Array[TreeItemBase] = js.native
    
    /**
      * Defines the indentation of the tree list item. Use level 1 for tree list items, representing top-level tree nodes.
      * @protected
      * @default 1
      */
    var level: Double = js.native
    
    def requiresToggleButton: Boolean = js.native
    
    /**
      * Defines whether the tree list item should display an expand/collapse button.
      * @default false
      * @protected
      */
    var showToggleButton: Boolean = js.native
    
    def styles: PreContent = js.native
    
    /**
      * Call this method to manually switch the `expanded` state of a tree item.
      * @public
      */
    def toggle(): Unit = js.native
  }
  
  trait TreeItemBaseEventDetail extends StObject {
    
    var item: TreeItemBase
  }
  object TreeItemBaseEventDetail {
    
    inline def apply(item: TreeItemBase): TreeItemBaseEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeItemBaseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TreeItemBaseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: TreeItemBase): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type TreeItemBaseStepInEventDetail = TreeItemBaseEventDetail
  
  type TreeItemBaseStepOutEventDetail = TreeItemBaseEventDetail
  
  type TreeItemBaseToggleEventDetail = TreeItemBaseEventDetail
}
