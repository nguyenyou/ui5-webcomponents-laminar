package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PostContent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputTemplateMod {
  
  @JSImport("@ui5/webcomponents/dist/InputTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(hooks: PostContent): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type TemplateHook = js.Function0[JsxTemplateResult]
}
