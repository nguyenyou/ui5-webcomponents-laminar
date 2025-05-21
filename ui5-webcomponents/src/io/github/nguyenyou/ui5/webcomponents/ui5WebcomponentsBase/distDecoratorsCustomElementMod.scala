package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.ClassDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cldr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsCustomElementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/customElement.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a custom element class decorator.
    *
    * @param { string | object } tagNameOrComponentSettings
    * @returns { ClassDecorator }
    */
  inline def default(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ClassDecorator]
  inline def default(tagNameOrComponentSettings: Cldr): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def default(tagNameOrComponentSettings: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
