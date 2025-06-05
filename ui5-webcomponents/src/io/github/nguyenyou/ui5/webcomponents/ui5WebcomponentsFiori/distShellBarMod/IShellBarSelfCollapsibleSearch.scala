package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellBarSelfCollapsibleSearch extends StObject {
  
  var collapsed: Boolean
  
  var open: Boolean
}
object IShellBarSelfCollapsibleSearch {
  
  inline def apply(collapsed: Boolean, open: Boolean): IShellBarSelfCollapsibleSearch = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellBarSelfCollapsibleSearch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellBarSelfCollapsibleSearch] (val x: Self) extends AnyVal {
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
