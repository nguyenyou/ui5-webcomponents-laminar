package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRendererExecuteTemplateMod {
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/executeTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Runs a component's template with the component's current state, while also scoping HTML
    *
    * @param template - the template to execute
    * @param component - the component
    * @public
    */
  inline def default(
    template: TemplateFunction,
    component: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  type TemplateFunction = js.Function0[js.Object]
}
