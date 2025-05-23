package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implements the document object model (DOM) representation of the font element. The HTML Font Element <font> defines the font size, font face and color of text.
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement)
  */
@js.native
trait HTMLFontElement
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
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/color)
    */
  /* standard dom */
  var color: String = js.native
  
  /**
    * Sets or retrieves the current typeface family.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/face)
    */
  /* standard dom */
  var face: String = js.native
  
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
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/size)
    */
  /* standard dom */
  var size: String = js.native
}
