package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRatingIndicatorMod {
  
  /**
    * @class
    *
    * ### Overview
    * The Rating Indicator is used to display a specific number of icons that are used to rate an item.
    * Additionally, it is also used to display the average and overall ratings.
    *
    * ### Usage
    * The recommended number of icons is between 5 and 7.
    *
    * ### Responsive Behavior
    * You can change the size of the Rating Indicator by changing its `font-size` CSS property.
    *
    * Example: `<ui5-rating-indicator style="font-size: 3rem;"></ui5-rating-indicator>`
    *
    * ### Keyboard Handling
    * When the `ui5-rating-indicator` is focused, the user can change the rating
    * with the following keyboard shortcuts:
    *
    * - [RIGHT/UP] - Increases the value of the rating by one step. If the highest value is reached, does nothing
    * - [LEFT/DOWN] - Decreases the value of the rating by one step. If the lowest value is reached, does nothing.
    * - [Home] - Sets the lowest value.
    * - [End] - Sets the highest value.
    * - [SPACE/ENTER/RETURN] - Increases the value of the rating by one step. If the highest value is reached, sets the rating to the lowest value.
    * - Any number - Changes value to the corresponding number. If typed number is larger than the number of values, sets the highest value.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RatingIndicator.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents/dist/RatingIndicator", JSImport.Default)
  @js.native
  open class default () extends RatingIndicator
  object default {
    
    @JSImport("@ui5/webcomponents/dist/RatingIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RatingIndicator", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The Rating Indicator is used to display a specific number of icons that are used to rate an item.
    * Additionally, it is also used to display the average and overall ratings.
    *
    * ### Usage
    * The recommended number of icons is between 5 and 7.
    *
    * ### Responsive Behavior
    * You can change the size of the Rating Indicator by changing its `font-size` CSS property.
    *
    * Example: `<ui5-rating-indicator style="font-size: 3rem;"></ui5-rating-indicator>`
    *
    * ### Keyboard Handling
    * When the `ui5-rating-indicator` is focused, the user can change the rating
    * with the following keyboard shortcuts:
    *
    * - [RIGHT/UP] - Increases the value of the rating by one step. If the highest value is reached, does nothing
    * - [LEFT/DOWN] - Decreases the value of the rating by one step. If the lowest value is reached, does nothing.
    * - [Home] - Sets the lowest value.
    * - [End] - Sets the highest value.
    * - [SPACE/ENTER/RETURN] - Increases the value of the rating by one step. If the highest value is reached, sets the rating to the lowest value.
    * - Any number - Changes value to the corresponding number. If typed number is larger than the number of values, sets the highest value.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RatingIndicator.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait RatingIndicator
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDescription: js.UndefOr[String] = js.native
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _ariaLabel: js.UndefOr[String] = js.native
    
    def _ariaRoleDescription: String = js.native
    
    /**
      * @private
      */
    var _focused: Boolean = js.native
    
    var _liveValue: js.UndefOr[Double] = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @private
      */
    var _stars: js.Array[Star] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.15.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaReadonly: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
      ] = js.native
    
    def calcState(): Unit = js.native
    
    def defaultTooltip: String = js.native
    
    /**
      * Defines whether the component is disabled.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveTabIndex: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_RatingIndicator: ChangeVoid = js.native
    
    /**
      * The number of displayed rating symbols.
      * @default 5
      * @public
      * @since 1.0.0-rc.15
      */
    var max: Double = js.native
    
    def ratingTooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 1.15.0
      */
    var required: Boolean = js.native
    
    /**
      * Defines the size of the component.
      * @default "M"
      * @public
      * @since 2.6.0
      */
    var size: /* template literal string: ${RatingIndicatorSize} */ String = js.native
    
    /**
      * Defines the tooltip of the component.
      * @default undefined
      * @public
      * @since 1.19.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * The indicated value of the rating.
      *
      * **Note:** If you set a number which is not round, it would be shown as follows:
      *
      * - 1.0 - 1.2 -> 1
      * - 1.3 - 1.7 -> 1.5
      * - 1.8 - 1.9 -> 2
      * @default 0
      * @public
      */
    var value: Double = js.native
  }
  
  trait Star extends StObject {
    
    var halfStar: Boolean
    
    var index: Double
    
    var selected: Boolean
  }
  object Star {
    
    inline def apply(halfStar: Boolean, index: Double, selected: Boolean): Star = {
      val __obj = js.Dynamic.literal(halfStar = halfStar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Star]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Star] (val x: Self) extends AnyVal {
      
      inline def setHalfStar(value: Boolean): Self = StObject.set(x, "halfStar", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
