package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilSlotsHelperMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/SlotsHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSlotName(node: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlotName")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSlottedNodes(node: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlottedNodes")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  
  inline def getSlottedNodesList(nodeList: js.Array[Node]): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSlottedNodesList")(nodeList.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
}
