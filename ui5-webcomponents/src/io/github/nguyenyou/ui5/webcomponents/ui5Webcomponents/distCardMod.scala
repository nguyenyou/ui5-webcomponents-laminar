package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCardMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-card` is a component that represents information in the form of a
    * tile with separate header and content areas.
    * The content area of a `ui5-card` can be arbitrary HTML content.
    * The header can be used through slot `header`. For which there is a `ui5-card-header` component to achieve the card look and feel.
    *
    * Note: We recommend the usage of `ui5-card-header` for the header slot, so advantage can be taken for keyboard handling, styling and accessibility.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Card.js";`
    *
    * `import "@ui5/webcomponents/dist/CardHeader.js";` (for `ui5-card-header`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the root DOM element of the card component
    * @csspart content - Used to style the content of the card
    */
  @JSImport("@ui5/webcomponents/dist/Card", JSImport.Default)
  @js.native
  open class default () extends Card
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Card", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-card` is a component that represents information in the form of a
    * tile with separate header and content areas.
    * The content area of a `ui5-card` can be arbitrary HTML content.
    * The header can be used through slot `header`. For which there is a `ui5-card-header` component to achieve the card look and feel.
    *
    * Note: We recommend the usage of `ui5-card-header` for the header slot, so advantage can be taken for keyboard handling, styling and accessibility.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Card.js";`
    *
    * `import "@ui5/webcomponents/dist/CardHeader.js";` (for `ui5-card-header`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the root DOM element of the card component
    * @csspart content - Used to style the content of the card
    */
  @js.native
  trait Card
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaCardContentLabel: String = js.native
    
    def _getAriaLabel: String = js.native
    
    def _hasHeader: Boolean = js.native
    
    /**
      * Defines the accessible name of the component, which is used as the name of the card region and should be unique per card.
      *
      * **Note:** `accessibleName` should be always set, unless `accessibleNameRef` is set.
      * @default undefined
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the content of the component.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header of the component.
      *
      * **Note:** Use `ui5-card-header` for the intended design.
      * @since 1.0.0-rc.15
      * @public
      */
    var header: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCardHeaderMod.default] = js.native
    
    /**
      * Defines if a loading indicator would be displayed over the card.
      * @default false
      * @public
      * @since 2.1.0
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the loading indicator will show up for this card.
      * @default 1000
      * @public
      * @since 2.1.0
      */
    var loadingDelay: Double = js.native
  }
}
