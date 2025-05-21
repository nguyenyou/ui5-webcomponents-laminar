package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserMenuAccountMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/UserMenuAccount.js", JSImport.Default)
  @js.native
  open class default () extends UserMenuAccount
  
  @js.native
  trait UserMenuAccount
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _initials: String = js.native
    
    /**
      * Defines the avatar initials of the user.
      *
      * @default undefined
      * @public
      */
    var avatarInitials: js.UndefOr[String] = js.native
    
    /**
      * Defines the avatar image url of the user.
      *
      * @default ""
      * @public
      */
    var avatarSrc: js.UndefOr[String] = js.native
    
    /**
      * Defines description of the user.
      *
      * @default ""
      * @public
      */
    var description: String = js.native
    
    /**
      * Indicates whether a loading indicator should be shown.
      * @default false
      * @public
      * @since 2.9.0
      */
    var loading: Boolean = js.native
    
    /**
      * Defines if the user is selected.
      *
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines additional text of the user.
      *
      * @default ""
      * @public
      */
    var subtitleText: String = js.native
    
    /**
      * Defines the title text of the user.
      *
      * @default ""
      * @public
      */
    var titleText: String = js.native
  }
}
