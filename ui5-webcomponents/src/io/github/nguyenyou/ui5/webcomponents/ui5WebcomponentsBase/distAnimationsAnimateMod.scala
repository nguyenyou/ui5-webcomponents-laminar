package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Promise
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAnimationsAnimateMod {
  
  @JSImport("@ui5/webcomponents-base/dist/animations/animate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: AnimateOptions): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  @JSImport("@ui5/webcomponents-base/dist/animations/animate.js", "duration")
  @js.native
  val duration: /* 400 */ Double = js.native
  
  trait AnimateOptions extends StObject {
    
    def advance(p: Double): Unit
    
    var beforeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var duration: Double
    
    var element: HTMLElement
  }
  object AnimateOptions {
    
    inline def apply(advance: Double => Unit, duration: Double, element: HTMLElement): AnimateOptions = {
      val __obj = js.Dynamic.literal(advance = js.Any.fromFunction1(advance), duration = duration.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimateOptions] (val x: Self) extends AnyVal {
      
      inline def setAdvance(value: Double => Unit): Self = StObject.set(x, "advance", js.Any.fromFunction1(value))
      
      inline def setBeforeStart(value: () => Unit): Self = StObject.set(x, "beforeStart", js.Any.fromFunction0(value))
      
      inline def setBeforeStartUndefined: Self = StObject.set(x, "beforeStart", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
}
