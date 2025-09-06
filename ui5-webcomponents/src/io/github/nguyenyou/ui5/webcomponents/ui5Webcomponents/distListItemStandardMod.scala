package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesExpandableTextTemplateParamsMod.ExpandableTextTemplateParams
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemStandardMod {
  
  /**
    * @class
    * The `ui5-li` represents the simplest type of item for a `ui5-list`.
    *
    * This is a list item,
    * providing the most common use cases such as `text`,
    * `image` and `icon`.
    * @csspart title - Used to style the title of the list item
    * @csspart description - Used to style the description of the list item
    * @csspart additional-text - Used to style the additionalText of the list item
    * @csspart icon - Used to style the icon of the list item
    * @csspart native-li - Used to style the main li tag of the list item
    * @csspart content - Used to style the content area of the list item
    * @csspart detail-button - Used to style the button rendered when the list item is of type detail
    * @csspart delete-button - Used to style the button rendered when the list item is in delete mode
    * @csspart radio - Used to style the radio button rendered when the list item is in single selection mode
    * @csspart checkbox - Used to style the checkbox rendered when the list item is in multiple selection mode
    * @constructor
    * @extends ListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ListItemStandard.js", JSImport.Default)
  @js.native
  open class default () extends ListItemStandard
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ListItemStandard.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItemStandard.js", "default.ExpandableTextTemplate")
    @js.native
    def ExpandableTextTemplate: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemStandardMod.ExpandableTextTemplate
      ] = js.native
    inline def ExpandableTextTemplate_=(x: js.UndefOr[ExpandableTextTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExpandableTextTemplate")(x.asInstanceOf[js.Any])
  }
  
  type ExpandableTextTemplate = js.ThisFunction1[
    /* this */ ListItemStandard, 
    /* params */ ExpandableTextTemplateParams, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ Any
  ]
  
  /**
    * @class
    * The `ui5-li` represents the simplest type of item for a `ui5-list`.
    *
    * This is a list item,
    * providing the most common use cases such as `text`,
    * `image` and `icon`.
    * @csspart title - Used to style the title of the list item
    * @csspart description - Used to style the description of the list item
    * @csspart additional-text - Used to style the additionalText of the list item
    * @csspart icon - Used to style the icon of the list item
    * @csspart native-li - Used to style the main li tag of the list item
    * @csspart content - Used to style the content area of the list item
    * @csspart detail-button - Used to style the button rendered when the list item is of type detail
    * @csspart delete-button - Used to style the button rendered when the list item is in delete mode
    * @csspart radio - Used to style the radio button rendered when the list item is in single selection mode
    * @csspart checkbox - Used to style the checkbox rendered when the list item is in multiple selection mode
    * @constructor
    * @extends ListItem
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distListItemMod.IAccessibleListItem because var conflicts: accessibleName. Inlined accessibleNameRef */ @js.native
  trait ListItemStandard
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.default {
    
    var _hasImage: Boolean = js.native
    
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
    
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the `additionalText`, displayed in the end of the list item.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalText: js.UndefOr[String] = js.native
    
    /**
      * Defines the state of the `additionalText`.
      *
      * Available options are: `"None"` (by default), `"Positive"`, `"Critical"`, `"Information"` and `"Negative"`.
      * @default "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var additionalTextState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the custom formatted text of the component.
      *
      * **Note:** For optimal text wrapping and a consistent layout, it is strongly recommended to use the `text` property.
      *
      * Use the `default` slot only when custom formatting with HTML elements (e.g., `<b>`, `<i>`) is required.
      * Be aware that wrapping (via `wrappingType="Normal"`) may not function correctly with custom HTML content in the `default` slot.
      *
      * If both `text` and `default` slot are used, the `text` property takes precedence.
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * Defines the description displayed right under the item text, if such is present.
      * @default undefined
      * @public
      * @since 0.8.0
      */
    var description: js.UndefOr[String] = js.native
    
    def displayIconBegin: Boolean = js.native
    
    def displayIconEnd: Boolean = js.native
    
    /**
      * The expandableText template.
      * @private
      */
    var expandableTextTemplate: js.UndefOr[ExpandableTextTemplate] = js.native
    
    def hasImage: Boolean = js.native
    
    /**
      * Indicates if the list item has text content.
      * @private
      */
    var hasTitle: Boolean = js.native
    
    /**
      * Defines the `icon` source URI.
      *
      * **Note:**
      * SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the `icon` should be displayed in the beginning of the list item or in the end.
      *
      * @default false
      * @public
      */
    var iconEnd: Boolean = js.native
    
    /**
      * **Note:** While the slot allows option for setting custom avatar, to match the
      * design guidelines, please use the `ui5-avatar` with it's default size - S.
      *
      * **Note:** If bigger `ui5-avatar` needs to be used, then the size of the
      * `ui5-li` should be customized in order to fit.
      * @since 2.0.0
      * @public
      */
    var image: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the text of the component.
      *
      * @default undefined
      * @public
      * @since 2.10.0
      */
    var text: js.UndefOr[String] = js.native
    
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
      * @since 2.10.0
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
