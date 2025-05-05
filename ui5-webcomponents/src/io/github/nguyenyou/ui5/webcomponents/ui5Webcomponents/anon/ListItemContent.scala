package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemContent extends StObject {
  
  def listItemContent(): Unit
}
object ListItemContent {
  
  inline def apply(listItemContent: () => Unit): ListItemContent = {
    val __obj = js.Dynamic.literal(listItemContent = js.Any.fromFunction0(listItemContent))
    __obj.asInstanceOf[ListItemContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemContent] (val x: Self) extends AnyVal {
    
    inline def setListItemContent(value: () => Unit): Self = StObject.set(x, "listItemContent", js.Any.fromFunction0(value))
  }
}
