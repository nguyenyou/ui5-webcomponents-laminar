package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchItemShowMoreMod {
  
  /**
    * @class
    * ### Overview
    *
    * A `ui5-search-item-show-more` is a special type of ui5-li that acts as a button to progressively reveal additional (overflow) items within a group.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchItemShowMore.js";`
    *
    * @constructor
    * @extends ListItemBase
    * @public
    * @since 2.14.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchItemShowMore.js", JSImport.Default)
  @js.native
  open class default () extends SearchItemShowMore
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/SearchItemShowMore.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/SearchItemShowMore.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * A `ui5-search-item-show-more` is a special type of ui5-li that acts as a button to progressively reveal additional (overflow) items within a group.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchItemShowMore.js";`
    *
    * @constructor
    * @extends ListItemBase
    * @public
    * @since 2.14.0
    * @experimental
    */
  @js.native
  trait SearchItemShowMore
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    def _onfocusout(): Unit = js.native
    
    /**
      * Specifies the number of additional items available to show.
      * This value replaces the placeholder (N) in the "Show more (N)" text.
      * If not set, the placeholder will remain as (N).
      * @public
      * @default undefined
      */
    var itemsToShowCount: js.UndefOr[Double] = js.native
    
    def showMoreTextCount: String = js.native
  }
}
