package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod

import io.github.nguyenyou.ui5.webcomponents.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionComponent[P] extends StObject {
  
  def apply(props: RenderableProps[P, Any]): ComponentChildren = js.native
  def apply(props: RenderableProps[P, Any], context: Any): ComponentChildren = js.native
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
}
