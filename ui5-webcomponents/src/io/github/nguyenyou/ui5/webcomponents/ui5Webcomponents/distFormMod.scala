package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.form
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.region
import org.scalajs.dom.CSSStyleSheet
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The Form is a layout component that arranges labels and form fields (like input fields) pairs
    * into a specific number of columns.
    *
    * **Note:** The Form web component is a layout component, it isn't a replacement for the native `form` HTML element.
    * The Form web component does not provide any APIs for form submission.
    *
    * ### Structure
    *
    * - **Form** (`ui5-form`) is the top-level container component, responsible for the content layout and responsiveness.
    * - **FormGroup** (`ui5-form-group`) enables the grouping of the Form content.
    * - **FormItem** (`ui5-form-item`) is a pair of label and form fields and can be used directly in a Form, or as part of a FormGroup.
    *
    * The simplest Form (`ui5-form`) consists of a header area on top,
    * displaying a header text (see the `headingText` property) and content below - an arbitrary number of FormItems (ui5-form-item),
    * representing the pairs of label and form fields.
    *
    * And, there is also "grouping" available to assist the implementation of richer UIs.
    * This is enabled by the FormGroup (`ui5-form-group`) component.
    * In this case, the Form is structured into FormGroups and each FormGroup consists of FormItems.
    *
    * ### Responsiveness
    *
    * The Form component reacts and changes its layout on predefined breakpoints.
    * Depending on its size, the Form content (FormGroups and FormItems) gets divided into one or more columns as follows:
    * - **S** (< 600px) – 1 column is recommended (default: 1)
    * - **M** (600px - 1022px) – up to 2 columns are recommended (default: 1)
    * - **L** (1023px - 1439px) - up to 3 columns are recommended (default: 2)
    * - **XL** (> 1439px) – up to 6 columns are recommended (default: 3)
    *
    * To change the layout, use the `layout` property - f.e. layout="S1 M2 L3 XL6".
    *
    * ### Groups
    *
    * To make better use of screen space, there is built-in logic to determine how many columns should a FormGroup occupy.
    *
    * - **Example #1** (perfect match):
    * 4 columns and 4 groups: each group will use 1 column.
    *
    * - **Example #2** (balanced distribution):
    * 4 columns and 2 groups: each group will use 2 columns.
    * 6 columns and 2 groups: each group will use 3 columns.
    *
    * - **Example #3** (unbalanced distribution):
    * 3 columns and 2 groups: the larger one will use 2 columns, the smaller 1 column.
    * 5 columns and 3 groups: two of the groups will use 2 columns each, the smallest 1 column.
    *
    * **Note:** The size of a group element is determined by the number of FormItems assigned to it.
    * In the case of equality, the first in the DOM will use more columns, and the last - fewer columns.
    *
    * - **Example #4** (more groups than columns):
    * 3 columns and 4 groups: each FormGroup uses only 1 column, the last FormGroup will wrap on the second row.
    *
    * ### Groups Column Span
    *
    * To influence the built-in group distribution, described in the previous section,
    * you can use the FormGroup's `columnSpan` property, that defines how many columns the group should expand to.
    *
    * ### Items Column Span
    *
    * FormItem's columnSpan property defines how many columns the form item should expand to inside a form group or the form.
    *
    * ### Items Label Span
    *
    * The placement of the labels depends on the size of the used column.
    * If there is enough space, the labels are next to their associated fields, otherwise  - above the fields.
    * By default, the labels take 4/12 of the FormItem, leaving 8/12 parts to associated fields.
    * You can control what space the labels should take via the `labelSpan` property.
    *
    * **For example:** To always place the labels on top set: `labelSpan="S12 M12 L12 XL12"` property.
    *
    * ### Items Empty Span
    *
    * By default, a form item spans 12 cells, fully divided between its label and field, with no empty space at the end:
    * - **Label:** occupies 4 cells.
    * - **Field:** occupies 8 cells.
    *
    * The `emptySpan` property provides additional layout flexibility by defining empty space at the form item’s end.
    *
    * **For example:** Setting "S0 M0 L3 XL3" (or just "L3 XL3") adjusts the layout as follows:
    * - **Label:** remains 4 cells.
    * - **Field:** is reduced to 5 cells.
    * - **Empty space:** 3 cells are added at the end.
    *
    * Greater values increase the empty space at the end of the form item, reducing the space available for the label and its field.
    * However, setting `emptySpan` to 1 cell is recommended and typically sufficient to achieve a balanced layout.
    *
    * ### Navigation flow
    *
    * The Form component supports two layout options for keyboard navigation:
    *
    * #### Simple form
    *
    * In this "simple form" layout, each `ui5-form-item` acts as a standalone group
    * with one item, so focus moves horizontally across the grid from one `ui5-form-item` to the next.
    * This layout is ideal for simpler forms and supports custom arrangements, e.g.,
    *
    * ```
    * | 1 | 2 |
    * |   3   |
    * | 4 | 5 |
    * ```
    *
    * #### Complex form
    *
    * In this layout, items are grouped into `ui5-form-group` elements, allowing more complex configurations:
    *
    * - **Single-Column Group**: Focus moves vertically down from one item to the next.
    *   ```
    *   | 1 |
    *   | 2 |
    *   | 3 |
    *   ```
    *
    * - **Multi-Column Group**: Focus moves horizontally within each row, advancing to the next row after completing the current one.
    *   ```
    *   | 1 | 4 |
    *   | 2 | 5 |
    *   | 3 | 6 |
    *   ```
    *
    * ### Keyboard Handling
    *
    * - [Tab] - Moves the focus to the next interactive element within the Form/FormGroup (if available) or to the next element in the tab chain outside the Form
    * - [Shift] + [Tab] - Moves the focus to the previous interactive element within the Form/FormGroup (if available) or to the previous element in the tab chain outside the Form
    * - [F6] - Moves the focus to the first interactive element of the next FormGroup (if available) or to the next element in the tab chain outside the Form
    * - [Shift] + [F6] - Moves the focus to the first interactive element of the previous FormGroup (if available) or to the previous element in the tab chain outside the Form
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/Form.js";
    * - import @ui5/webcomponents/dist/FormGroup.js";
    * - import @ui5/webcomponents/dist/FormItem.js";
    *
    * @csspart header - Used to style the wrapper of the header.
    * @csspart layout - Used to style the element defining the form column layout.
    * @csspart column - Used to style a single column of the form column layout.
    *
    * @public
    * @since 2.0.0
    * @extends UI5Element
    */
  @JSImport("@ui5/webcomponents/dist/Form", JSImport.Default)
  @js.native
  open class default () extends Form
  
  /**
    * @class
    *
    * ### Overview
    *
    * The Form is a layout component that arranges labels and form fields (like input fields) pairs
    * into a specific number of columns.
    *
    * **Note:** The Form web component is a layout component, it isn't a replacement for the native `form` HTML element.
    * The Form web component does not provide any APIs for form submission.
    *
    * ### Structure
    *
    * - **Form** (`ui5-form`) is the top-level container component, responsible for the content layout and responsiveness.
    * - **FormGroup** (`ui5-form-group`) enables the grouping of the Form content.
    * - **FormItem** (`ui5-form-item`) is a pair of label and form fields and can be used directly in a Form, or as part of a FormGroup.
    *
    * The simplest Form (`ui5-form`) consists of a header area on top,
    * displaying a header text (see the `headingText` property) and content below - an arbitrary number of FormItems (ui5-form-item),
    * representing the pairs of label and form fields.
    *
    * And, there is also "grouping" available to assist the implementation of richer UIs.
    * This is enabled by the FormGroup (`ui5-form-group`) component.
    * In this case, the Form is structured into FormGroups and each FormGroup consists of FormItems.
    *
    * ### Responsiveness
    *
    * The Form component reacts and changes its layout on predefined breakpoints.
    * Depending on its size, the Form content (FormGroups and FormItems) gets divided into one or more columns as follows:
    * - **S** (< 600px) – 1 column is recommended (default: 1)
    * - **M** (600px - 1022px) – up to 2 columns are recommended (default: 1)
    * - **L** (1023px - 1439px) - up to 3 columns are recommended (default: 2)
    * - **XL** (> 1439px) – up to 6 columns are recommended (default: 3)
    *
    * To change the layout, use the `layout` property - f.e. layout="S1 M2 L3 XL6".
    *
    * ### Groups
    *
    * To make better use of screen space, there is built-in logic to determine how many columns should a FormGroup occupy.
    *
    * - **Example #1** (perfect match):
    * 4 columns and 4 groups: each group will use 1 column.
    *
    * - **Example #2** (balanced distribution):
    * 4 columns and 2 groups: each group will use 2 columns.
    * 6 columns and 2 groups: each group will use 3 columns.
    *
    * - **Example #3** (unbalanced distribution):
    * 3 columns and 2 groups: the larger one will use 2 columns, the smaller 1 column.
    * 5 columns and 3 groups: two of the groups will use 2 columns each, the smallest 1 column.
    *
    * **Note:** The size of a group element is determined by the number of FormItems assigned to it.
    * In the case of equality, the first in the DOM will use more columns, and the last - fewer columns.
    *
    * - **Example #4** (more groups than columns):
    * 3 columns and 4 groups: each FormGroup uses only 1 column, the last FormGroup will wrap on the second row.
    *
    * ### Groups Column Span
    *
    * To influence the built-in group distribution, described in the previous section,
    * you can use the FormGroup's `columnSpan` property, that defines how many columns the group should expand to.
    *
    * ### Items Column Span
    *
    * FormItem's columnSpan property defines how many columns the form item should expand to inside a form group or the form.
    *
    * ### Items Label Span
    *
    * The placement of the labels depends on the size of the used column.
    * If there is enough space, the labels are next to their associated fields, otherwise  - above the fields.
    * By default, the labels take 4/12 of the FormItem, leaving 8/12 parts to associated fields.
    * You can control what space the labels should take via the `labelSpan` property.
    *
    * **For example:** To always place the labels on top set: `labelSpan="S12 M12 L12 XL12"` property.
    *
    * ### Items Empty Span
    *
    * By default, a form item spans 12 cells, fully divided between its label and field, with no empty space at the end:
    * - **Label:** occupies 4 cells.
    * - **Field:** occupies 8 cells.
    *
    * The `emptySpan` property provides additional layout flexibility by defining empty space at the form item’s end.
    *
    * **For example:** Setting "S0 M0 L3 XL3" (or just "L3 XL3") adjusts the layout as follows:
    * - **Label:** remains 4 cells.
    * - **Field:** is reduced to 5 cells.
    * - **Empty space:** 3 cells are added at the end.
    *
    * Greater values increase the empty space at the end of the form item, reducing the space available for the label and its field.
    * However, setting `emptySpan` to 1 cell is recommended and typically sufficient to achieve a balanced layout.
    *
    * ### Navigation flow
    *
    * The Form component supports two layout options for keyboard navigation:
    *
    * #### Simple form
    *
    * In this "simple form" layout, each `ui5-form-item` acts as a standalone group
    * with one item, so focus moves horizontally across the grid from one `ui5-form-item` to the next.
    * This layout is ideal for simpler forms and supports custom arrangements, e.g.,
    *
    * ```
    * | 1 | 2 |
    * |   3   |
    * | 4 | 5 |
    * ```
    *
    * #### Complex form
    *
    * In this layout, items are grouped into `ui5-form-group` elements, allowing more complex configurations:
    *
    * - **Single-Column Group**: Focus moves vertically down from one item to the next.
    *   ```
    *   | 1 |
    *   | 2 |
    *   | 3 |
    *   ```
    *
    * - **Multi-Column Group**: Focus moves horizontally within each row, advancing to the next row after completing the current one.
    *   ```
    *   | 1 | 4 |
    *   | 2 | 5 |
    *   | 3 | 6 |
    *   ```
    *
    * ### Keyboard Handling
    *
    * - [Tab] - Moves the focus to the next interactive element within the Form/FormGroup (if available) or to the next element in the tab chain outside the Form
    * - [Shift] + [Tab] - Moves the focus to the previous interactive element within the Form/FormGroup (if available) or to the previous element in the tab chain outside the Form
    * - [F6] - Moves the focus to the first interactive element of the next FormGroup (if available) or to the next element in the tab chain outside the Form
    * - [Shift] + [F6] - Moves the focus to the first interactive element of the previous FormGroup (if available) or to the previous element in the tab chain outside the Form
    *
    * ### ES6 Module Import
    *
    * - import @ui5/webcomponents/dist/Form.js";
    * - import @ui5/webcomponents/dist/FormGroup.js";
    * - import @ui5/webcomponents/dist/FormItem.js";
    *
    * @csspart header - Used to style the wrapper of the header.
    * @csspart layout - Used to style the element defining the form column layout.
    * @csspart column - Used to style a single column of the form column layout.
    *
    * @public
    * @since 2.0.0
    * @extends UI5Element
    */
  @js.native
  trait Form
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var columnsL: Double = js.native
    
    var columnsM: Double = js.native
    
    /**
      * @private
      */
    var columnsS: Double = js.native
    
    var columnsXl: Double = js.native
    
    def createAdditionalCSSStyleSheet(): Unit = js.native
    
    def effectiveAccessibleRole: form | region = js.native
    
    def effectiveАccessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the number of cells that are empty at the end of each form item, configurable by breakpoint.
      *
      * By default, a form item spans 12 cells, fully divided between its label (4 cells) and field (8 cells), with no empty space at the end.
      * The `emptySpan` provides additional layout flexibility by defining empty space at the form item’s end.
      *
      * **Note:**
      * - The maximum allowable empty space is 10 cells. At least 1 cell each must remain for the label and the field.
      * - When `emptySpan` is specified (greater than 0), ensure that the combined value of `emptySpan` and `labelSpan` does not exceed 11. This guarantees a minimum of 1 cell for the field.
      *
      * @default "S0 M0 L0 XL0"
      * @since 2.5.0
      * @public
      */
    var emptySpan: String = js.native
    
    var emptySpanL: Double = js.native
    
    var emptySpanM: Double = js.native
    
    var emptySpanS: Double = js.native
    
    var emptySpanXl: Double = js.native
    
    def getAdditionalCSS(step: String, colsNumber: Double): js.UndefOr[String] = js.native
    
    def getCSSStyleSheet(cssText: String): CSSStyleSheet = js.native
    
    def getGroupsColSpan(cols: Double, groups: Double, index: Double, group: IFormItem): Double = js.native
    
    def getItemsInfo(): js.Array[ItemsInfo] = js.native
    def getItemsInfo(items: js.Array[IFormItem]): js.Array[ItemsInfo] = js.native
    
    def groupItemsInfo: js.Array[GroupItemsInfo] = js.native
    
    def hasCustomHeader: Boolean = js.native
    
    def hasGroupItems: Boolean = js.native
    
    def hasHeader: Boolean = js.native
    
    /**
      * Defines the component header area.
      *
      * **Note:** When a `header` is provided, the `headerText` property is ignored.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header text of the component.
      *
      * **Note:** The property gets overridden by the `header` slot.
      *
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    def isValidFormItemLayout(labelSpan: Double, emptySpan: Double): Boolean = js.native
    
    /**
      * Defines the vertical spacing between form items.
      *
      * **Note:** If the Form is meant to be switched between "non-edit" and "edit" modes,
      * we recommend using "Large" item spacing in "non-edit" mode, and "Normal" - for "edit" mode,
      * to avoid "jumping" effect, caused by the hight difference between texts in "non-edit" mode and the input fields in "edit" mode.
      *
      * @default "Normal"
      * @public
      */
    var itemSpacing: /* template literal string: ${FormItemSpacing} */ String = js.native
    
    /**
      * Defines the component content - FormGroups or FormItems.
      *
      * **Note:** Mixing FormGroups and standalone FormItems (not belonging to a group) is not supported.
      * Either use FormGroups and make sure all FormItems are part of a FormGroup, or use just FormItems without any FormGroups.
      * @public
      */
    var items: js.Array[IFormItem] = js.native
    
    def itemsInfo: js.Array[ItemsInfo] = js.native
    
    /**
      * Defines the width proportion of the labels and fields of a form item by breakpoint.
      *
      * By default, the labels take 4/12 (or 1/3) of the form item in M,L and XL sizes,
      * and 12/12 in S size, e.g in S the label is on top of its associated field.
      *
      * The supported values are between 1 and 12. Greater the number, more space the label will use.
      *
      * **Note:** If "12" is set, the label will be displayed on top of its assosiated field.
      *
      * @default "S12 M4 L4 XL4"
      * @public
      */
    var labelSpan: String = js.native
    
    var labelSpanL: Double = js.native
    
    var labelSpanM: Double = js.native
    
    var labelSpanS: Double = js.native
    
    var labelSpanXl: Double = js.native
    
    /**
      * Defines the number of columns to distribute the form content by breakpoint.
      *
      * Supported values:
      * - `S` - 1 column by default (1 column is recommended)
      * - `M` - 1 column by default (up to 2 columns are recommended)
      * - `L` - 2 columns by default (up to 3 columns are recommended)
      * - `XL` - 3 columns by default (up to 6 columns  are recommended)
      *
      * @default "S1 M1 L2 XL3"
      * @public
      */
    var layout: String = js.native
    
    def parseFormItemSpan(): Unit = js.native
    
    def setColumnLayout(): Unit = js.native
    
    def setFastNavGroup(): Unit = js.native
    
    def setFormItemLayout(): Unit = js.native
    
    def setGroupsColSpan(): Unit = js.native
  }
  
  trait GroupItemsInfo extends StObject {
    
    var accessibleNameRef: js.UndefOr[String] = js.undefined
    
    var groupItem: IFormItem
    
    var items: js.Array[ItemsInfo]
  }
  object GroupItemsInfo {
    
    inline def apply(groupItem: IFormItem, items: js.Array[ItemsInfo]): GroupItemsInfo = {
      val __obj = js.Dynamic.literal(groupItem = groupItem.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupItemsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupItemsInfo] (val x: Self) extends AnyVal {
      
      inline def setAccessibleNameRef(value: String): Self = StObject.set(x, "accessibleNameRef", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameRefUndefined: Self = StObject.set(x, "accessibleNameRef", js.undefined)
      
      inline def setGroupItem(value: IFormItem): Self = StObject.set(x, "groupItem", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[ItemsInfo]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: ItemsInfo*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  /**
    * Interface for components that can be slotted inside `ui5-form` as items.
    * @public
    * @since 2.0.0
    */
  @js.native
  trait IFormItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var colsL: js.UndefOr[Double] = js.native
    
    var colsM: js.UndefOr[Double] = js.native
    
    var colsS: js.UndefOr[Double] = js.native
    
    var colsXl: js.UndefOr[Double] = js.native
    
    var columnSpan: js.UndefOr[Double] = js.native
    
    var headerText: js.UndefOr[String] = js.native
    
    val isGroup: Boolean = js.native
    
    var itemSpacing: /* template literal string: ${FormItemSpacing} */ String = js.native
  }
  
  trait ItemsInfo extends StObject {
    
    var item: IFormItem
  }
  object ItemsInfo {
    
    inline def apply(item: IFormItem): ItemsInfo = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsInfo] (val x: Self) extends AnyVal {
      
      inline def setItem(value: IFormItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
