package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFcllayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/FCLLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FCLLayout & String] = js.native
    
    /* "EndColumnFullScreen" */ val EndColumnFullScreen: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.EndColumnFullScreen & String = js.native
    
    /* "MidColumnFullScreen" */ val MidColumnFullScreen: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.MidColumnFullScreen & String = js.native
    
    /* "OneColumn" */ val OneColumn: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.OneColumn & String = js.native
    
    /* "ThreeColumnsEndExpanded" */ val ThreeColumnsEndExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsEndExpanded & String = js.native
    
    /* "ThreeColumnsMidExpanded" */ val ThreeColumnsMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpanded & String = js.native
    
    /* "ThreeColumnsMidExpandedEndHidden" */ val ThreeColumnsMidExpandedEndHidden: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsMidExpandedEndHidden & String = js.native
    
    /* "ThreeColumnsStartExpandedEndHidden" */ val ThreeColumnsStartExpandedEndHidden: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartExpandedEndHidden & String = js.native
    
    /* "ThreeColumnsStartHiddenEndExpanded" */ val ThreeColumnsStartHiddenEndExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartHiddenEndExpanded & String = js.native
    
    /* "ThreeColumnsStartHiddenMidExpanded" */ val ThreeColumnsStartHiddenMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.ThreeColumnsStartHiddenMidExpanded & String = js.native
    
    /* "TwoColumnsMidExpanded" */ val TwoColumnsMidExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsMidExpanded & String = js.native
    
    /* "TwoColumnsStartExpanded" */ val TwoColumnsStartExpanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesFcllayoutMod.FCLLayout.TwoColumnsStartExpanded & String = js.native
  }
  
  @js.native
  sealed trait FCLLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/FCLLayout", "FCLLayout")
  @js.native
  object FCLLayout extends StObject {
    
    /**
      * Desktop: Fixed -- -- 100 percent widths of columns, only the End column is displayed
      * Tablet:  Fixed -- -- 100 percent widths of columns, only the End column is displayed
      * Phone:   Fixed -- -- 100 percent widths of columns, only the End column is displayed
      *
      * Use to display a detail-detail page only, when the user should focus entirely on it.
      * @public
      */
    @js.native
    sealed trait EndColumnFullScreen
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Fixed -- 100 -- percent widths of columns, only the Mid column is displayed
      * Tablet:  Fixed -- 100 -- percent widths of columns, only the Mid column is displayed
      * Phone:   Fixed -- 100 -- percent widths of columns, only the Mid column is displayed
      *
      * Use to display a detail page only, when the user should focus entirely on it.
      * @public
      */
    @js.native
    sealed trait MidColumnFullScreen
      extends StObject
         with FCLLayout
    
    /**
      * The layout will display 1 column.
      * @public
      */
    @js.native
    sealed trait OneColumn
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 25 - 25 - 50 percent widths of columns. Start, Mid and End (expanded) columns are displayed
      * Tablet:  Defaults to 0 - 33 - 67 percent widths of columns. Mid and End (expanded) columns are displayed, Start is accessible by dragging the columns-separator
      * Phone:   Fixed -- -- 100 percent widths of columns (only the End column is displayed)
      *
      * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail-detail.
      * @public
      */
    @js.native
    sealed trait ThreeColumnsEndExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 25 - 50 - 25 percent widths of columns. Start, Mid (expanded) and End columns are displayed
      * Tablet:  Defaults to 0 - 67 - 33 percent widths of columns. Mid (expanded) and End columns are displayed, Start is accessible by dragging the columns-separator
      * Phone:   Fixed -- -- 100 percent widths of columns, only the End column is displayed
      *
      * Use to display all three pages (list, detail, detail-detail) when the user should focus on the detail.
      * @public
      */
    @js.native
    sealed trait ThreeColumnsMidExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 33 - 67 - 0 percent widths of columns. Start and Mid (expanded) columns are displayed, End is accessible by dragging the columns-separator
      * Tablet:  Defaults to 33 - 67 - 0 percent widths of columns. Start and Mid (expanded) columns are displayed, End is accessible by dragging the columns-separator
      * Phone:   Fixed -- -- 100 percent widths of columns, only the End column is displayed
      *
      * Use to display the list and detail pages when the user should focus on the detail.
      * The detail-detail is still loaded and easily accessible by dragging the columns-separator
      * @public
      */
    @js.native
    sealed trait ThreeColumnsMidExpandedEndHidden
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 67 - 33 - 0 percent widths of columns. Start (expanded) and Mid columns are displayed, End is accessible by dragging the columns-separator
      * Tablet:  Defaults to 67 - 33 - 0 percent widths of columns. Start (expanded) and Mid columns are displayed, End is accessible by dragging the columns-separator
      * Phone:   Fixed -- -- 100 percent widths of columns, only the End column is displayed
      *
      * Use to display the list and detail pages when the user should focus on the list.
      * The detail-detail is still loaded and easily accessible by dragging the columns-separator
      * @public
      */
    @js.native
    sealed trait ThreeColumnsStartExpandedEndHidden
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 0 - 33 - 67 percent widths of columns. Start is hidden, Mid and End (expanded) columns are displayed.
      * Tablet:  Defaults to 0 - 33 - 67 percent widths of columns. Start is hidden, Mid and End (expanded) columns are displayed.
      * Phone:   Fixed -- 100 percent width of the End column, only the End column is displayed.
      *
      * Use to display the Mid column and expanded End column while the grip of the separator is not visible.
      * @public
      */
    @js.native
    sealed trait ThreeColumnsStartHiddenEndExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 0 - 67 - 33 percent widths of columns. Start is hidden, Mid (expanded) and End columns are displayed.
      * Tablet:  Defaults to 0 - 67 - 33 percent widths of columns. Start is hidden, Mid (expanded) and End columns are displayed.
      * Phone:   Fixed -- 100 percent width of the Mid column, only the Mid column is displayed.
      *
      * Use to display the Mid and End columns while the Start column is hidden.
      * @public
      */
    @js.native
    sealed trait ThreeColumnsStartHiddenMidExpanded
      extends StObject
         with FCLLayout
    
    /**
      * Desktop: Defaults to 33 - 67 - -- percent widths of columns. Start and Mid (expanded) columns are displayed
      * Tablet:  Defaults to 33 - 67 - -- percent widths of columns. Start and Mid (expanded) columns are displayed
      * Phone:   Fixed -- 100 -- percent widths of columns, only the Mid column is displayed
      *
      * Use to display both a list and a detail page when the user should focus on the detail page.
      * @public
      */
    @js.native
    sealed trait TwoColumnsMidExpanded
      extends StObject
         with FCLLayout
    
    /**
      *
      * Desktop: Defaults to 67 - 33 - -- percent widths of columns. Start (expanded) and Mid columns are displayed.
      * Tablet:  Defaults to 67 - 33 - -- percent widths of columns. Start (expanded) and Mid columns are displayed.
      * Phone:   Fixed -- 100 -- percent widths of columns, only the Mid column is displayed
      *
      * Use to display both a list and a detail page when the user should focus on the list page.
      * @public
      */
    @js.native
    sealed trait TwoColumnsStartExpanded
      extends StObject
         with FCLLayout
  }
}
