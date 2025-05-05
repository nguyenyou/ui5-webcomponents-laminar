package io.github.nguyenyou.ui5.webcomponents.litHtml

import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.DirectiveParameters
import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.Directive_
import io.github.nguyenyou.ui5.webcomponents.litHtml.directiveMod.PartInfo
import io.github.nguyenyou.ui5.webcomponents.litHtml.mod.AttributePart
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesClassMapMod {
  
  @JSImport("lit-html/directives/class-map", "ClassMapDirective")
  @js.native
  open class ClassMapDirective protected () extends Directive_ {
    def this(partInfo: PartInfo) = this()
    
    /**
      * Stores the ClassInfo object applied to a given AttributePart.
      * Used to unset existing values when a new ClassInfo object is applied.
      */
    /* private */ var _previousClasses: Any = js.native
    
    /* private */ var _staticClasses: Any = js.native
    
    def render(classInfo: ClassInfo): String = js.native
    
    def update(part: AttributePart, param1: DirectiveParameters[this.type]): String | js.Symbol = js.native
  }
  
  type ClassInfo = StringDictionary[String | Boolean | Double]
}
