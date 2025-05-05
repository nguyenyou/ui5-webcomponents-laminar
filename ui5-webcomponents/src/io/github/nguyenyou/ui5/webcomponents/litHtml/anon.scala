package io.github.nguyenyou.ui5.webcomponents.litHtml

import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.PartInfo
import io.github.nguyenyou.ui5.webcomponents.litHtml.directivesUnsafeHtmlMod.UnsafeHTMLDirective
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ImportNode extends StObject {
    
    def importNode(node: Node): Node = js.native
    def importNode(node: Node, deep: Boolean): Node = js.native
  }
  
  @js.native
  trait TypeofUnsafeHTMLDirectiveInstantiable
    extends StObject
       with Instantiable1[/* partInfo */ PartInfo, UnsafeHTMLDirective] {
    
    var directiveName: String = js.native
    
    var resultType: Double = js.native
  }
}
