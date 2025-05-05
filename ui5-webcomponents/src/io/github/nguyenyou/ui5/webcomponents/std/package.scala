package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.MutationObserver
import org.scalajs.dom.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Recursively unwraps the "awaited type" of a type. Non-promise "thenables" should resolve to `never`. This emulates the behavior of `await`.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends null | undefined ? T : // special case for `null | undefined` when not in `--strictNullChecks` mode
T extends object & {then (onfulfilled : infer F, args : infer _): any} ? // `await` only unwraps object types with a callable `then`. Non-object types are not unwrapped
F extends (value : infer V, args : infer _): any ? // if the argument to `then` is callable, extracts the first argument
std.Awaited<V> : // recursively unwrap the value
never : // the argument to `then` was not callable
T
  }}}
  */
type Awaited[T] = T

/**
  * Defines the `TReturn` type used for built-in iterators produced by `Array`, `Map`, `Set`, and others.
  * This is `undefined` when `strictBuiltInIteratorReturn` is `true`; otherwise, this is `any`.
  */
type BuiltinIteratorReturn = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type CSSNumberish = Double | CSSNumericValue

/**
  * Convert first character of string literal type to uppercase
  */
type Capitalize[S /* <: String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]

type DOMHighResTimeStamp = Double

/**
  * Used by the dataset HTML attribute to represent data for custom attributes added to elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringMap)
  */
type DOMStringMap = /* standard dom */
StringDictionary[js.UndefOr[String]]

type EventListener = js.Function1[/* evt */ org.scalajs.dom.Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? never : T
  }}}
  */
type Exclude[T, U] = T

/**
  * Extract from T those types that are assignable to U
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends U ? T : never
  }}}
  */
type Extract[T, U] = T

/**
  * Convert string literal type to lowercase
  */
type Lowercase[S /* <: String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type MutationCallback = js.Function2[/* mutations */ js.Array[MutationRecord], /* observer */ MutationObserver, Unit]

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null

type OnErrorEventHandlerNonNull = js.Function5[
/* event */ org.scalajs.dom.Event | String, 
/* source */ js.UndefOr[String], 
/* lineno */ js.UndefOr[Double], 
/* colno */ js.UndefOr[Double], 
/* error */ js.UndefOr[js.Error], 
Any]

/**
  * Make all properties in T optional
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in keyof T ]:? T[P]}
  }}}
  */
type Partial[T] = T

/**
  * From T, pick a set of properties whose keys are in the union K
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation is imprecise and ignores the effect of the type mapping. 
  * TS definition: {{{
  {[ P in K ]: T[P]}
  }}}
  */
type Pick[T, K /* <: /* keyof T */ String */] = T

type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit]

type PropertyDescriptorMap = /* standard es5 */
StringDictionary[js.PropertyDescriptor]

type PropertyKey = String | Double | js.Symbol

/**
  * Construct a type with a set of properties K of type T
  */
/** NOTE: Mapped type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
  * This translation throws away the known field names. 
  * TS definition: {{{
  {[ P in K ]: T}
  }}}
  */
type Record[K /* <: /* keyof any */ String */, T] = StringDictionary[T]

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StaticRange) */
type StaticRange = AbstractRange

type TimerHandler = String | js.Function

type WeakKey = /* import warning: importer.ImportType#apply Failed type conversion: std.WeakKeyTypes['object'] */ js.Any
