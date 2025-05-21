package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.HTMLAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.SVGAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.Attributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.FunctionComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.VNode
import org.scalajs.dom.EventTarget
import org.scalajs.dom.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThirdpartyPreactJsxRuntimeDotmoduleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ui5/webcomponents-base/dist/thirdparty/preact/jsxRuntime.module", "Fragment")
  @js.native
  def Fragment: FunctionComponent[js.Object] = js.native
  inline def Fragment_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(x.asInstanceOf[js.Any])
  
  inline def jsx(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `0`
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsx(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `0`,
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsx[P](`type`: ComponentType[P], props: Attributes & P & `0`): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsx[P](`type`: ComponentType[P], props: Attributes & P & `0`, key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxAttr(name: String, value: Any): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxAttr")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def jsxDEV(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `2`
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `2`,
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV[P](`type`: ComponentType[P], props: Attributes & P & `2`): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV[P](`type`: ComponentType[P], props: Attributes & P & `2`, key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxEscape[T](value: T): String | Null | VNode[Any] | (js.Array[String | Null | VNode[js.Object]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxEscape")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null | VNode[Any] | (js.Array[String | Null | VNode[js.Object]])]
  
  inline def jsxTemplate(template: js.Array[String], expressions: Any*): VNode[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("jsxTemplate")(scala.List(template.asInstanceOf[js.Any]).`++`(expressions.asInstanceOf[Seq[js.Any]])*).asInstanceOf[VNode[Any]]
  
  inline def jsxs(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `1`
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxs(
    `type`: String,
    props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, Any]) & `1`,
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxs[P](`type`: ComponentType[P], props: Attributes & P & `1`): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxs[P](`type`: ComponentType[P], props: Attributes & P & `1`, key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
}
