package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.group
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardHeaderMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-card-header` is a component, meant to be used as a header of the `ui5-card` component.
    * It displays valuable information, that can be defined with several properties, such as: `titleText`, `subtitleText`, `additionalText`
    * and two slots: `avatar` and `action`.
    *
    * ### Keyboard handling
    * In case you enable `interactive` property, you can press the `ui5-card-header` by Space and Enter keys.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CardHeader";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    * @csspart root - Used to style the root DOM element of the CardHeader
    * @csspart title - Used to style the title of the CardHeader
    * @csspart subtitle - Used to style the subtitle of the CardHeader
    * @csspart additional-text - Used to style the additional text of the CardHeader
    */
  @JSImport("@ui5/webcomponents/dist/CardHeader", JSImport.Default)
  @js.native
  open class default () extends CardHeader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CardHeader", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-card-header` is a component, meant to be used as a header of the `ui5-card` component.
    * It displays valuable information, that can be defined with several properties, such as: `titleText`, `subtitleText`, `additionalText`
    * and two slots: `avatar` and `action`.
    *
    * ### Keyboard handling
    * In case you enable `interactive` property, you can press the `ui5-card-header` by Space and Enter keys.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CardHeader";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    * @csspart root - Used to style the root DOM element of the CardHeader
    * @csspart title - Used to style the title of the CardHeader
    * @csspart subtitle - Used to style the subtitle of the CardHeader
    * @csspart additional-text - Used to style the additional text of the CardHeader
    */
  @js.native
  trait CardHeader
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _actionsFocusin(): Unit = js.native
    
    def _actionsFocusout(): Unit = js.native
    
    /**
      * Define the `aria-level` attribute of the component
      *
      * **Note: ** If the interactive property is set, `aria-level` attribute is not rendered at all.
      * @private
      * @default 3
      */
    var _ariaLevel: Double = js.native
    
    def _click(e: MouseEvent): Unit = js.native
    
    var _headerActive: Boolean = js.native
    
    def _keydown(e: KeyboardEvent): Unit = js.native
    
    def _keyup(e: KeyboardEvent): Unit = js.native
    
    def _root: HTMLElement = js.native
    
    /**
      * Defines an action, displayed in the right most part of the header.
      * @public
      */
    var action: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the additional text.
      * @default undefined
      * @public
      */
    var additionalText: js.UndefOr[String] = js.native
    
    def ariaCardAvatarLabel: String = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    @JSName("ariaRoleDescription")
    def ariaRoleDescription_MCardHeader: String = js.native
    
    def ariaRoleFocusableElement: button | group = js.native
    
    /**
      * Defines an avatar image, displayed in the left most part of the header.
      * @public
      */
    var avatar: js.Array[HTMLElement] = js.native
    
    @JSName("eventDetails")
    var eventDetails_CardHeader: Click = js.native
    
    def hasAction: Boolean = js.native
    
    def hasAvatar: Boolean = js.native
    
    /**
      * Defines if the component would be interactive,
      * e.g gets hover effect and `click` event is fired, when pressed.
      * @default false
      * @public
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines the subtitle text.
      * @default undefined
      * @public
      */
    var subtitleText: js.UndefOr[String] = js.native
    
    /**
      * Defines the title text.
      * @default undefined
      * @public
      */
    var titleText: js.UndefOr[String] = js.native
  }
}
