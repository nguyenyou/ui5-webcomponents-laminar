package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.DocumentOrShadowRoot
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesF6NavigationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/F6Navigation", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with F6Navigation
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/F6Navigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  }
  
  @js.native
  trait F6Navigation extends StObject {
    
    def _keydownHandler(event: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _ui5RuntimeIndex: Double = js.native
    
    def attachEventListeners(): Unit = js.native
    
    def deepActive(root: DocumentOrShadowRoot): Element | Null = js.native
    
    def destroy(): Unit = js.native
    
    def findContainer(): HTMLElement = js.native
    
    def findNextFocusableGroupElement(currentIndex: Double): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    def findPreviousFocusableGroupElement(currentIndex: Double): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    def groupElementToFocus(nextElement: HTMLElement): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    var groups: js.Array[HTMLElement] = js.native
    
    def keydownHandler(event: KeyboardEvent): Unit = js.native
    
    def removeEventListeners(): Unit = js.native
    
    var selectedGroup: HTMLElement | Null = js.native
    
    def setSelectedGroup(): Unit = js.native
    def setSelectedGroup(root: DocumentOrShadowRoot): Unit = js.native
    
    def updateGroups(): Unit = js.native
  }
}
