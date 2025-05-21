package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Interactive
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowActionBaseMod {
  
  /**
    * Fired when a row action is clicked.
    *
    * @public
    * @since 2.9.0
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/TableRowActionBase.js", JSImport.Default)
  @js.native
  open class default () extends TableRowActionBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableRowActionBase.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableRowActionBase.js", "default._menu")
    @js.native
    def menu: Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableRowActionBase.js", "default._menuItems")
    @js.native
    def menuItems: Any = js.native
    
    inline def menuItems_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_menuItems")(x.asInstanceOf[js.Any])
    
    inline def menu_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_menu")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def showMenu(actions: js.Array[TableRowActionBase], opener: HTMLElement): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showMenu")(actions.asInstanceOf[js.Any], opener.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Fired when a row action is clicked.
    *
    * @public
    * @since 2.9.0
    */
  @js.native
  trait TableRowActionBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _fireClickEvent(): Unit = js.native
    
    def _icon: String = js.native
    
    def _isInteractive: Boolean = js.native
    
    @JSName("_onActionClick")
    def _onActionClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _text: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableRowActionBase: Click = js.native
    
    def getRenderInfo(): Interactive = js.native
    
    /**
      * Defines the visibility of the row action.
      *
      * **Note:** Invisible row actions still take up space, allowing to hide the action while maintaining its position.
      *
      * @default false
      * @public
      */
    var invisible: Boolean = js.native
    
    def isFixedAction(): Boolean = js.native
  }
}
