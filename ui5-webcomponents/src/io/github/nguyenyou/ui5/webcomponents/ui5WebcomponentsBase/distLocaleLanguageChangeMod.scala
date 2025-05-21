package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleLanguageChangeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/locale/languageChange.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachLanguageChange(listener: LanguageChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachLanguageChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachLanguageChange(listener: LanguageChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachLanguageChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fireLanguageChange(lang: String): js.Promise[js.Array[Unit | js.Array[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fireLanguageChange")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Unit | js.Array[Unit]]]]
  
  type LanguageChangeCallback = js.Function1[/* lang */ String, js.Promise[Unit | js.Array[Unit]]]
}
