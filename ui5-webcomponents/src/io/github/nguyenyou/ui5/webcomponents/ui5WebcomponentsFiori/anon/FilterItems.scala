package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFilterItemMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.VSDFilter
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.VSDFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterItems extends StObject {
  
  var filterItems: js.Array[default]
  
  var filters: VSDFilters
  
  var sortBy: String
  
  var sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default
  
  var sortDescending: Boolean
  
  var sortOrder: String
}
object FilterItems {
  
  inline def apply(
    filterItems: js.Array[default],
    filters: VSDFilters,
    sortBy: String,
    sortByItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default,
    sortDescending: Boolean,
    sortOrder: String
  ): FilterItems = {
    val __obj = js.Dynamic.literal(filterItems = filterItems.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], sortBy = sortBy.asInstanceOf[js.Any], sortByItem = sortByItem.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterItems] (val x: Self) extends AnyVal {
    
    inline def setFilterItems(value: js.Array[default]): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
    
    inline def setFilterItemsVarargs(value: default*): Self = StObject.set(x, "filterItems", js.Array(value*))
    
    inline def setFilters(value: VSDFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: VSDFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setSortBy(value: String): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByItem(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.default): Self = StObject.set(x, "sortByItem", value.asInstanceOf[js.Any])
    
    inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
  }
}
