package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleDirectionChangeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/locale/directionChange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attach a callback that will be executed whenever the application calls the "applyDirection" function
    * @public
    * @param listener
    */
  inline def attachDirectionChange(listener: DirectionChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachDirectionChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Detach a callback that was passed with "attachDirectionChange"
    * @public
    * @param listener
    */
  inline def detachDirectionChange(listener: DirectionChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachDirectionChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fireDirectionChange(): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fireDirectionChange")().asInstanceOf[js.Array[Unit]]
  
  type DirectionChangeCallback = js.Function0[Unit]
}
