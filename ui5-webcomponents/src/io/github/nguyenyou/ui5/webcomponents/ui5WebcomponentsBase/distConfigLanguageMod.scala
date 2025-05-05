package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigLanguageMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Language", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default languague.
    *
    * Note: Default language might be different than the configurated one.
    *
    * @public
    * @returns {string}
    */
  inline def getDefaultLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLanguage")().asInstanceOf[String]
  
  /**
    * Returns if the default language, that is inlined, should be fetched over the network.
    * @public
    * @returns {boolean}
    */
  inline def getFetchDefaultLanguage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetchDefaultLanguage")().asInstanceOf[Boolean]
  
  inline def getLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Defines if the default language, that is inlined, should be
    * fetched over the network instead of using the inlined one.
    * **Note:** By default the language will not be fetched.
    *
    * @public
    * @param {boolean} fetchDefaultLang
    */
  inline def setFetchDefaultLanguage(fetchDefaultLang: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFetchDefaultLanguage")(fetchDefaultLang.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Changes the current language, re-fetches all message bundles, updates all language-aware components
    * and returns a promise that resolves when all rendering is done.
    *
    * @param {string} language
    * @public
    * @returns {Promise<void>}
    */
  inline def setLanguage(language: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
