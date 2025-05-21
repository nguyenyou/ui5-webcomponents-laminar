package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesLocaleDataMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/LocaleData.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchCldr(language: String, region: String, script: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchCldr")(language.asInstanceOf[js.Any], region.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getLocaleData(localeId: String): CLDRData = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleData")(localeId.asInstanceOf[js.Any]).asInstanceOf[CLDRData]
  
  inline def registerLocaleDataLoader(localeId: String, loader: LocaleDataLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleDataLoader")(localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type CLDRData = Record[String, js.Object | Boolean | String]
  
  type LocaleDataLoader = js.Function1[/* locale */ String, js.Promise[CLDRData]]
}
