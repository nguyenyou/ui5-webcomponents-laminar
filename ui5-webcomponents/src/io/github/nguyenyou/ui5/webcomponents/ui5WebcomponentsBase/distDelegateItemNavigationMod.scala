package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesItemNavigationBehaviorMod.ItemNavigationBehavior
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesNavigationModeMod.NavigationMode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelegateItemNavigationMod {
  
  /**
    * The ItemNavigation class manages the calculations to determine the correct "tabindex" for a group of related items inside a root component.
    * Important: ItemNavigation only does the calculations and does not change "tabindex" directly, this is a responsibility of the developer.
    *
    * The keys that trigger ItemNavigation are:
    *  - Up/down
    *  - Left/right
    *  - Home/End
    *
    * Usage:
    * 1) Use the "getItemsCallback" constructor property to pass a callback to ItemNavigation, which, whenever called, will return the list of items to navigate among.
    *
    * Each item passed to ItemNavigation via "getItemsCallback" must be:
    *  - A) either a UI5Element with a "forcedTabIndex" property
    *  - B) or an Object with "id" and "forcedTabIndex" properties which represents a part of the root component's shadow DOM.
    *    The "id" must be a valid ID within the shadow root of the component ItemNavigation operates on.
    *    This object must not be a DOM object because, as said, ItemNavigation will not set "tabindex" on it. It must be a representation of a DOM object only
    *    and the developer has the responsibility to update the "tabindex" in the component's DOM.
    *  - C) a combination of the above
    *
    * Whenever the user navigates with the keyboard, ItemNavigation will modify the "forcedTabIndex" properties of the items.
    * It is the items' responsibilities to re-render themselves and apply the correct value of "tabindex" (i.e. to map the "forcedTabIndex" ItemNavigation set to them to the "tabindex" property).
    * If the items of the ItemNavigation are UI5Elements themselves, this can happen naturally since they will be invalidated by their "forcedTabIndex" property.
    * If the items are Objects with "id" and "forcedTabIndex" however, it is the developer's responsibility to apply these and the easiest way is to have the root component invalidated by ItemNavigation.
    * To do so, set the "affectedPropertiesNames" constructor property to point to one or more of the root component's properties that need refreshing when "forcedTabIndex" is changed deeply.
    *
    * 2) Call the "setCurrentItem" method of ItemNavigation whenever you want to change the current item.
    * This is most commonly required if the user for example clicks on an item and thus selects it directly.
    * Pass as the only argument to "setCurrentItem" the item that becomes current (must be one of the items, returned by "getItemsCallback").
    *
    * @class
    * @public
    */
  @JSImport("@ui5/webcomponents-base/dist/delegate/ItemNavigation.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ItemNavigation {
    /**
      *
      * @param rootWebComponent the component to operate on (component that slots or contains within its shadow root the items the user navigates among)
      * @param {ItemNavigationOptions} options Object with configuration options:
      *  - currentIndex: the index of the item that will be initially selected (from which navigation will begin)
      *  - navigationMode (Auto|Horizontal|Vertical): whether the items are displayed horizontally (Horizontal), vertically (Vertical) or as a matrix (Auto) meaning the user can navigate in both directions (up/down and left/right)
      *  - rowSize: tells how many items per row there are when the items are not rendered as a flat list but rather as a matrix. Relevant for navigationMode=Auto
      * 	- skipItemsSize: tells how many items upon PAGE_UP and PAGE_DOWN should be skipped to applying the focus on the next item
      *  - behavior (Static|Cycling): tells what to do when trying to navigate beyond the first and last items
      *    Static means that nothing happens if the user tries to navigate beyond the first/last item.
      *    Cycling means that when the user navigates beyond the last item they go to the first and vice versa.
      *  - getItemsCallback: function that, when called, returns an array with all items the user can navigate among
      *  - affectedPropertiesNames: a list of metadata properties on the root component which, upon user navigation, will be reassigned by address thus causing the root component to invalidate
      */
    def this(
      rootWebComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default,
      options: ItemNavigationOptions
    ) = this()
    
    /* CompleteClass */
    var _affectedPropertiesNames: js.Array[String] = js.native
    
    /* CompleteClass */
    override def _applyTabIndex(): Unit = js.native
    
    /* CompleteClass */
    var _behavior: ItemNavigationBehavior = js.native
    
    /* CompleteClass */
    override def _canNavigate(): js.UndefOr[Boolean] = js.native
    
    /* CompleteClass */
    var _currentIndex: Double = js.native
    
    /* CompleteClass */
    override def _focusCurrentItem(): Unit = js.native
    
    /* CompleteClass */
    override def _getCurrentItem(): js.UndefOr[HTMLElement] = js.native
    
    /* CompleteClass */
    override def _getItems(): js.Array[ITabbable] = js.native
    
    /* CompleteClass */
    override def _handleDown(): Unit = js.native
    
    /* CompleteClass */
    override def _handleEnd(): Unit = js.native
    
    /* CompleteClass */
    override def _handleHome(): Unit = js.native
    
    /* CompleteClass */
    override def _handleLeft(): Unit = js.native
    
    /* CompleteClass */
    override def _handlePageDown(): Unit = js.native
    
    /**
      * Handles PAGE_DOWN in a flat list-like structure, both vertically and horizontally.
      */
    /* CompleteClass */
    override def _handlePageDownFlat(): Unit = js.native
    
    /* CompleteClass */
    override def _handlePageUp(): Unit = js.native
    
    /**
      * Handles PAGE_UP in a flat list-like structure, both vertically and horizontally.
      */
    /* CompleteClass */
    override def _handlePageUpFlat(): Unit = js.native
    
    /* CompleteClass */
    override def _handleRight(): Unit = js.native
    
    /* CompleteClass */
    override def _handleUp(): Unit = js.native
    
    /* CompleteClass */
    override def _init(): Unit = js.native
    
    /* CompleteClass */
    override def _initBound(): Unit = js.native
    
    /* CompleteClass */
    var _navigationMode: NavigationMode = js.native
    
    /* CompleteClass */
    override def _onkeydown(event: KeyboardEvent): Unit = js.native
    
    /* CompleteClass */
    var _rowSize: Double = js.native
    
    /* CompleteClass */
    var _skipItemsSize: Double | Null = js.native
    
    /* CompleteClass */
    var rootWebComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default = js.native
    
    /**
      * Call this method to set a new "current" (selected) item in the item navigation
      * Note: the item passed to this function must be one of the items, returned by the getItemsCallback function
      *
      * @public
      * @param current the new selected item
      */
    /* CompleteClass */
    override def setCurrentItem(current: ITabbable): Unit = js.native
    
    /**
      * Call this method to dynamically change the row size
      *
      * @public
      * @param newRowSize
      */
    /* CompleteClass */
    override def setRowSize(newRowSize: Double): Unit = js.native
  }
  
  trait ITabbable extends StObject {
    
    var forcedTabIndex: js.UndefOr[String] = js.undefined
    
    var id: String
  }
  object ITabbable {
    
    inline def apply(id: String): ITabbable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITabbable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITabbable] (val x: Self) extends AnyVal {
      
      inline def setForcedTabIndex(value: String): Self = StObject.set(x, "forcedTabIndex", value.asInstanceOf[js.Any])
      
      inline def setForcedTabIndexUndefined: Self = StObject.set(x, "forcedTabIndex", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The ItemNavigation class manages the calculations to determine the correct "tabindex" for a group of related items inside a root component.
    * Important: ItemNavigation only does the calculations and does not change "tabindex" directly, this is a responsibility of the developer.
    *
    * The keys that trigger ItemNavigation are:
    *  - Up/down
    *  - Left/right
    *  - Home/End
    *
    * Usage:
    * 1) Use the "getItemsCallback" constructor property to pass a callback to ItemNavigation, which, whenever called, will return the list of items to navigate among.
    *
    * Each item passed to ItemNavigation via "getItemsCallback" must be:
    *  - A) either a UI5Element with a "forcedTabIndex" property
    *  - B) or an Object with "id" and "forcedTabIndex" properties which represents a part of the root component's shadow DOM.
    *    The "id" must be a valid ID within the shadow root of the component ItemNavigation operates on.
    *    This object must not be a DOM object because, as said, ItemNavigation will not set "tabindex" on it. It must be a representation of a DOM object only
    *    and the developer has the responsibility to update the "tabindex" in the component's DOM.
    *  - C) a combination of the above
    *
    * Whenever the user navigates with the keyboard, ItemNavigation will modify the "forcedTabIndex" properties of the items.
    * It is the items' responsibilities to re-render themselves and apply the correct value of "tabindex" (i.e. to map the "forcedTabIndex" ItemNavigation set to them to the "tabindex" property).
    * If the items of the ItemNavigation are UI5Elements themselves, this can happen naturally since they will be invalidated by their "forcedTabIndex" property.
    * If the items are Objects with "id" and "forcedTabIndex" however, it is the developer's responsibility to apply these and the easiest way is to have the root component invalidated by ItemNavigation.
    * To do so, set the "affectedPropertiesNames" constructor property to point to one or more of the root component's properties that need refreshing when "forcedTabIndex" is changed deeply.
    *
    * 2) Call the "setCurrentItem" method of ItemNavigation whenever you want to change the current item.
    * This is most commonly required if the user for example clicks on an item and thus selects it directly.
    * Pass as the only argument to "setCurrentItem" the item that becomes current (must be one of the items, returned by "getItemsCallback").
    *
    * @class
    * @public
    */
  trait ItemNavigation extends StObject {
    
    var _affectedPropertiesNames: js.Array[String]
    
    def _applyTabIndex(): Unit
    
    var _behavior: ItemNavigationBehavior
    
    def _canNavigate(): js.UndefOr[Boolean]
    
    var _currentIndex: Double
    
    def _focusCurrentItem(): Unit
    
    def _getCurrentItem(): js.UndefOr[HTMLElement]
    
    def _getItems(): js.Array[ITabbable]
    
    def _handleDown(): Unit
    
    def _handleEnd(): Unit
    
    def _handleHome(): Unit
    
    def _handleLeft(): Unit
    
    def _handlePageDown(): Unit
    
    /**
      * Handles PAGE_DOWN in a flat list-like structure, both vertically and horizontally.
      */
    def _handlePageDownFlat(): Unit
    
    def _handlePageUp(): Unit
    
    /**
      * Handles PAGE_UP in a flat list-like structure, both vertically and horizontally.
      */
    def _handlePageUpFlat(): Unit
    
    def _handleRight(): Unit
    
    def _handleUp(): Unit
    
    def _init(): Unit
    
    def _initBound(): Unit
    
    var _navigationMode: NavigationMode
    
    def _onkeydown(event: KeyboardEvent): Unit
    
    var _rowSize: Double
    
    var _skipItemsSize: Double | Null
    
    var rootWebComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    
    /**
      * Call this method to set a new "current" (selected) item in the item navigation
      * Note: the item passed to this function must be one of the items, returned by the getItemsCallback function
      *
      * @public
      * @param current the new selected item
      */
    def setCurrentItem(current: ITabbable): Unit
    
    /**
      * Call this method to dynamically change the row size
      *
      * @public
      * @param newRowSize
      */
    def setRowSize(newRowSize: Double): Unit
  }
  object ItemNavigation {
    
    inline def apply(
      _affectedPropertiesNames: js.Array[String],
      _applyTabIndex: () => Unit,
      _behavior: ItemNavigationBehavior,
      _canNavigate: () => js.UndefOr[Boolean],
      _currentIndex: Double,
      _focusCurrentItem: () => Unit,
      _getCurrentItem: () => js.UndefOr[HTMLElement],
      _getItems: () => js.Array[ITabbable],
      _handleDown: () => Unit,
      _handleEnd: () => Unit,
      _handleHome: () => Unit,
      _handleLeft: () => Unit,
      _handlePageDown: () => Unit,
      _handlePageDownFlat: () => Unit,
      _handlePageUp: () => Unit,
      _handlePageUpFlat: () => Unit,
      _handleRight: () => Unit,
      _handleUp: () => Unit,
      _init: () => Unit,
      _initBound: () => Unit,
      _navigationMode: NavigationMode,
      _onkeydown: KeyboardEvent => Unit,
      _rowSize: Double,
      rootWebComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default,
      setCurrentItem: ITabbable => Unit,
      setRowSize: Double => Unit
    ): ItemNavigation = {
      val __obj = js.Dynamic.literal(_affectedPropertiesNames = _affectedPropertiesNames.asInstanceOf[js.Any], _applyTabIndex = js.Any.fromFunction0(_applyTabIndex), _behavior = _behavior.asInstanceOf[js.Any], _canNavigate = js.Any.fromFunction0(_canNavigate), _currentIndex = _currentIndex.asInstanceOf[js.Any], _focusCurrentItem = js.Any.fromFunction0(_focusCurrentItem), _getCurrentItem = js.Any.fromFunction0(_getCurrentItem), _getItems = js.Any.fromFunction0(_getItems), _handleDown = js.Any.fromFunction0(_handleDown), _handleEnd = js.Any.fromFunction0(_handleEnd), _handleHome = js.Any.fromFunction0(_handleHome), _handleLeft = js.Any.fromFunction0(_handleLeft), _handlePageDown = js.Any.fromFunction0(_handlePageDown), _handlePageDownFlat = js.Any.fromFunction0(_handlePageDownFlat), _handlePageUp = js.Any.fromFunction0(_handlePageUp), _handlePageUpFlat = js.Any.fromFunction0(_handlePageUpFlat), _handleRight = js.Any.fromFunction0(_handleRight), _handleUp = js.Any.fromFunction0(_handleUp), _init = js.Any.fromFunction0(_init), _initBound = js.Any.fromFunction0(_initBound), _navigationMode = _navigationMode.asInstanceOf[js.Any], _onkeydown = js.Any.fromFunction1(_onkeydown), _rowSize = _rowSize.asInstanceOf[js.Any], rootWebComponent = rootWebComponent.asInstanceOf[js.Any], setCurrentItem = js.Any.fromFunction1(setCurrentItem), setRowSize = js.Any.fromFunction1(setRowSize), _skipItemsSize = null)
      __obj.asInstanceOf[ItemNavigation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemNavigation] (val x: Self) extends AnyVal {
      
      inline def setRootWebComponent(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default): Self = StObject.set(x, "rootWebComponent", value.asInstanceOf[js.Any])
      
      inline def setSetCurrentItem(value: ITabbable => Unit): Self = StObject.set(x, "setCurrentItem", js.Any.fromFunction1(value))
      
      inline def setSetRowSize(value: Double => Unit): Self = StObject.set(x, "setRowSize", js.Any.fromFunction1(value))
      
      inline def set_affectedPropertiesNames(value: js.Array[String]): Self = StObject.set(x, "_affectedPropertiesNames", value.asInstanceOf[js.Any])
      
      inline def set_affectedPropertiesNamesVarargs(value: String*): Self = StObject.set(x, "_affectedPropertiesNames", js.Array(value*))
      
      inline def set_applyTabIndex(value: () => Unit): Self = StObject.set(x, "_applyTabIndex", js.Any.fromFunction0(value))
      
      inline def set_behavior(value: ItemNavigationBehavior): Self = StObject.set(x, "_behavior", value.asInstanceOf[js.Any])
      
      inline def set_canNavigate(value: () => js.UndefOr[Boolean]): Self = StObject.set(x, "_canNavigate", js.Any.fromFunction0(value))
      
      inline def set_currentIndex(value: Double): Self = StObject.set(x, "_currentIndex", value.asInstanceOf[js.Any])
      
      inline def set_focusCurrentItem(value: () => Unit): Self = StObject.set(x, "_focusCurrentItem", js.Any.fromFunction0(value))
      
      inline def set_getCurrentItem(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "_getCurrentItem", js.Any.fromFunction0(value))
      
      inline def set_getItems(value: () => js.Array[ITabbable]): Self = StObject.set(x, "_getItems", js.Any.fromFunction0(value))
      
      inline def set_handleDown(value: () => Unit): Self = StObject.set(x, "_handleDown", js.Any.fromFunction0(value))
      
      inline def set_handleEnd(value: () => Unit): Self = StObject.set(x, "_handleEnd", js.Any.fromFunction0(value))
      
      inline def set_handleHome(value: () => Unit): Self = StObject.set(x, "_handleHome", js.Any.fromFunction0(value))
      
      inline def set_handleLeft(value: () => Unit): Self = StObject.set(x, "_handleLeft", js.Any.fromFunction0(value))
      
      inline def set_handlePageDown(value: () => Unit): Self = StObject.set(x, "_handlePageDown", js.Any.fromFunction0(value))
      
      inline def set_handlePageDownFlat(value: () => Unit): Self = StObject.set(x, "_handlePageDownFlat", js.Any.fromFunction0(value))
      
      inline def set_handlePageUp(value: () => Unit): Self = StObject.set(x, "_handlePageUp", js.Any.fromFunction0(value))
      
      inline def set_handlePageUpFlat(value: () => Unit): Self = StObject.set(x, "_handlePageUpFlat", js.Any.fromFunction0(value))
      
      inline def set_handleRight(value: () => Unit): Self = StObject.set(x, "_handleRight", js.Any.fromFunction0(value))
      
      inline def set_handleUp(value: () => Unit): Self = StObject.set(x, "_handleUp", js.Any.fromFunction0(value))
      
      inline def set_init(value: () => Unit): Self = StObject.set(x, "_init", js.Any.fromFunction0(value))
      
      inline def set_initBound(value: () => Unit): Self = StObject.set(x, "_initBound", js.Any.fromFunction0(value))
      
      inline def set_navigationMode(value: NavigationMode): Self = StObject.set(x, "_navigationMode", value.asInstanceOf[js.Any])
      
      inline def set_onkeydown(value: KeyboardEvent => Unit): Self = StObject.set(x, "_onkeydown", js.Any.fromFunction1(value))
      
      inline def set_rowSize(value: Double): Self = StObject.set(x, "_rowSize", value.asInstanceOf[js.Any])
      
      inline def set_skipItemsSize(value: Double): Self = StObject.set(x, "_skipItemsSize", value.asInstanceOf[js.Any])
      
      inline def set_skipItemsSizeNull: Self = StObject.set(x, "_skipItemsSize", null)
    }
  }
  
  trait ItemNavigationOptions extends StObject {
    
    var affectedPropertiesNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var behavior: js.UndefOr[ItemNavigationBehavior] = js.undefined
    
    var currentIndex: js.UndefOr[Double] = js.undefined
    
    def getItemsCallback(): js.Array[ITabbable]
    
    var navigationMode: js.UndefOr[NavigationMode] = js.undefined
    
    var rowSize: js.UndefOr[Double] = js.undefined
    
    var skipItemsSize: js.UndefOr[Double] = js.undefined
  }
  object ItemNavigationOptions {
    
    inline def apply(getItemsCallback: () => js.Array[ITabbable]): ItemNavigationOptions = {
      val __obj = js.Dynamic.literal(getItemsCallback = js.Any.fromFunction0(getItemsCallback))
      __obj.asInstanceOf[ItemNavigationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemNavigationOptions] (val x: Self) extends AnyVal {
      
      inline def setAffectedPropertiesNames(value: js.Array[String]): Self = StObject.set(x, "affectedPropertiesNames", value.asInstanceOf[js.Any])
      
      inline def setAffectedPropertiesNamesUndefined: Self = StObject.set(x, "affectedPropertiesNames", js.undefined)
      
      inline def setAffectedPropertiesNamesVarargs(value: String*): Self = StObject.set(x, "affectedPropertiesNames", js.Array(value*))
      
      inline def setBehavior(value: ItemNavigationBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
      
      inline def setCurrentIndexUndefined: Self = StObject.set(x, "currentIndex", js.undefined)
      
      inline def setGetItemsCallback(value: () => js.Array[ITabbable]): Self = StObject.set(x, "getItemsCallback", js.Any.fromFunction0(value))
      
      inline def setNavigationMode(value: NavigationMode): Self = StObject.set(x, "navigationMode", value.asInstanceOf[js.Any])
      
      inline def setNavigationModeUndefined: Self = StObject.set(x, "navigationMode", js.undefined)
      
      inline def setRowSize(value: Double): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      inline def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
      
      inline def setSkipItemsSize(value: Double): Self = StObject.set(x, "skipItemsSize", value.asInstanceOf[js.Any])
      
      inline def setSkipItemsSizeUndefined: Self = StObject.set(x, "skipItemsSize", js.undefined)
    }
  }
}
