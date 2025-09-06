package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Nameclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTimelineMod.ITimelineItem
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimelineItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * An entry posted on the timeline.
    * @constructor
    * @extends UI5Element
    * @implements { ITimelineItem }
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/TimelineItem.js", JSImport.Default)
  @js.native
  open class default () extends TimelineItem
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/TimelineItem.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/TimelineItem.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def typeTextMappings(): Record[String, I18nText] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeTextMappings")().asInstanceOf[Record[String, I18nText]]
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * An entry posted on the timeline.
    * @constructor
    * @extends UI5Element
    * @implements { ITimelineItem }
    * @public
    */
  @js.native
  trait TimelineItem extends ITimelineItem {
    
    def _getAccessibleLabel: String = js.native
    
    /**
      * Defines the content of the `ui5-timeline-item`.
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * @private
      */
    @JSName("effectiveRole")
    var effectiveRole_TimelineItem: /* template literal string: ${TimelineItemRole} */ String = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimelineItem: Nameclick = js.native
    
    /**
      * @private
      */
    @JSName("firstItemInTimeline")
    var firstItemInTimeline_TimelineItem: Boolean = js.native
    
    /**
      * Focus the internal link.
      */
    @JSName("focusLink")
    def focusLink_MTimelineItem(): Unit = js.native
    
    @JSName("forcedTabIndex")
    var forcedTabIndex_TimelineItem: String = js.native
    
    /**
      * @private
      */
    var hideBubble: Boolean = js.native
    
    @JSName("isGroupItem")
    def isGroupItem_MTimelineItem: Boolean = js.native
    
    /**
      * @private
      */
    @JSName("isNextItemGroup")
    var isNextItemGroup_TimelineItem: Boolean = js.native
    
    /**
      * Defines the name of the item, displayed before the `title-text`.
      * @default undefined
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Defines if the `name` is clickable.
      * @default false
      * @public
      */
    @JSName("nameClickable")
    var nameClickable_TimelineItem: Boolean = js.native
    
    def onNamePress(): Unit = js.native
    
    /**
      * Defines the state of the icon displayed in the `ui5-timeline-item`.
      * @default "None"
      * @public
      * @since 2.7.0
      */
    var state: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the subtitle text of the component.
      * @default undefined
      * @public
      */
    var subtitleText: js.UndefOr[String] = js.native
    
    def timelineItemStateText: js.UndefOr[String] = js.native
    
    /**
      * Defines the title text of the component.
      * @default undefined
      * @public
      */
    var titleText: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.listitem
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.treeitem
  */
  trait TimelineItemRole extends StObject
  object TimelineItemRole {
    
    inline def listitem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.listitem = "listitem".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.listitem]
    
    inline def treeitem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.treeitem = "treeitem".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.treeitem]
  }
}
