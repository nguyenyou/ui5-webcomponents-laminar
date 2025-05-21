package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Label
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBarMod {
  
  /**
    * @class
    *
    * ### Overview
    * The Bar is a container which is primarily used to hold titles, buttons and input elements
    * and its design and functionality is the basis for page headers and footers.
    * The component consists of three areas to hold its content - startContent slot, default slot and endContent slot.
    * It has the capability to center content, such as a title, while having other components on the left and right side.
    *
    * ### Usage
    * With the use of the design property, you can set the style of the Bar to appear designed like a Header, Subheader, Footer and FloatingFooter.
    *
    * **Note:** Do not place a Bar inside another Bar or inside any bar-like component. Doing so may cause unpredictable behavior.
    *
    * ### Responsive Behavior
    * The default slot will be centered in the available space between the startContent and the endContent areas,
    * therefore it might not always be centered in the entire bar.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Bar.js";`
    * @csspart bar - Used to style the wrapper of the content of the component
    * @csspart startContent - Used to style the wrapper of the start content of the component
    * @csspart midContent - Used to style the wrapper of the middle content of the component
    * @csspart endContent - Used to style the wrapper of the end content of the component
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.11
    */
  @JSImport("@ui5/webcomponents/dist/Bar.js", JSImport.Default)
  @js.native
  open class default () extends Bar
  
  /**
    * @class
    *
    * ### Overview
    * The Bar is a container which is primarily used to hold titles, buttons and input elements
    * and its design and functionality is the basis for page headers and footers.
    * The component consists of three areas to hold its content - startContent slot, default slot and endContent slot.
    * It has the capability to center content, such as a title, while having other components on the left and right side.
    *
    * ### Usage
    * With the use of the design property, you can set the style of the Bar to appear designed like a Header, Subheader, Footer and FloatingFooter.
    *
    * **Note:** Do not place a Bar inside another Bar or inside any bar-like component. Doing so may cause unpredictable behavior.
    *
    * ### Responsive Behavior
    * The default slot will be centered in the available space between the startContent and the endContent areas,
    * therefore it might not always be centered in the entire bar.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Bar.js";`
    * @csspart bar - Used to style the wrapper of the content of the component
    * @csspart startContent - Used to style the wrapper of the start content of the component
    * @csspart midContent - Used to style the wrapper of the middle content of the component
    * @csspart endContent - Used to style the wrapper of the end content of the component
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.11
    */
  @js.native
  trait Bar
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _handleResizeBound(): Unit = js.native
    
    def accInfo: Label = js.native
    
    /**
      * Defines the component's design.
      * @default "Header"
      * @public
      */
    var design: /* template literal string: ${BarDesign} */ String = js.native
    
    /**
      * Defines the content at the end of the bar.
      * @public
      */
    var endContent: js.Array[HTMLElement] = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines the content in the middle of the bar.
      * @public
      */
    var middleContent: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the content at the start of the bar.
      * @public
      */
    var startContent: js.Array[HTMLElement] = js.native
  }
}
