package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.anon.TypeofUI5Element
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsCompatCustomElementsScopeMod {
  
  @JSImport("@ui5/webcomponents-compat/dist/utils/CompatCustomElementsScope.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCompatCustomElementsScopingSuffix(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompatCustomElementsScopingSuffix")().asInstanceOf[String]
  
  inline def patchScopingSuffix(klass: TypeofUI5Element & Instantiable0[default]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchScopingSuffix")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCompatCustomElementsScopingSuffix(suffix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCompatCustomElementsScopingSuffix")(suffix.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
