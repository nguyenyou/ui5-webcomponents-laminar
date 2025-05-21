package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilFocusableElementsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/FocusableElements.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFirstFocusableElement(container: HTMLElement): js.Promise[HTMLElement | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(container.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement | Null]]
  inline def getFirstFocusableElement(container: HTMLElement, startFromContainer: Boolean): js.Promise[HTMLElement | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusableElement")(container.asInstanceOf[js.Any], startFromContainer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement | Null]]
  
  inline def getLastFocusableElement(container: HTMLElement): js.Promise[HTMLElement | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(container.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLElement | Null]]
  inline def getLastFocusableElement(container: HTMLElement, startFromContainer: Boolean): js.Promise[HTMLElement | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusableElement")(container.asInstanceOf[js.Any], startFromContainer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLElement | Null]]
  
  type FocusableElementPromise = js.Promise[HTMLElement | Null]
}
