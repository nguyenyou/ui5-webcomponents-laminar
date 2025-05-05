package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Value
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context[T] extends StObject {
  
  def Consumer(props: RenderableProps[`3`[T], Any]): ComponentChildren
  def Consumer(props: RenderableProps[`3`[T], Any], context: Any): ComponentChildren
  @JSName("Consumer")
  var Consumer_Original: Consumer[T]
  
  def Provider(props: RenderableProps[Value[T], Any]): ComponentChildren
  def Provider(props: RenderableProps[Value[T], Any], context: Any): ComponentChildren
  @JSName("Provider")
  var Provider_Original: Provider[T]
  
  var displayName: js.UndefOr[String] = js.undefined
}
object Context {
  
  inline def apply[T](Consumer: Consumer[T], Provider: Provider[T]): Context[T] = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context[?], T] (val x: Self & Context[T]) extends AnyVal {
    
    inline def setConsumer(value: Consumer[T]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProvider(value: Provider[T]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
  }
}
