package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesUtilIconCollectionsByThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/IconCollectionsByTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RegisteredIconCollection extends StObject
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/IconCollectionsByTheme", "RegisteredIconCollection")
  @js.native
  object RegisteredIconCollection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RegisteredIconCollection & String] = js.native
    
    @js.native
    sealed trait SAPBSIconsV1
      extends StObject
         with RegisteredIconCollection
    /* "business-suite-v1" */ val SAPBSIconsV1: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPBSIconsV1 & String = js.native
    
    @js.native
    sealed trait SAPBSIconsV2
      extends StObject
         with RegisteredIconCollection
    /* "business-suite-v2" */ val SAPBSIconsV2: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPBSIconsV2 & String = js.native
    
    @js.native
    sealed trait SAPIconsTNTV2
      extends StObject
         with RegisteredIconCollection
    /* "tnt-v2" */ val SAPIconsTNTV2: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsTNTV2 & String = js.native
    
    @js.native
    sealed trait SAPIconsTNTV3
      extends StObject
         with RegisteredIconCollection
    /* "tnt-v3" */ val SAPIconsTNTV3: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsTNTV3 & String = js.native
    
    @js.native
    sealed trait SAPIconsV4
      extends StObject
         with RegisteredIconCollection
    /* "SAP-icons-v4" */ val SAPIconsV4: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsV4 & String = js.native
    
    @js.native
    sealed trait SAPIconsV5
      extends StObject
         with RegisteredIconCollection
    /* "SAP-icons-v5" */ val SAPIconsV5: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsV5 & String = js.native
  }
  
  inline def getIconCollectionForTheme(collectionName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconCollectionForTheme")(collectionName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Registers collection version per theme.
    * **For exmaple:** registerIconCollectionForTheme("my-custom-icons", {"sap_horizon": "my-custom-icons-v5"})
    * @param { string } collectionName
    * @param { ThemeToCollectionMap } themeCollectionMap
    */
  inline def registerIconCollectionForTheme(collectionName: String, themeCollectionMap: ThemeToCollectionMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconCollectionForTheme")(collectionName.asInstanceOf[js.Any], themeCollectionMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ThemeToCollectionMap = StringDictionary[String]
}
