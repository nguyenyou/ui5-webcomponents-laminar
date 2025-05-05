package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement) */
@js.native
trait HTMLDialogElement
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
    * Closes the dialog element.
    *
    * The argument, if provided, provides a return value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  def close(returnValue: String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open) */
  /* standard dom */
  var open: Boolean = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue) */
  /* standard dom */
  var returnValue: String = js.native
  
  /**
    * Displays the dialog element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
    */
  /* standard dom */
  def show(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal) */
  /* standard dom */
  def showModal(): Unit = js.native
}
