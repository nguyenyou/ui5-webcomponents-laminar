package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables access to the contents of an HTML <template> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement)
  */
@js.native
trait HTMLTemplateElement
  extends StObject
     with HTMLElement {
  
  /* standard dom */
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  
  /**
    * Returns the template contents (a DocumentFragment).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/content)
    */
  /* standard dom */
  val content: org.scalajs.dom.DocumentFragment = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootClonable) */
  /* standard dom */
  var shadowRootClonable: Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootDelegatesFocus) */
  /* standard dom */
  var shadowRootDelegatesFocus: Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootMode) */
  /* standard dom */
  var shadowRootMode: String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSerializable) */
  /* standard dom */
  var shadowRootSerializable: Boolean = js.native
}
