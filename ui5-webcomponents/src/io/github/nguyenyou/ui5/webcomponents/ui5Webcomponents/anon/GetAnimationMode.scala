package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnimationMode extends StObject {
  
  def getAnimationMode(): /* template literal string: ${import(@ui5/webcomponents-base/dist/types/AnimationMode.js).default} */ String = js.native
  
  def getFirstDayOfWeek(): js.UndefOr[Double] = js.native
  
  def getLanguage(): js.UndefOr[String] = js.native
  
  def getTheme(): String = js.native
  
  def getThemeRoot(): js.UndefOr[String] = js.native
  
  def getTimezone(): js.UndefOr[String] = js.native
  
  def isLegacyThemeFamily(): Boolean = js.native
  
  def setAnimationMode(
    animationMode: /* template literal string: ${import(@ui5/webcomponents-base/dist/types/AnimationMode.js).default} */ String
  ): Unit = js.native
  
  def setLanguage(language: String): js.Promise[Unit] = js.native
  
  def setNoConflict(noConflictData: Events): Unit = js.native
  def setNoConflict(noConflictData: Boolean): Unit = js.native
  
  def setTheme(theme: String): js.Promise[Unit] = js.native
  
  def setThemeRoot(themeRoot: String): js.UndefOr[js.Promise[Unit]] = js.native
  
  def setTimezone(timezone: String): Unit = js.native
}
