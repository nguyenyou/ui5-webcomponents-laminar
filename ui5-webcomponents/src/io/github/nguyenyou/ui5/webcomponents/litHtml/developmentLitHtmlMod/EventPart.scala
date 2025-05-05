package io.github.nguyenyou.ui5.webcomponents.litHtml.developmentLitHtmlMod

import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `io.github.nguyenyou.ui5.webcomponents`.litHtml.developmentLitHtmlMod.Part because Already inherited */ @JSImport("lit-html/development/lit-html", "EventPart")
@js.native
open class EventPart protected () extends AttributePart {
  def this(element: HTMLElement, name: String, strings: js.Array[String], parent: Disconnectable) = this()
  def this(
    element: HTMLElement,
    name: String,
    strings: js.Array[String],
    parent: Disconnectable,
    options: RenderOptions
  ) = this()
  
  def handleEvent(event: Event): Unit = js.native
  
  @JSName("type")
  val type_EventPart: /* 5 */ Double = js.native
}
