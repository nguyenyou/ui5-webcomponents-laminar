package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.ClassDecorator
import io.github.nguyenyou.ui5.webcomponents.std.PropertyDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.BubblesCancelable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cancelable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cldr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDecoratorsEventStrictMod.ExtractEventKeys
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDecoratorsI18nMod.i18nDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Property
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Slot
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bound(target: Any, key: String, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def bound(target: Any, key: js.Symbol, descriptor: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bound")(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns a custom element class decorator.
    *
    * @param { string | object } tagNameOrComponentSettings
    * @returns { ClassDecorator }
    */
  inline def customElement(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")().asInstanceOf[ClassDecorator]
  inline def customElement(tagNameOrComponentSettings: Cldr): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def customElement(tagNameOrComponentSettings: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  inline def event[EventDetail](name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def event[EventDetail](name: String, data: Cancelable[EventDetail]): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  
  /**
    * Returns an event class decorator.
    *
    * @param { string } name the event name
    * @param { EventData } data the event data
    * @returns { ClassDecorator }
    */
  inline def eventStrict[T /* <: Instantiable0[default] & TypeofUI5Element */, N /* <: ExtractEventKeys[T] */](name: N): js.Function1[/* target */ T, T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventStrict")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T | Unit]]
  inline def eventStrict[T /* <: Instantiable0[default] & TypeofUI5Element */, N /* <: ExtractEventKeys[T] */](name: N, data: BubblesCancelable): js.Function1[/* target */ T, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventStrict")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ T, T | Unit]]
  
  /**
    * A decorator that converts a static class member into an accessor for the i18n bundle with a specified name
    *
    * @param { string } bundleName name of the i18n bundle to load
    * @returns { i18nDecorator }
    *
    * ```ts
    * class MyComponnet extends UI5Element {
    *   @i18n('@ui5/webcomponents')
    *   i18nBundle: I18nBundle;
    * }
    * ```
    */
  inline def i18n(bundleName: String): i18nDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("i18n")(bundleName.asInstanceOf[js.Any]).asInstanceOf[i18nDecorator]
  
  /**
    * Returns a property decorator.
    *
    * @param { Property } propData
    * @returns { PropertyDecorator }
    */
  inline def property(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("property")().asInstanceOf[PropertyDecorator]
  inline def property(propData: Property): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("property")(propData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  /**
    * Returns a slot decorator.
    *
    * @param { Slot } slotData
    * @returns { PropertyDecorator }
    */
  inline def slot(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("slot")().asInstanceOf[PropertyDecorator]
  inline def slot(slotData: Slot): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
