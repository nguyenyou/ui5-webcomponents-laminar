package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.IShelBarItemInfo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.IShellBarContentItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInfo extends StObject {
  
  var contentInfo: js.Array[IShellBarContentItem]
  
  var itemsInfo: js.Array[IShelBarItemInfo]
}
object ContentInfo {
  
  inline def apply(contentInfo: js.Array[IShellBarContentItem], itemsInfo: js.Array[IShelBarItemInfo]): ContentInfo = {
    val __obj = js.Dynamic.literal(contentInfo = contentInfo.asInstanceOf[js.Any], itemsInfo = itemsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentInfo] (val x: Self) extends AnyVal {
    
    inline def setContentInfo(value: js.Array[IShellBarContentItem]): Self = StObject.set(x, "contentInfo", value.asInstanceOf[js.Any])
    
    inline def setContentInfoVarargs(value: IShellBarContentItem*): Self = StObject.set(x, "contentInfo", js.Array(value*))
    
    inline def setItemsInfo(value: js.Array[IShelBarItemInfo]): Self = StObject.set(x, "itemsInfo", value.asInstanceOf[js.Any])
    
    inline def setItemsInfoVarargs(value: IShelBarItemInfo*): Self = StObject.set(x, "itemsInfo", js.Array(value*))
  }
}
