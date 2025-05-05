package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Location", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocationHostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHostname")().asInstanceOf[String]
  
  inline def getLocationHref(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationHref")().asInstanceOf[String]
  
  inline def getLocationPort(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationPort")().asInstanceOf[String]
  
  inline def getLocationProtocol(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationProtocol")().asInstanceOf[String]
  
  inline def getLocationSearch(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationSearch")().asInstanceOf[String]
  
  object internals {
    
    @JSImport("@ui5/webcomponents-base/dist/Location", "internals")
    @js.native
    val ^ : js.Any = js.native
    
    inline def search(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("search")().asInstanceOf[String]
  }
  
  inline def locationOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")().asInstanceOf[Unit]
  inline def locationOpen(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def locationOpen(url: String, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: String, target: String, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: String, target: Unit, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: URL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def locationOpen(url: URL, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: URL, target: String, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: URL, target: Unit, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: Unit, target: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: Unit, target: String, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def locationOpen(url: Unit, target: Unit, features: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("locationOpen")(url.asInstanceOf[js.Any], target.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def locationReload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locationReload")().asInstanceOf[Unit]
}
