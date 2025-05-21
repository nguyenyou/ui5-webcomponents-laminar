package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ClickTableHeaderCellActionClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Icon
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableHeaderCellActionBaseMod {
  
  /**
    * Fired when a header cell action is clicked.
    *
    * @param {HTMLElement} targetRef The reference to the element that triggered the event
    * @public
    * @since 2.8.0
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/TableHeaderCellActionBase", JSImport.Default)
  @js.native
  open class default () extends TableHeaderCellActionBase
  
  /**
    * Fired when a header cell action is clicked.
    *
    * @param {HTMLElement} targetRef The reference to the element that triggered the event
    * @public
    * @since 2.8.0
    */
  @js.native
  trait TableHeaderCellActionBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _icon: String = js.native
    
    @JSName("_onClick")
    def _onClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _tooltip: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableHeaderCellActionBase: ClickTableHeaderCellActionClickEventDetail = js.native
    
    def getRenderInfo(): Icon = js.native
  }
  
  /**
    * Fired when a header cell action is clicked.
    *
    * @param {HTMLElement} targetRef The reference to the element that triggered the event
    * @public
    * @since 2.8.0
    */
  trait TableHeaderCellActionClickEventDetail extends StObject {
    
    var targetRef: HTMLElement
  }
  object TableHeaderCellActionClickEventDetail {
    
    inline def apply(targetRef: HTMLElement): TableHeaderCellActionClickEventDetail = {
      val __obj = js.Dynamic.literal(targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeaderCellActionClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableHeaderCellActionClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
