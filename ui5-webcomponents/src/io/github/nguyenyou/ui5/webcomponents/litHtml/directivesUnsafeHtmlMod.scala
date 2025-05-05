package io.github.nguyenyou.ui5.webcomponents.litHtml

import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.Directive_
import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.PartInfo
import io.github.nguyenyou.ui5.webcomponents.litHtml.litHtmlInts.`1`
import io.github.nguyenyou.ui5.webcomponents.litHtml.litHtmlInts.`2`
import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.TemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesUnsafeHtmlMod {
  
  @JSImport("lit-html/directives/unsafe-html", "UnsafeHTMLDirective")
  @js.native
  open class UnsafeHTMLDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /* private */ var _templateResult: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def render(): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
    def render(value: String): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
    def render(value: js.Symbol): js.UndefOr[js.Symbol | (TemplateResult[`1` | `2`]) | Null] = js.native
  }
  /* static members */
  object UnsafeHTMLDirective
}
