package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.ClassDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsEventMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/event.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[EventDetail](name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def default[EventDetail](name: String, data: Cancelable[EventDetail]): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
}
