package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverPlacementMod.PopoverPlacement
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Center
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.End
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Start
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Stretch
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopoverMod {
  
  @JSImport("@ui5/webcomponents/dist/Popover.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-popover` component displays additional information for an object
    * in a compact way and without leaving the page.
    * The Popover can contain various UI elements, such as fields, tables, images, and charts.
    * It can also include actions in the footer.
    *
    * ### Structure
    *
    * The popover has three main areas:
    *
    * - Header (optional)
    * - Content
    * - Footer (optional)
    *
    * **Note:** The `ui5-popover` is closed when the user clicks
    * or taps outside the popover
    * or selects an action within the popover. You can prevent this with the
    * `modal` property.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Popover.js";`
    *
    * @constructor
    * @extends Popup
    * @since 1.0.0-rc.6
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @JSImport("@ui5/webcomponents/dist/Popover.js", JSImport.Default)
  @js.native
  open class default () extends Popover
  
  inline def instanceOfPopover(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/Popover.Popover */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfPopover")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/Popover.Popover */ Boolean]
  
  trait ArrowPosition extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ArrowPosition {
    
    inline def apply(x: Double, y: Double): ArrowPosition = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrowPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArrowPosition] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalculatedPlacement extends StObject {
    
    var arrow: ArrowPosition
    
    var left: Double
    
    var placement: /* template literal string: ${PopoverPlacement} */ String
    
    var top: Double
  }
  object CalculatedPlacement {
    
    inline def apply(
      arrow: ArrowPosition,
      left: Double,
      placement: /* template literal string: ${PopoverPlacement} */ String,
      top: Double
    ): CalculatedPlacement = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalculatedPlacement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalculatedPlacement] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: ArrowPosition): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setPlacement(value: /* template literal string: ${PopoverPlacement} */ String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-popover` component displays additional information for an object
    * in a compact way and without leaving the page.
    * The Popover can contain various UI elements, such as fields, tables, images, and charts.
    * It can also include actions in the footer.
    *
    * ### Structure
    *
    * The popover has three main areas:
    *
    * - Header (optional)
    * - Content
    * - Footer (optional)
    *
    * **Note:** The `ui5-popover` is closed when the user clicks
    * or taps outside the popover
    * or selects an action within the popover. You can prevent this with the
    * `modal` property.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Popover.js";`
    *
    * @constructor
    * @extends Popup
    * @since 1.0.0-rc.6
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @js.native
  trait Popover
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.default {
    
    def _actualHorizontalAlign: Start | End | Center | Stretch | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Start | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.End = js.native
    
    /**
      * Adjust the desired top position to compensate for shift of the screen
      * caused by opened keyboard on iOS which affects all elements with position:fixed.
      * @private
      * @param top The target top in px.
      * @returns The adjusted top in px.
      */
    def _adjustForIOSKeyboard(top: Double): Double = js.native
    
    /**
      * Hook for descendants to hide footer.
      */
    def _displayFooter: Boolean = js.native
    
    /**
      * Hook for descendants to hide header.
      */
    def _displayHeader: Boolean = js.native
    
    var _height: js.UndefOr[String] = js.native
    
    def _isUI5AbstractElement(el: HTMLElement): /* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.default */ Boolean = js.native
    
    var _left: js.UndefOr[Double] = js.native
    
    var _maxHeight: js.UndefOr[Double] = js.native
    
    var _maxWidth: js.UndefOr[Double] = js.native
    
    var _oldPlacement: js.UndefOr[CalculatedPlacement] = js.native
    
    var _opener: js.UndefOr[HTMLElement | String | Null] = js.native
    
    var _openerRect: js.UndefOr[DOMRect] = js.native
    
    var _preventRepositionAndClose: js.UndefOr[Boolean] = js.native
    
    def _showOutsideViewport(): Unit = js.native
    
    var _top: js.UndefOr[Double] = js.native
    
    var _width: js.UndefOr[String] = js.native
    
    /**
      * Returns the calculated placement depending on the free space
      * @private
      */
    var actualPlacement: /* template literal string: ${PopoverPlacement} */ String = js.native
    
    /**
      * Determines if there is no enough space, the component can be placed
      * over the target.
      * @default false
      * @public
      */
    var allowTargetOverlap: Boolean = js.native
    
    def arrowDOM: Element = js.native
    
    /**
      * Sets the X translation of the arrow
      * @private
      */
    var arrowTranslateX: Double = js.native
    
    /**
      * Sets the Y translation of the arrow
      * @private
      */
    var arrowTranslateY: Double = js.native
    
    /**
      * @private
      */
    def calcPlacement(targetRect: DOMRect, popoverSize: PopoverSize): CalculatedPlacement = js.native
    
    /**
      * Fallbacks to new placement, prioritizing `Left` and `Right` placements.
      * @private
      */
    def fallbackPlacement(clientWidth: Double, clientHeight: Double, targetRect: DOMRect, popoverSize: PopoverSize): js.UndefOr[PopoverPlacement] = js.native
    
    /**
      * @protected
      */
    def focusOpener(): Unit = js.native
    
    /**
      * Defines the footer HTML Element.
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    def getActualPlacement(targetRect: DOMRect): /* template literal string: ${PopoverPlacement} */ String = js.native
    
    /**
      * Calculates the position for the arrow.
      * @private
      * @param targetRect BoundingClientRect of the target element
      * @param popoverSize Width and height of the popover
      * @param left Left offset of the popover
      * @param top Top offset of the popover
      * @param isVertical If the popover is positioned vertically to the target element
      * @param borderRadius Value of the border-radius property
      * @returns  Arrow's coordinates
      */
    def getArrowPosition(
      targetRect: DOMRect,
      popoverSize: PopoverSize,
      left: Double,
      top: Double,
      isVertical: Boolean,
      borderRadius: Double
    ): ArrowPosition = js.native
    
    def getHorizontalTop(targetRect: DOMRect, popoverSize: PopoverSize): Double = js.native
    
    def getOpenerHTMLElement(): js.UndefOr[HTMLElement | Null] = js.native
    def getOpenerHTMLElement(opener: String): js.UndefOr[HTMLElement | Null] = js.native
    def getOpenerHTMLElement(opener: HTMLElement): js.UndefOr[HTMLElement | Null] = js.native
    
    def getPopoverSize(): PopoverSize = js.native
    def getPopoverSize(calcScrollHeight: Boolean): PopoverSize = js.native
    
    def getRTLCorrectionLeft(): Double = js.native
    
    def getVerticalLeft(targetRect: DOMRect, popoverSize: PopoverSize): Double = js.native
    
    /**
      * Defines the header HTML Element.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header text.
      *
      * **Note:** If `header` slot is provided, the `headerText` is ignored.
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component arrow is hidden.
      * @default false
      * @public
      * @since 1.0.0-rc.15
      */
    var hideArrow: Boolean = js.native
    
    /**
      * Determines the horizontal alignment of the component.
      * @default "Center"
      * @public
      */
    var horizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    def isOpenerClicked(e: MouseEvent): Boolean = js.native
    
    def isOpenerOutsideViewport(openerRect: DOMRect): Boolean = js.native
    
    /**
      * Defines whether the component should close when
      * clicking/tapping outside of the popover.
      * If enabled, it blocks any interaction with the background.
      * @default false
      * @public
      */
    var modal: Boolean = js.native
    
    def opener: js.UndefOr[HTMLElement | String | Null] = js.native
    /**
      * Defines the ID or DOM Reference of the element at which the popover is shown.
      * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
      * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
      * @public
      * @default undefined
      * @since 1.2.0
      */
    def opener_=(value: HTMLElement | String | Null): Unit = js.native
    
    /**
      * Determines on which side the component is placed at.
      * @default "End"
      * @public
      */
    var placement: /* template literal string: ${PopoverPlacement} */ String = js.native
    
    def reposition(): Unit = js.native
    
    def shouldCloseDueToNoOpener(openerRect: DOMRect): Boolean = js.native
    
    def shouldCloseDueToOverflow(placement: /* template literal string: ${PopoverPlacement} */ String, openerRect: DOMRect): Boolean = js.native
    
    /**
      * Determines the vertical alignment of the component.
      * @default "Center"
      * @public
      */
    var verticalAlign: /* template literal string: ${PopoverVerticalAlign} */ String = js.native
  }
  
  trait PopoverSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PopoverSize {
    
    inline def apply(height: Double, width: Double): PopoverSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
