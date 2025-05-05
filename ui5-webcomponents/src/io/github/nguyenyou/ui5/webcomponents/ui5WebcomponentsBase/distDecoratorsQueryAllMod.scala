package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsQueryAllMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/queryAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A decorator that converts a class member into a getter that
    * executes a querySelectorAll on the element's shadow DOM.
    *
    * @param { string } selector DOM String containing selector to match
    * @returns { QueryDecorator }
    *
    * ```ts
    * class MyComponnet extends UI5Element {
    *   @queryAll('.item')
    *   itemsDOM?: HTMLElement;
    *
    *   render() {
    *     return html`
    * 		 <div>
    *      	<li class=".item"></li>
    *       	<li class=".item"></li>
    * 		 </div>
    *     `;
    *   }
    * }
    * ```
    */
  inline def default(selector: String): QueryDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(selector.asInstanceOf[js.Any]).asInstanceOf[QueryDecorator]
  
  type QueryDecorator = js.Function2[/* target */ default, /* propertyKey */ String | js.Symbol, Unit]
}
