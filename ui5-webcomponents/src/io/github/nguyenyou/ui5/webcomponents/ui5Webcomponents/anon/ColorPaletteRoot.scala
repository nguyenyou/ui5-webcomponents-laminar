package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaletteRoot extends StObject {
  
  var colorPaletteRoot: Ui5cproot
}
object ColorPaletteRoot {
  
  inline def apply(colorPaletteRoot: Ui5cproot): ColorPaletteRoot = {
    val __obj = js.Dynamic.literal(colorPaletteRoot = colorPaletteRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorPaletteRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorPaletteRoot] (val x: Self) extends AnyVal {
    
    inline def setColorPaletteRoot(value: Ui5cproot): Self = StObject.set(x, "colorPaletteRoot", value.asInstanceOf[js.Any])
  }
}
