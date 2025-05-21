package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Itemdelete
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadUtilsUploadCollectionBodyDnDMod.DnDEventListener
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadUtilsUploadCollectionBodyDnDMod.DnDEventListenerParam
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUploadCollectionMod {
  
  /**
    * @class
    *
    * ### Overview
    * This component allows you to represent files before uploading them to a server, with the help of `ui5-upload-collection-item`.
    * It also allows you to show already uploaded files.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UploadCollection.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";` (for `ui5-upload-collection-item`)
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.7
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection.js", JSImport.Default)
  @js.native
  open class default () extends UploadCollection
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * This component allows you to represent files before uploading them to a server, with the help of `ui5-upload-collection-item`.
    * It also allows you to show already uploaded files.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UploadCollection.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";` (for `ui5-upload-collection-item`)
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.7
    */
  @js.native
  trait UploadCollection
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _bodyDnDHandler(param: DnDEventListenerParam): Unit = js.native
    @JSName("_bodyDnDHandler")
    var _bodyDnDHandler_Original: DnDEventListener = js.native
    
    def _dndOverlay: js.UndefOr[Element | Null] = js.native
    
    /**
      * Indicates what overlay to show when files are being dragged.
      * @default "None"
      * @private
      */
    var _dndOverlayMode: /* template literal string: ${UploadCollectionDnDOverlayMode} */ String = js.native
    
    def _dndOverlayText: String = js.native
    
    def _noDataDescription: String = js.native
    
    def _noDataText: String = js.native
    
    def _onItemDelete(e: CustomEvent): Unit = js.native
    
    def _onSelectionChange(e: CustomEvent): Unit = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def _roleDescription: String = js.native
    
    def _root: Element | Null = js.native
    
    def _showDndOverlay: Boolean = js.native
    
    def _showNoData: Boolean = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.16
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def bodyDnDHandler(e: DnDEventListenerParam): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_UploadCollection: Itemdelete = js.native
    
    /**
      * Defines the `ui5-upload-collection` header.
      *
      * **Note:** If `header` slot is provided,
      * the labelling of the `UploadCollection` is a responsibility of the application developer.
      * `accessibleName` should be used.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * By default there will be drag and drop overlay shown over the `ui5-upload-collection` when files
      * are dragged. If you don't intend to use drag and drop, set this property.
      *
      * **Note:** It is up to the application developer to add handler for `drop` event and handle it.
      * `ui5-upload-collection` only displays an overlay.
      * @default false
      * @public
      */
    var hideDragOverlay: Boolean = js.native
    
    /**
      * Defines the items of the `ui5-upload-collection`.
      *
      * **Note:** Use `ui5-upload-collection-item` for the intended design.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
      ] = js.native
    
    /**
      * Allows you to set your own text for the 'No data' description.
      * @default undefined
      * @public
      */
    var noDataDescription: js.UndefOr[String] = js.native
    
    /**
      * Allows you to set your own text for the 'No data' text.
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
    
    /**
      * Defines the selection mode of the `ui5-upload-collection`.
      *
      * @default "None"
      * @public
      */
    var selectionMode: /* template literal string: ${UploadCollectionSelectionMode} */ String = js.native
  }
  
  trait UploadCollectionItemDeleteEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
  }
  object UploadCollectionItemDeleteEventDetail {
    
    inline def apply(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
    ): UploadCollectionItemDeleteEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadCollectionItemDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollectionItemDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
      ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadCollectionSelectionChangeEventDetail extends StObject {
    
    var selectedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
      ]
  }
  object UploadCollectionSelectionChangeEventDetail {
    
    inline def apply(
      selectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
        ]
    ): UploadCollectionSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadCollectionSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadCollectionSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default
            ]
      ): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.default*
      ): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
}
