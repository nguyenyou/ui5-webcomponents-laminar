package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.AnimationMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.CalendarType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesLocaleDataMod.CLDRData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesPatchPopupMod.PopupInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesOpenUI5SupportMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Support.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenUI5Support
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Support.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addOpenedPopup(popupInfo: PopupInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOpenedPopup")(popupInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /* static member */
    inline def attachListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachListeners")().asInstanceOf[Unit]
    
    /* static member */
    inline def cssVariablesLoaded(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssVariablesLoaded")().asInstanceOf[js.UndefOr[Boolean]]
    
    /* static member */
    inline def getConfigurationSettingsObject(): AnimationMode | CalendarType = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigurationSettingsObject")().asInstanceOf[AnimationMode | CalendarType]
    
    /* static member */
    inline def getLocaleDataObject(): js.UndefOr[CLDRData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDataObject")().asInstanceOf[js.UndefOr[CLDRData]]
    
    /* static member */
    inline def getTopmostPopup(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopmostPopup")().asInstanceOf[js.Object]
    
    /* static member */
    inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/features/OpenUI5Support.js", "default.initPromise")
    @js.native
    def initPromise: js.UndefOr[js.Promise[Unit]] = js.native
    inline def initPromise_=(x: js.UndefOr[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initPromise")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isAtLeastVersion116(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAtLeastVersion116")().asInstanceOf[Boolean]
    
    /* static member */
    inline def isOpenUI5Detected(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpenUI5Detected")().asInstanceOf[Boolean]
    
    /* static member */
    inline def listenForThemeChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_listenForThemeChange")().asInstanceOf[Unit]
    
    /* static member */
    inline def removeOpenedPopup(popup: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOpenedPopup")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait OpenUI5Support extends StObject
}
