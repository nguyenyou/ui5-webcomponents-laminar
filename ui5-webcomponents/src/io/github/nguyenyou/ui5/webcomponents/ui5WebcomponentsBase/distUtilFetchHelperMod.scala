package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilFetchHelperMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/FetchHelper.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchJsonOnce(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonOnce")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def fetchTextOnce(url: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchTextOnce")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
