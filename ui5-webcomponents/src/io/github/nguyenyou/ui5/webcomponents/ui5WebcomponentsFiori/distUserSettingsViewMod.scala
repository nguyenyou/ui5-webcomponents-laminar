package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserSettingsViewMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-view` represents a view displayed in the `ui5-user-settings-item`.
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsView.js", JSImport.Default)
  @js.native
  open class default () extends UserSettingsView
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-settings-view` represents a view displayed in the `ui5-user-settings-item`.
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.8.0
    */
  @js.native
  trait UserSettingsView
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the content of the view.
      *
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Indicates whether the view is secondary. It is relevant only if the view is used in `pages` slot of `ui5-user-settings-item`
      * and controls the visibility of the back button.
      * @default false
      * @public
      */
    var secondary: Boolean = js.native
    
    /**
      * Defines whether the view is selected. There can be just one selected view at a time.
      *
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the title text of the user settings view.
      *
      * @public
      * @default undefined
      */
    var text: js.UndefOr[String] = js.native
  }
}
