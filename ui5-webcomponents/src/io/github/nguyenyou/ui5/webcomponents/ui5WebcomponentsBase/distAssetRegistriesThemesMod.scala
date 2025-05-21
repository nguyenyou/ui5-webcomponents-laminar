package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAssetRegistriesThemesMod {
  
  @JSImport("@ui5/webcomponents-base/dist/asset-registries/Themes.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredPackages(): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredPackages")().asInstanceOf[Set[String]]
  
  inline def getThemeProperties(packageName: String, themeName: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProperties")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def getThemeProperties(packageName: String, themeName: String, externalThemeName: String): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProperties")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], externalThemeName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
  
  inline def isThemeRegistered(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThemeRegistered")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerCustomThemePropertiesLoader(packageName: String, themeName: String, loader: ThemeLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomThemePropertiesLoader")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerThemePropertiesLoader(packageName: String, themeName: String, loader: ThemeLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerThemePropertiesLoader")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type ThemeData = String
  
  type ThemeLoader = js.Function1[/* themeName */ String, js.Promise[String]]
}
