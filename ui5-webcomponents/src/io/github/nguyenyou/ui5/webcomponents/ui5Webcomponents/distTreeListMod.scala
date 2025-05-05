package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTreeListMod {
  
  @JSImport("@ui5/webcomponents/dist/TreeList", JSImport.Default)
  @js.native
  open class default () extends TreeList
  
  @js.native
  trait TreeList
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default {
    
    def getItems(includeCollapsed: Boolean): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.default
      ] = js.native
  }
}
