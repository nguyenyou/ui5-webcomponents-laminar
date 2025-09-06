package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Announce
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.GetAnimationMode
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Height
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.TypeofResizeHandler
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.TypeofdefaultTexts
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigIconsMod.IconCollection
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBundleDotscopedDotesmMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", "default.ResizeHandler")
    @js.native
    open class ResizeHandler ()
      extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.default
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", "default.ResizeHandler")
    @js.native
    def ResizeHandler: (Instantiable0[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.default
      ]) & TypeofResizeHandler = js.native
    inline def ResizeHandler_=(
      x: (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.default
        ]) & TypeofResizeHandler
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResizeHandler")(x.asInstanceOf[js.Any])
    
    inline def addCustomCSS(tag: String, css: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomCSS")(tag.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def applyDirection(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyDirection")().asInstanceOf[js.Promise[Unit]]
    
    inline def attachDirectionChange(listener: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachDirectionChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def attachThemeLoaded(listener: js.Function1[/* theme */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", "default.configuration")
    @js.native
    def configuration: GetAnimationMode = js.native
    inline def configuration_=(x: GetAnimationMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configuration")(x.asInstanceOf[js.Any])
    
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", "default.defaultTexts")
    @js.native
    def defaultTexts: TypeofdefaultTexts = js.native
    inline def defaultTexts_=(x: TypeofdefaultTexts): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTexts")(x.asInstanceOf[js.Any])
    
    inline def detachThemeLoaded(listener: js.Function1[/* theme */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getEffectiveIconCollection(): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveIconCollection")().asInstanceOf[IconCollection]
    inline def getEffectiveIconCollection(collectionName: IconCollection): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveIconCollection")(collectionName.asInstanceOf[js.Any]).asInstanceOf[IconCollection]
    
    inline def getElementSelection(element: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementSelection")(element.asInstanceOf[js.Any]).asInstanceOf[Height]
    
    inline def getIconAccessibleName(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconAccessibleName")().asInstanceOf[js.Promise[js.UndefOr[String]]]
    inline def getIconAccessibleName(name: String): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconAccessibleName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
    
    inline def getIconNames(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconNames")().asInstanceOf[js.Promise[js.Array[String]]]
    
    inline def getLocaleData(lang: String): js.Promise[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distLocaleDataMod.default
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleData")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distLocaleDataMod.default
      ]]
    
    inline def ignoreCustomElements(tagPrefix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ignoreCustomElements")(tagPrefix.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@ui5/webcomponents-compat/dist/bundle.scoped.esm", "default.invisibleMessage")
    @js.native
    def invisibleMessage: Announce = js.native
    inline def invisibleMessage_=(x: Announce): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invisibleMessage")(x.asInstanceOf[js.Any])
    
    inline def renderFinished(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFinished")().asInstanceOf[js.Promise[Unit]]
    
    inline def resetConfiguration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")().asInstanceOf[Unit]
    inline def resetConfiguration(testEnv: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")(testEnv.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def shouldIgnoreCustomElement(tag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldIgnoreCustomElement")(tag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def startMultipleDrag(count: Double, e: DragEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startMultipleDrag")(count.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
