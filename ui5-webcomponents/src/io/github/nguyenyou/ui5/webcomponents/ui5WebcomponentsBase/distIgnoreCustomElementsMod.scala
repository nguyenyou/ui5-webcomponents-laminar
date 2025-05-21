package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIgnoreCustomElementsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/IgnoreCustomElements.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ignoreCustomElements(tagPrefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreCustomElements")(tagPrefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Determines whether custom elements with the given tag should be ignored.
    *
    * @private
    * @param { string } tag
    */
  inline def shouldIgnoreCustomElement(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnoreCustomElement")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
