package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResponsivePopoverMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-responsive-popover` acts as a Popover on desktop and tablet, while on phone it acts as a Dialog.
    * The component improves tremendously the user experience on mobile.
    *
    * ### Usage
    * Use it when you want to make sure that all the content is visible on any device.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ResponsivePopover.js";`
    * @constructor
    * @extends Popover
    * @since 1.0.0-rc.6
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @JSImport("@ui5/webcomponents/dist/ResponsivePopover", JSImport.Default)
  @js.native
  open class default () extends ResponsivePopover
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ResponsivePopover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ResponsivePopover", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-responsive-popover` acts as a Popover on desktop and tablet, while on phone it acts as a Dialog.
    * The component improves tremendously the user experience on mobile.
    *
    * ### Usage
    * Use it when you want to make sure that all the content is visible on any device.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ResponsivePopover.js";`
    * @constructor
    * @extends Popover
    * @since 1.0.0-rc.6
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @js.native
  trait ResponsivePopover
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default {
    
    def _afterDialogClose(): Unit = js.native
    
    def _afterDialogOpen(): Unit = js.native
    
    def _beforeDialogClose(e: CustomEvent): Unit = js.native
    
    def _beforeDialogOpen(): Unit = js.native
    
    def _closeDialogAriaLabel: String = js.native
    
    def _dialog: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDialogMod.default = js.native
    
    def _dialogCloseButtonClick(): Unit = js.native
    
    /**
      * Defines whether a close button will be rendered in the header of the component
      * **Note:** If you are using the `header` slot, this property will have no effect
      * @private
      * @default false
      * @since 1.0.0-rc.16
      */
    var _hideCloseButton: Boolean = js.native
    
    /**
      * Used internaly for controls which must not have header.
      * @private
      */
    var _hideHeader: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    /**
      * Defines if only the content would be displayed (without header and footer) in the popover on Desktop.
      * By default both the header and footer would be displayed.
      * @private
      */
    var contentOnlyOnDesktop: Boolean = js.native
    
    def toggle(opener: HTMLElement): Unit = js.native
  }
}
