package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUploadStateMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UploadState & String] = js.native
    
    /* "Complete" */ val Complete: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Complete & String = js.native
    
    /* "Error" */ val Error: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Error & String = js.native
    
    /* "Ready" */ val Ready: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Ready & String = js.native
    
    /* "Uploading" */ val Uploading: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState.Uploading & String = js.native
  }
  
  @js.native
  sealed trait UploadState extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/UploadState", "UploadState")
  @js.native
  object UploadState extends StObject {
    
    /**
      * The file has been uploaded successfully.
      * @public
      */
    @js.native
    sealed trait Complete
      extends StObject
         with UploadState
    
    /**
      * The file cannot be uploaded due to an error.
      * @public
      */
    @js.native
    sealed trait Error
      extends StObject
         with UploadState
    
    /**
      * The file is awaiting an explicit command to start being uploaded.
      * @public
      */
    @js.native
    sealed trait Ready
      extends StObject
         with UploadState
    
    /**
      * The file is currently being uploaded.
      * @public
      */
    @js.native
    sealed trait Uploading
      extends StObject
         with UploadState
  }
}
