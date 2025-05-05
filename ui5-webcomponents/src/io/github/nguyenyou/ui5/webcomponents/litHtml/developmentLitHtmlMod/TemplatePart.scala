package io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod

import org.scalablytyped.runtime.Instantiable5
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TemplatePart represents a dynamic part in a template, before the template
  * is instantiated. When a template is instantiated Parts are created from
  * TemplateParts.
  */
/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.ui5.webcomponents`.litHtml.developmentLitHtmlMod.ChildTemplatePart
  - `io.github.nguyenyou.ui5.webcomponents`.litHtml.developmentLitHtmlMod.AttributeTemplatePart
  - `io.github.nguyenyou.ui5.webcomponents`.litHtml.developmentLitHtmlMod.ElementTemplatePart
  - `io.github.nguyenyou.ui5.webcomponents`.litHtml.developmentLitHtmlMod.CommentTemplatePart
*/
trait TemplatePart extends StObject
object TemplatePart {
  
  inline def AttributeTemplatePart(
    ctor: Instantiable5[
      /* element */ HTMLElement, 
      /* name */ String, 
      /* strings */ js.Array[String], 
      /* parent */ Disconnectable, 
      /* options */ js.UndefOr[RenderOptions], 
      AttributePart
    ],
    index: Double,
    name: String,
    strings: js.Array[String],
    `type`: /* 1 */ Double
  ): io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.AttributeTemplatePart = {
    val __obj = js.Dynamic.literal(ctor = ctor.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.AttributeTemplatePart]
  }
  
  inline def ChildTemplatePart(index: Double, `type`: /* 2 */ Double): io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.ChildTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.ChildTemplatePart]
  }
  
  inline def CommentTemplatePart(index: Double, `type`: /* 7 */ Double): io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.CommentTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.CommentTemplatePart]
  }
  
  inline def ElementTemplatePart(index: Double, `type`: /* 6 */ Double): io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.ElementTemplatePart = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod.ElementTemplatePart]
  }
}
