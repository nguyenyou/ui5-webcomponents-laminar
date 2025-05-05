package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConnectToComponentMod {
  
  @JSImport("@ui5/webcomponents-base/dist/connectToComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: ConnectOptions): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  
  trait ConnectOptions extends StObject {
    
    var host: default
    
    var onConnect: js.UndefOr[js.Function1[/* friend */ HTMLElement, Unit]] = js.undefined
    
    var onDisconnect: js.UndefOr[js.Function1[/* friend */ HTMLElement, Unit]] = js.undefined
    
    var propName: String
  }
  object ConnectOptions {
    
    inline def apply(host: default, propName: String): ConnectOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      inline def setHost(value: default): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOnConnect(value: /* friend */ HTMLElement => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: /* friend */ HTMLElement => Unit): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1(value))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
    }
  }
}
