package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distIllustratedMessageMod.IllustratedMessage as IllustratedMessageComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object IllustratedMessage extends WebComponent("ui5-illustrated-message") {

  @JSImport("@ui5/webcomponents-fiori/dist/IllustratedMessage.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = IllustratedMessage.type

  type Ref = IllustratedMessageComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Receives id(or many ids) of the elements that label the component.
   *
   * **Note:** Available since [v1.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.7.0) of **@ui5/webcomponents-fiori**.
   *
   * Default: undefined
   */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)
  /**
   * Defines whether the illustration is decorative.
   * 
   * When set to `true`, the attributes `role="presentation"` and `aria-hidden="true"` are applied to the SVG element.
   *
   * **Note:** Available since [v2.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.10.0) of **@ui5/webcomponents-fiori**.
   *
   * Default: false
   */
  lazy val decorative: HtmlAttr[Boolean] = htmlAttr("decorative", BooleanAsAttrPresenceCodec)
  /**
   * Determines which illustration breakpoint variant is used.
   * 
   * As `IllustratedMessage` adapts itself around the `Illustration`, the other
   * elements of the component are displayed differently on the different breakpoints/illustration designs.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents-fiori**.
   *
   * Default: "Auto"
   */
  lazy val design: HtmlAttr[IllustrationMessageDesign] = htmlAttr("design", StringUnionCodec[IllustrationMessageDesign])
  /**
   * Defines the illustration name that will be displayed in the component.
   * 
   * Example:
   * 
   * `name='BeforeSearch'`, `name='UnableToUpload'`, etc..
   * 
   * **Note:** To use the TNT illustrations,
   * you need to set the `tnt` or `Tnt` prefix in front of the icon's name.
   * 
   * Example:
   * 
   * `name='tnt/Avatar'` or `name='TntAvatar'`.
   * 
   * **Note:** By default the `BeforeSearch` illustration is loaded.
   * When using an illustration type, other than the default, it should be loaded in addition:
   * 
   * `import "@ui5/webcomponents-fiori/dist/illustrations/NoData.js";`
   * 
   * For TNT illustrations:
   * 
   * `import "@ui5/webcomponents-fiori/dist/illustrations/tnt/SessionExpired.js";`
   *
   * Default: "BeforeSearch"
   */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  /**
   * Defines the subtitle of the component.
   * 
   * **Note:** Using this property, the default subtitle text of illustration will be overwritten.
   * 
   * **Note:** Using `subtitle` slot, the default of this property will be overwritten.
   *
   * Default: undefined
   */
  lazy val subtitleText: HtmlAttr[String] = htmlAttr("subtitle-text", StringAsIsCodec)
  /**
   * Defines the title of the component.
   * 
   * **Note:** Using this property, the default title text of illustration will be overwritten.
   *
   * Default: undefined
   */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --


  // -- Slots --

  /**
   * Defines the subtitle of the component.
   * 
   * **Note:** Using this slot, the default subtitle text of illustration and the value of `subtitleText` property will be overwritten.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="subtitle"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val subtitle: Slot = new Slot("subtitle")
  /**
   * Defines the title of the component.
   * 
   * **Note:** Using this slot, the default title text of illustration and the value of `title` property will be overwritten.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="title"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   *
   * **Note:** Available since [v1.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.7.0) of **@ui5/webcomponents-fiori**.
   */
  lazy val title: Slot = new Slot("title")
}

