package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Decorative
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Interactive
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDynamicDateRangeMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-dynamic-date-range` component provides a flexible interface to define date ranges using a combination of absolute dates, relative intervals, and preset ranges (e.g., "Today", "Yesterday", etc.).
    * It allows users to select a date range from a predefined set of options or enter custom dates.
    *
    * ### Usage
    *
    * The component is typically used in scenarios where users need to filter data based on date ranges, such as in reports, dashboards, or data analysis tools.
    * It can be used with the predefined options or extended with custom options to suit specific requirements. You can create your own options by extending the `IDynamicDateRangeOption` interface.
    * Every option should be registered using the `DynamicDateRange.register` method.
    *
    * If needed, you can also create a range of dates based on specific option using the `toDates` method.
    *
    * ### Standard Options
    *
    * The component comes with a set of standard options, including:
    * - "TODAY" - Represents the current date. An example value is `{ operator: "TODAY"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Today.js";`
    * - "YESTERDAY" - Represents the previous date. An example value is `{ operator: "YESTERDAY"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Yesterday.js";`
    * - "TOMORROW" - Represents the next date. An example value is `{ operator: "TOMORROW"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Tomorrow.js";`
    * - "DATE" - Represents a single date. An example value is `{ operator: "DATE", values: [new Date()]}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/SingleDate.js";`
    * - "DATERANGE" - Represents a range of dates. An example value is `{ operator: "DATERANGE", values: [new Date(), new Date()]}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/DateRange.js";`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DynamicDateRange.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.11.0
    */
  @JSImport("@ui5/webcomponents/dist/DynamicDateRange.js", JSImport.Default)
  @js.native
  open class default () extends DynamicDateRange
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DynamicDateRange.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getOptionClass(operator: String): js.UndefOr[Instantiable0[IDynamicDateRangeOption]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionClass")(operator.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Instantiable0[IDynamicDateRangeOption]]]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DynamicDateRange.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DynamicDateRange.js", "default.optionsClasses")
    @js.native
    def optionsClasses: Map[String, Instantiable0[IDynamicDateRangeOption]] = js.native
    inline def optionsClasses_=(x: Map[String, Instantiable0[IDynamicDateRangeOption]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionsClasses")(x.asInstanceOf[js.Any])
    
    /**
      * Registers a new dynamic date range option with a unique key.
      *
      * Example:
      * DynamicDateRange.register("LASTWEEK", LastWeek);
      */
    /* static member */
    inline def register(operator: String, option: Instantiable0[IDynamicDateRangeOption]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(operator.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-dynamic-date-range` component provides a flexible interface to define date ranges using a combination of absolute dates, relative intervals, and preset ranges (e.g., "Today", "Yesterday", etc.).
    * It allows users to select a date range from a predefined set of options or enter custom dates.
    *
    * ### Usage
    *
    * The component is typically used in scenarios where users need to filter data based on date ranges, such as in reports, dashboards, or data analysis tools.
    * It can be used with the predefined options or extended with custom options to suit specific requirements. You can create your own options by extending the `IDynamicDateRangeOption` interface.
    * Every option should be registered using the `DynamicDateRange.register` method.
    *
    * If needed, you can also create a range of dates based on specific option using the `toDates` method.
    *
    * ### Standard Options
    *
    * The component comes with a set of standard options, including:
    * - "TODAY" - Represents the current date. An example value is `{ operator: "TODAY"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Today.js";`
    * - "YESTERDAY" - Represents the previous date. An example value is `{ operator: "YESTERDAY"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Yesterday.js";`
    * - "TOMORROW" - Represents the next date. An example value is `{ operator: "TOMORROW"}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/Tomorrow.js";`
    * - "DATE" - Represents a single date. An example value is `{ operator: "DATE", values: [new Date()]}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/SingleDate.js";`
    * - "DATERANGE" - Represents a range of dates. An example value is `{ operator: "DATERANGE", values: [new Date(), new Date()]}`. Import: `import "@ui5/webcomponents/dist/dynamic-date-range-options/DateRange.js";`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DynamicDateRange.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.11.0
    */
  @js.native
  trait DynamicDateRange
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _close(): Unit = js.native
    
    var _currentOption: js.UndefOr[IDynamicDateRangeOption] = js.native
    
    def _hasCurrentOptionTemplate: Boolean = js.native
    
    /**
      * Defines whether the value help icon is hidden
      * @private
      */
    def _iconMode: Decorative | Interactive = js.native
    
    var _input: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default] = js.native
    
    var _list: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default] = js.native
    
    def _optionsTitles: js.Array[String] = js.native
    
    def _selectOption(e: CustomEvent): Unit = js.native
    
    def _submitValue(): Unit = js.native
    
    def _toggleAndFocusInput(): Unit = js.native
    
    def _togglePicker(): Unit = js.native
    
    var currentValue: js.UndefOr[DynamicDateRangeValue] = js.native
    
    def currentValueText: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_DynamicDateRange: ChangeVoid = js.native
    
    def getOption(operator: String): js.UndefOr[IDynamicDateRangeOption] = js.native
    
    def handleSelectionChange(e: CustomEvent): Unit = js.native
    
    def onButtonBackClick(): Unit = js.native
    
    def onInputChange(e: Event): Unit = js.native
    
    def onInputKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onKeyDownPopover(e: KeyboardEvent): Unit = js.native
    
    def onPopoverClose(): Unit = js.native
    
    def onPopoverOpen(): Unit = js.native
    
    /**
      * Defines the open or closed state of the popover.
      * @private
      * @default false
      */
    var open: Boolean = js.native
    
    /**
      * Defines the options listed as a string, separated by commas and using capital case.
      * Example: "TODAY, YESTERDAY, DATERANGE"
      * @public
      * @default ""
      */
    var options: String = js.native
    
    var optionsObjects: js.Array[IDynamicDateRangeOption] = js.native
    
    /**
      * Converts a `value` into concrete `startDate` and `endDate` JavaScript `Date` objects.
      *
      * @public
      * @param value The option to convert into an array of date ranges
      * @returns An array of two `Date` objects representing the start and end dates.
      */
    def toDates(value: DynamicDateRangeValue): js.Array[js.Date] = js.native
    
    def tooltipNavigationIcon: String = js.native
    
    /**
      * Defines the value object.
      * @default undefined
      * @public
      */
    var value: js.UndefOr[DynamicDateRangeValue] = js.native
  }
  
  trait DynamicDateRangeValue extends StObject {
    
    /**
      * The key of the option.
      * @default ""
      * @public
      */
    var operator: String
    
    /**
      * Values of the dynamic date range.
      * @default []
      * @public
      */
    var values: js.UndefOr[js.Array[js.Date | Double]] = js.undefined
  }
  object DynamicDateRangeValue {
    
    inline def apply(operator: String): DynamicDateRangeValue = {
      val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicDateRangeValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamicDateRangeValue] (val x: Self) extends AnyVal {
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[js.Date | Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: (js.Date | Double)*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /**
    * Represents a dynamic date range option used by the `ui5-dynamic-date-range` component.
    *
    * Represents a dynamic date range option used for handling dynamic date ranges.
    * This interface defines the structure and behavior required for implementing
    * dynamic date range options, including formatting, parsing, validation, and
    * conversion of date range values.
    *
    *  * Properties:
    * - `icon`: The icon associated with the dynamic date range option, typically used for UI representation.
    * - `operator`: A unique operator identifying the dynamic date range option.
    * - `text`: The display text for the dynamic date range option.
    * - `template` (optional): A JSX template for rendering the dynamic date range option.
    *
    * Methods:
    * - `format(value: DynamicDateRangeValue): string`: Formats the given dynamic date range value into a string representation.
    * - `parse(value: string): DynamicDateRangeValue | undefined`: Parses a string into a dynamic date range value.
    * - `toDates(value: DynamicDateRangeValue): Date[]`: Converts a dynamic date range value into an array of `Date` objects.
    * - `handleSelectionChange?(event: CustomEvent): DynamicDateRangeValue | undefined`: (Optional) Handles selection changes in the UI of the dynamic date range option.
    * - `isValidString(value: string): boolean`: Validates whether a given string is a valid representation of the dynamic date range value.
    *
    * @public
    * @since 2.11.0
    */
  trait IDynamicDateRangeOption extends StObject {
    
    def format(value: DynamicDateRangeValue): String
    
    var handleSelectionChange: js.UndefOr[js.Function1[/* event */ CustomEvent, js.UndefOr[DynamicDateRangeValue]]] = js.undefined
    
    var icon: String
    
    def isValidString(value: String): Boolean
    
    var operator: String
    
    def parse(value: String): js.UndefOr[DynamicDateRangeValue]
    
    var template: js.UndefOr[JsxTemplate] = js.undefined
    
    var text: String
    
    def toDates(value: DynamicDateRangeValue): js.Array[js.Date]
  }
  object IDynamicDateRangeOption {
    
    inline def apply(
      format: DynamicDateRangeValue => String,
      icon: String,
      isValidString: String => Boolean,
      operator: String,
      parse: String => js.UndefOr[DynamicDateRangeValue],
      text: String,
      toDates: DynamicDateRangeValue => js.Array[js.Date]
    ): IDynamicDateRangeOption = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), icon = icon.asInstanceOf[js.Any], isValidString = js.Any.fromFunction1(isValidString), operator = operator.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), text = text.asInstanceOf[js.Any], toDates = js.Any.fromFunction1(toDates))
      __obj.asInstanceOf[IDynamicDateRangeOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDynamicDateRangeOption] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: DynamicDateRangeValue => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setHandleSelectionChange(value: /* event */ CustomEvent => js.UndefOr[DynamicDateRangeValue]): Self = StObject.set(x, "handleSelectionChange", js.Any.fromFunction1(value))
      
      inline def setHandleSelectionChangeUndefined: Self = StObject.set(x, "handleSelectionChange", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIsValidString(value: String => Boolean): Self = StObject.set(x, "isValidString", js.Any.fromFunction1(value))
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setParse(value: String => js.UndefOr[DynamicDateRangeValue]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTemplate(value: () => JsxTemplateResult): Self = StObject.set(x, "template", js.Any.fromFunction0(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setToDates(value: DynamicDateRangeValue => js.Array[js.Date]): Self = StObject.set(x, "toDates", js.Any.fromFunction1(value))
    }
  }
}
