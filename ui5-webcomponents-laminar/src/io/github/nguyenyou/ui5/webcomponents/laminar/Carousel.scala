package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCarouselMod.Carousel as CarouselComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCarouselMod.CarouselNavigateEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Carousel extends WebComponent("ui5-carousel") {

  @JSImport("@ui5/webcomponents/dist/Carousel.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Carousel.type

  type Ref = CarouselComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible name of the component.
    *
    * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the IDs of the elements that label the input.
    *
    * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines the position of arrows.
    *
    * Available options are:
    *
    *   - `Content` - the arrows are placed on the sides of the current page.
    *   - `Navigation` - the arrows are placed on the sides of the page indicator.
    *
    * Default: "Content"
    */
  lazy val arrowsPlacement: HtmlAttr[CarouselArrowsPlacement] =
    htmlAttr("arrows-placement", StringUnionCodec[CarouselArrowsPlacement])
  type CarouselArrowsPlacement = "Content" | "Navigation"

  /** Defines the carousel's background design.
    *
    * **Note:** Available since [v1.14](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.14) of
    * **@ui5/webcomponents**.
    *
    * Default: "Translucent"
    */
  lazy val backgroundDesign: HtmlAttr[BackgroundDesign] =
    htmlAttr("background-design", StringUnionCodec[BackgroundDesign])
  type BackgroundDesign = "Solid" | "Transparent" | "Translucent"

  /** Defines whether the carousel should loop, i.e show the first page after the last page is reached and vice versa.
    *
    * Default: false
    */
  lazy val cyclic: HtmlAttr[Boolean] = htmlAttr("cyclic", BooleanAsAttrPresenceCodec)

  /** Defines the visibility of the navigation arrows. If set to true the navigation arrows will be hidden.
    *
    * Default: false
    */
  lazy val hideNavigationArrows: HtmlAttr[Boolean] = htmlAttr("hide-navigation-arrows", BooleanAsAttrPresenceCodec)

  /** Defines the visibility of the page indicator. If set to true the page indicator will be hidden.
    *
    * Default: false
    */
  lazy val hidePageIndicator: HtmlAttr[Boolean] = htmlAttr("hide-page-indicator", BooleanAsAttrPresenceCodec)

  /** Defines the number of items per page depending on the carousel width.
    *
    *   - 'S' for screens smaller than 600 pixels.
    *   - 'M' for screens greater than or equal to 600 pixels and smaller than 1024 pixels.
    *   - 'L' for screens greater than or equal to 1024 pixels and smaller than 1440 pixels.
    *   - 'XL' for screens greater than or equal to 1440 pixels.
    *
    * One item per page is shown by default.
    *
    * Default: "S1 M1 L1 XL1"
    */
  lazy val itemsPerPage: HtmlAttr[String] = htmlAttr("items-per-page", StringAsIsCodec)

  /** Defines the page indicator background design.
    *
    * **Note:** Available since [v1.14](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.14) of
    * **@ui5/webcomponents**.
    *
    * Default: "Solid"
    */
  lazy val pageIndicatorBackgroundDesign: HtmlAttr[BackgroundDesign] =
    htmlAttr("page-indicator-background-design", StringUnionCodec[BackgroundDesign])

  /** Defines the page indicator border design.
    *
    * **Note:** Available since [v1.14](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.14) of
    * **@ui5/webcomponents**.
    *
    * Default: "Solid"
    */
  lazy val pageIndicatorBorderDesign: HtmlAttr[BorderDesign] =
    htmlAttr("page-indicator-border-design", StringUnionCodec[BorderDesign])
  type BorderDesign = "Solid" | "None"

  /** Defines the style of the page indicator. Available options are:
    *
    *   - `Default` - The page indicator will be visualized as dots if there are fewer than 9 pages. If there are more
    *     pages, the page indicator will switch to displaying the current page and the total number of pages. (e.g. X of
    *     Y)
    *   - `Numeric` - The page indicator will display the current page and the total number of pages. (e.g. X of Y)
    *
    * **Note:** Available since [v1.10](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10) of
    * **@ui5/webcomponents**.
    *
    * Default: "Default"
    */
  lazy val pageIndicatorType: HtmlAttr[CarouselPageIndicatorType] =
    htmlAttr("page-indicator-type", StringUnionCodec[CarouselPageIndicatorType])
  type CarouselPageIndicatorType = "Default" | "Numeric"

  // -- Events --

  /** Fired whenever the page changes due to user interaction, when the user clicks on the navigation arrows or while
    * resizing, based on the `items-per-page` property.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onNavigate: EventProp[Ui5CustomEvent[Ref] & EventDetail[CarouselNavigateEventDetail]] = new EventProp(
    "navigate"
  )

  // -- Slots --

}
