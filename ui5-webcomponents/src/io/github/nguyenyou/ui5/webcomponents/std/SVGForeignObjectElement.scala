package io.github.nguyenyou.ui5.webcomponents.std

import org.scalajs.dom.SVGAnimatedLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the properties of <foreignObject> elements, as well as methods to manipulate them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement)
  */
@js.native
trait SVGForeignObjectElement
  extends StObject
     with SVGGraphicsElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /* standard dom */
  val height: SVGAnimatedLength = js.native
  
  /* standard dom */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /* standard dom */
  val width: SVGAnimatedLength = js.native
  
  /* standard dom */
  val x: SVGAnimatedLength = js.native
  
  /* standard dom */
  val y: SVGAnimatedLength = js.native
}
