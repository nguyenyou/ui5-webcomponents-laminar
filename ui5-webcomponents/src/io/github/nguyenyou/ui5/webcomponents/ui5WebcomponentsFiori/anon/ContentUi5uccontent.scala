package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentUi5uccontent extends StObject {
  
  var content: Ui5uccontent
}
object ContentUi5uccontent {
  
  inline def apply(content: Ui5uccontent): ContentUi5uccontent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUi5uccontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentUi5uccontent] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Ui5uccontent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
