package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acc extends StObject {
  
  var acc: js.UndefOr[I18nText] = js.undefined
  
  var ltr: js.UndefOr[Boolean] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}
object Acc {
  
  inline def apply(): Acc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Acc] (val x: Self) extends AnyVal {
    
    inline def setAcc(value: I18nText): Self = StObject.set(x, "acc", value.asInstanceOf[js.Any])
    
    inline def setAccUndefined: Self = StObject.set(x, "acc", js.undefined)
    
    inline def setLtr(value: Boolean): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
    
    inline def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
