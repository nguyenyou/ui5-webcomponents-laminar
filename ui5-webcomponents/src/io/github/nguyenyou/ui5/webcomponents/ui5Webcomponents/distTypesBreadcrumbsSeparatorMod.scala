package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsSeparatorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsSeparator", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BreadcrumbsSeparator & String] = js.native
    
    /* "BackSlash" */ val BackSlash: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.BackSlash & String = js.native
    
    /* "DoubleBackSlash" */ val DoubleBackSlash: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.DoubleBackSlash & String = js.native
    
    /* "DoubleGreaterThan" */ val DoubleGreaterThan: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.DoubleGreaterThan & String = js.native
    
    /* "DoubleSlash" */ val DoubleSlash: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.DoubleSlash & String = js.native
    
    /* "GreaterThan" */ val GreaterThan: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.GreaterThan & String = js.native
    
    /* "Slash" */ val Slash: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsSeparatorMod.BreadcrumbsSeparator.Slash & String = js.native
  }
  
  @js.native
  sealed trait BreadcrumbsSeparator extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsSeparator", "BreadcrumbsSeparator")
  @js.native
  object BreadcrumbsSeparator extends StObject {
    
    /**
      * The separator appears as "\".
      * @public
      */
    @js.native
    sealed trait BackSlash
      extends StObject
         with BreadcrumbsSeparator
    
    /**
      * The separator appears as "\\".
      * @public
      */
    @js.native
    sealed trait DoubleBackSlash
      extends StObject
         with BreadcrumbsSeparator
    
    /**
      * The separator appears as ">>".
      * @public
      */
    @js.native
    sealed trait DoubleGreaterThan
      extends StObject
         with BreadcrumbsSeparator
    
    /**
      * The separator appears as "//" .
      * @public
      */
    @js.native
    sealed trait DoubleSlash
      extends StObject
         with BreadcrumbsSeparator
    
    /**
      * The separator appears as ">".
      * @public
      */
    @js.native
    sealed trait GreaterThan
      extends StObject
         with BreadcrumbsSeparator
    
    /**
      * The separator appears as "/".
      * @public
      */
    @js.native
    sealed trait Slash
      extends StObject
         with BreadcrumbsSeparator
  }
}
