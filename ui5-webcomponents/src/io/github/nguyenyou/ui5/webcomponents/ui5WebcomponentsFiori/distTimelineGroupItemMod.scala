package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Toggle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTimelineMod.ITimelineItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimelineGroupItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * An entry posted on the timeline.
    * It is intented to represent a group of `<ui5-timeline-item>`s.
    *
    * **Note**: Please do not use empty groups in order to preserve the intended design.
    *
    * @constructor
    * @extends UI5Element
    * @implements {ITimelineItem}
    * @public
    * @since 2.1.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/TimelineGroupItem.js", JSImport.Default)
  @js.native
  open class default () extends TimelineGroupItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * An entry posted on the timeline.
    * It is intented to represent a group of `<ui5-timeline-item>`s.
    *
    * **Note**: Please do not use empty groups in order to preserve the intended design.
    *
    * @constructor
    * @extends UI5Element
    * @implements {ITimelineItem}
    * @public
    * @since 2.1.0
    */
  @js.native
  trait TimelineGroupItem extends ITimelineItem {
    
    def _groupName: js.UndefOr[String] = js.native
    
    def _setGroupItemProps(): Unit = js.native
    
    /**
      * Determines if the group is collapsed or expanded.
      * @default false
      * @public
      */
    @JSName("collapsed")
    var collapsed_TimelineGroupItem: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimelineGroupItem: Toggle = js.native
    
    /**
      * @private
      */
    @JSName("firstItemInTimeline")
    var firstItemInTimeline_TimelineGroupItem: Boolean = js.native
    
    @JSName("forcedTabIndex")
    var forcedTabIndex_TimelineGroupItem: String = js.native
    
    /**
      * Defines the text of the button that expands and collapses the group.
      * @default undefined
      * @public
      */
    var groupName: js.UndefOr[String] = js.native
    
    @JSName("isGroupItem")
    def isGroupItem_MTimelineGroupItem: Boolean = js.native
    
    /**
      * Determines if the item afterwards is a group item.
      * Intended for styling purposes.
      * @private
      */
    @JSName("isNextItemGroup")
    var isNextItemGroup_TimelineGroupItem: Boolean = js.native
    
    /**
      * Determines the content of the `ui5-timeline-group-item`.
      * @public
      */
    @JSName("items")
    var items_TimelineGroupItem: js.Array[ITimelineItem] = js.native
    
    def onGroupItemClick(): Unit = js.native
  }
}
