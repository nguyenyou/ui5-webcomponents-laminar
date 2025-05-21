package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBootMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Boot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attaches a callback that will be executed after boot finishes.
    * **Note:** If the framework already booted, the callback will be immediately executed.
    * @public
    * @param { Function } listener
    */
  inline def attachBoot(listener: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBoot")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def boot(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("boot")().asInstanceOf[js.Promise[Unit]]
  
  inline def isBooted(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooted")().asInstanceOf[Boolean]
}
