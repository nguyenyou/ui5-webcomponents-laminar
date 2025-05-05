package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.Renderer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable0[ATTRIBUTENODE] {
  
  def _generateAccessors(): Unit = js.native
  
  var _metadata: default = js.native
  
  def _needsShadowDOM(): Boolean = js.native
  
  var asyncFinished: Boolean = js.native
  
  def cacheUniqueDependencies(): Unit = js.native
  
  def define(): (Instantiable0[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ]) & TypeofUI5Element = js.native
  
  var definePromise: js.UndefOr[js.Promise[Unit]] = js.native
  
  val dependencies: js.Array[
    (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element
  ] = js.native
  
  def fetchCLDR(): js.Promise[Unit] = js.native
  
  def fetchI18nBundles(): js.Promise[
    js.Array[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
    ]
  ] = js.native
  
  val formAssociated: Boolean = js.native
  
  def getMetadata(): default = js.native
  
  def getUniqueDependencies(): js.Array[
    (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element
  ] = js.native
  
  var i18nBundleStorage: Record[
    String, 
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
  ] = js.native
  
  val i18nBundles: Record[
    String, 
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
  ] = js.native
  
  var metadata: Metadata = js.native
  
  val observedAttributes: js.Array[String] = js.native
  
  def onDefine(): js.Promise[Unit] = js.native
  
  def renderer(instance: UI5Element, container: DocumentFragment): Unit = js.native
  def renderer(instance: UI5Element, container: HTMLElement): Unit = js.native
  @JSName("renderer")
  var renderer_Original: Renderer = js.native
  
  var styles: ComponentStylesData = js.native
  
  val tagsToScope: js.Array[String] = js.native
  
  var template: js.UndefOr[TemplateFunction] = js.native
}
