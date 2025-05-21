package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNotificationListItemBaseMod {
  
  /**
    * @class
    *
    * The base class of the `NotificationListItem` and `NotificationListGroupItem`.
    * @constructor
    * @extends ListItemBase
    * @since 1.0.0-rc.8
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListItemBase.js", JSImport.Default)
  @js.native
  open class default () extends NotificationListItemBase
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/NotificationListItemBase.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/NotificationListItemBase.js", "default.i18nFioriBundle")
    @js.native
    def i18nFioriBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nFioriBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nFioriBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * The base class of the `NotificationListItem` and `NotificationListGroupItem`.
    * @constructor
    * @extends ListItemBase
    * @since 1.0.0-rc.8
    * @public
    */
  @js.native
  trait NotificationListItemBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    @JSName("eventDetails")
    var eventDetails_NotificationListItemBase: Focused = js.native
    
    def getHeaderDomRef(): js.UndefOr[HTMLElement] = js.native
    
    def hasTitleText: Boolean = js.native
    
    /**
      * Defines if a busy indicator would be displayed over the item.
      * @default false
      * @public
      * @since 1.0.0-rc.8
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      * @default 1000
      * @public
      */
    var loadingDelay: Double = js.native
    
    def loadingText: String = js.native
    
    /**
      * Defines if the `notification` is new or has been already read.
      *
      * **Note:** if set to `false` the `titleText` has bold font,
      * if set to true - it has a normal font.
      * @default false
      * @public
      */
    var read: Boolean = js.native
    
    /**
      * Defines the `titleText` of the item.
      * @default undefined
      * @public
      */
    var titleText: js.UndefOr[String] = js.native
  }
}
