package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod

import io.github.nguyenyou.ui5.webcomponents.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Preact render
// -----------------------------------
@js.native
trait ContainerNode extends StObject {
  
  def appendChild(node: ContainerNode): ContainerNode = js.native
  
  val childNodes: ArrayLike[ContainerNode] = js.native
  
  def contains(): Boolean = js.native
  def contains(other: ContainerNode): Boolean = js.native
  
  val firstChild: ContainerNode | Null = js.native
  
  def insertBefore(node: ContainerNode): ContainerNode = js.native
  def insertBefore(node: ContainerNode, child: ContainerNode): ContainerNode = js.native
  
  val nodeType: Double = js.native
  
  val parentNode: ContainerNode | Null = js.native
  
  def removeChild(child: ContainerNode): ContainerNode = js.native
}
