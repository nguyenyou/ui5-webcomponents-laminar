package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.TokenizerSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.TokenizerTokenDeleteEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beforemorepopoveropen extends StObject {
  
  var `before-more-popover-open`: Unit
  
  var `selection-change`: TokenizerSelectionChangeEventDetail
  
  var `show-more-items-press`: Unit
  
  var `token-delete`: TokenizerTokenDeleteEventDetail
}
object Beforemorepopoveropen {
  
  inline def apply(
    `before-more-popover-open`: Unit,
    `selection-change`: TokenizerSelectionChangeEventDetail,
    `show-more-items-press`: Unit,
    `token-delete`: TokenizerTokenDeleteEventDetail
  ): Beforemorepopoveropen = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("before-more-popover-open")(`before-more-popover-open`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-more-items-press")(`show-more-items-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("token-delete")(`token-delete`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beforemorepopoveropen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beforemorepopoveropen] (val x: Self) extends AnyVal {
    
    inline def `setBefore-more-popover-open`(value: Unit): Self = StObject.set(x, "before-more-popover-open", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: TokenizerSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
    
    inline def `setShow-more-items-press`(value: Unit): Self = StObject.set(x, "show-more-items-press", value.asInstanceOf[js.Any])
    
    inline def `setToken-delete`(value: TokenizerTokenDeleteEventDetail): Self = StObject.set(x, "token-delete", value.asInstanceOf[js.Any])
  }
}
