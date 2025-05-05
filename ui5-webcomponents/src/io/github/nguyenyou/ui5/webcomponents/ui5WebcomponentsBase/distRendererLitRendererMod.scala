package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.litHtml.anon.TypeofUnsafeHTMLDirectiveInstantiable
import io.github.nguyenyou.ui5.webcomponents.litHtml.developmentDirectiveMod.DirectiveResult
import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.PartInfo
import io.github.nguyenyou.ui5.webcomponents.litHtml.directivesClassMapMod.ClassInfo
import io.github.nguyenyou.ui5.webcomponents.litHtml.directivesClassMapMod.ClassMapDirective
import io.github.nguyenyou.ui5.webcomponents.litHtml.directivesRepeatMod.RepeatDirectiveFn
import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.ResultType
import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.TemplateResult
import io.github.nguyenyou.ui5.webcomponents.std.NonNullable
import io.github.nguyenyou.ui5.webcomponents.std.TemplateStringsArray
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererDirectivesStyleMapMod.StyleMapDirective
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.Renderer
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRendererLitRendererMod {
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/LitRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/LitRenderer", JSImport.Default)
  @js.native
  val default: Renderer = js.native
  
  inline def classMap(classInfo: ClassInfo): DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("classMap")(classInfo.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[Instantiable1[/* partInfo */ PartInfo, ClassMapDirective]]]
  
  inline def html(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def ifDefined[T](value: T): js.Symbol | NonNullable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifDefined")(value.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | NonNullable[T]]
  
  @JSImport("@ui5/webcomponents-base/dist/renderer/LitRenderer", "repeat")
  @js.native
  val repeat: RepeatDirectiveFn = js.native
  
  inline def scopeTag(tag: String, tags: js.Array[String], suffix: String): js.UndefOr[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeTag")(tag.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Object]]
  
  inline def styleMap(styleInfo: Any): io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.DirectiveResult[Instantiable1[/* partInfo */ Any, StyleMapDirective]] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleMap")(styleInfo.asInstanceOf[js.Any]).asInstanceOf[io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.DirectiveResult[Instantiable1[/* partInfo */ Any, StyleMapDirective]]]
  
  inline def svg(strings: TemplateStringsArray, values: Any*): TemplateResult[ResultType] = ^.asInstanceOf[js.Dynamic].applyDynamic("svg")(scala.List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateResult[ResultType]]
  
  inline def unsafeHTML(): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")().asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: String): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
  inline def unsafeHTML(value: js.Symbol): DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeHTML")(value.asInstanceOf[js.Any]).asInstanceOf[DirectiveResult[TypeofUnsafeHTMLDirectiveInstantiable]]
}
