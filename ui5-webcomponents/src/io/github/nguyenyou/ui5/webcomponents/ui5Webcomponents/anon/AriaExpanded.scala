package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaExpanded extends StObject {
  
  var ariaChecked: js.UndefOr[Boolean] = js.undefined
  
  var ariaExpanded: js.UndefOr[Boolean] = js.undefined
  
  var ariaHaspopup: js.UndefOr[/* template literal string: ${AriaHasPopup} */ String] = js.undefined
  
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  
  var ariaKeyShortcuts: js.UndefOr[String] = js.undefined
  
  var ariaLabel: String
  
  var ariaLabelRadioButton: String
  
  var ariaLevel: js.UndefOr[Double] = js.undefined
  
  var ariaOwns: js.UndefOr[String] = js.undefined
  
  var ariaSelected: js.UndefOr[Boolean] = js.undefined
  
  var ariaSelectedText: js.UndefOr[String] = js.undefined
  
  var listItemAriaLabel: js.UndefOr[String] = js.undefined
  
  var posinset: js.UndefOr[Double] = js.undefined
  
  var role: AriaRole
  
  var setsize: js.UndefOr[Double] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object AriaExpanded {
  
  inline def apply(ariaLabel: String, ariaLabelRadioButton: String, role: AriaRole): AriaExpanded = {
    val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelRadioButton = ariaLabelRadioButton.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaExpanded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaExpanded] (val x: Self) extends AnyVal {
    
    inline def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
    
    inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
    
    inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
    
    inline def setAriaHaspopup(value: /* template literal string: ${AriaHasPopup} */ String): Self = StObject.set(x, "ariaHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAriaHaspopupUndefined: Self = StObject.set(x, "ariaHaspopup", js.undefined)
    
    inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
    
    inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
    
    inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
    
    inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelRadioButton(value: String): Self = StObject.set(x, "ariaLabelRadioButton", value.asInstanceOf[js.Any])
    
    inline def setAriaLevel(value: Double): Self = StObject.set(x, "ariaLevel", value.asInstanceOf[js.Any])
    
    inline def setAriaLevelUndefined: Self = StObject.set(x, "ariaLevel", js.undefined)
    
    inline def setAriaOwns(value: String): Self = StObject.set(x, "ariaOwns", value.asInstanceOf[js.Any])
    
    inline def setAriaOwnsUndefined: Self = StObject.set(x, "ariaOwns", js.undefined)
    
    inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectedText(value: String): Self = StObject.set(x, "ariaSelectedText", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectedTextUndefined: Self = StObject.set(x, "ariaSelectedText", js.undefined)
    
    inline def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
    
    inline def setListItemAriaLabel(value: String): Self = StObject.set(x, "listItemAriaLabel", value.asInstanceOf[js.Any])
    
    inline def setListItemAriaLabelUndefined: Self = StObject.set(x, "listItemAriaLabel", js.undefined)
    
    inline def setPosinset(value: Double): Self = StObject.set(x, "posinset", value.asInstanceOf[js.Any])
    
    inline def setPosinsetUndefined: Self = StObject.set(x, "posinset", js.undefined)
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSetsize(value: Double): Self = StObject.set(x, "setsize", value.asInstanceOf[js.Any])
    
    inline def setSetsizeUndefined: Self = StObject.set(x, "setsize", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
