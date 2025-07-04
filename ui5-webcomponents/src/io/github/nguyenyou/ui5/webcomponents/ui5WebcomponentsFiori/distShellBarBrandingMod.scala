package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ClickVoid
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.link
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShellBarBrandingMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-shellbar-branding` component is intended to be placed inside the branding slot of the
    * `ui5-shellbar` component. Its content has higher priority than the `primaryTitle` property
    * and the `logo` slot of `ui5-shellbar`.
    *
    * @constructor
    * @extends UI5Element
    * @since 2.12.0
    * @public
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarBranding.js", JSImport.Default)
  @js.native
  open class default () extends ShellBarBranding
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-shellbar-branding` component is intended to be placed inside the branding slot of the
    * `ui5-shellbar` component. Its content has higher priority than the `primaryTitle` property
    * and the `logo` slot of `ui5-shellbar`.
    *
    * @constructor
    * @extends UI5Element
    * @since 2.12.0
    * @public
    * @experimental
    */
  @js.native
  trait ShellBarBranding
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _fireClick(): Unit = js.native
    
    /**
      * Defines if the title of the branding is shown on an S breakpoint.
      * @default false
      * @private
      */
    var _isSBreakPoint: Boolean = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _role: button | link = js.native
    
    /**
      * Defines the text alternative of the component.
      * If not provided a default text alternative will be set, if present.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def accessibleNameText: js.UndefOr[String] = js.native
    
    /**
      * Defines the title for the ui5-shellbar-branding component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    @JSName("eventDetails")
    var eventDetails_ShellBarBranding: ClickVoid = js.native
    
    /**
      * Defines the component href.
      *
      * **Note:** Standard hyperlink behavior is supported.
      * @default undefined
      * @public
      */
    var href: js.UndefOr[String] = js.native
    
    /**
      * Defines the logo of the `ui5-shellbar`.
      * For example, you can use `ui5-avatar` or `img` elements as logo.
      * @public
      */
    var logo: js.Array[HTMLElement] = js.native
    
    def parsedRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the component target.
      *
      * **Notes:**
      *
      * - `_self`
      * - `_top`
      * - `_blank`
      * - `_parent`
      * - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      * @default undefined
      * @public
      */
    var target: js.UndefOr[String] = js.native
  }
}
