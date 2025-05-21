package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.LinkAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Space
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`DotDotDot `
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExpandableTextMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-expandable-text` component allows displaying a large body of text in a small space. It provides an "expand/collapse" functionality, which shows/hides potentially truncated text.
    *
    * ### Usage
    *
    * #### When to use:
    * - To accommodate long texts in limited space, for example in list items, table cell texts, or forms
    *
    * #### When not to use:
    * - The content is critical for the user. In this case use short descriptions that can fit in
    * - Strive to provide short and meaningful texts to avoid excessive number of "Show More" links on the page
    *
    * ### Responsive Behavior
    *
    * On phones, if the component is configured to display the full text in a popover, the popover will appear in full screen.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ExpandableText";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.6.0
    */
  @JSImport("@ui5/webcomponents/dist/ExpandableText.js", JSImport.Default)
  @js.native
  open class default () extends ExpandableText
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ExpandableText.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ExpandableText.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-expandable-text` component allows displaying a large body of text in a small space. It provides an "expand/collapse" functionality, which shows/hides potentially truncated text.
    *
    * ### Usage
    *
    * #### When to use:
    * - To accommodate long texts in limited space, for example in list items, table cell texts, or forms
    *
    * #### When not to use:
    * - The content is critical for the user. In this case use short descriptions that can fit in
    * - Strive to provide short and meaningful texts to avoid excessive number of "Show More" links on the page
    *
    * ### Responsive Behavior
    *
    * On phones, if the component is configured to display the full text in a popover, the popover will appear in full screen.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ExpandableText";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.6.0
    */
  @js.native
  trait ExpandableText
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _accessibilityAttributesForToggle: LinkAccessibilityAttributes = js.native
    
    def _accessibleNameForToggle: js.UndefOr[String] = js.native
    
    def _closeButtonText: String = js.native
    
    def _displayedText: js.UndefOr[String] = js.native
    
    def _ellipsisText: Space | (`DotDotDot `) = js.native
    
    var _expanded: Boolean = js.native
    
    @JSName("_handleCloseButtonClick")
    def _handleCloseButtonClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _handlePopoverClose(): Unit = js.native
    
    def _handleToggleClick(): Unit = js.native
    
    def _maxCharactersExceeded: Boolean = js.native
    
    def _textForToggle: String = js.native
    
    def _usePopover: Boolean = js.native
    
    /**
      * Specifies if an empty indicator should be displayed when there is no text.
      * @default "Off"
      * @public
      */
    var emptyIndicatorMode: /* template literal string: ${TextEmptyIndicatorMode} */ String = js.native
    
    /**
      * Maximum number of characters to be displayed initially. If the text length exceeds this limit, the text will be truncated with an ellipsis, and the "More" link will be displayed.
      * @default 100
      * @public
      */
    var maxCharacters: Double = js.native
    
    /**
      * Determines how the full text will be displayed.
      * @default "InPlace"
      * @public
      */
    var overflowMode: /* template literal string: ${ExpandableTextOverflowMode} */ String = js.native
    
    /**
      * Text of the component.
      *
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
