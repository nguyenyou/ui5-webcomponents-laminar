package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFiltersMod {
  
  @JSImport("@ui5/webcomponents/dist/Filters.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Contains[T](value: String, items: js.Array[T], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(value.asInstanceOf[js.Any], items.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def None[T](_underscore: String, items: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("None")(_underscore.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def StartsWith[T](value: String, items: js.Array[T], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWith")(value.asInstanceOf[js.Any], items.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def StartsWithPerTerm[T](value: String, items: js.Array[T], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("StartsWithPerTerm")(value.asInstanceOf[js.Any], items.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
