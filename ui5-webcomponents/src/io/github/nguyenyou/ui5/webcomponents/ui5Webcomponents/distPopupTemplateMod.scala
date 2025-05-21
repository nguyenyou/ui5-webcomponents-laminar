package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.AfterContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopupTemplateMod {
  
  @JSImport("@ui5/webcomponents/dist/PopupTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(hooks: AfterContent): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def afterContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterContent")().asInstanceOf[Unit]
  
  inline def beforeContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeContent")().asInstanceOf[Unit]
}
