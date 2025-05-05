package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsivePopover extends StObject {
  
  var popoverHeader: MaxwidthString
  
  var responsivePopover: Minwidth
  
  var responsivePopoverHeader: Display
}
object ResponsivePopover {
  
  inline def apply(popoverHeader: MaxwidthString, responsivePopover: Minwidth, responsivePopoverHeader: Display): ResponsivePopover = {
    val __obj = js.Dynamic.literal(popoverHeader = popoverHeader.asInstanceOf[js.Any], responsivePopover = responsivePopover.asInstanceOf[js.Any], responsivePopoverHeader = responsivePopoverHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsivePopover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsivePopover] (val x: Self) extends AnyVal {
    
    inline def setPopoverHeader(value: MaxwidthString): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
    
    inline def setResponsivePopover(value: Minwidth): Self = StObject.set(x, "responsivePopover", value.asInstanceOf[js.Any])
    
    inline def setResponsivePopoverHeader(value: Display): Self = StObject.set(x, "responsivePopoverHeader", value.asInstanceOf[js.Any])
  }
}
