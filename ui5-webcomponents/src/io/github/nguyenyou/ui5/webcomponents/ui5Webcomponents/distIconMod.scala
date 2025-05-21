package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.img
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.ltr
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.presentation
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-icon` component represents an SVG icon.
    * There are two main scenarios how the `ui5-icon` component is used:
    * as a purely decorative element,
    * or as an interactive element that can be focused and clicked.
    *
    * ### Usage
    *
    * 1. **Get familiar with the icons collections.**
    *
    * Before displaying an icon, you need to explore the icons collections to find and import the desired icon.
    *
    * Currently there are 3 icons collection, available as 3 npm packages:
    *
    * - [@ui5/webcomponents-icons](https://www.npmjs.com/package/@ui5/webcomponents-icons) represents the "SAP-icons" collection and includes the following
    * [icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons).
    * - [@ui5/webcomponents-icons-tnt](https://www.npmjs.com/package/@ui5/webcomponents-icons-tnt) represents the "tnt" collection and includes the following
    * [icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT).
    * - [@ui5/webcomponents-icons-business-suite](https://www.npmjs.com/package/@ui5/webcomponents-icons-business-suite) represents the "business-suite" collection and includes the following
    * [icons](https://ui5.sap.com/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/BusinessSuiteInAppSymbols).
    *
    * 2. **After exploring the icons collections, add one or more of the packages as dependencies to your project.**
    *
    * `npm i @ui5/webcomponents-icons`
    * `npm i @ui5/webcomponents-icons-tnt`
    * `npm i @ui5/webcomponents-icons-business-suite`
    *
    * 3. **Then, import the desired icon**.
    *
    * `import "@ui5/\{package_name\}/dist/\{icon_name\}.js";`
    *
    * **For Example**:
    *
    * For the standard "SAP-icons" icon collection, import an icon from the `@ui5/webcomponents-icons` package:
    *
    * `import "@ui5/webcomponents-icons/dist/employee.js";`
    *
    * For the "tnt" (SAP Fiori Tools) icon collection, import an icon from the `@ui5/webcomponents-icons-tnt` package:
    *
    * `import "@ui5/webcomponents-icons-tnt/dist/antenna.js";`
    *
    * For the "business-suite" (SAP Business Suite) icon collection, import an icon from the `@ui5/webcomponents-icons-business-suite` package:
    *
    * `import "@ui5/webcomponents-icons-business-suite/dist/ab-testing.js";`
    *
    * 4. **Display the icon using the `ui5-icon` web component.**
    * Set the icon collection ("SAP-icons", "tnt" or "business-suite" - "SAP-icons" is the default icon collection and can be skipped)
    * and the icon name to the `name` property.
    *
    * `<ui5-icon name="employee"></ui5-icon>`
    * `<ui5-icon name="tnt/antenna"></ui5-icon>`
    * `<ui5-icon name="business-suite/ab-testing"></ui5-icon>`
    *
    * ### Keyboard Handling
    *
    * - [Space] / [Enter] or [Return] - Fires the `click` event if the `mode` property is set to `Interactive`.
    * - [Shift] - If [Space] / [Enter] or [Return] is pressed, pressing [Shift] releases the ui5-icon without triggering the click event.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Icon.js";`
    * @csspart root - Used to style the outermost wrapper of the `ui5-icon`.
    * @constructor
    * @extends UI5Element
    * @implements {IIcon}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Icon.js", JSImport.Default)
  @js.native
  open class default () extends Icon
  
  /**
    * Interface for components that represent an icon, usable in numerous higher-order components
    * @public
    */
  type IIcon = HTMLElement
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-icon` component represents an SVG icon.
    * There are two main scenarios how the `ui5-icon` component is used:
    * as a purely decorative element,
    * or as an interactive element that can be focused and clicked.
    *
    * ### Usage
    *
    * 1. **Get familiar with the icons collections.**
    *
    * Before displaying an icon, you need to explore the icons collections to find and import the desired icon.
    *
    * Currently there are 3 icons collection, available as 3 npm packages:
    *
    * - [@ui5/webcomponents-icons](https://www.npmjs.com/package/@ui5/webcomponents-icons) represents the "SAP-icons" collection and includes the following
    * [icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons).
    * - [@ui5/webcomponents-icons-tnt](https://www.npmjs.com/package/@ui5/webcomponents-icons-tnt) represents the "tnt" collection and includes the following
    * [icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT).
    * - [@ui5/webcomponents-icons-business-suite](https://www.npmjs.com/package/@ui5/webcomponents-icons-business-suite) represents the "business-suite" collection and includes the following
    * [icons](https://ui5.sap.com/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/BusinessSuiteInAppSymbols).
    *
    * 2. **After exploring the icons collections, add one or more of the packages as dependencies to your project.**
    *
    * `npm i @ui5/webcomponents-icons`
    * `npm i @ui5/webcomponents-icons-tnt`
    * `npm i @ui5/webcomponents-icons-business-suite`
    *
    * 3. **Then, import the desired icon**.
    *
    * `import "@ui5/\{package_name\}/dist/\{icon_name\}.js";`
    *
    * **For Example**:
    *
    * For the standard "SAP-icons" icon collection, import an icon from the `@ui5/webcomponents-icons` package:
    *
    * `import "@ui5/webcomponents-icons/dist/employee.js";`
    *
    * For the "tnt" (SAP Fiori Tools) icon collection, import an icon from the `@ui5/webcomponents-icons-tnt` package:
    *
    * `import "@ui5/webcomponents-icons-tnt/dist/antenna.js";`
    *
    * For the "business-suite" (SAP Business Suite) icon collection, import an icon from the `@ui5/webcomponents-icons-business-suite` package:
    *
    * `import "@ui5/webcomponents-icons-business-suite/dist/ab-testing.js";`
    *
    * 4. **Display the icon using the `ui5-icon` web component.**
    * Set the icon collection ("SAP-icons", "tnt" or "business-suite" - "SAP-icons" is the default icon collection and can be skipped)
    * and the icon name to the `name` property.
    *
    * `<ui5-icon name="employee"></ui5-icon>`
    * `<ui5-icon name="tnt/antenna"></ui5-icon>`
    * `<ui5-icon name="business-suite/ab-testing"></ui5-icon>`
    *
    * ### Keyboard Handling
    *
    * - [Space] / [Enter] or [Return] - Fires the `click` event if the `mode` property is set to `Interactive`.
    * - [Shift] - If [Space] / [Enter] or [Return] is pressed, pressing [Shift] releases the ui5-icon without triggering the click event.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Icon.js";`
    * @csspart root - Used to style the outermost wrapper of the `ui5-icon`.
    * @constructor
    * @extends UI5Element
    * @implements {IIcon}
    * @public
    */
  @js.native
  trait Icon
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Enforce "ltr" direction, based on the icons collection metadata.
      */
    def _dir: js.UndefOr[ltr] = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _tabIndex: js.UndefOr[`0`] = js.native
    
    /**
      * @private
      */
    var accData: js.UndefOr[I18nText] = js.native
    
    /**
      * Defines the text alternative of the component.
      * If not provided a default text alternative will be set, if present.
      *
      * **Note:** Every icon should have a text alternative in order to
      * calculate its accessible name.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    var customSvg: js.UndefOr[js.Object] = js.native
    
    /**
      * Defines the component semantic design.
      * @default "Default"
      * @public
      * @since 1.9.2
      */
    var design: /* template literal string: ${IconDesign} */ String = js.native
    
    /**
      * @private
      */
    var effectiveAccessibleName: js.UndefOr[String] = js.native
    
    def effectiveAccessibleRole: button | presentation | img = js.native
    
    def effectiveAriaHidden: js.UndefOr[`true`] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Icon: Click = js.native
    
    def hasIconTooltip: js.UndefOr[String | `false`] = js.native
    
    /**
      * @private
      */
    var invalid: Boolean = js.native
    
    var ltr: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the mode of the component.
      * @default "Decorative"
      * @public
      * @since 2.0.0
      */
    var mode: /* template literal string: ${IconMode} */ String = js.native
    
    /**
      * Defines the unique identifier (icon name) of the component.
      *
      * To browse all available icons, see the
      * [SAP Icons](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html),
      * [SAP Fiori Tools](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html#/overview/SAP-icons-TNT) and
      * [SAP Business Suite](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html)
      *
      * Example:
      * `name='add'`, `name='delete'`, `name='employee'`.
      *
      * **Note:** To use the SAP Fiori Tools icons,
      * you need to set the `tnt` prefix in front of the icon's name.
      *
      * Example:
      * `name='tnt/antenna'`, `name='tnt/actor'`, `name='tnt/api'`.
      *
      * **Note:** To use the SAP Business Suite icons,
      * you need to set the `business-suite` prefix in front of the icon's name.
      *
      * Example:
      * `name='business-suite/3d'`, `name='business-suite/1x2-grid-layout'`, `name='business-suite/4x4-grid-layout'`.
      * @default undefined
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    var packageName: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var pathData: js.Array[String] = js.native
    
    /**
      * Defines whether the component should have a tooltip.
      *
      * **Note:** The tooltip text should be provided via the `accessible-name` property.
      * @default false
      * @public
      */
    var showTooltip: Boolean = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
}
