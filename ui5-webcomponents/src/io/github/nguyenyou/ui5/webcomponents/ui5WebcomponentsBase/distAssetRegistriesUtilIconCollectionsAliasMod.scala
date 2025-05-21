package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesUtilIconCollectionsAliasMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/IconCollectionsAlias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/IconCollectionsAlias", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconCollectionsAlias & String] = js.native
    
    /* "business-suite" */ val BusinessSuiteInAppSymbols: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsAliasMod.IconCollectionsAlias.BusinessSuiteInAppSymbols & String = js.native
    
    /* "SAP-icons-v4" */ val `SAP-icons`: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsAliasMod.IconCollectionsAlias.`SAP-icons` & String = js.native
    
    /* "tnt" */ val `SAP-icons-TNT`: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsAliasMod.IconCollectionsAlias.`SAP-icons-TNT` & String = js.native
    
    /* "SAP-icons-v5" */ val horizon: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsAliasMod.IconCollectionsAlias.horizon & String = js.native
  }
  
  @js.native
  sealed trait IconCollectionsAlias extends StObject
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/IconCollectionsAlias", "IconCollectionsAlias")
  @js.native
  object IconCollectionsAlias extends StObject {
    
    @js.native
    sealed trait BusinessSuiteInAppSymbols
      extends StObject
         with IconCollectionsAlias
    
    @js.native
    sealed trait `SAP-icons`
      extends StObject
         with IconCollectionsAlias
    
    @js.native
    sealed trait `SAP-icons-TNT`
      extends StObject
         with IconCollectionsAlias
    
    @js.native
    sealed trait horizon
      extends StObject
         with IconCollectionsAlias
  }
  
  /**
    * Returns the collection name for a given alias:
    *
    * - "SAP-icons-TNT"resolves to "tnt"
    * - "BusinessSuiteInAppSymbols" resolves to "business-suite"
    * - "horizon" resolves to "SAP-icons-v5"
    *
    * @param { string } collectionName
    * @return { string } the normalized collection name
    */
  inline def getIconCollectionByAlias(collectionName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconCollectionByAlias")(collectionName.asInstanceOf[js.Any]).asInstanceOf[String]
}
