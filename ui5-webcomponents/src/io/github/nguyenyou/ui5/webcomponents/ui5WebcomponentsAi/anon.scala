package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arrowbuttonclick extends StObject {
    
    var `arrow-button-click`: Unit
    
    var click: Unit
  }
  object Arrowbuttonclick {
    
    inline def apply(`arrow-button-click`: Unit, click: Unit): Arrowbuttonclick = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
      __obj.updateDynamic("arrow-button-click")(`arrow-button-click`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arrowbuttonclick]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arrowbuttonclick] (val x: Self) extends AnyVal {
      
      inline def `setArrow-button-click`(value: Unit): Self = StObject.set(x, "arrow-button-click", value.asInstanceOf[js.Any])
      
      inline def setClick(value: Unit): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    }
  }
  
  trait Change extends StObject {
    
    var change: Unit
    
    var input: Unit
    
    var submit: Unit
  }
  object Change {
    
    inline def apply(change: Unit, input: Unit, submit: Unit): Change = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Change]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Change] (val x: Self) extends AnyVal {
      
      inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setSubmit(value: Unit): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    }
  }
}
