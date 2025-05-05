package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreContent extends StObject {
  
  var preContent: Paddinginlinestart
}
object PreContent {
  
  inline def apply(preContent: Paddinginlinestart): PreContent = {
    val __obj = js.Dynamic.literal(preContent = preContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreContent] (val x: Self) extends AnyVal {
    
    inline def setPreContent(value: Paddinginlinestart): Self = StObject.set(x, "preContent", value.asInstanceOf[js.Any])
  }
}
