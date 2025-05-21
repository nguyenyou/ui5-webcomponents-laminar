package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigFormatSettingsMod.FormatSettings
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesAnimationModeMod.AnimationMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInitialConfigurationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/InitialConfiguration.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnimationMode(): AnimationMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationMode")().asInstanceOf[AnimationMode]
  
  /**
    * Get the configured calendar type
    * @returns { String } the name of the configured calendar type
    */
  inline def getCalendarType(): js.UndefOr[CalendarType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[js.UndefOr[CalendarType]]
  
  inline def getDefaultFontLoading(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontLoading")().asInstanceOf[Boolean]
  
  inline def getEnableDefaultTooltips(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnableDefaultTooltips")().asInstanceOf[Boolean]
  
  /**
    * Returns if the default language, that is inlined at build time,
    * should be fetched over the network instead.
    * @returns {Boolean}
    */
  inline def getFetchDefaultLanguage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetchDefaultLanguage")().asInstanceOf[Boolean]
  
  inline def getFormatSettings(): FormatSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatSettings")().asInstanceOf[FormatSettings]
  
  inline def getLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[js.UndefOr[String]]
  
  inline def getNoConflict(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoConflict")().asInstanceOf[Boolean]
  
  inline def getSecondaryCalendarType(): js.UndefOr[CalendarType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryCalendarType")().asInstanceOf[js.UndefOr[CalendarType]]
  
  inline def getTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[String]
  
  inline def getThemeRoot(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeRoot")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns the configured IANA timezone ID.
    * @returns { String } the configured IANA timezone ID, e.g. "America/New_York"
    */
  inline def getTimezone(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimezone")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Internaly exposed method to enable configurations in tests.
    * @private
    */
  inline def resetConfiguration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")().asInstanceOf[Unit]
  inline def resetConfiguration(testEnv: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")(testEnv.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
