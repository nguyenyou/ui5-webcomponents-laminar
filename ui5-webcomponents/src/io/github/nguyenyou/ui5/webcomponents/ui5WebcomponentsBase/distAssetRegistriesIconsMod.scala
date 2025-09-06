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
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Icons.js", JSImport.Namespace)
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
  
  inline def getIconData(iconName: String): js.Promise[js.UndefOr[IconData | UnsafeIconData | ICON_NOT_FOUND]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconData")(iconName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IconData | UnsafeIconData | ICON_NOT_FOUND]]]
  
  inline def getIconDataSync(iconName: String): js.UndefOr[IconData | UnsafeIconData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDataSync")(iconName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IconData | UnsafeIconData]]
  
  inline def getRegisteredNames(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getRegisteredNames")().asInstanceOf[js.Promise[js.Array[String]]]
  
  /**
    * Registers a SVG icon with the given name and associated icon data.
    *
    * This method is used to add an icon to the registry, making it available for use
    * in the application.
    *
    * @public
    * @param { string } name - The name of the icon to register.
    * @param { IconData } iconData - The data associated with the icon: `collection`, `pathData`, `packageName`
    * `customTemplate`, `viewBox`, `ltr`, `accData`.
    *
    * <b>Note:</b> Properties `pathData` and `customTemplate` are mutually exclusive.
    * If both are set, `customTemplate` will be used.
    */
  inline def registerIcon(name: String, iconData: IconData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIcon")(name.asInstanceOf[js.Any], iconData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIconLoader(collectionName: String, loader: IconLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconLoader")(collectionName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Registers a SVG icon in the registry with the given name and icon data.
    *
    * <b>Note:</b> This method is unsafe as it allows the SVG content to be passed as a string
    * through the `customTemplateAsString` property of the `iconData`.
    * Ensure that the SVG content is properly validated.
    * Improperly sanitized SVG strings can lead to security vulnerabilities such as XSS (Cross-Site Scripting).
    *
    * @public
    * @param { string } name - The name of the icon to register.
    * @param { UnsafeIconData } iconData - The data for the icon: `collection`, `customTemplateAsString`, `packageName`
    * `viewBox`, `ltr` and `accData`.
    * @since 2.14.0
    */
  inline def unsafeRegisterIcon(name: String, iconData: UnsafeIconData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeRegisterIcon")(name.asInstanceOf[js.Any], iconData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  trait IconData
    extends StObject
       with IconDatabase {
    
    var customTemplate: js.UndefOr[TemplateFunction] = js.undefined
    
    var pathData: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object IconData {
    
    inline def apply(collection: String): IconData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconData] (val x: Self) extends AnyVal {
      
      inline def setCustomTemplate(value: () => js.Object): Self = StObject.set(x, "customTemplate", js.Any.fromFunction0(value))
      
      inline def setCustomTemplateUndefined: Self = StObject.set(x, "customTemplate", js.undefined)
      
      inline def setPathData(value: String | js.Array[String]): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      inline def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      inline def setPathDataVarargs(value: String*): Self = StObject.set(x, "pathData", js.Array(value*))
    }
  }
  
  trait IconDatabase extends StObject {
    
    var accData: js.UndefOr[I18nText] = js.undefined
    
    var collection: String
    
    var ltr: js.UndefOr[Boolean] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object IconDatabase {
    
    inline def apply(collection: String): IconDatabase = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDatabase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconDatabase] (val x: Self) extends AnyVal {
      
      inline def setAccData(value: I18nText): Self = StObject.set(x, "accData", value.asInstanceOf[js.Any])
      
      inline def setAccDataUndefined: Self = StObject.set(x, "accData", js.undefined)
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setLtr(value: Boolean): Self = StObject.set(x, "ltr", value.asInstanceOf[js.Any])
      
      inline def setLtrUndefined: Self = StObject.set(x, "ltr", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  type IconLoader = js.Function1[/* collectionName */ String, js.Promise[CollectionData | js.Array[CollectionData]]]
  
  trait UnsafeIconData
    extends StObject
       with IconDatabase {
    
    var customTemplateAsString: String
  }
  object UnsafeIconData {
    
    inline def apply(collection: String, customTemplateAsString: String): UnsafeIconData = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], customTemplateAsString = customTemplateAsString.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsafeIconData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnsafeIconData] (val x: Self) extends AnyVal {
      
      inline def setCustomTemplateAsString(value: String): Self = StObject.set(x, "customTemplateAsString", value.asInstanceOf[js.Any])
    }
  }
}
