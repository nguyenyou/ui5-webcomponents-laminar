package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFormItemMod.{FormItem as FormItemComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FormItem extends WebComponent("ui5-form-item") {

  @JSImport("@ui5/webcomponents/dist/FormItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FormItem.type

  type Ref = FormItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the column span of the component, e.g how many columns the component should span to.
    *
    * **Note:** The column span should be a number between 1 and the available columns of the FormGroup (when items are
    * placed in a group) or the Form. The available columns can be affected by the FormGroup#columnSpan and/or the
    * Form#layout. A number bigger than the available columns won't take effect.
    *
    * Default: undefined
    */
  lazy val columnSpan: HtmlAttr[Double] = htmlAttr("column-span", DoubleAsStringCodec)

  // -- Events --

  // -- Slots --

  /** Defines the label of the component.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="labelContent"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val labelContent: Slot = new Slot("labelContent")
}
