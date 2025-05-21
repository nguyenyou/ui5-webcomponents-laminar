package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigNoConflictMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/NoConflict.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns if the "noConflict" configuration is set.
    * @public
    * @returns { NoConflictData }
    */
  inline def getNoConflict(): NoConflictData = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoConflict")().asInstanceOf[NoConflictData]
  
  /**
    * Sets the "noConflict" mode.
    * - When "false" (default value), all custom events are fired with and without the "ui5-" prefix.
    * - When "true", all custom events are fired with the "ui5-" prefix only.
    * - When an object is supplied, just the specified events will be fired with the "ui5-" prefix.
    * @public
    * @param { NoConflictData } noConflictData
    */
  inline def setNoConflict(noConflictData: NoConflictData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNoConflict")(noConflictData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def skipOriginalEvent(eventName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("skipOriginalEvent")(eventName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type NoConflictData = Boolean | Events
}
