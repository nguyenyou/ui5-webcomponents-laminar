package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.PropertyDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsPropertyMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a property decorator.
    *
    * @param { Property } propData
    * @returns { PropertyDecorator }
    */
  inline def default(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropertyDecorator]
  inline def default(propData: Property): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(propData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
