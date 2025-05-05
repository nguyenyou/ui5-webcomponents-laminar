package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsMod.BreadcrumbsItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemclick extends StObject {
  
  var `item-click`: BreadcrumbsItemClickEventDetail
}
object Itemclick {
  
  inline def apply(`item-click`: BreadcrumbsItemClickEventDetail): Itemclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemclick] (val x: Self) extends AnyVal {
    
    inline def `setItem-click`(value: BreadcrumbsItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
  }
}
