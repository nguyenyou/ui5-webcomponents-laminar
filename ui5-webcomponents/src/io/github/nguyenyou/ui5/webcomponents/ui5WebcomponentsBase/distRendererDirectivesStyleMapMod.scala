package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.DirectiveResult
import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.Directive_
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRendererDirectivesStyleMapMod {
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/directives/style-map.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def styleMap(styleInfo: Any): DirectiveResult[Instantiable1[/* partInfo */ Any, StyleMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(styleInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ Any, StyleMapDirective]]]
  
  @js.native
  trait StyleMapDirective extends Directive_ {
    
    def render(styleInfo: Any): String = js.native
    
    def update(part: Any, param1: js.Array[Any]): js.Symbol = js.native
  }
}
