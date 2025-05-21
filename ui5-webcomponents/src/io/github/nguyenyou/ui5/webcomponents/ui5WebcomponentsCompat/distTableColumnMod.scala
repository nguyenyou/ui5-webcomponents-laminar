package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableColumnMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-column` component allows to define column specific properties that are applied
    * when rendering the `ui5-table` component.
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Node[]} default - Defines the content of the column header
    * @csspart column - Used to style the native `th` element
    */
  @JSImport("@ui5/webcomponents-compat/dist/TableColumn", JSImport.Default)
  @js.native
  open class default () extends TableColumn
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-column` component allows to define column specific properties that are applied
    * when rendering the `ui5-table` component.
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Node[]} default - Defines the content of the column header
    * @csspart column - Used to style the native `th` element
    */
  @js.native
  trait TableColumn
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * According to your `minWidth` settings, the component can be hidden
      * in different screen sizes.
      *
      * Setting this property to `true`, shows this column as pop-in instead of hiding it.
      * @default false
      * @public
      */
    var demandPopin: Boolean = js.native
    
    /**
      * @private
      */
    var first: Boolean = js.native
    
    /**
      * @private
      */
    var last: Boolean = js.native
    
    /**
      * Defines the minimum table width required to display this column. By default it is always displayed.
      *
      * The responsive behavior of the `ui5-table` is determined by this property. As an example, by setting
      * `minWidth` property to `400` sets the minimum width to 400 pixels, and	shows this column on tablet (and desktop) but hides it on mobile.
      *
      * For further responsive design options, see `demandPopin` property.
      * @default Infinity
      * @public
      */
    var minWidth: Double = js.native
    
    /**
      * Defines how the popin row is displayed.
      *
      * **The available values are:**
      *
      * - `Block`
      * - `Inline`
      * @default "Block"
      * @public
      */
    var popinDisplay: /* template literal string: ${TableColumnPopinDisplay} */ String = js.native
    
    /**
      * The text for the column when it pops in.
      * @default undefined
      * @public
      */
    var popinText: js.UndefOr[String] = js.native
  }
}
