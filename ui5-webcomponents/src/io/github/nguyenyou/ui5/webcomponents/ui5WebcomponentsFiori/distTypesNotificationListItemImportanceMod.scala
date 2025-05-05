package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationListItemImportanceMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/NotificationListItemImportance", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationListItemImportance & String] = js.native
    
    /* "Important" */ val Important: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNotificationListItemImportanceMod.NotificationListItemImportance.Important & String = js.native
    
    /* "Standard" */ val Standard: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNotificationListItemImportanceMod.NotificationListItemImportance.Standard & String = js.native
  }
  
  @js.native
  sealed trait NotificationListItemImportance extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/NotificationListItemImportance", "NotificationListItemImportance")
  @js.native
  object NotificationListItemImportance extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait Important
      extends StObject
         with NotificationListItemImportance
    
    /**
      * @public
      */
    @js.native
    sealed trait Standard
      extends StObject
         with NotificationListItemImportance
  }
}
