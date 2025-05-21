package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.LanguageAware
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRenderMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachBeforeComponentRender(listener: BeforeComponentRenderCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBeforeComponentRender")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Cancels the rendering of a component, if awaiting to be rendered, and removes it from the registry of rendered components
    *
    * @param webComponent
    */
  inline def cancelRender(webComponent: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelRender")(webComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachBeforeComponentRender(listener: BeforeComponentRenderCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachBeforeComponentRender")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Re-renders all UI5 Elements on the page, with the option to specify filters to rerender only some components.
    *
    * Usage:
    * reRenderAllUI5Elements() -> re-renders all components
    * reRenderAllUI5Elements({tag: "ui5-button"}) -> re-renders only instances of ui5-button
    * reRenderAllUI5Elements({rtlAware: true}) -> re-renders only rtlAware components
    * reRenderAllUI5Elements({languageAware: true}) -> re-renders only languageAware components
    * reRenderAllUI5Elements({themeAware: true}) -> re-renders only themeAware components
    * reRenderAllUI5Elements({rtlAware: true, languageAware: true}) -> re-renders components that are rtlAware or languageAware
    * etc...
    *
    * @public
    * @param {object|undefined} filters - Object with keys that can be "rtlAware" or "languageAware"
    * @returns {Promise<void>}
    */
  inline def reRenderAllUI5Elements(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reRenderAllUI5Elements")().asInstanceOf[js.Promise[Unit]]
  inline def reRenderAllUI5Elements(filters: LanguageAware): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reRenderAllUI5Elements")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Schedules a render task (if not already scheduled) to render the component
    *
    * @param webComponent
    * @returns {Promise}
    */
  inline def renderDeferred(webComponent: default): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderDeferred")(webComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderFinished(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFinished")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Renders a component synchronously and adds it to the registry of rendered components
    *
    * @param webComponent
    */
  inline def renderImmediately(webComponent: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderImmediately")(webComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type BeforeComponentRenderCallback = js.Function1[/* webComponent */ default, Unit]
}
