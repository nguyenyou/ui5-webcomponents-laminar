package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilGetSingletonElementInstanceMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/getSingletonElementInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tag: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tag.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def default(tag: String, parentElement: HTMLElement): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tag.asInstanceOf[js.Any], parentElement.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def default(tag: String, parentElement: HTMLElement, createEl: js.Function0[Element]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tag.asInstanceOf[js.Any], parentElement.asInstanceOf[js.Any], createEl.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def default(tag: String, parentElement: Unit, createEl: js.Function0[Element]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tag.asInstanceOf[js.Any], parentElement.asInstanceOf[js.Any], createEl.asInstanceOf[js.Any])).asInstanceOf[Element]
}
