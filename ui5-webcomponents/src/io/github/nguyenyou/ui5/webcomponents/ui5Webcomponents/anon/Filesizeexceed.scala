package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFileUploaderMod.FileUploaderChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFileUploaderMod.FileUploaderFileSizeExceedEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filesizeexceed extends StObject {
  
  var change: FileUploaderChangeEventDetail
  
  var `file-size-exceed`: FileUploaderFileSizeExceedEventDetail
}
object Filesizeexceed {
  
  inline def apply(change: FileUploaderChangeEventDetail, `file-size-exceed`: FileUploaderFileSizeExceedEventDetail): Filesizeexceed = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.updateDynamic("file-size-exceed")(`file-size-exceed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filesizeexceed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filesizeexceed] (val x: Self) extends AnyVal {
    
    inline def setChange(value: FileUploaderChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def `setFile-size-exceed`(value: FileUploaderFileSizeExceedEventDetail): Self = StObject.set(x, "file-size-exceed", value.asInstanceOf[js.Any])
  }
}
