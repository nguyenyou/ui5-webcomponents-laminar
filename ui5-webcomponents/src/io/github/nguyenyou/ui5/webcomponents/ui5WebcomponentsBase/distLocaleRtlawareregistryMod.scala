package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLocaleRtlawareregistryMod {
  
  @JSImport("@ui5/webcomponents-base/dist/locale/RTLAwareRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRtlAware(klass: Instantiable0[default] & TypeofUI5Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRtlAware")(klass.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markAsRtlAware(klass: Instantiable0[default] & TypeofUI5Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markAsRtlAware")(klass.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
