package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The PageTransitionEvent is fired when a document is being loaded or unloaded.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent)
  */
@js.native
trait PageTransitionEvent
  extends StObject
     with Event {
  
  /**
    * For the pageshow event, returns false if the page is newly being loaded (and the load event will fire). Otherwise, returns true.
    *
    * For the pagehide event, returns false if the page is going away for the last time. Otherwise, returns true, meaning that (if nothing conspires to make the page unsalvageable) the page might be reused if the user navigates back to this page.
    *
    * Things that can cause the page to be unsalvageable include:
    *
    * The user agent decided to not keep the Document alive in a session history entry after unload
    * Having iframes that are not salvageable
    * Active WebSocket objects
    * Aborting a Document
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/persisted)
    */
  /* standard dom */
  val persisted: Boolean = js.native
}
