package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`inline`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.both
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.list
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.none_
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AriaRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaAutoComplete extends StObject {
  
  var accessibleDescription: js.UndefOr[String] = js.undefined
  
  var ariaAutoComplete: js.UndefOr[list | none_ | `inline` | both] = js.undefined
  
  var ariaControls: js.UndefOr[String] = js.undefined
  
  var ariaDescribedBy: String
  
  var ariaDescription: String
  
  var ariaExpanded: js.UndefOr[Boolean] = js.undefined
  
  var ariaHasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  
  var ariaInvalid: js.UndefOr[Boolean] = js.undefined
  
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  var ariaRoledescription: String
  
  var role: js.UndefOr[AriaRole] = js.undefined
}
object AriaAutoComplete {
  
  inline def apply(ariaDescribedBy: String, ariaDescription: String, ariaRoledescription: String): AriaAutoComplete = {
    val __obj = js.Dynamic.literal(ariaDescribedBy = ariaDescribedBy.asInstanceOf[js.Any], ariaDescription = ariaDescription.asInstanceOf[js.Any], ariaRoledescription = ariaRoledescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaAutoComplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaAutoComplete] (val x: Self) extends AnyVal {
    
    inline def setAccessibleDescription(value: String): Self = StObject.set(x, "accessibleDescription", value.asInstanceOf[js.Any])
    
    inline def setAccessibleDescriptionUndefined: Self = StObject.set(x, "accessibleDescription", js.undefined)
    
    inline def setAriaAutoComplete(value: list | none_ | `inline` | both): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
    
    inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
    
    inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
    
    inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
    
    inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
    
    inline def setAriaHasPopup(value: AriaHasPopup): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
    
    inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
    
    inline def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
    
    inline def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
