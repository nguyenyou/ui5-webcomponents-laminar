package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesI18nMod.I18nLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distI18nBundleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/i18nBundle.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/i18nBundle.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with I18nBundle {
    def this(packageName: String) = this()
  }
  
  /**
    * Fetches and returns the I18nBundle instance for the given package.
    *
    * @public
    * @param packageName
    */
  inline def getI18nBundle(packageName: String): js.Promise[I18nBundle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getI18nBundle")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[I18nBundle]]
  
  /**
    * Allows developers to provide a custom getI18nBundle implementation
    * If this function is called, the custom implementation will be used for all components and will completely
    * replace the default implementation.
    *
    * @public
    * @param customGet the function to use instead of the standard getI18nBundle implementation
    */
  inline def registerCustomI18nBundleGetter(customGet: I18nBundleGetter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomI18nBundleGetter")(customGet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers i18n loader function for given package and locale.
    *
    * @public
    * @param {string} packageName for which package this loader can fetch data
    * @param {string} localeId locale that this loader can handle
    * @param {function} loader async function that will be passed a localeId and should return a JSON object
    */
  inline def registerI18nLoader(packageName: String, localeId: String, loader: I18nLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerI18nLoader")(packageName.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @class
    * @public
    */
  @js.native
  trait I18nBundle extends StObject {
    
    /**
      * Returns a text in the currently loaded language
      *
      * @public
      * @param textObj key/defaultText pair or just the key
      * @param params Values for the placeholders
      */
    def getText(textObj: I18nText, params: (Double | String)*): String = js.native
    def getText(textObj: String, params: (Double | String)*): String = js.native
    
    var packageName: String = js.native
  }
  
  type I18nBundleGetter = js.Function1[/* packageName */ String, js.Promise[I18nBundle]]
  
  trait I18nText extends StObject {
    
    var defaultText: String
    
    var key: String
  }
  object I18nText {
    
    inline def apply(defaultText: String, key: String): I18nText = {
      val __obj = js.Dynamic.literal(defaultText = defaultText.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nText] (val x: Self) extends AnyVal {
      
      inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
