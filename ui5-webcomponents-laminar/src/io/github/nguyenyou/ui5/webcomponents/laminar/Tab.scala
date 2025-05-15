package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.Tab as TabComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Tab extends WebComponent("ui5-tab") {

  @JSImport("@ui5/webcomponents/dist/Tab.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = Tab.type

  type Ref = TabComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Represents the "additionalText" text, which is displayed in the tab. In the cases when in the same time there are tabs with icons and tabs without icons, if a tab has no icon the "additionalText" is displayed larger.
   *
   * Default: undefined
   */
  lazy val additionalText: HtmlAttr[String] = htmlAttr("additional-text", StringAsIsCodec)
  /**
   * Defines the component's design color.
   * 
   * The design is applied to:
   * 
   * - the component icon
   * - the `text` when the component overflows
   * - the tab selection line
   * 
   * Available designs are: `"Default"`, `"Neutral"`, `"Positive"`, `"Critical"` and `"Negative"`.
   * 
   * **Note:** The design depends on the current theme.
   *
   * Default: "Default"
   */
  lazy val design: HtmlAttr[SemanticColor] = htmlAttr("design", StringUnionCodec[SemanticColor])
  /**
   * Disabled tabs can't be selected.
   *
   * Default: false
   */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  /**
   * Defines the icon source URI to be displayed as graphical element within the component.
   * The SAP-icons font provides numerous built-in icons.
   * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
   *
   * Default: undefined
   */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)
  /**
   * Specifies if the component is selected.
   *
   * Default: false
   */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  /**
   * The text to be displayed for the item.
   *
   * Default: undefined
   */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --


  // -- Slots --

  /**
   * Defines hierarchies with nested sub tabs.
   * 
   * **Note:** Use `Tab` and `TabSeparator` for the intended design.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="items"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val items: Slot = new Slot("items")
}

