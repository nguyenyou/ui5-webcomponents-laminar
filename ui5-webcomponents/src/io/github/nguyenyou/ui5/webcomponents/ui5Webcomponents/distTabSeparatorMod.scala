package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.HTMLElementrealTabReferen
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabContainerMod.ITab
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabSeparatorMod {
  
  /**
    * @class
    * The `ui5-tab-separator` represents a vertical line to separate tabs inside a `ui5-tabcontainer`.
    * @constructor
    * @extends UI5Element
    * @implements {ITab}
    * @abstract
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TabSeparator", JSImport.Default)
  @js.native
  open class default () extends TabSeparator
  
  /**
    * @class
    * The `ui5-tab-separator` represents a vertical line to separate tabs inside a `ui5-tabcontainer`.
    * @constructor
    * @extends UI5Element
    * @implements {ITab}
    * @abstract
    * @public
    */
  @js.native
  trait TabSeparator extends ITab {
    
    var _forcedStyleInOverflow: js.UndefOr[Record[String, Any]] = js.native
    
    var _getElementInStrip: js.UndefOr[js.Function0[js.UndefOr[HTMLElement]]] = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementrealTabReferen): Unit = js.native
    
    @JSName("isSeparator")
    def isSeparator_MTabSeparator: Boolean = js.native
    
    def overflowPresentation: js.Object = js.native
    
    def stableDomRef: String = js.native
    
    def stripPresentation: js.Object = js.native
  }
  
  @js.native
  trait TabSeparatorInOverflow
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemCustomMod.default {
    
    var realTabReference: TabSeparator = js.native
  }
  
  @js.native
  trait TabSeparatorInStrip
    extends StObject
       with io.github.nguyenyou.ui5.webcomponents.std.HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var realTabReference: TabSeparator = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
