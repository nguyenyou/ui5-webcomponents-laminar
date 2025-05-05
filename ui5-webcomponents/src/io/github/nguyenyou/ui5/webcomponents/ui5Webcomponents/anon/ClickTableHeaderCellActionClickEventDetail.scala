package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellActionBaseMod.TableHeaderCellActionClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTableHeaderCellActionClickEventDetail extends StObject {
  
  var click: TableHeaderCellActionClickEventDetail
}
object ClickTableHeaderCellActionClickEventDetail {
  
  inline def apply(click: TableHeaderCellActionClickEventDetail): ClickTableHeaderCellActionClickEventDetail = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickTableHeaderCellActionClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickTableHeaderCellActionClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def setClick(value: TableHeaderCellActionClickEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
