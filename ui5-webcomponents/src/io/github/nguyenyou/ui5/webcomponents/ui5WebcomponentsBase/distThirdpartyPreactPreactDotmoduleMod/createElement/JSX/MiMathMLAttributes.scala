package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`bold-fraktur`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`bold-italic`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`bold-sans-serif`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`bold-script`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`double-struck`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`sans-serif-bold-italic`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`sans-serif-italic`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`sans-serif`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.bold
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.fraktur
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.initial
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.italic
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.looped
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.monospace
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.normal
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.script
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.stretched
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tailed
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MathMLAttributes[T] {
  
  /** The only value allowed in the current specification is normal (case insensitive)
  		 * See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mi#mathvariant */
  var mathvariant: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[
      js.UndefOr[
        normal | bold | italic | `bold-italic` | `double-struck` | `bold-fraktur` | script | `bold-script` | fraktur | `sans-serif` | `bold-sans-serif` | `sans-serif-italic` | `sans-serif-bold-italic` | monospace | initial | tailed | looped | stretched
      ]
    ]
  ] = js.undefined
}
object MiMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MiMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MiMathMLAttributes[T]) extends AnyVal {
    
    inline def setMathvariant(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[
          js.UndefOr[
            normal | bold | italic | `bold-italic` | `double-struck` | `bold-fraktur` | script | `bold-script` | fraktur | `sans-serif` | `bold-sans-serif` | `sans-serif-italic` | `sans-serif-bold-italic` | monospace | initial | tailed | looped | stretched
          ]
        ]
    ): Self = StObject.set(x, "mathvariant", value.asInstanceOf[js.Any])
    
    inline def setMathvariantUndefined: Self = StObject.set(x, "mathvariant", js.undefined)
  }
}
