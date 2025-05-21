package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesRegistryMod {
  
  @JSImport("@ui5/webcomponents-base/dist/FeaturesRegistry.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFeature[T](name: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeature")(name.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def registerFeature(name: String, feature: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFeature")(name.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
