package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilAccessibilityTextsHelperMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/AccessibilityTextsHelper.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deregisterUI5Element(el: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterUI5Element")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAllAccessibleDescriptionRefTexts(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAccessibleDescriptionRefTexts")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    *
    * @param {HTMLElement} el Defines the HTMLElement, for which you need to get all related texts
    */
  inline def getAllAccessibleNameRefTexts(el: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAccessibleNameRefTexts")(el.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @param {HTMLElement} el Defines the HTMLElement, for which you need to get all related "label for" texts
    */
  inline def getAssociatedLabelForTexts(el: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAssociatedLabelForTexts")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEffectiveAriaDescriptionText(el: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveAriaDescriptionText")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEffectiveAriaLabelText(el: HTMLElement): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveAriaLabelText")(el.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def registerUI5Element(el: default, callback: MutationCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerUI5Element")(el.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type MutationCallback = js.Function0[Unit]
}
