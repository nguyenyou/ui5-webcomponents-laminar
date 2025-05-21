package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.TypeofToolbarItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarRegistryMod {
  
  @JSImport("@ui5/webcomponents/dist/ToolbarRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredStyles(): js.Array[ComponentStylesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredStyles")().asInstanceOf[js.Array[ComponentStylesData]]
  
  inline def getRegisteredToolbarItem(name: String): js.UndefOr[TypeofToolbarItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredToolbarItem")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeofToolbarItem]]
  
  inline def registerToolbarItem(ElementClass: TypeofToolbarItem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerToolbarItem")(ElementClass.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
