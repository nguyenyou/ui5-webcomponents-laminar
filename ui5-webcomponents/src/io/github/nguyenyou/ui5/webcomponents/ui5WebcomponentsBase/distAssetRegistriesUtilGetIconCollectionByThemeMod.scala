package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigIconsMod.IconCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesUtilGetIconCollectionByThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/util/getIconCollectionByTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the effective theme dependant icon collection:
    *
    * - "no collection" resolves to "SAP-icons-v4" in "Quartz" and to "SAP-icons-v5" in "Horizon"
    * - "tnt" (and its alias "SAP-icons-TNT") resolves to "tnt-v2" in "Quartz" and resolves to "tnt-v3" in "Horizon"
    * - "business-suite" (and its alias "BusinessSuiteInAppSymbols") resolves to "business-suite-v1" in "Quartz" and resolves to "business-suite-v2" in "Horizon"
    *
    * @param { IconCollection } collectionName
    * @returns { IconCollection } the effective collection name
    */
  inline def default(): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[IconCollection]
  inline def default(collectionName: IconCollection): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(collectionName.asInstanceOf[js.Any]).asInstanceOf[IconCollection]
}
