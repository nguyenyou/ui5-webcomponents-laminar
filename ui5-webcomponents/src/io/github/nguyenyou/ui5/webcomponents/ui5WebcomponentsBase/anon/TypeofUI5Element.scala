package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.Renderer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofUI5Element extends StObject {
  
  /**
    * @private
    */
  /* static member */
  def _generateAccessors(): Unit
  
  /* static member */
  var _metadata: default
  
  /**
    * @private
    */
  /* static member */
  def _needsShadowDOM(): Boolean
  
  /* static member */
  var asyncFinished: Boolean
  
  /* static member */
  def cacheUniqueDependencies(): Unit
  
  /**
    * Registers a UI5 Web Component in the browser window object
    * @public
    */
  /* static member */
  def define(): /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any
  
  /* static member */
  var definePromise: js.UndefOr[js.Promise[Unit]] = js.undefined
  
  /* static member */
  def fetchCLDR(): js.Promise[Unit]
  
  /* static member */
  def fetchI18nBundles(): js.Promise[
    js.Array[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
    ]
  ]
  
  /**
    * Returns an instance of UI5ElementMetadata.js representing this UI5 Web Component's full metadata (its and its parents')
    * Note: not to be confused with the "get metadata()" method, which returns an object for this class's metadata only
    * @public
    */
  /* static member */
  def getMetadata(): default
  
  /**
    * Returns a list of the unique dependencies for this UI5 Web Component
    *
    * @public
    */
  /* static member */
  def getUniqueDependencies(): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any
  ]
  
  /* static member */
  var i18nBundleStorage: Record[
    String, 
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
  ]
  
  /**
    * Returns the metadata object for this UI5 Web Component Class
    * @protected
    */
  /* static member */
  var metadata: Metadata
  
  /**
    * Hook that will be called upon custom element definition
    *
    * @protected
    * @deprecated use the "i18n" decorator for fetching message bundles and the "cldr" option in the "customElements" decorator for fetching CLDR
    */
  /* static member */
  def onDefine(): js.Promise[Unit]
  
  def renderer(instance: UI5Element, container: DocumentFragment): Unit
  /* static member */
  def renderer(instance: UI5Element, container: HTMLElement): Unit
  /* static member */
  @JSName("renderer")
  var renderer_Original: Renderer
  
  /**
    * Returns the CSS for this UI5 Web Component Class
    * @protected
    */
  /* static member */
  var styles: ComponentStylesData
  
  /* static member */
  var template: js.UndefOr[TemplateFunction] = js.undefined
}
object TypeofUI5Element {
  
  inline def apply(
    _generateAccessors: () => Unit,
    _metadata: default,
    _needsShadowDOM: () => Boolean,
    asyncFinished: Boolean,
    cacheUniqueDependencies: () => Unit,
    define: () => /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any,
    fetchCLDR: () => js.Promise[Unit],
    fetchI18nBundles: () => js.Promise[
      js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
      ]
    ],
    getMetadata: () => default,
    getUniqueDependencies: () => js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any
    ],
    i18nBundleStorage: Record[
      String, 
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
    ],
    metadata: Metadata,
    onDefine: () => js.Promise[Unit],
    renderer: (/* instance */ UI5Element, /* container */ HTMLElement | DocumentFragment) => Unit,
    styles: ComponentStylesData
  ): TypeofUI5Element = {
    val __obj = js.Dynamic.literal(_generateAccessors = js.Any.fromFunction0(_generateAccessors), _metadata = _metadata.asInstanceOf[js.Any], _needsShadowDOM = js.Any.fromFunction0(_needsShadowDOM), asyncFinished = asyncFinished.asInstanceOf[js.Any], cacheUniqueDependencies = js.Any.fromFunction0(cacheUniqueDependencies), define = js.Any.fromFunction0(define), fetchCLDR = js.Any.fromFunction0(fetchCLDR), fetchI18nBundles = js.Any.fromFunction0(fetchI18nBundles), getMetadata = js.Any.fromFunction0(getMetadata), getUniqueDependencies = js.Any.fromFunction0(getUniqueDependencies), i18nBundleStorage = i18nBundleStorage.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], onDefine = js.Any.fromFunction0(onDefine), renderer = js.Any.fromFunction2(renderer), styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUI5Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofUI5Element] (val x: Self) extends AnyVal {
    
    inline def setAsyncFinished(value: Boolean): Self = StObject.set(x, "asyncFinished", value.asInstanceOf[js.Any])
    
    inline def setCacheUniqueDependencies(value: () => Unit): Self = StObject.set(x, "cacheUniqueDependencies", js.Any.fromFunction0(value))
    
    inline def setDefine(
      value: () => /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any
    ): Self = StObject.set(x, "define", js.Any.fromFunction0(value))
    
    inline def setDefinePromise(value: js.Promise[Unit]): Self = StObject.set(x, "definePromise", value.asInstanceOf[js.Any])
    
    inline def setDefinePromiseUndefined: Self = StObject.set(x, "definePromise", js.undefined)
    
    inline def setFetchCLDR(value: () => js.Promise[Unit]): Self = StObject.set(x, "fetchCLDR", js.Any.fromFunction0(value))
    
    inline def setFetchI18nBundles(
      value: () => js.Promise[
          js.Array[
            io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
          ]
        ]
    ): Self = StObject.set(x, "fetchI18nBundles", js.Any.fromFunction0(value))
    
    inline def setGetMetadata(value: () => default): Self = StObject.set(x, "getMetadata", js.Any.fromFunction0(value))
    
    inline def setGetUniqueDependencies(
      value: () => js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof UI5Element */ js.Any
        ]
    ): Self = StObject.set(x, "getUniqueDependencies", js.Any.fromFunction0(value))
    
    inline def setI18nBundleStorage(
      value: Record[
          String, 
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
        ]
    ): Self = StObject.set(x, "i18nBundleStorage", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOnDefine(value: () => js.Promise[Unit]): Self = StObject.set(x, "onDefine", js.Any.fromFunction0(value))
    
    inline def setRenderer(value: (/* instance */ UI5Element, /* container */ HTMLElement | DocumentFragment) => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
    
    inline def setStyles(value: ComponentStylesData): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: Any*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: () => js.Object): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def set_generateAccessors(value: () => Unit): Self = StObject.set(x, "_generateAccessors", js.Any.fromFunction0(value))
    
    inline def set_metadata(value: default): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
    
    inline def set_needsShadowDOM(value: () => Boolean): Self = StObject.set(x, "_needsShadowDOM", js.Any.fromFunction0(value))
  }
}
