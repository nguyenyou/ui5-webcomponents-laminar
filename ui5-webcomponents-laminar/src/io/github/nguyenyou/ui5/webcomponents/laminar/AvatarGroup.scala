package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarGroupMod.AvatarGroup as AvatarGroupComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarGroupMod.AvatarGroupAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distAvatarGroupMod.AvatarGroupClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object AvatarGroup extends WebComponent("ui5-avatar-group") {

  @JSImport("@ui5/webcomponents/dist/AvatarGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = AvatarGroup.type

  type Ref = AvatarGroupComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the mode of the `AvatarGroup`.
    *
    * Default: "Group"
    */
  lazy val tpe: HtmlAttr[AvatarGroupType] = htmlAttr("type", StringUnionCodec[AvatarGroupType])

  // -- Events --

  /** Fired when the component is activated either with a click/tap or by using the Enter or Space key.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[AvatarGroupClickEventDetail]] = new EventProp("click")

  /** Fired when the count of visible `Avatar` elements in the component has changed
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOverflow: EventProp[Ui5CustomEvent[Ref]] = new EventProp("overflow")

  // -- Slots --

  /** Defines the overflow button of the component.
    *
    * **Note:** We recommend using the `Button` component.
    *
    * **Note:** If this slot is not used, the component will display the built-in overflow button.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="overflowButton"`). Since you can't change the DOM order of slots when declaring them within a prop, it
    * might prove beneficial to manually mount them as part of the component's children, especially when facing problems
    * with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val overflowButton: Slot = new Slot("overflowButton")
}
