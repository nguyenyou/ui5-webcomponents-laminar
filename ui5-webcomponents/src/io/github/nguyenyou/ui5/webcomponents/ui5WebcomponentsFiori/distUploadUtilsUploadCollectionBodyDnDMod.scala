package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionDnDModeMod.UploadCollectionDnDOverlayMode
import org.scalajs.dom.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUploadUtilsUploadCollectionBodyDnDMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/upload-utils/UploadCollectionBodyDnD.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachBodyDnDHandler(handler: DnDEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBodyDnDHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachBodyDnDHandler(handler: DnDEventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachBodyDnDHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def draggingFiles(event: DragEvent): Boolean | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("draggingFiles")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean | Null]
  
  type DnDEventListener = js.Function1[/* param */ DnDEventListenerParam, Unit]
  
  trait DnDEventListenerParam extends StObject {
    
    var mode: UploadCollectionDnDOverlayMode
  }
  object DnDEventListenerParam {
    
    inline def apply(mode: UploadCollectionDnDOverlayMode): DnDEventListenerParam = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnDEventListenerParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnDEventListenerParam] (val x: Self) extends AnyVal {
      
      inline def setMode(value: UploadCollectionDnDOverlayMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
