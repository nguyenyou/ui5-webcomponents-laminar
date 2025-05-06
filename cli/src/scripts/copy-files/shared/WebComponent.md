```scala
package io.github.nguyenyou.ui5.webcomponents.laminar.shared

import com.raquo.laminar.api.L.*
import com.raquo.laminar.modifiers.Modifier
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.raquo.laminar.tags.CustomHtmlTag
import org.scalajs.dom

import scala.scalajs.js

/** Marker trait that all web components inherit.
  *
  * This can allow you to implement some shenanigans and abstract over some thins.
  */
abstract class WebComponent(tagName: String) { this: Self =>
  type Self

  val id: HtmlProp[String, String] = idAttr

  /** Override this with JSImport-ed object of the component. The import must register the component's custom element in
    * the DOM.
    */
  def RawImport: js.Object

  useImport(RawImport)

  type Ref <: dom.HTMLElement

  type Element = ReactiveHtmlElement[Ref]

  type ComponentMod = Self => Modifier[Element]
  type LaminarMod   = Modifier[Element]

  // Note: this is overriden for components that have controlled inputs – see `tagWithControlledInputs`
  protected lazy val tag: CustomHtmlTag[Ref] = new CustomHtmlTag(tagName)

  // Mark imported JS object as used, to prevent dead code elimination
  @inline protected def useImport(importObject: js.Any): Unit = ()

  /** Instantiate this component using the specified modifiers.
    *
    * Modifiers can be the usual Laminar modifiers, or they can be functions from this component to a modifier. Allowing
    * these functions is very practical to access the reactive attributes of the component, with the `_.reactiveAttr`
    * syntax.
    */
  final def apply(componentMods: ComponentMod*)(laminarMods: LaminarMod*): Element = {
    val el = tag()
    componentMods.foreach(_(this)(el))
    laminarMods.foreach(_(el))
    el
  }
}
```