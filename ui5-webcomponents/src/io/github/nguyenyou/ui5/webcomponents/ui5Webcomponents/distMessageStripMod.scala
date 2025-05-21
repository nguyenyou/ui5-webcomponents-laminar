package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.CloseVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMessageStripMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The ui5-message-strip component allows for the embedding of application-related messages.
    * It supports four semantic designs, each with its own color and icon: "Information", "Positive", "Critical", and "Negative".
    * Additionally, users can choose from two color sets ("ColorSet1" and "ColorSet2"), each containing 10 predefined color schemes.
    * Each message shows a "Close" button, so that it can be removed from the UI, if needed.
    * ### Usage
    *
    * For the `ui5-message-strip` component, you can define whether it displays
    * an icon in the beginning and a close button. Moreover, its size and background
    * can be controlled with CSS.
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
    * `import "@ui5/webcomponents/dist/MessageStrip.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.9.0
    * @slot {Array<Node>} default
    * Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @JSImport("@ui5/webcomponents/dist/MessageStrip.js", JSImport.Default)
  @js.native
  open class default () extends MessageStrip
  object default {
    
    @JSImport("@ui5/webcomponents/dist/MessageStrip.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def closeButtonMappings(): DesignCloseButtonTooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("closeButtonMappings")().asInstanceOf[DesignCloseButtonTooltip]
    
    /* static member */
    inline def designAnnouncementMappings(): DesignTypeAnnouncemnt = ^.asInstanceOf[js.Dynamic].applyDynamic("designAnnouncementMappings")().asInstanceOf[DesignTypeAnnouncemnt]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MessageStrip.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait DesignClassesMapping extends StObject
  @JSImport("@ui5/webcomponents/dist/MessageStrip.js", "DesignClassesMapping")
  @js.native
  object DesignClassesMapping extends StObject {
    
    @js.native
    sealed trait ColorSet1
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait ColorSet2
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Critical
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Information
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Negative
      extends StObject
         with DesignClassesMapping
    
    @js.native
    sealed trait Positive
      extends StObject
         with DesignClassesMapping
  }
  
  type DesignCloseButtonTooltip = Record[MessageStripDesign, String]
  
  type DesignTypeAnnouncemnt = Record[MessageStripDesign, String]
  
  /**
    * @class
    *
    * ### Overview
    *
    * The ui5-message-strip component allows for the embedding of application-related messages.
    * It supports four semantic designs, each with its own color and icon: "Information", "Positive", "Critical", and "Negative".
    * Additionally, users can choose from two color sets ("ColorSet1" and "ColorSet2"), each containing 10 predefined color schemes.
    * Each message shows a "Close" button, so that it can be removed from the UI, if needed.
    * ### Usage
    *
    * For the `ui5-message-strip` component, you can define whether it displays
    * an icon in the beginning and a close button. Moreover, its size and background
    * can be controlled with CSS.
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
    * `import "@ui5/webcomponents/dist/MessageStrip.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.9.0
    * @slot {Array<Node>} default
    * Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @js.native
  trait MessageStrip
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _closableText: String = js.native
    
    def _closeButtonText: String = js.native
    
    def _closeClick(): Unit = js.native
    
    /**
      * Defines the color scheme of the component.
      * There are 10 predefined schemes.
      * To use one you can set a number from `"1"` to `"10"`. The `colorScheme` `"1"` will be set by default.
      *
      * @default "1"
      * @public
      * @since 2.0.0
      */
    var colorScheme: String = js.native
    
    /**
      * Defines the component type.
      * @default "Information"
      * @public
      * @since 1.0.0-rc.15
      */
    var design: /* template literal string: ${MessageStripDesign} */ String = js.native
    
    def designClasses: DesignClassesMapping = js.native
    
    @JSName("eventDetails")
    var eventDetails_MessageStrip: CloseVoid = js.native
    
    def hiddenText: String = js.native
    
    /**
      * Defines whether the MessageStrip renders close button.
      * @default false
      * @public
      */
    var hideCloseButton: Boolean = js.native
    
    /**
      * Defines whether the MessageStrip will show an icon in the beginning.
      * You can directly provide an icon with the `icon` slot. Otherwise, the default icon for the type will be used.
      *
      *  * **Note:** If <code>MessageStripDesign.ColorSet1</code> or <code>MessageStripDesign.ColorSet2</code> value is set to the <code>design</code> property, default icon will not be presented.
      *
      * @default false
      * @public
      * @since 1.0.0-rc.15
      */
    var hideIcon: Boolean = js.native
    
    /**
      * Defines the content to be displayed as graphical element within the component.
      *
      * **Note:** If no icon is given, the default icon for the component type will be used.
      * The SAP-icons font provides numerous options.
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @public
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconProvided: Boolean = js.native
    
    def shouldHideIcon: Boolean = js.native
  }
}
