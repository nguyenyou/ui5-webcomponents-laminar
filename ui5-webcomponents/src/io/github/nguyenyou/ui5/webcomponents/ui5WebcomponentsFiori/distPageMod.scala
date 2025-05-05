package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Content
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`0rem`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`2Dot75rem`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.`3Dot5rem`
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPageMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-page` is a container component that holds one whole screen of an application.
    * The page has three distinct areas that can hold content - a header, content area and a footer.
    * ### Structure
    * #### Header
    * The top most area of the page is occupied by the header. The standard header includes a navigation button and a title.
    * #### Content
    * The content occupies the main part of the page. Only the content area is scrollable by default.
    * This can be prevented by setting `noScrolling` to `true`.
    * #### Footer
    * The footer is optional and occupies the part above the bottom part of the content. Alternatively, the footer can be fixed at the bottom of the page by enabling the `fixedFooter` property.
    *
    * **Note:** `ui5-page` occipues the whole available space of its parent. In order to achieve the intended design you have to make sure
    * that there is enough space for the `ui5-page` to be rendered.
    * **Note:** In order for the `ui5-page` to be displayed, the parent element should have fixed height.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/Page.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @public
    * @csspart content - Used to style the content section of the component
    */
  @JSImport("@ui5/webcomponents-fiori/dist/Page", JSImport.Default)
  @js.native
  open class default () extends Page
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-page` is a container component that holds one whole screen of an application.
    * The page has three distinct areas that can hold content - a header, content area and a footer.
    * ### Structure
    * #### Header
    * The top most area of the page is occupied by the header. The standard header includes a navigation button and a title.
    * #### Content
    * The content occupies the main part of the page. Only the content area is scrollable by default.
    * This can be prevented by setting `noScrolling` to `true`.
    * #### Footer
    * The footer is optional and occupies the part above the bottom part of the content. Alternatively, the footer can be fixed at the bottom of the page by enabling the `fixedFooter` property.
    *
    * **Note:** `ui5-page` occipues the whole available space of its parent. In order to achieve the intended design you have to make sure
    * that there is enough space for the `ui5-page` to be rendered.
    * **Note:** In order for the `ui5-page` to be displayed, the parent element should have fixed height.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/Page.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @public
    * @csspart content - Used to style the content section of the component
    */
  @js.native
  trait Page
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _contentBottom: `0` | `2Dot75rem` = js.native
    
    def _contentPaddingBottom: `0` | `3Dot5rem` = js.native
    
    def _contentTop: `2Dot75rem` | `0rem` = js.native
    
    /**
      * Defines the background color of the `ui5-page`.
      *
      * **Note:** When a ui5-list is placed inside the page, we recommend using “List” to ensure better color contrast.
      * @default "Solid"
      * @public
      */
    var backgroundDesign: /* template literal string: ${PageBackgroundDesign} */ String = js.native
    
    /**
      * Defines the content HTML Element.
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * Defines if the footer is fixed at the very bottom of the page.
      *
      * **Note:** When set to true the footer is fixed at the very bottom of the page, otherwise it floats over the content with a slight offset from the bottom.
      * @default false
      * @public
      */
    var fixedFooter: Boolean = js.native
    
    /**
      * Defines the footer HTML Element.
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header HTML Element.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the footer visibility.
      * @default false
      * @public
      */
    var hideFooter: Boolean = js.native
    
    /**
      * Disables vertical scrolling of page content.
      * If set to true, there will be no vertical scrolling at all.
      * @default false
      * @public
      */
    var noScrolling: Boolean = js.native
    
    def styles: Content = js.native
  }
}
