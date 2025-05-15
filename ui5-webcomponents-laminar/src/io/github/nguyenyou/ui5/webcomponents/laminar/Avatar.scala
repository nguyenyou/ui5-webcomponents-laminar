package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarMod.AvatarAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarMod.Avatar as AvatarComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Avatar extends WebComponent("ui5-avatar") {

  @JSImport("@ui5/webcomponents/dist/Avatar.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = Avatar.type

  type Ref = AvatarComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the text alternative of the component.
   * If not provided a default text alternative will be set, if present.
   *
   * Default: undefined
   */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)
  /**
   * Defines the background color of the desired image.
   * If `colorScheme` is set to `Auto`, the avatar will be displayed with the `Accent6` color.
   *
   * Default: "Auto"
   */
  lazy val colorScheme: HtmlAttr[AvatarColorScheme] = htmlAttr("color-scheme", StringUnionCodec[AvatarColorScheme])
  /**
   * Defines whether the component is disabled.
   * A disabled component can't be pressed or
   * focused, and it is not in the tab chain.
   *
   * Default: false
   */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  /**
   * Defines the name of the fallback icon, which should be displayed in the following cases:
   * 
   * 	- If the initials are not valid (more than 3 letters, unsupported languages or empty initials).
   * 	- If there are three initials and they do not fit in the shape (e.g. WWW for some of the sizes).
   * 	- If the image src is wrong.
   * 
   * **Note:** If not set, a default fallback icon "employee" is displayed.
   * 
   * **Note:** You should import the desired icon first, then use its name as "fallback-icon".
   * 
   * `import "@ui5/webcomponents-icons/dist/{icon_name}.js"`
   * 
   * `<Avatar fallback-icon="alert">`
   * 
   * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
   *
   * Default: "employee"
   */
  lazy val fallbackIcon: HtmlAttr[String] = htmlAttr("fallback-icon", StringAsIsCodec)
  /**
   * Defines the name of the UI5 Icon, that will be displayed.
   * 
   * **Note:** If `image` slot is provided, the property will be ignored.
   * 
   * **Note:** You should import the desired icon first, then use its name as "icon".
   * 
   * `import "@ui5/webcomponents-icons/dist/{icon_name}.js"`
   * 
   * `<Avatar icon="employee">`
   * 
   * **Note:** If no icon or an empty one is provided, by default the "employee" icon should be displayed.
   * 
   * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
   *
   * Default: undefined
   */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)
  /**
   * Defines the displayed initials.
   * 
   * Up to three Latin letters can be displayed as initials.
   *
   * Default: undefined
   */
  lazy val initials: HtmlAttr[String] = htmlAttr("initials", StringAsIsCodec)
  /**
   * Defines if the avatar is interactive (focusable and pressable).
   * 
   * **Note:** This property won't have effect if the `disabled`
   * property is set to `true`.
   *
   * Default: false
   */
  lazy val interactive: HtmlAttr[Boolean] = htmlAttr("interactive", BooleanAsAttrPresenceCodec)
  /**
   * Defines the shape of the component.
   *
   * Default: "Circle"
   */
  lazy val shape: HtmlAttr[AvatarShape] = htmlAttr("shape", StringUnionCodec[AvatarShape])
  /**
   * Defines predefined size of the component.
   *
   * Default: "S"
   */
  lazy val size: HtmlAttr[AvatarSize] = htmlAttr("size", StringUnionCodec[AvatarSize])

  // -- Events --


  // -- Slots --

  /**
   * Defines the optional badge that will be used for visual affordance.
   * 
   * **Note:** While the slot allows for custom badges, to achieve
   * the Fiori design, you can use the `Tag` with `Icon`
   * in the corresponding `icon` slot, without text nodes.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="badge"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   *
   * **Note:** Available since [v1.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.7.0) of **@ui5/webcomponents**.
   */
  lazy val badge: Slot = new Slot("badge")
}

