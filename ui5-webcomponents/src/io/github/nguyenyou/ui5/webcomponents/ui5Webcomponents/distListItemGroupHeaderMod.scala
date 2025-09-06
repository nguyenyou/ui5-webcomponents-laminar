package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesExpandableTextTemplateParamsMod.ExpandableTextTemplateParams
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
  @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader.js", JSImport.Default)
  @js.native
  open class default () extends ListItemGroupHeader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader.js", "default.ExpandableTextTemplate")
    @js.native
    def ExpandableTextTemplate: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupHeaderMod.ExpandableTextTemplate
      ] = js.native
    inline def ExpandableTextTemplate_=(x: js.UndefOr[ExpandableTextTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpandableTextTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItemGroupHeader.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  type ExpandableTextTemplate = js.ThisFunction1[
    /* this */ ListItemGroupHeader, 
    /* params */ ExpandableTextTemplateParams, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any
  ]
  
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
      * Determines the maximum characters to display based on the current media range.
      * - Size S: 100 characters
      * - Size M and larger: 300 characters
      * @private
      */
    def _maxCharacters: Double = js.native
    
    /**
      * Returns the content text, either from text property or from the default slot
      * @private
      */
    def _textContent: String = js.native
    
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
    
    def defaultSlotText: String = js.native
    
    def effectiveAccRole: AriaRole = js.native
    
    /**
      * The expandableText template.
      * @private
      */
    var expandableTextTemplate: js.UndefOr[ExpandableTextTemplate] = js.native
    
    def groupHeaderText: String = js.native
    
    def groupItem: Boolean = js.native
    
    def hasSubItems: Boolean = js.native
    
    /**
      * Defines the current media query size.
      * @default "S"
      * @private
      */
    var mediaRange: String = js.native
    
    var subItems: js.Array[HTMLElement] = js.native
    
    /**
      * Defines if the text of the component should wrap when it's too long.
      * When set to "Normal", the content (title, description) will be wrapped
      * using the `ui5-expandable-text` component.<br/>
      *
      * The text can wrap up to 100 characters on small screens (size S) and
      * up to 300 characters on larger screens (size M and above). When text exceeds
      * these limits, it truncates with an ellipsis followed by a text expansion trigger.
      *
      * Available options are:
      * - `None` (default) - The text will truncate with an ellipsis.
      * - `Normal` - The text will wrap (without truncation).
      *
      * @default "None"
      * @public
      * @since 2.15.0
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
