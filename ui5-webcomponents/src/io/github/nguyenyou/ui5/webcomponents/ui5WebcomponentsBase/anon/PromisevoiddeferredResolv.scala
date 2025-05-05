package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.PromiseLike
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.PromiseResolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Promise<void> & {  _deferredResolve :@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.PromiseResolve | undefined} */
@js.native
trait PromisevoiddeferredResolv extends StObject {
  
  var _deferredResolve: js.UndefOr[PromiseResolve] = js.native
  
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  /* standard es5 */
  def `catch`[TResult](): js.Promise[Unit | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Unit | TResult] = js.native
  
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  /* standard es5 */
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ Unit, TResult1 | PromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
  ): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
  
  /* standard es2015.symbol.wellknown */
  @JSName(js.Symbol.toStringTag)
  val toStringTag: String = js.native
}
