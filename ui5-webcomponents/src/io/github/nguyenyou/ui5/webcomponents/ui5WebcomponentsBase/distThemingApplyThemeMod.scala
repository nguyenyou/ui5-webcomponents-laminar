package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingApplyThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/applyTheme.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
