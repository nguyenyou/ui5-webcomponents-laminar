package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ListItemContent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemBaseTemplateMod {
  
  @JSImport("@ui5/webcomponents/dist/ListItemBaseTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(hooks: ListItemContent): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def default(hooks: ListItemContent, injectedProps: Role): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], injectedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def default(hooks: Unit, injectedProps: Role): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any], injectedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
}
