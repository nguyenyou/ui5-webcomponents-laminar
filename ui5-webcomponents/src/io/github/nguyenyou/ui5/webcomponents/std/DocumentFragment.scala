package io.github.nguyenyou.ui5.webcomponents.std

import org.scalajs.dom.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A minimal document object that has no parent. It is used as a lightweight version of Document that stores a segment of a document structure comprised of nodes just like a standard document. The key difference is that because the document fragment isn't part of the active document tree structure, changes made to the fragment don't affect the document, cause reflow, or incur any performance impact that can occur when changes are made.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment)
  */
@js.native
trait DocumentFragment
  extends StObject
     with NonElementParentNode
     with ParentNode {
  
  /* standard dom */
  @JSName("ownerDocument")
  val ownerDocument_DocumentFragment: Document = js.native
}
