package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesInvisibleMessageModeMod.InvisibleMessageMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilInvisibleMessageMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/InvisibleMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Inserts the string into the respective span, depending on the mode provided.
    *
    * @param { string } message String to be announced by the screen reader.
    * @param { InvisibleMessageMode } mode The mode to be inserted in the aria-live attribute.
    * @public
    */
  inline def default(message: String, mode: InvisibleMessageMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(message.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
