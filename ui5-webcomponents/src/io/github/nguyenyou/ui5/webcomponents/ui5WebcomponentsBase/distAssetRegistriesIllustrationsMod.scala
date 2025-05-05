package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesIllustrationsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Illustrations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIllustrationData(illustrationName: String): js.Promise[js.UndefOr[IllustrationProperties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIllustrationData")(illustrationName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IllustrationProperties]]]
  
  inline def getIllustrationDataSync(illustrationName: String): js.UndefOr[IllustrationProperties] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIllustrationDataSync")(illustrationName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IllustrationProperties]]
  
  inline def registerIllustration(name: String, data: IllustrationData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIllustration")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIllustrationLoader(illustrationName: String, loader: IllustrationLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIllustrationLoader")(illustrationName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IllustrationData
    extends StObject
       with IllustrationProperties {
    
    var collection: String
    
    var set: String
  }
  object IllustrationData {
    
    inline def apply(
      collection: String,
      dialogSvg: String,
      dotSvg: String,
      sceneSvg: String,
      set: String,
      spotSvg: String,
      subtitle: I18nText,
      title: I18nText
    ): IllustrationData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], dialogSvg = dialogSvg.asInstanceOf[js.Any], dotSvg = dotSvg.asInstanceOf[js.Any], sceneSvg = sceneSvg.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], spotSvg = spotSvg.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IllustrationData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IllustrationData] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  type IllustrationLoader = js.Function1[/* illustrationName */ String, js.Promise[IllustrationData]]
  
  trait IllustrationProperties extends StObject {
    
    var dialogSvg: String
    
    var dotSvg: String
    
    var sceneSvg: String
    
    var spotSvg: String
    
    var subtitle: I18nText
    
    var title: I18nText
  }
  object IllustrationProperties {
    
    inline def apply(
      dialogSvg: String,
      dotSvg: String,
      sceneSvg: String,
      spotSvg: String,
      subtitle: I18nText,
      title: I18nText
    ): IllustrationProperties = {
      val __obj = js.Dynamic.literal(dialogSvg = dialogSvg.asInstanceOf[js.Any], dotSvg = dotSvg.asInstanceOf[js.Any], sceneSvg = sceneSvg.asInstanceOf[js.Any], spotSvg = spotSvg.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IllustrationProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IllustrationProperties] (val x: Self) extends AnyVal {
      
      inline def setDialogSvg(value: String): Self = StObject.set(x, "dialogSvg", value.asInstanceOf[js.Any])
      
      inline def setDotSvg(value: String): Self = StObject.set(x, "dotSvg", value.asInstanceOf[js.Any])
      
      inline def setSceneSvg(value: String): Self = StObject.set(x, "sceneSvg", value.asInstanceOf[js.Any])
      
      inline def setSpotSvg(value: String): Self = StObject.set(x, "spotSvg", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: I18nText): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: I18nText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
