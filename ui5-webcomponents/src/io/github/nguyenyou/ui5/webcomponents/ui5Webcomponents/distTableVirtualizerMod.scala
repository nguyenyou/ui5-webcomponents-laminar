package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Rangechange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.ITableFeature
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.InvalidationInfo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableVirtualizerMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-virtualizer` component is used inside the `ui5-table` to virtualize the table rows, if the `overflowMode` property of the table is set to 'Scroll'.
    * It is responsible for rendering only the rows that are visible in the viewport and updating them on scroll.
    * This allows large numbers of rows to exist, but maintain high performance by only paying the cost for those that are currently visible.
    *
    * **Note:** The maximum number of virtualized rows is limited by browser constraints, specifically the maximum supported height for a DOM element.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TableVirtualizer.js";`
    *
    * @constructor
    * @since 2.5.0
    * @extends UI5Element
    * @public
    * @experimental This component is not intended to be used in a productive enviroment. The API is under development and may be changed in the future.
    */
  @JSImport("@ui5/webcomponents/dist/TableVirtualizer", JSImport.Default)
  @js.native
  open class default () extends TableVirtualizer
  
  @js.native
  sealed trait TabBlocking extends StObject
  @JSImport("@ui5/webcomponents/dist/TableVirtualizer", "TabBlocking")
  @js.native
  object TabBlocking extends StObject {
    
    @js.native
    sealed trait Next
      extends StObject
         with TabBlocking
    
    @js.native
    sealed trait NextReleased
      extends StObject
         with TabBlocking
    
    @js.native
    sealed trait None
      extends StObject
         with TabBlocking
    
    @js.native
    sealed trait Previous
      extends StObject
         with TabBlocking
    
    @js.native
    sealed trait PreviousReleased
      extends StObject
         with TabBlocking
    
    @js.native
    sealed trait Released
      extends StObject
         with TabBlocking
  }
  
  /**
    * Fired when the virtualizer is changed by user interaction e.g. on scrolling.
    * @param number {first} The 0-based index of the first children currently rendered
    * @param number {last} The 0-based index of the last children currently rendered
    * @public
    */
  trait RangeChangeEventDetail extends StObject {
    
    var first: Double
    
    var last: Double
  }
  object RangeChangeEventDetail {
    
    inline def apply(first: Double, last: Double): RangeChangeEventDetail = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-virtualizer` component is used inside the `ui5-table` to virtualize the table rows, if the `overflowMode` property of the table is set to 'Scroll'.
    * It is responsible for rendering only the rows that are visible in the viewport and updating them on scroll.
    * This allows large numbers of rows to exist, but maintain high performance by only paying the cost for those that are currently visible.
    *
    * **Note:** The maximum number of virtualized rows is limited by browser constraints, specifically the maximum supported height for a DOM element.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/TableVirtualizer.js";`
    *
    * @constructor
    * @since 2.5.0
    * @extends UI5Element
    * @public
    * @experimental This component is not intended to be used in a productive enviroment. The API is under development and may be changed in the future.
    */
  @js.native
  trait TableVirtualizer extends ITableFeature {
    
    var _firstRowPosition: Double = js.native
    
    def _getTransform(): js.UndefOr[String] = js.native
    
    var _lastRowPosition: Double = js.native
    
    def _onKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onRowInvalidate(invalidationInfo: InvalidationInfo): Unit = js.native
    
    def _onRowInvalidateBound(invalidationInfo: InvalidationInfo): Unit = js.native
    
    def _onScroll(): Unit = js.native
    
    def _onScrollBound(): Unit = js.native
    
    def _rowsContainer: HTMLElement = js.native
    
    def _scrollContainer: HTMLElement = js.native
    
    var _tabBlockingState: TabBlocking = js.native
    
    var _table: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default] = js.native
    
    def _updateRowsHeight(): Unit = js.native
    
    var _visibleRowCount: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableVirtualizer: Rangechange = js.native
    
    /**
      * Defines the count of extra rows to be rendered at the top and bottom of the table.
      *
      * **Note:** This property is experimental and may be changed or deleted in the future.
      *
      * @default 0
      * @public
      */
    var extraRows: Double = js.native
    
    @JSName("onTableAfterRendering")
    def onTableAfterRendering_MTableVirtualizer(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default): Unit = js.native
    
    /**
      * Resets the virtualizer to its initial state and triggers the `range-change` event.
      * @public
      */
    def reset(): Unit = js.native
    
    /**
      * Defines the total count of rows in the table.
      *
      * **Note:** For virtualization to work properly, this property is mandatory.
      *
      * @default 100
      * @public
      */
    var rowCount: Double = js.native
    
    /**
      * Defines the height of the rows in the table.
      *
      * **Note:** For virtualization to work properly, this property is mandatory.
      *
      * @default 45
      * @public
      */
    var rowHeight: Double = js.native
  }
}
