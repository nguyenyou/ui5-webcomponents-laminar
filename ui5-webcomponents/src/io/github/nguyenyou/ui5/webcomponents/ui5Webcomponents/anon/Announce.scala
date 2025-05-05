package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesInvisibleMessageModeMod.InvisibleMessageMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Announce extends StObject {
  
  def announce(message: String, mode: InvisibleMessageMode): Unit
}
object Announce {
  
  inline def apply(announce: (String, InvisibleMessageMode) => Unit): Announce = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction2(announce))
    __obj.asInstanceOf[Announce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Announce] (val x: Self) extends AnyVal {
    
    inline def setAnnounce(value: (String, InvisibleMessageMode) => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction2(value))
  }
}
