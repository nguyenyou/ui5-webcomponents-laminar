package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsxUtilsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/jsx-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUI5ElementClass(`type`: Instantiable0[default] & TypeofUI5Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUI5ElementClass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUI5ElementClass(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUI5ElementClass")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def preprocess(`type`: Instantiable0[default] & TypeofUI5Element, props: Record[String, Any], key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preprocess")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def preprocess(`type`: String, props: Record[String, Any], key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("preprocess")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
}
