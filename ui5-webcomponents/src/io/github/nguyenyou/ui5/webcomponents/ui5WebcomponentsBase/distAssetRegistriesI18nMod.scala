package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesI18nMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/i18n.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This method preforms the asynchronous task of fetching the actual text resources. It will fetch
    * each text resource over the network once (even for multiple calls to the same method).
    * It should be fully finished before the i18nBundle class is created in the webcomponents.
    * This method uses the bundle URLs that are populated by the `registerI18nBundle` method.
    * To simplify the usage, the synchronization of both methods happens internally for the same `bundleId`
    * @param {packageName} packageName the NPM package name
    * @public
    */
  inline def fetchI18nBundle(packageName: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchI18nBundle")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getI18nBundleData(packageName: String): js.UndefOr[I18nData | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getI18nBundleData")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[I18nData | Null]]
  
  /**
    * Registers i18n loader function for given package and locale.
    *
    * @public
    * @param {string} packageName for which package this loader can fetch data
    * @param {string} localeId locale that this loader can handle
    * @param {function} loader async function that will be passed a localeId and should return a JSON object
    */
  inline def registerI18nLoader(packageName: String, localeId: String, loader: I18nLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerI18nLoader")(packageName.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type I18nData = Record[String, String]
  
  type I18nLoader = js.Function1[/* localeId */ String, js.Promise[I18nData]]
}
