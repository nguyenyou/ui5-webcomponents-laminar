package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigTimezoneMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Timezone.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTimezone(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Sets the IANA timezone ID.
    * **For example:** "America/New_York", "Europe/London", "Australia/Sydney", "Asia/Bishkek", etc.
    *>
    * @param {string} timezone
    * @private
    * @returns { Promise<void> }
    */
  inline def setTimezone(timezone: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimezone")(timezone.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
