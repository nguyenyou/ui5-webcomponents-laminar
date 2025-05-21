package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Acc
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ICON_NOT_FOUND
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.legacy
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.sap_horizon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesIconsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the accessible name for the given icon,
    * or undefined if accessible name is not present.
    *
    * @param { string } name
    * @return { Promise }
    */
  inline def getIconAccessibleName(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconAccessibleName")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def getIconAccessibleName(name: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconAccessibleName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def getIconData(iconName: String): js.Promise[js.UndefOr[IconData | ICON_NOT_FOUND]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconData")(iconName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IconData | ICON_NOT_FOUND]]]
  
  inline def getIconDataSync(iconName: String): js.UndefOr[IconData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDataSync")(iconName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IconData]]
  
  inline def getRegisteredNames(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRegisteredNames")().asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def registerIcon(name: String, iconData: IconData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIcon")(name.asInstanceOf[js.Any], iconData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIconLoader(collectionName: String, loader: IconLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconLoader")(collectionName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CollectionData extends StObject {
    
    var collection: String
    
    var data: Record[String, Acc]
    
    var packageName: String
    
    var themeFamily: js.UndefOr[legacy | sap_horizon] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object CollectionData {
    
    inline def apply(collection: String, data: Record[String, Acc], packageName: String): CollectionData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionData] (val x: Self) extends AnyVal {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setData(value: Record[String, Acc]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setThemeFamily(value: legacy | sap_horizon): Self = StObject.set(x, "themeFamily", value.asInstanceOf[js.Any])
      
      inline def setThemeFamilyUndefined: Self = StObject.set(x, "themeFamily", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait IconData extends StObject {
    
    var accData: js.UndefOr[I18nText] = js.undefined
    
    var collection: String
    
    var customTemplate: js.UndefOr[TemplateFunction] = js.undefined
    
    var ltr: js.UndefOr[Boolean] = js.undefined
    
    var packageName: String
    
    var pathData: String | js.Array[String]
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object IconData {
    
    inline def apply(collection: String, packageName: String, pathData: String | js.Array[String]): IconData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], pathData = pathData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconData] (val x: Self) extends AnyVal {
      
      inline def setAccData(value: I18nText): Self = StObject.set(x, "accData", value.asInstanceOf[js.Any])
      
      inline def setAccDataUndefined: Self = StObject.set(x, "accData", js.undefined)
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setCustomTemplate(value: () => js.Object): Self = StObject.set(x, "customTemplate", js.Any.fromFunction0(value))
      
      inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
      
      inline def setLtr(value: Boolean): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      inline def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPathData(value: String | js.Array[String]): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      inline def setPathDataVarargs(value: String*): Self = StObject.set(x, "pathData", js.Array(value*))
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type IconLoader = js.Function1[/* collectionName */ String, js.Promise[CollectionData | js.Array[CollectionData]]]
}
