package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreDecodeHintTypeMod.DecodeHintType
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreReaderMod.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreMultiFormatReaderMod {
  
  @JSImport("@zxing/library/esm/core/MultiFormatReader", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MultiFormatReader
  
  @js.native
  trait MultiFormatReader
    extends StObject
       with Reader {
    
    /**
      * @throws NotFoundException
      */
    /* private */ var decodeInternal: Any = js.native
    
    /**
      * Decode an image using the state set up by calling setHints() previously. Continuous scan
      * clients will get a <b>large</b> speed increase by using this instead of decode().
      *
      * @param image The pixel data to decode
      * @return The contents of the image
      *
      * @throws NotFoundException Any errors which occurred
      */
    def decodeWithState(image: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreBinaryBitmapMod.default): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default = js.native
    
    /* private */ var hints: Any = js.native
    
    /* private */ var readers: Any = js.native
    
    /**
      * This method adds state to the MultiFormatReader. By setting the hints once, subsequent calls
      * to decodeWithState(image) can reuse the same set of readers without reallocating memory. This
      * is important for performance in continuous scan clients.
      *
      * @param hints The set of hints to use for subsequent calls to decode(image)
      */
    def setHints(): Unit = js.native
    def setHints(hints: Map[DecodeHintType, Any]): Unit = js.native
  }
}
