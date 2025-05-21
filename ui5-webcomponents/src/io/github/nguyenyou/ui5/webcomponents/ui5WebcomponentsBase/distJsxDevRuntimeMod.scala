package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distJsxRuntimeMod.VNode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsxDevRuntimeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/jsx-dev-runtime.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Fragment(props: Record[String, Any]): ComponentChildren = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any]).asInstanceOf[ComponentChildren]
  inline def Fragment(props: Record[String, Any], context: Any): ComponentChildren = (^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ComponentChildren]
  
  inline def jsxDEV(`type`: Instantiable0[default] & TypeofUI5Element, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
}
