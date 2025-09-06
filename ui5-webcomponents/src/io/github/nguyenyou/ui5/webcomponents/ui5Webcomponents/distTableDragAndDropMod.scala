package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableDragAndDropMod {
  
  @JSImport("@ui5/webcomponents/dist/TableDragAndDrop.js", JSImport.Default)
  @js.native
  open class default protected () extends TableDragAndDrop {
    def this(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default) = this()
  }
  
  @js.native
  trait TableDragAndDrop
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableExtensionMod.default {
    
    def _ondragend(): Unit = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(e: DragEvent): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondragstart(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    var _table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default = js.native
  }
}
