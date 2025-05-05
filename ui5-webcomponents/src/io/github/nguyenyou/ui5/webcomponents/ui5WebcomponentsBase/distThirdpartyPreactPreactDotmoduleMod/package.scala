package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Value
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.`3`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.^
import org.scalajs.dom.Element
import org.scalajs.dom.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Fragment: FunctionComponent[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[FunctionComponent[js.Object]]
inline def Fragment_=(x: FunctionComponent[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(x.asInstanceOf[js.Any])

inline def cloneElement(vnode: VNode[Any], props: Any, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def cloneElement(vnode: VNode[Any], props: Unit, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]

inline def cloneElement_P[P](vnode: VNode[P], props: Any, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[P]]
inline def cloneElement_P[P](vnode: VNode[P], props: Unit, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[P]]

inline def createContext[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]

inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]

inline def hydrate(vnode: ComponentChild, parent: ContainerNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isValidElement(vnode: Any): /* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/preact.module.VNode<{}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(vnode.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/preact.module.VNode<{}> */ Boolean]

inline def options: Options_ = ^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[Options_]
inline def options_=(x: Options_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])

inline def render(vnode: ComponentChild, parent: ContainerNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: ComponentChild, parent: ContainerNode, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def render(vnode: ComponentChild, parent: ContainerNode, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def toChildArray(children: ComponentChildren): js.Array[VNode[js.Object] | String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toChildArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[VNode[js.Object] | String | Double]]

type AnyComponent[P, S] = FunctionComponent[P] | (ComponentConstructor[P, S])

type ComponentChild = js.UndefOr[VNode[Any] | js.Object | String | Double | js.BigInt | Boolean | Null]

type ComponentChildren = js.Array[ComponentChild] | ComponentChild

type ComponentConstructor[P, S] = ComponentClass[P, S]

type ComponentFactory[P] = ComponentType[P]

type ComponentType[P] = (ComponentClass[P, js.Object]) | FunctionComponent[P]

type Consumer[T] = FunctionComponent[`3`[T]]

type FunctionalComponent[P] = FunctionComponent[P]

type Key = String | Double | Any

type PreactConsumer[T] = Consumer[T]

type PreactContext[T] = Context[T]

type PreactProvider[T] = Provider[T]

type Provider[T] = FunctionComponent[Value[T]]

type Ref[T] = RefObject[T] | RefCallback[T] | Null

type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]

type RenderableProps[P, RefType] = P & Attributes & io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Ref[RefType]
