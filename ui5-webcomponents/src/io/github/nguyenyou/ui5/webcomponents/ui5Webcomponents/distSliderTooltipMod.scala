package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Forwardfocus
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Interval
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSliderTooltipMod {
  
  /**
    * @class
    *
    * ### Overview
    * @constructor
    * @extends UI5Element
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/SliderTooltip.js", JSImport.Default)
  @js.native
  open class default () extends SliderTooltip
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SliderTooltip.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/SliderTooltip.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * @constructor
    * @extends UI5Element
    * @private
    */
  @js.native
  trait SliderTooltip
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelledByInputText: String = js.native
    
    def _keydown(e: KeyboardEvent): Unit = js.native
    
    def _onInputFocusOut(e: FocusEvent): Unit = js.native
    
    def _onInputFocusin(): Unit = js.native
    
    var _repoisitionInterval: js.UndefOr[Interval] = js.native
    
    def _repositionTooltipBound(): Unit = js.native
    
    def attachGlobalScrollHandler(): Unit = js.native
    
    def detachGlobalScrollHandler(): Unit = js.native
    
    var editable: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_SliderTooltip: Forwardfocus = js.native
    
    var followRef: js.UndefOr[HTMLElement] = js.native
    
    def inputRef: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default = js.native
    
    var inputValue: js.UndefOr[String] = js.native
    
    def isValueValid(value: String): Boolean = js.native
    
    var max: Double = js.native
    
    var min: Double = js.native
    
    var open: Boolean = js.native
    
    def repositionTooltip(): Unit = js.native
    
    var value: js.UndefOr[String] = js.native
    
    var valueState: /* template literal string: ${ValueState} */ String = js.native
  }
  
  trait SliderTooltipChangeEventDetails extends StObject {
    
    var value: String
  }
  object SliderTooltipChangeEventDetails {
    
    inline def apply(value: String): SliderTooltipChangeEventDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderTooltipChangeEventDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderTooltipChangeEventDetails] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
