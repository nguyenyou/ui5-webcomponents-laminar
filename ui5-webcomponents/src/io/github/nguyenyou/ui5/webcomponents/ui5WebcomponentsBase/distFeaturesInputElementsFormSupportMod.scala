package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesInputElementsFormSupportMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/InputElementsFormSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resetForm(element: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetForm")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setFormValidity(element: IFormInputElement): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setFormValidity")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setFormValue(element: IFormInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFormValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def submitForm(element: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("submitForm")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def updateFormValue(element: IFormInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateFormValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def updateFormValue(element: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateFormValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait IFormInputElement extends default {
    
    var formElementAnchor: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | js.Promise[js.UndefOr[HTMLElement]]]]] = js.native
    
    var formFormattedValue: FormData | String | Null = js.native
    
    var formValidity: js.UndefOr[ValidityStateFlags] = js.native
    
    var formValidityMessage: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
