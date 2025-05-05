package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.std.Omit
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.CurrentTarget
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TargetedEventEventTargetE
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.Component
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.FunctionComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.VNode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.currentTarget
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllCSSProperties = StringDictionary[js.UndefOr[String | Double | Null]]

type AnimationEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedAnimationEvent[Target]]

type AudioHTMLAttributes[T /* <: EventTarget */] = MediaHTMLAttributes[T]

type ClipboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedClipboardEvent[Target]]

type CompositionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedCompositionEvent[Target]]

type DetailedHTMLProps[HA /* <: HTMLAttributes[RefType] */, RefType /* <: EventTarget */] = HA

type DragEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedDragEvent[Target]]

type Element = VNode[Any]

type ElementClass = (Component[Any, Any]) | FunctionComponent[Any]

type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'marquee' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'search' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' ]: P extends @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsx.JSXInternal.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'marquee' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'script' | 'search' | 'section' | 'select' | 'slot' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'tbody' | 'td' | 'template' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr'] */ js.Any) | ComponentType[P]

type EventHandler[E /* <: TargetedEventEventTargetE */] = js.Function1[/* event */ E, Unit]

type FocusEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedFocusEvent[Target]]

type GenericEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedEvent[Target, Event]]

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings._self
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings._blank
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings._parent
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings._top
  - java.lang.String
*/
type HTMLAttributeAnchorTarget = _HTMLAttributeAnchorTarget | String

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.button
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.checkbox
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.color
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.date
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`datetime-local`
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.email
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.file
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.image
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.month
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.number
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.password
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.radio
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.range
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.reset
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.search
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.submit
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tel
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.text
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.time
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.url
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.week
  - java.lang.String
*/
type HTMLInputTypeAttribute = _HTMLInputTypeAttribute | String

type InputEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedInputEvent[Target]]

type KeyboardEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedKeyboardEvent[Target]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Component extends {  defaultProps :infer Defaults} ? @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsx.Defaultize<Props, Defaults> : Props
  }}}
  */
type LibraryManagedAttributes[Component, Props] = Props

type MErrorMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MNMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MPhantomMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MPrescriptsMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MRootMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MRowMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MSqrtMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MTextMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type MouseEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedMouseEvent[Target]]

type PictureInPictureEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedPictureInPictureEvent[Target]]

type PointerEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedPointerEvent[Target]]

type SemanticsMathMLAttributes[T /* <: EventTarget */] = MathMLAttributes[T]

type Signalish[T] = T | SignalLike[T]

type SubmitEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedSubmitEvent[Target]]

type TargetedEvent[Target /* <: EventTarget */, TypedEvent /* <: Event */] = (Omit[TypedEvent, currentTarget]) & CurrentTarget[Target]

type TouchEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTouchEvent[Target]]

type TransitionEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedTransitionEvent[Target]]

type UIEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedUIEvent[Target]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsx.JSXInternal.SignalLike<infer V> ? V : T
  }}}
  */
type UnpackSignal[T] = T

type WheelEventHandler[Target /* <: EventTarget */] = EventHandler[TargetedWheelEvent[Target]]
