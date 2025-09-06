package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Element
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Move
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Placement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemGroupMod {
  
  @JSImport("@ui5/webcomponents/dist/ListItemGroup.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    * ### Overview
    * The `ui5-li-group` is a special list item, used only to create groups of list items.
    *
    * This is the item to use inside a `ui5-list`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ListItemGroup.js";`
    * @csspart header - Used to style the header item of the group
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents/dist/ListItemGroup.js", JSImport.Default)
  @js.native
  open class default () extends ListItemGroup
  
  inline def isInstanceOfListItemGroup(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/ListItemGroup.ListItemGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfListItemGroup")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/ListItemGroup.ListItemGroup */ Boolean]
  
  /**
    * @class
    * ### Overview
    * The `ui5-li-group` is a special list item, used only to create groups of list items.
    *
    * This is the item to use inside a `ui5-list`.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/ListItemGroup.js";`
    * @csspart header - Used to style the header item of the group
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @js.native
  trait ListItemGroup
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _dragAndDropHandler: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDelegateDragAndDropHandlerMod.default = js.native
    
    def _filterPlacements(placements: js.Array[MovePlacement], draggedElement: HTMLElement, targetElement: HTMLElement): js.Array[MovePlacement] = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(e: DragEvent): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def dropIndicatorDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_ListItemGroup: Move = js.native
    
    /**
      * Indicates whether the header is focused
      * @private
      */
    var focused: Boolean = js.native
    
    def groupHeaderItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupHeaderMod.default = js.native
    
    def hasFormattedHeader: Boolean = js.native
    
    def hasHeader: Boolean = js.native
    
    /**
      * Defines the header of the component.
      *
      * **Note:** Using this slot, the default header text of group and the value of `headerText` property will be overwritten.
      * @public
      */
    var header: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    /**
      * Defines the accessible name of the header.
      * @public
      * @default undefined
      */
    var headerAccessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the header text of the <code>ui5-li-group</code>.
      * @public
      * @default undefined
      */
    var headerText: js.UndefOr[String] = js.native
    
    def isListItemGroup: Boolean = js.native
    
    /**
      * Defines the items of the <code>ui5-li-group</code>.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    /**
      * Defines if the text of the component should wrap when it's too long.
      * When set to "Normal", the content (title, description) will be wrapped
      * using the `ui5-expandable-text` component.<br/>
      *
      * The text can wrap up to 100 characters on small screens (size S) and
      * up to 300 characters on larger screens (size M and above). When text exceeds
      * these limits, it truncates with an ellipsis followed by a text expansion trigger.
      *
      * Available options are:
      * - `None` (default) - The text will truncate with an ellipsis.
      * - `Normal` - The text will wrap (without truncation).
      *
      * @default "None"
      * @public
      * @since 2.15.0
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
  
  trait ListItemGroupMoveEventDetail extends StObject {
    
    var destination: Placement
    
    var source: Element
  }
  object ListItemGroupMoveEventDetail {
    
    inline def apply(destination: Placement, source: Element): ListItemGroupMoveEventDetail = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemGroupMoveEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemGroupMoveEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: Placement): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
