package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.PassiveEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ArrowDirection
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Columns
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.CursorPositionX
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Name
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFclUtilsFcllayoutMod.LayoutConfiguration
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.EndColumnFullScreen
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.MidColumnFullScreen
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.OneColumn
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsEndExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsMidExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsMidExpandedEndHidden
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsStartExpandedEndHidden
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsStartHiddenEndExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.ThreeColumnsStartHiddenMidExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.TwoColumnsMidExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.TwoColumnsStartExpanded
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.backward
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.forward
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.separator
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalajs.dom.TransitionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFlexibleColumnLayoutMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `FlexibleColumnLayout` implements the list-detail-detail paradigm by displaying up to three pages in separate columns.
    * There are several possible layouts that can be changed either with the component API, or by dragging the column separators.
    *
    * ### Usage
    *
    * Use this component for applications that need to display several logical levels of related information side by side (e.g. list of items, item, sub-item, etc.).
    * The Component is flexible in a sense that the application can focus the user's attention on one particular column.
    *
    * ### Responsive Behavior
    *
    * The `FlexibleColumnLayout` automatically displays the maximum possible number of columns based on `layout` property and the window size.
    * The component would display 1 column for window size smaller than 599px, up to two columns between 599px and 1023px,
    * and 3 columns for sizes bigger than 1023px.
    *
    * **Note:** When the component displays more than one column, the minimal width of each column is 248px. Consequently, when the user drags a column separator to resize the columns, the minimal allowed width of any resized column is 248px.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    *
    * When a column separator is focused,  the following keyboard
    * shortcuts allow the user to resize the columns and change the layout:
    *
    * - [Shift] + [Left] or [Shift] + [Right] - Moves the separator to the left or right, which resizes the columns accordingly.
    * - [Left] or [Right] - Moves the separator to the left or right with a bigger step, which resizes the columns accordingly.
    * - [Home] - Moves the separator to the start position.
    * - [End] - Moves the separator to the end position.
    * - This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js", JSImport.Default)
  @js.native
  open class default () extends FlexibleColumnLayout
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait MEDIA extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js", "MEDIA")
  @js.native
  object MEDIA extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MEDIA & String] = js.native
    
    @js.native
    sealed trait DESKTOP
      extends StObject
         with MEDIA
    /* "desktop" */ val DESKTOP: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.MEDIA.DESKTOP & String = js.native
    
    @js.native
    sealed trait PHONE
      extends StObject
         with MEDIA
    /* "phone" */ val PHONE: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.MEDIA.PHONE & String = js.native
    
    @js.native
    sealed trait TABLET
      extends StObject
         with MEDIA
    /* "tablet" */ val TABLET: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.MEDIA.TABLET & String = js.native
  }
  
  trait FCLAccessibilityAttributes extends StObject {
    
    var endColumn: js.UndefOr[Name] = js.undefined
    
    var endSeparator: js.UndefOr[Name] = js.undefined
    
    var midColumn: js.UndefOr[Name] = js.undefined
    
    var startColumn: js.UndefOr[Name] = js.undefined
    
    var startSeparator: js.UndefOr[Name] = js.undefined
  }
  object FCLAccessibilityAttributes {
    
    inline def apply(): FCLAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FCLAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FCLAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setEndColumn(value: Name): Self = StObject.set(x, "endColumn", value.asInstanceOf[js.Any])
      
      inline def setEndColumnUndefined: Self = StObject.set(x, "endColumn", js.undefined)
      
      inline def setEndSeparator(value: Name): Self = StObject.set(x, "endSeparator", value.asInstanceOf[js.Any])
      
      inline def setEndSeparatorUndefined: Self = StObject.set(x, "endSeparator", js.undefined)
      
      inline def setMidColumn(value: Name): Self = StObject.set(x, "midColumn", value.asInstanceOf[js.Any])
      
      inline def setMidColumnUndefined: Self = StObject.set(x, "midColumn", js.undefined)
      
      inline def setStartColumn(value: Name): Self = StObject.set(x, "startColumn", value.asInstanceOf[js.Any])
      
      inline def setStartColumnUndefined: Self = StObject.set(x, "startColumn", js.undefined)
      
      inline def setStartSeparator(value: Name): Self = StObject.set(x, "startSeparator", value.asInstanceOf[js.Any])
      
      inline def setStartSeparatorUndefined: Self = StObject.set(x, "startSeparator", js.undefined)
    }
  }
  
  /* Inlined std.Extract<@ui5/webcomponents-base.@ui5/webcomponents-base.AriaLandmarkRole, 'none' | 'complementary' | 'contentinfo' | 'main' | 'region'> */
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.main
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.complementary
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.none
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.region
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.contentinfo
  */
  trait FCLAccessibilityRoles extends StObject
  object FCLAccessibilityRoles {
    
    inline def complementary: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.complementary = "complementary".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.complementary]
    
    inline def contentinfo: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.contentinfo = "contentinfo".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.contentinfo]
    
    inline def main: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.main = "main".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.main]
    
    inline def none: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.none = "none".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.none]
    
    inline def region: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.region = "region".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.region]
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `FlexibleColumnLayout` implements the list-detail-detail paradigm by displaying up to three pages in separate columns.
    * There are several possible layouts that can be changed either with the component API, or by dragging the column separators.
    *
    * ### Usage
    *
    * Use this component for applications that need to display several logical levels of related information side by side (e.g. list of items, item, sub-item, etc.).
    * The Component is flexible in a sense that the application can focus the user's attention on one particular column.
    *
    * ### Responsive Behavior
    *
    * The `FlexibleColumnLayout` automatically displays the maximum possible number of columns based on `layout` property and the window size.
    * The component would display 1 column for window size smaller than 599px, up to two columns between 599px and 1023px,
    * and 3 columns for sizes bigger than 1023px.
    *
    * **Note:** When the component displays more than one column, the minimal width of each column is 248px. Consequently, when the user drags a column separator to resize the columns, the minimal allowed width of any resized column is 248px.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    *
    * When a column separator is focused,  the following keyboard
    * shortcuts allow the user to resize the columns and change the layout:
    *
    * - [Shift] + [Left] or [Shift] + [Right] - Moves the separator to the left or right, which resizes the columns accordingly.
    * - [Left] or [Right] - Moves the separator to the left or right with a bigger step, which resizes the columns accordingly.
    * - [Home] - Moves the separator to the start position.
    * - [End] - Moves the separator to the end position.
    * - This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait FlexibleColumnLayout
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _accAttributes: Columns = js.native
    
    def _availableWidthForColumns: Double = js.native
    
    /**
      * Defines the effective columns layout,
      * based on both the `layout` property and the screen size.
      * Example: [67%, 33%, 0], [25%, 50%, 25%], etc.
      * @default undefined
      * @private
      */
    var _columnLayout: js.UndefOr[FlexibleColumnLayoutColumnLayout] = js.native
    
    def _effectiveLayoutsByMedia: LayoutConfiguration = js.native
    
    def _handleResize(): Unit = js.native
    
    /**
      * Checks if a column is hidden based on its width.
      */
    /* private */ var _isColumnHidden: Any = js.native
    
    /**
      * Allows the user to replace the whole layouts configuration
      * @private
      */
    var _layoutsConfiguration: js.UndefOr[LayoutConfiguration] = js.native
    
    def _onArrowKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onSeparatorKeyUp(): Unit = js.native
    
    def _onSeparatorKeydown(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _onSeparatorMove(e: MouseEvent): Unit = js.native
    def _onSeparatorMove(e: TouchEvent): Unit = js.native
    
    def _onSeparatorMoveEnd(e: MouseEvent): Unit = js.native
    def _onSeparatorMoveEnd(e: TouchEvent): Unit = js.native
    
    var _ontouchstart: PassiveEventListenerObject = js.native
    
    var _prevLayout: (/* template literal string: ${FCLLayout} */ String) | Null = js.native
    
    /**
      * Defines if the user is currently resizing the columns by dragging their separator.
      * @default false
      * @private
      */
    var _resizing: Boolean = js.native
    
    var _userDefinedColumnLayouts: UserDefinedColumnLayouts = js.native
    
    /**
      * Defines the visible columns count - 1, 2 or 3.
      * @default 1
      * @private
      */
    var _visibleColumns: Double = js.native
    
    /**
      * Defines the component width in px.
      * @default 0
      * @private
      */
    var _width: Double = js.native
    
    def accEndColumnRole: js.UndefOr[FCLAccessibilityRoles] = js.native
    
    def accEndColumnText: String = js.native
    
    def accEndSeparatorRole: separator | FCLAccessibilityRoles = js.native
    
    def accEndSeparatorText: String = js.native
    
    def accMiddleColumnRole: js.UndefOr[FCLAccessibilityRoles] = js.native
    
    def accMiddleColumnText: String = js.native
    
    def accStartColumnRole: js.UndefOr[FCLAccessibilityRoles] = js.native
    
    def accStartColumnText: String = js.native
    
    def accStartSeparatorRole: separator | FCLAccessibilityRoles = js.native
    
    def accStartSeparatorText: js.UndefOr[String] = js.native
    
    /**
      * Defines additional accessibility attributes on different areas of the component.
      *
      * The accessibilityAttributes object has the following fields,
      * where each field is an object supporting one or more accessibility attributes:
      *
      *  - **startColumn**: `startColumn.role` and `startColumn.name`.
      *  - **midColumn**: `midColumn.role` and `midColumn.name`.
      *  - **endColumn**: `endColumn.role` and `endColumn.name`.
      *  - **startSeparator**: `startSeparator.role` and `startSeparator.name`.
      *  - **endSeparator**: `endSeparator.role` and `endSeparator.name`.
      *
      * The accessibility attributes support the following values:
      *
      * - **role**: Defines the accessible ARIA landmark role of the area.
      * Accepts the following values: `none`, `complementary`, `contentinfo`, `main` or `region`.
      *
      * - **name**: Defines the accessible ARIA name of the area.
      * Accepts any string.
      *
      * @default {}
      * @public
      * @since 2.0.0
      */
    var accessibilityAttributes: FCLAccessibilityAttributes = js.native
    
    def adjustColumnLayout(columnToResize: `0` | `2`, newSize: Double): js.UndefOr[FlexibleColumnLayoutColumnLayout] = js.native
    def adjustColumnLayout(columnToResize: `0` | `2`, newSize: Double, createNewArray: Boolean): js.UndefOr[FlexibleColumnLayoutColumnLayout] = js.native
    
    /* private */ var attachMoveListeners: Any = js.native
    
    def calcVisibleColumns(colLayout: FlexibleColumnLayoutColumnLayout): Double = js.native
    
    def calculateNewColumnWidth(columnToResize: `0` | `2`, widthDelta: Double): Double = js.native
    
    def collapseColumn(columnDOM: HTMLElement): Unit = js.native
    
    /**
      * Returns the current column layout, based on both the `layout` property and the screen size.
      *
      * **For example:** ["67%", "33%", 0], ["100%", 0, 0], ["25%", "50%", "25%"], etc,
      * where the numbers represents the width of the start, middle and end columns.
      * @default undefined
      * @public
      */
    def columnLayout: js.UndefOr[FlexibleColumnLayoutColumnLayout] = js.native
    
    def convertColumnWidthToPixels(width: String): Double = js.native
    def convertColumnWidthToPixels(width: Double): Double = js.native
    
    def convertToRelativeColumnWidth(pxWidth: String): String = js.native
    def convertToRelativeColumnWidth(pxWidth: Double): String = js.native
    
    /* private */ var detachMoveListeners: Any = js.native
    
    /**
      * Specifies if the user is allowed to change the columns layout by dragging the separator between the columns.
      * @default false
      * @public
      * @since 2.0.0
      */
    var disableResizing: Boolean = js.native
    
    def effectiveLayout: OneColumn | TwoColumnsStartExpanded | TwoColumnsMidExpanded | ThreeColumnsMidExpanded | ThreeColumnsEndExpanded | ThreeColumnsStartExpandedEndHidden | ThreeColumnsMidExpandedEndHidden | ThreeColumnsStartHiddenMidExpanded | ThreeColumnsStartHiddenEndExpanded | MidColumnFullScreen | EndColumnFullScreen | FCLLayout = js.native
    
    def effectiveSeparatorsInfo: js.Array[ArrowDirection] = js.native
    
    /**
      * Defines the content in the end column.
      * @public
      */
    var endColumn: js.Array[HTMLElement] = js.native
    
    def endColumnDOM: HTMLElement = js.native
    
    /**
      * Returns if the `end` column is visible.
      * @default false
      * @public
      */
    def endColumnVisible: Boolean = js.native
    
    def endColumnWidth: String | Double = js.native
    
    def endSeparatorDOM: HTMLElement = js.native
    
    def endSeparatorGripVisibility: js.UndefOr[Boolean] = js.native
    
    def endSeparatorTabIndex: js.UndefOr[`0`] = js.native
    
    def endSeparatorValue: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_FlexibleColumnLayout: LayoutchangeFlexibleColumnLayoutLayoutChangeEventDetail = js.native
    
    def exitSeparatorMovementSession(): Unit = js.native
    
    def expandColumn(columnDOM: HTMLElement, columnWidth: String): Unit = js.native
    def expandColumn(columnDOM: HTMLElement, columnWidth: Double): Unit = js.native
    
    def fireLayoutChange(separatorUsed: Boolean, resized: Boolean): Unit = js.native
    
    def getNextLayoutOnSeparatorMovement(
      separator: HTMLElement,
      isStartToEndDirection: Boolean,
      fclLayoutBeforeMove: FCLLayout,
      columnLayoutAfterMove: FlexibleColumnLayoutColumnLayout
    ): FCLLayout = js.native
    
    /* private */ var getPageXValueFromEvent: Any = js.native
    
    def handleInitialRendering(): Unit = js.native
    
    def handleResize(): Unit = js.native
    
    def initSeparatorMovementSession(separator: HTMLElement, cursorPositionX: Double, isTouch: Boolean): CursorPositionX = js.native
    
    var initialRendering: Boolean = js.native
    
    /* private */ var isSeparatorAheadOfCursor: Any = js.native
    
    /**
      * Defines the columns layout and their proportion.
      *
      * **Note:** The layout also depends on the screen size - one column for screens smaller than 599px,
      * two columns between 599px and 1023px and three columns for sizes bigger than 1023px.
      *
      * **For example:** layout=`TwoColumnsStartExpanded` means the layout will display up to two columns
      * in 67%/33% proportion.
      * @default "OneColumn"
      * @public
      */
    var layout: /* template literal string: ${FCLLayout} */ String = js.native
    
    def media: MEDIA = js.native
    
    /**
      * Defines the content in the middle column.
      * @public
      */
    var midColumn: js.Array[HTMLElement] = js.native
    
    def midColumnDOM: HTMLElement = js.native
    
    /**
      * Returns if the `middle` column is visible.
      * @default false
      * @public
      */
    def midColumnVisible: Boolean = js.native
    
    def midColumnWidth: String | Double = js.native
    
    def moveSeparator(separator: HTMLElement, offsetX: Double, fclLayoutBeforeMove: FCLLayout): FCLLayout = js.native
    
    def nextColumnLayout(layout: /* template literal string: ${FCLLayout} */ String): FlexibleColumnLayoutColumnLayout = js.native
    
    def onColumnCollapseAnimationEnd(e: Event): Unit = js.native
    
    def onColumnCollapseAnimationEndRef(e: TransitionEvent): Unit = js.native
    
    def onSeparatorMove(e: MouseEvent): Unit = js.native
    def onSeparatorMove(e: TouchEvent): Unit = js.native
    
    /* private */ var onSeparatorMoveEnd: Any = js.native
    
    def onSeparatorPress(e: MouseEvent): Unit = js.native
    def onSeparatorPress(e: TouchEvent): Unit = js.native
    
    def saveUserDefinedColumnLayout(newLayout: FCLLayout, newColumnLayout: FlexibleColumnLayoutColumnLayout): Unit = js.native
    
    var separatorMovementSession: js.UndefOr[SeparatorMovementSession | Null] = js.native
    
    def showEndSeparator: Boolean = js.native
    
    def showEndSeparatorGrip: js.UndefOr[Boolean] = js.native
    
    def showStartSeparator: Boolean = js.native
    
    def showStartSeparatorArrow: js.UndefOr[Boolean] = js.native
    
    def showStartSeparatorGrip: js.UndefOr[Boolean] = js.native
    
    def startArrowDOM: HTMLElement = js.native
    
    def startArrowDirection: js.UndefOr[forward | backward] = js.native
    
    /**
      * Defines the content in the start column.
      * @public
      */
    var startColumn: js.Array[HTMLElement] = js.native
    
    def startColumnDOM: HTMLElement = js.native
    
    /**
      * Returns if the `start` column is visible.
      * @default true
      * @public
      */
    def startColumnVisible: Boolean = js.native
    
    def startColumnWidth: String | Double = js.native
    
    def startSeparatorArrowVisibility: js.UndefOr[Boolean] = js.native
    
    def startSeparatorDOM: HTMLElement = js.native
    
    def startSeparatorGripVisibility: js.UndefOr[Boolean] = js.native
    
    def startSeparatorTabIndex: js.UndefOr[`0`] = js.native
    
    def startSeparatorValue: Double = js.native
    
    def switchLayoutOnArrowPress(): Unit = js.native
    
    def syncLayout(): Unit = js.native
    
    def toggleColumn(column: String): Unit = js.native
    
    def toggleColumns(): Unit = js.native
    
    /* private */ var toggleSideAnimations: Any = js.native
    
    def updateLayout(): Unit = js.native
    
    /**
      * Returns the number of currently visible columns.
      * @default 1
      * @public
      */
    def visibleColumns: Double = js.native
    
    def widthDOM: Double = js.native
  }
  
  type FlexibleColumnLayoutColumnLayout = js.Array[String | Double]
  
  trait FlexibleColumnLayoutLayoutChangeEventDetail extends StObject {
    
    var columnLayout: FlexibleColumnLayoutColumnLayout
    
    var endColumnVisible: Boolean
    
    var layout: /* template literal string: ${FCLLayout} */ String
    
    var midColumnVisible: Boolean
    
    var resized: Boolean
    
    var separatorsUsed: Boolean
    
    var startColumnVisible: Boolean
  }
  object FlexibleColumnLayoutLayoutChangeEventDetail {
    
    inline def apply(
      columnLayout: FlexibleColumnLayoutColumnLayout,
      endColumnVisible: Boolean,
      layout: /* template literal string: ${FCLLayout} */ String,
      midColumnVisible: Boolean,
      resized: Boolean,
      separatorsUsed: Boolean,
      startColumnVisible: Boolean
    ): FlexibleColumnLayoutLayoutChangeEventDetail = {
      val __obj = js.Dynamic.literal(columnLayout = columnLayout.asInstanceOf[js.Any], endColumnVisible = endColumnVisible.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], midColumnVisible = midColumnVisible.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any], separatorsUsed = separatorsUsed.asInstanceOf[js.Any], startColumnVisible = startColumnVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlexibleColumnLayoutLayoutChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlexibleColumnLayoutLayoutChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setColumnLayout(value: FlexibleColumnLayoutColumnLayout): Self = StObject.set(x, "columnLayout", value.asInstanceOf[js.Any])
      
      inline def setColumnLayoutVarargs(value: (String | Double)*): Self = StObject.set(x, "columnLayout", js.Array(value*))
      
      inline def setEndColumnVisible(value: Boolean): Self = StObject.set(x, "endColumnVisible", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: /* template literal string: ${FCLLayout} */ String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setMidColumnVisible(value: Boolean): Self = StObject.set(x, "midColumnVisible", value.asInstanceOf[js.Any])
      
      inline def setResized(value: Boolean): Self = StObject.set(x, "resized", value.asInstanceOf[js.Any])
      
      inline def setSeparatorsUsed(value: Boolean): Self = StObject.set(x, "separatorsUsed", value.asInstanceOf[js.Any])
      
      inline def setStartColumnVisible(value: Boolean): Self = StObject.set(x, "startColumnVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeparatorMovementSession extends StObject {
    
    var cursorPositionX: Double
    
    var separator: HTMLElement
    
    var tmpFCLLayout: FCLLayout
  }
  object SeparatorMovementSession {
    
    inline def apply(cursorPositionX: Double, separator: HTMLElement, tmpFCLLayout: FCLLayout): SeparatorMovementSession = {
      val __obj = js.Dynamic.literal(cursorPositionX = cursorPositionX.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], tmpFCLLayout = tmpFCLLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorMovementSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeparatorMovementSession] (val x: Self) extends AnyVal {
      
      inline def setCursorPositionX(value: Double): Self = StObject.set(x, "cursorPositionX", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: HTMLElement): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setTmpFCLLayout(value: FCLLayout): Self = StObject.set(x, "tmpFCLLayout", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserDefinedColumnLayouts extends StObject {
    
    var desktop: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any
    
    var tablet: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any
  }
  object UserDefinedColumnLayouts {
    
    inline def apply(
      desktop: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any,
      tablet: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any
    ): UserDefinedColumnLayouts = {
      val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any], tablet = tablet.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserDefinedColumnLayouts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserDefinedColumnLayouts] (val x: Self) extends AnyVal {
      
      inline def setDesktop(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any
      ): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setTablet(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ layoutName in @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/types/FCLLayout.FCLLayout ]:? @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/FlexibleColumnLayout.FlexibleColumnLayoutColumnLayout} */ js.Any
      ): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    }
  }
}
