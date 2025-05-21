package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCustomElementsRegistryMod {
  
  @JSImport("@ui5/webcomponents-base/dist/CustomElementsRegistry.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllRegisteredTags(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllRegisteredTags")().asInstanceOf[js.Array[String]]
  
  inline def hasRegisteredTags(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRegisteredTags")().asInstanceOf[Boolean]
  
  inline def isTagRegistered(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTagRegistered")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def recordTagRegistrationFailure(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("recordTagRegistrationFailure")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerTag(tag: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTag")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
