package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemGroupHeaderMod {
  
  /**
    * @class
    * The `ui5-li-group-header` is a special list item, used only to separate other list items into logical groups.
    * @slot {Node[]} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @constructor
    * @extends ListItemBase
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader", JSImport.Default)
  @js.native
  open class default () extends ListItemGroupHeader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * The `ui5-li-group-header` is a special list item, used only to separate other list items into logical groups.
    * @slot {Node[]} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @constructor
    * @extends ListItemBase
    * @private
    */
  @js.native
  trait ListItemGroupHeader
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    /**
      * Defines the text alternative of the component.
      *
      * **Note:** If not provided a default text alternative will be set, if present.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    var accessibleRole: /* template literal string: ${ListItemAccessibleRole} */ String = js.native
    
    def ariaLabelText: String = js.native
    
    def effectiveAccRole: AriaRole = js.native
    
    def groupHeaderText: String = js.native
    
    def groupItem: Boolean = js.native
    
    def hasSubItems: Boolean = js.native
    
    var subItems: js.Array[HTMLElement] = js.native
  }
}
