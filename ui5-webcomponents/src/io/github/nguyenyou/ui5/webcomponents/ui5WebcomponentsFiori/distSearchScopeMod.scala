package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchFieldMod.ISearchScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchScopeMod {
  
  /**
    * @class
    * The `ui5-search-scope` represents the options for the scope in `ui5-search`.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @implements {ISearchScope}
    * @public
    * @since 2.9.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchScope", JSImport.Default)
  @js.native
  open class default () extends SearchScope
  
  /**
    * @class
    * The `ui5-search-scope` represents the options for the scope in `ui5-search`.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @implements {ISearchScope}
    * @public
    * @since 2.9.0
    * @experimental
    */
  @js.native
  trait SearchScope extends ISearchScope {
    
    @JSName("stableDomRef")
    def stableDomRef_MSearchScope: String = js.native
    
    /**
      * Defines the text of the component.
      * @default ""
      * @public
      */
    @JSName("text")
    var text_SearchScope: String = js.native
  }
}
