package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsI18nMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A decorator that converts a static class member into an accessor for the i18n bundle with a specified name
    *
    * @param { string } bundleName name of the i18n bundle to load
    * @returns { i18nDecorator }
    *
    * ```ts
    * class MyComponnet extends UI5Element {
    *   @i18n('@ui5/webcomponents')
    *   i18nBundle: I18nBundle;
    * }
    * ```
    */
  inline def default(bundleName: String): i18nDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bundleName.asInstanceOf[js.Any]).asInstanceOf[i18nDecorator]
  
  type i18nDecorator = js.Function2[
    /* target */ Instantiable0[default] & TypeofUI5Element, 
    /* propertyName */ String, 
    Unit
  ]
}
