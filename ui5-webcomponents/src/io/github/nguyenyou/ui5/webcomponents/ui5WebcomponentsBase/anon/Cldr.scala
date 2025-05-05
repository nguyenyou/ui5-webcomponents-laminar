package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.Renderer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cldr extends StObject {
  
  /**
    * Whether the custom element needs the CLDR assets.
    */
  var cldr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Other custom elements used in the shadow root of the custom element.
    * @deprecated no longer necessary for jsxRenderer-enabled components
    */
  var dependencies: js.UndefOr[js.Array[Instantiable0[default] & TypeofUI5Element]] = js.undefined
  
  /**
    * Whether the custom element supports the F6 Fast navigation feature (is a fast-navigation group).
    */
  var fastNavigation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of all features, supported by the custom element.
    * @deprecated no longer necessary for jsxRenderer-enabled components
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the custom element is form-associated and implements form-relevant features.
    */
  var formAssociated: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the custom element should be re-rendered when the language changes.
    */
  var languageAware: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The renderer of the custom element - officially supported are: jsxRenderer and litRender (deprecated).
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  /**
    * The shadow root options of the custom element.
    */
  var shadowRootOptions: js.UndefOr[PartialShadowRootInit] = js.undefined
  
  /**
    * The styles to be injected into the shadow root of the custom element.
    */
  var styles: js.UndefOr[ComponentStylesData] = js.undefined
  
  /**
    * The tag name of the custom element (will be suffixed if the scoping feature is used).
    */
  var tag: js.UndefOr[String] = js.undefined
  
  /**
    * The template function of the custom element - must match the renderer.
    */
  var template: js.UndefOr[TemplateFunction] = js.undefined
  
  /**
    * Whether the custom element should be re-rendered when the theme changes.
    */
  var themeAware: js.UndefOr[Boolean] = js.undefined
}
object Cldr {
  
  inline def apply(): Cldr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cldr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cldr] (val x: Self) extends AnyVal {
    
    inline def setCldr(value: Boolean): Self = StObject.set(x, "cldr", value.asInstanceOf[js.Any])
    
    inline def setCldrUndefined: Self = StObject.set(x, "cldr", js.undefined)
    
    inline def setDependencies(value: js.Array[Instantiable0[default] & TypeofUI5Element]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (Instantiable0[default] & TypeofUI5Element)*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFastNavigation(value: Boolean): Self = StObject.set(x, "fastNavigation", value.asInstanceOf[js.Any])
    
    inline def setFastNavigationUndefined: Self = StObject.set(x, "fastNavigation", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFormAssociated(value: Boolean): Self = StObject.set(x, "formAssociated", value.asInstanceOf[js.Any])
    
    inline def setFormAssociatedUndefined: Self = StObject.set(x, "formAssociated", js.undefined)
    
    inline def setLanguageAware(value: Boolean): Self = StObject.set(x, "languageAware", value.asInstanceOf[js.Any])
    
    inline def setLanguageAwareUndefined: Self = StObject.set(x, "languageAware", js.undefined)
    
    inline def setRenderer(value: (/* instance */ UI5Element, /* container */ HTMLElement | DocumentFragment) => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction2(value))
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setShadowRootOptions(value: PartialShadowRootInit): Self = StObject.set(x, "shadowRootOptions", value.asInstanceOf[js.Any])
    
    inline def setShadowRootOptionsUndefined: Self = StObject.set(x, "shadowRootOptions", js.undefined)
    
    inline def setStyles(value: ComponentStylesData): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: Any*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTemplate(value: () => js.Object): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setThemeAware(value: Boolean): Self = StObject.set(x, "themeAware", value.asInstanceOf[js.Any])
    
    inline def setThemeAwareUndefined: Self = StObject.set(x, "themeAware", js.undefined)
  }
}
