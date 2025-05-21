package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesOpenUI5ElementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Element.js", JSImport.Default)
  @js.native
  open class default () extends OpenUI5Element
  
  @js.native
  trait OpenUI5Element
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var __isBusy: js.UndefOr[Boolean] = js.native
    
    var __redirectFocus: js.UndefOr[Boolean] = js.native
    
    var __suppressFocusBack: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Unit]] = js.native
    
    var __suppressFocusIn: js.UndefOr[js.Function0[Unit]] = js.native
    
    var isOpenUI5Component: js.UndefOr[Boolean] = js.native
  }
}
