package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateTimeInputMod {
  
  /**
    * Extention of the UI5 Input, so we do not modify Input's private properties within the datetime components.
    * Intended to be used for the DateTime components.
    *
    * @class
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/DateTimeInput.js", JSImport.Default)
  @js.native
  open class default () extends DateTimeInput
  
  /**
    * Extention of the UI5 Input, so we do not modify Input's private properties within the datetime components.
    * Intended to be used for the DateTime components.
    *
    * @class
    * @private
    */
  @js.native
  trait DateTimeInput
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default {
    
    def _isMobileDevice: Boolean = js.native
    
    var _shouldOpenValueStatePopover: Boolean = js.native
    
    /**
      * Prevents the value state message popover from appearing when a responsive popover (like time selection) is open
      * since the responsive popover already includes the necessary information in its header.
      *
      * @protected
      * @override
      */
    @JSName("hasValueStateMessage")
    def hasValueStateMessage_MDateTimeInput: Boolean = js.native
  }
}
