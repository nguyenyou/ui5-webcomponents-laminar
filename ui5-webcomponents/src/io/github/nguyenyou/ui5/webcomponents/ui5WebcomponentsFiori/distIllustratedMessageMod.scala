package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.IButton
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIllustratedMessageMod {
  
  /**
    * @class
    *
    * ### Overview
    * An IllustratedMessage is a recommended combination of a solution-oriented message, an engaging
    * illustration, and conversational tone to better communicate an empty or a success state than just show
    * a message alone.
    *
    * Each illustration has default internationalised title and subtitle texts. Also they can be managed with
    * `titleText` and `subtitleText` properties.
    *
    * To display the desired illustration, use the `name` property, where you can find the list of all available illustrations.
    *
    * **Note:** By default the “BeforeSearch” illustration is loaded. To use other illustrations, make sure you import them in addition, for example:
    *
    * `import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js"`
    *
    * **Note:** Illustrations starting with the “Tnt” prefix are part of another illustration set. For example to use the “TntSuccess” illustration, add the following import::
    *
    * `import "@ui5/webcomponents-fiori/dist/illustrations/tnt/Success.js"`
    *
    * ### Structure
    * The IllustratedMessage consists of the following elements, which are displayed below each other in the following order:
    *
    * - Illustration
    * - Title
    * - Subtitle
    * - Actions
    *
    * ### Usage
    * `ui5-illustrated-message` is meant to be used inside container component, for example a `ui5-card`,
    * a `ui5-dialog` or a `ui5-page`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/IllustratedMessage.js";`
    * @csspart subtitle - Used to style the subtitle wrapper of the `ui5-illustrated-message`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", JSImport.Default)
  @js.native
  open class default () extends IllustratedMessage
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * An IllustratedMessage is a recommended combination of a solution-oriented message, an engaging
    * illustration, and conversational tone to better communicate an empty or a success state than just show
    * a message alone.
    *
    * Each illustration has default internationalised title and subtitle texts. Also they can be managed with
    * `titleText` and `subtitleText` properties.
    *
    * To display the desired illustration, use the `name` property, where you can find the list of all available illustrations.
    *
    * **Note:** By default the “BeforeSearch” illustration is loaded. To use other illustrations, make sure you import them in addition, for example:
    *
    * `import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js"`
    *
    * **Note:** Illustrations starting with the “Tnt” prefix are part of another illustration set. For example to use the “TntSuccess” illustration, add the following import::
    *
    * `import "@ui5/webcomponents-fiori/dist/illustrations/tnt/Success.js"`
    *
    * ### Structure
    * The IllustratedMessage consists of the following elements, which are displayed below each other in the following order:
    *
    * - Illustration
    * - Title
    * - Subtitle
    * - Actions
    *
    * ### Usage
    * `ui5-illustrated-message` is meant to be used inside container component, for example a `ui5-card`,
    * a `ui5-dialog` or a `ui5-page`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/IllustratedMessage.js";`
    * @csspart subtitle - Used to style the subtitle wrapper of the `ui5-illustrated-message`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait IllustratedMessage
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _adjustHeightToFitContainer(): Unit = js.native
    
    def _applyMedia(): Unit = js.native
    def _applyMedia(heightChange: Boolean): Unit = js.native
    
    /**
      * Modifies the IM styles in accordance to the `size` property's value.
      * Note: The resize handler has no effect when size is different than "Auto".
      * @private
      * @since 1.5.0
      */
    def _handleCustomSize(): Unit = js.native
    
    def _handleResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResize")
    var _handleResize_Original: ResizeObserverCallback = js.native
    
    var _lastKnownMedia: String = js.native
    
    var _lastKnownOffsetHeightForMedia: Record[String, Double] = js.native
    
    var _lastKnownOffsetWidthForMedia: Record[String, Double] = js.native
    
    def _setSVGAccAttrs(): Unit = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.7.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the component actions.
      * @public
      */
    var actions: js.Array[IButton] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Determines which illustration breakpoint variant is used.
      *
      * As `IllustratedMessage` adapts itself around the `Illustration`, the other
      * elements of the component are displayed differently on the different breakpoints/illustration designs.
      * @default "Auto"
      * @public
      * @since 2.0.0
      */
    var design: /* template literal string: ${IllustrationMessageDesign} */ String = js.native
    
    /**
      * Illustration breakpoint variant for the `Dialog` design.
      * @private
      * @since 1.9.0
      */
    var dialogSvg: js.UndefOr[String] = js.native
    
    /**
      * Illustration breakpoint variant for the <code>Dot</code> design.
      *
      * @private
      * @since 1.24.0
      */
    var dotSvg: js.UndefOr[String] = js.native
    
    def effectiveIllustration: js.UndefOr[String] = js.native
    
    def effectiveSubitleText: js.UndefOr[String] = js.native
    
    def effectiveTitleText: js.UndefOr[String] = js.native
    
    def handleResize(): Unit = js.native
    
    def hasActions: Boolean = js.native
    
    def hasFormattedSubtitle: Boolean = js.native
    
    def hasFormattedTitle: Boolean = js.native
    
    def hasSubtitle: Boolean = js.native
    
    def hasTitle: Boolean = js.native
    
    var illustrationSubtitle: js.UndefOr[String] = js.native
    
    var illustrationTitle: js.UndefOr[String] = js.native
    
    def isValidIllustration(currentIllustration: String): Boolean = js.native
    
    /**
      * Determinates what is the current media of the component based on its width.
      * @private
      */
    var media: js.UndefOr[String] = js.native
    
    /**
      * Defines the illustration name that will be displayed in the component.
      *
      * Example:
      *
      * `name='BeforeSearch'`, `name='UnableToUpload'`, etc..
      *
      * **Note:** To use the TNT illustrations,
      * you need to set the `tnt` or `Tnt` prefix in front of the icon's name.
      *
      * Example:
      *
      * `name='tnt/Avatar'` or `name='TntAvatar'`.
      *
      * **Note:** By default the `BeforeSearch` illustration is loaded.
      * When using an illustration type, other than the default, it should be loaded in addition:
      *
      * `import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js";`
      *
      * For TNT illustrations:
      *
      * `import "@ui5/webcomponents-fiori/dist/illustrations/tnt/SessionExpired.js";`
      * @default "BeforeSearch"
      * @public
      */
    var name: String = js.native
    
    /**
      * Illustration breakpoint variant for the `Scene` design.
      * @private
      * @since 1.9.0
      */
    var sceneSvg: js.UndefOr[String] = js.native
    
    /**
      * Illustration breakpoint variant for the <code>Spot</code> design.
      *
      * @private
      * @since 1.9.0
      */
    var spotSvg: js.UndefOr[String] = js.native
    
    /**
      * Defines the subtitle of the component.
      *
      * **Note:** Using this slot, the default subtitle text of illustration and the value of `subtitleText` property will be overwritten.
      * @public
      * @since 1.0.0-rc.16
      */
    var subtitle: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the subtitle of the component.
      *
      * **Note:** Using this property, the default subtitle text of illustration will be overwritten.
      *
      * **Note:** Using `subtitle` slot, the default of this property will be overwritten.
      * @default undefined
      * @public
      */
    var subtitleText: js.UndefOr[String] = js.native
    
    /**
      * Defines the title of the component.
      *
      * **Note:** Using this property, the default title text of illustration will be overwritten.
      * @default undefined
      * @public
      */
    var titleText: js.UndefOr[String] = js.native
    
    /**
      * Defines the title of the component.
      *
      * **Note:** Using this slot, the default title text of illustration and the value of `title` property will be overwritten.
      * @public
      * @since 1.7.0
      */
    @JSName("title")
    var title_IllustratedMessage: js.Array[HTMLElement] & String = js.native
  }
}
