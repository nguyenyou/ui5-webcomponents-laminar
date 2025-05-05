package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.BubblesCancelable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`event name not found in GraveaccenteventDetailsGraveaccent field`
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsEventStrictMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/event-strict", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns an event class decorator.
    *
    * @param { string } name the event name
    * @param { EventData } data the event data
    * @returns { ClassDecorator }
    */
  inline def default[T /* <: (Instantiable0[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ]) & TypeofUI5Element */, N /* <: ExtractEventKeys[T] */](name: N): js.Function1[/* target */ T, T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T | Unit]]
  inline def default[T /* <: (Instantiable0[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ]) & TypeofUI5Element */, N /* <: ExtractEventKeys[T] */](name: N, data: BubblesCancelable): js.Function1[/* target */ T, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ T, T | Unit]]
  
  type EventDetailKeys[T /* <: Instantiable0[default] & TypeofUI5Element */] = /* import warning: importer.ImportType#apply Failed type conversion: keyof std.InstanceType<T>['eventDetails'] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    @ui5/webcomponents-base.@ui5/webcomponents-base/dist/decorators/event-strict.EventDetailKeys<T> extends never ? 'event name not found in `eventDetails` field' : @ui5/webcomponents-base.@ui5/webcomponents-base/dist/decorators/event-strict.EventDetailKeys<T>
    }}}
    */
  type ExtractEventKeys[T /* <: Instantiable0[default] & TypeofUI5Element */] = `event name not found in GraveaccenteventDetailsGraveaccent field`
}
