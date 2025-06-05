package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.Capitalize
import io.github.nguyenyou.ui5.webcomponents.std.DOMHighResTimeStamp
import io.github.nguyenyou.ui5.webcomponents.std.ElementInternals
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.HTMLSlotElement
import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.std.Omit
import io.github.nguyenyou.ui5.webcomponents.std.Partial
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.Set
import io.github.nguyenyou.ui5.webcomponents.std.WeakMap
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Bubbles
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Key
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.PickAllHTMLAttributesHTML
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.PromisevoiddeferredResolv
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distJsxRuntimeMod.JSX_.DOMAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AccessibilityInfo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ClassMap
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.PropertyValue
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Slot
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.State
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseBooleans.`false`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.accessKey
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.accessKeyLabel
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.accesskey_
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocapitalize
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dir
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.draggable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inert
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.innerText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.lang
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.offsetHeight
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.offsetLeft
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.offsetParent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.offsetTop
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.offsetWidth
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.onChange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.onClose
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.onInput
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.onSelect
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.onToggle
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.outerText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.popover
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.property
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.spellcheck
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tabindex_
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.title
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.translate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.writingSuggestions
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalajs.dom.ValidityState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUi5elementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    * Base class for all UI5 Web Components
    *
    * @extends HTMLElement
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with UI5Element {
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAtomic) */
    /* standard dom */
    /* CompleteClass */
    var ariaAtomic: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaAutoComplete) */
    /* standard dom */
    /* CompleteClass */
    var ariaAutoComplete: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBrailleLabel) */
    /* standard dom */
    /* CompleteClass */
    var ariaBrailleLabel: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBrailleRoleDescription) */
    /* standard dom */
    /* CompleteClass */
    var ariaBrailleRoleDescription: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaBusy) */
    /* standard dom */
    /* CompleteClass */
    var ariaBusy: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaChecked) */
    /* standard dom */
    /* CompleteClass */
    var ariaChecked: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColCount) */
    /* standard dom */
    /* CompleteClass */
    var ariaColCount: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndex) */
    /* standard dom */
    /* CompleteClass */
    var ariaColIndex: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColIndexText) */
    /* standard dom */
    /* CompleteClass */
    var ariaColIndexText: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaColSpan) */
    /* standard dom */
    /* CompleteClass */
    var ariaColSpan: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaCurrent) */
    /* standard dom */
    /* CompleteClass */
    var ariaCurrent: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDescription) */
    /* standard dom */
    /* CompleteClass */
    var ariaDescription: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaDisabled) */
    /* standard dom */
    /* CompleteClass */
    var ariaDisabled: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaExpanded) */
    /* standard dom */
    /* CompleteClass */
    var ariaExpanded: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHasPopup) */
    /* standard dom */
    /* CompleteClass */
    var ariaHasPopup: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaHidden) */
    /* standard dom */
    /* CompleteClass */
    var ariaHidden: String | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var ariaInvalid: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaKeyShortcuts) */
    /* standard dom */
    /* CompleteClass */
    var ariaKeyShortcuts: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLabel) */
    /* standard dom */
    /* CompleteClass */
    var ariaLabel: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLevel) */
    /* standard dom */
    /* CompleteClass */
    var ariaLevel: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaLive) */
    /* standard dom */
    /* CompleteClass */
    var ariaLive: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaModal) */
    /* standard dom */
    /* CompleteClass */
    var ariaModal: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiLine) */
    /* standard dom */
    /* CompleteClass */
    var ariaMultiLine: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaMultiSelectable) */
    /* standard dom */
    /* CompleteClass */
    var ariaMultiSelectable: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaOrientation) */
    /* standard dom */
    /* CompleteClass */
    var ariaOrientation: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPlaceholder) */
    /* standard dom */
    /* CompleteClass */
    var ariaPlaceholder: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPosInSet) */
    /* standard dom */
    /* CompleteClass */
    var ariaPosInSet: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaPressed) */
    /* standard dom */
    /* CompleteClass */
    var ariaPressed: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaReadOnly) */
    /* standard dom */
    /* CompleteClass */
    var ariaReadOnly: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRelevant) */
    /* standard dom */
    /* CompleteClass */
    var ariaRelevant: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRequired) */
    /* standard dom */
    /* CompleteClass */
    var ariaRequired: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRoleDescription) */
    /* standard dom */
    /* CompleteClass */
    var ariaRoleDescription: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowCount) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowCount: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndex) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndex: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowIndexText) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowIndexText: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaRowSpan) */
    /* standard dom */
    /* CompleteClass */
    var ariaRowSpan: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSelected) */
    /* standard dom */
    /* CompleteClass */
    var ariaSelected: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSetSize) */
    /* standard dom */
    /* CompleteClass */
    var ariaSetSize: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaSort) */
    /* standard dom */
    /* CompleteClass */
    var ariaSort: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMax) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueMax: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueMin) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueMin: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueNow) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueNow: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaValueText) */
    /* standard dom */
    /* CompleteClass */
    var ariaValueText: String | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot) */
    /* standard dom */
    /* CompleteClass */
    override val assignedSlot: HTMLSlotElement | Null = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable) */
    /* standard dom */
    /* CompleteClass */
    var contentEditable: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint) */
    /* standard dom */
    /* CompleteClass */
    var enterKeyHint: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode) */
    /* standard dom */
    /* CompleteClass */
    var inputMode: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable) */
    /* standard dom */
    /* CompleteClass */
    override val isContentEditable: Boolean = js.native
    
    /**
      * Returns the first following sibling that is an element, and null otherwise.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/nextElementSibling)
      */
    /* standard dom */
    /* CompleteClass */
    override val nextElementSibling: Element | Null = js.native
    
    /**
      * Returns the first preceding sibling that is an element, and null otherwise.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/previousElementSibling)
      */
    /* standard dom */
    /* CompleteClass */
    override val previousElementSibling: Element | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    var role: String | Null = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default._metadata")
    @js.native
    def _metadata: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default = js.native
    inline def _metadata_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_metadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.asyncFinished")
    @js.native
    def asyncFinished: Boolean = js.native
    inline def asyncFinished_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asyncFinished")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def cacheUniqueDependencies(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheUniqueDependencies")().asInstanceOf[Unit]
    
    /**
      * Registers a UI5 Web Component in the browser window object
      * @public
      */
    /* static member */
    inline def define(): TypeofUI5Element & Instantiable0[UI5Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[TypeofUI5Element & Instantiable0[UI5Element]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.definePromise")
    @js.native
    def definePromise: js.UndefOr[js.Promise[Unit]] = js.native
    inline def definePromise_=(x: js.UndefOr[js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definePromise")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def fetchCLDR(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchCLDR")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    inline def fetchI18nBundles(): js.Promise[
        js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchI18nBundles")().asInstanceOf[js.Promise[
        js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
        ]
      ]]
    
    /**
      * @private
      */
    /* static member */
    inline def generateAccessors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_generateAccessors")().asInstanceOf[Unit]
    
    /**
      * Returns an instance of UI5ElementMetadata.js representing this UI5 Web Component's full metadata (its and its parents')
      * Note: not to be confused with the "get metadata()" method, which returns an object for this class's metadata only
      * @public
      */
    /* static member */
    inline def getMetadata(): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default]
    
    /**
      * Returns a list of the unique dependencies for this UI5 Web Component
      *
      * @public
      */
    /* static member */
    inline def getUniqueDependencies(): js.Array[TypeofUI5Element & Instantiable0[UI5Element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueDependencies")().asInstanceOf[js.Array[TypeofUI5Element & Instantiable0[UI5Element]]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.i18nBundleStorage")
    @js.native
    def i18nBundleStorage: Record[
        String, 
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
      ] = js.native
    inline def i18nBundleStorage_=(
      x: Record[
          String, 
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundleStorage")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the metadata object for this UI5 Web Component Class
      * @protected
      */
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.metadata")
    @js.native
    def metadata: Metadata = js.native
    inline def metadata_=(x: Metadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
    
    /**
      * @private
      */
    /* static member */
    inline def needsShadowDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_needsShadowDOM")().asInstanceOf[Boolean]
    
    /**
      * Hook that will be called upon custom element definition
      *
      * @protected
      * @deprecated use the "i18n" decorator for fetching message bundles and the "cldr" option in the "customElements" decorator for fetching CLDR
      */
    /* static member */
    inline def onDefine(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("onDefine")().asInstanceOf[js.Promise[Unit]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.renderer")
    @js.native
    def renderer: Renderer = js.native
    inline def renderer_=(x: Renderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS for this UI5 Web Component Class
      * @protected
      */
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.styles")
    @js.native
    def styles: ComponentStylesData = js.native
    inline def styles_=(x: ComponentStylesData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base/dist/UI5Element.js", "default.template")
    @js.native
    def template: js.UndefOr[TemplateFunction] = js.native
    inline def template_=(x: js.UndefOr[TemplateFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Always use duck-typing to cover all runtimes on the page.
    */
  inline def instanceOfUI5Element(`object`: Any): /* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfUI5Element")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element */ Boolean]
  
  trait ChangeInfo extends StObject {
    
    var child: js.UndefOr[Node] = js.undefined
    
    var name: String
    
    var newValue: js.UndefOr[PropertyValue] = js.undefined
    
    var oldValue: js.UndefOr[PropertyValue] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[UI5Element] = js.undefined
    
    var `type`: property | slot
  }
  object ChangeInfo {
    
    inline def apply(name: String, `type`: property | slot): ChangeInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeInfo] (val x: Self) extends AnyVal {
      
      inline def setChild(value: Node): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setChildUndefined: Self = StObject.set(x, "child", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: PropertyValue): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: PropertyValue): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTarget(value: UI5Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: property | slot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ChildChangeListener = js.Function1[/* param */ InvalidationInfo, Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Property in keyof T as / * template literal string: on${KebabToPascal<string&Property>} * / string ]: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.IsAny<T[Property], any, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.TargetedEventHandler<T[Property], K>>}
    }}}
    */
  @js.native
  trait Convert[T, K /* <: UI5Element */] extends StObject
  
  type ElementProps[I] = Partial[
    Omit[
      I, 
      accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | inert | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | outerText | popover | spellcheck | title | translate | writingSuggestions
    ]
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    <T>(): T extends X ? 1 : 2 extends <T>(): T extends Y ? 1 : 2 ? true : false
    }}}
    */
  type Equal[X, Y] = `true`
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.accesskey_
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocapitalize
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autofocus
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocomplete
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contenteditable
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contextmenu
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`class`
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dir
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.draggable
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.enterkeyhint
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.id
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inputmode
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.lang
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.nonce
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.part
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.exportparts
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.pattern
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.spellcheck
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.style
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tabIndex
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tabindex_
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.title
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.translate
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ref
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inert
  */
  trait GlobalHTMLAttributeNames extends StObject
  object GlobalHTMLAttributeNames {
    
    inline def accesskey: accesskey_ = "accesskey".asInstanceOf[accesskey_]
    
    inline def autocapitalize: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocapitalize = "autocapitalize".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocapitalize]
    
    inline def autocomplete: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocomplete = "autocomplete".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autocomplete]
    
    inline def autofocus: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autofocus = "autofocus".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.autofocus]
    
    inline def `class`: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`class` = "class".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`class`]
    
    inline def contenteditable: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contenteditable = "contenteditable".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contenteditable]
    
    inline def contextmenu: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contextmenu = "contextmenu".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contextmenu]
    
    inline def dir: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dir = "dir".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dir]
    
    inline def draggable: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.draggable = "draggable".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.draggable]
    
    inline def enterkeyhint: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.enterkeyhint = "enterkeyhint".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.enterkeyhint]
    
    inline def exportparts: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.exportparts = "exportparts".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.exportparts]
    
    inline def hidden: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden = "hidden".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.hidden]
    
    inline def id: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.id = "id".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.id]
    
    inline def inert: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inert = "inert".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inert]
    
    inline def inputmode: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inputmode = "inputmode".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.inputmode]
    
    inline def lang: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.lang = "lang".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.lang]
    
    inline def nonce: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.nonce = "nonce".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.nonce]
    
    inline def part: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.part = "part".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.part]
    
    inline def pattern: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.pattern = "pattern".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.pattern]
    
    inline def ref: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ref = "ref".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ref]
    
    inline def slot: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot = "slot".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.slot]
    
    inline def spellcheck: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.spellcheck = "spellcheck".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.spellcheck]
    
    inline def style: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.style = "style".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.style]
    
    inline def tabIndex: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tabIndex = "tabIndex".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tabIndex]
    
    inline def tabindex: tabindex_ = "tabindex".asInstanceOf[tabindex_]
    
    inline def title: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.title = "title".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.title]
    
    inline def translate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.translate = "translate".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.translate]
  }
  
  trait InvalidationInfo
    extends StObject
       with ChangeInfo {
    
    @JSName("target")
    var target_InvalidationInfo: UI5Element
  }
  object InvalidationInfo {
    
    inline def apply(name: String, target: UI5Element, `type`: property | slot): InvalidationInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InvalidationInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidationInfo] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: UI5Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    0 extends 1 & T ? Y : N
    }}}
    */
  type IsAny[T, Y, N] = Y
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends / * template literal string: ${inferH}-${inferJ}${inferK} * / string ? / * template literal string: ${Uncapitalize<H>}${Capitalize<J>}${KebabToCamel<K>} * / string : T
    }}}
    */
  type KebabToCamel[T /* <: String */] = T
  
  type KebabToPascal[T /* <: String */] = Capitalize[KebabToCamel[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    true extends @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.Equal<X, Y> ? false : true
    }}}
    */
  type NotEqual[X, Y] = `false`
  
  type Renderer = js.Function2[/* instance */ UI5Element, /* container */ HTMLElement | DocumentFragment, Unit]
  
  type SlotChangeListener = js.ThisFunction1[/* this */ HTMLSlotElement, /* ev */ Event, Unit]
  
  type SlottedChild = Record[String, Any]
  
  /* Inlined std.Omit<std.CustomEvent<D>, 'currentTarget'> & {  currentTarget :T} */
  trait TargetedCustomEvent[D, T] extends StObject {
    
    var AT_TARGET: `2`
    
    var BUBBLING_PHASE: `3`
    
    var CAPTURING_PHASE: `1`
    
    var NONE: `0`
    
    var bubbles: Boolean
    
    var cancelBubble: Boolean
    
    var cancelable: Boolean
    
    var composed: Boolean
    
    def composedPath(): js.Array[EventTarget]
    @JSName("composedPath")
    var composedPath_Original: js.Function0[js.Array[EventTarget]]
    
    var currentTarget: T
    
    var defaultPrevented: Boolean
    
    var detail: D
    
    var eventPhase: Double
    
    def initCustomEvent(`type`: String): Unit
    @JSName("initCustomEvent")
    var initCustomEvent_Original: js.Function1[/* type */ String, Unit]
    
    def initEvent(`type`: String): Unit
    @JSName("initEvent")
    var initEvent_Original: js.Function1[/* type */ String, Unit]
    
    var isTrusted: Boolean
    
    def preventDefault(): Unit
    @JSName("preventDefault")
    var preventDefault_Original: js.Function0[Unit]
    
    var returnValue: Boolean
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
    
    def stopImmediatePropagation(): Unit
    @JSName("stopImmediatePropagation")
    var stopImmediatePropagation_Original: js.Function0[Unit]
    
    def stopPropagation(): Unit
    @JSName("stopPropagation")
    var stopPropagation_Original: js.Function0[Unit]
    
    var target: js.UndefOr[EventTarget | Null] = js.undefined
    
    var timeStamp: DOMHighResTimeStamp
    
    var `type`: String
  }
  object TargetedCustomEvent {
    
    inline def apply[D, T](
      bubbles: Boolean,
      cancelBubble: Boolean,
      cancelable: Boolean,
      composed: Boolean,
      composedPath: () => js.Array[EventTarget],
      currentTarget: T,
      defaultPrevented: Boolean,
      detail: D,
      eventPhase: Double,
      initCustomEvent: /* type */ String => Unit,
      initEvent: /* type */ String => Unit,
      isTrusted: Boolean,
      preventDefault: () => Unit,
      returnValue: Boolean,
      stopImmediatePropagation: () => Unit,
      stopPropagation: () => Unit,
      timeStamp: DOMHighResTimeStamp,
      `type`: String
    ): TargetedCustomEvent[D, T] = {
      val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCustomEvent = js.Any.fromFunction1(initCustomEvent), initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedCustomEvent[D, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetedCustomEvent[?, ?], D, T] (val x: Self & (TargetedCustomEvent[D, T])) extends AnyVal {
      
      inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      inline def setCurrentTarget(value: T): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: D): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      inline def setInitCustomEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initCustomEvent", js.Any.fromFunction1(value))
      
      inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetedEventHandler[D, T] = js.Function1[/* e */ TargetedCustomEvent[D, T], Unit]
  
  /**
    * @class
    * Base class for all UI5 Web Components
    *
    * @extends HTMLElement
    * @public
    */
  @js.native
  trait UI5Element
    extends StObject
       with io.github.nguyenyou.ui5.webcomponents.std.HTMLElement {
    
    var __id: js.UndefOr[String] = js.native
    
    var __shouldHydrate: Boolean = js.native
    
    /**
      * @private
      */
    def _assignIndividualSlotsToChildren(): Unit = js.native
    
    /**
      * @private
      */
    def _attachSlotChange(slot: HTMLSlotElement, slotName: String, invalidateOnChildChange: Boolean): Unit = js.native
    
    var _changedState: js.Array[ChangeInfo] = js.native
    
    var _childChangeListeners: Map[String, ChildChangeListener] = js.native
    
    /**
      * Removes all children from the slot and detaches listeners, if any
      * @private
      */
    def _clearSlot(slotName: String, slotData: Slot): Unit = js.native
    
    var _componentStateFinalizedEventProvider: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distEventProviderMod.default[Unit, Unit] = js.native
    
    /**
      * @private
      */
    def _detachSlotChange(child: HTMLSlotElement, slotName: String): Unit = js.native
    
    var _doNotSyncAttributes: Set[String] = js.native
    
    var _domRefReadyPromise: PromisevoiddeferredResolv = js.native
    
    def _fireEvent[T](name: String): Boolean = js.native
    def _fireEvent[T](name: String, data: T): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: T, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def _fireEvent[T](name: String, data: Unit, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    
    var _fullyConnected: Boolean = js.native
    
    /**
      * Returns a singleton event listener for the "change" event of a child in a given slot
      *
      * @param slotName the name of the slot, where the child is
      * @private
      */
    def _getChildChangeListener(slotName: String): ChildChangeListener = js.native
    
    var _getRealDomRef: js.UndefOr[js.Function0[HTMLElement]] = js.native
    
    /**
      * Returns a singleton slotchange event listener that invalidates the component due to changes in the given slot
      *
      * @param slotName the name of the slot, where the slot element (whose slotchange event we're listening to) is
      * @private
      */
    def _getSlotChangeListener(slotName: String): SlotChangeListener = js.native
    
    /**
      * Returns a unique ID for this UI5 Element
      *
      * @deprecated - This property is not guaranteed in future releases
      * @protected
      */
    def _id: String = js.native
    
    var _inDOM: Boolean = js.native
    
    var _individualSlot: js.UndefOr[String] = js.native
    
    def _initShadowRoot(): Unit = js.native
    
    var _internals: ElementInternals = js.native
    
    var _invalidationEventProvider: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distEventProviderMod.default[InvalidationInfo, Unit] = js.native
    
    var _jsxEvents: (Omit[
        DOMAttributes[this.type], 
        (/* keyof @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.Convert<this['eventDetails'], this> */ String) | onClose | onToggle | onChange | onSelect | onInput
      ]) & (Convert[
        /* import warning: importer.ImportType#apply Failed type conversion: this['eventDetails'] */ js.Any, 
        this.type
      ]) = js.native
    
    var _jsxProps: PickAllHTMLAttributesHTML & ElementProps[this.type] & (Partial[
        /* import warning: importer.ImportType#apply Failed type conversion: this['_jsxEvents'] */ js.Any
      ]) & Key = js.native
    
    /**
      * Callback that is executed whenever a monitored child changes its state
      *
      * @param slotName the slot in which a child was invalidated
      * @param childChangeInfo the changeInfo object for the child in the given slot
      * @private
      */
    def _onChildChange(slotName: String, childChangeInfo: ChangeInfo): Unit = js.native
    
    /**
      * Note: this "slotchange" listener is for slots, rendered in the component's shadow root
      */
    def _onShadowRootSlotChange(e: Event): Unit = js.native
    
    /**
      * Whenever a slot element is slotted inside a UI5 Web Component, its slotchange event invalidates the component
      * Note: this "slotchange" listener is for slots that are children of the component (in the light dom, as opposed to slots rendered by the component in the shadow root)
      *
      * @param slotName the name of the slot, where the slot element (whose slotchange event we're listening to) is
      * @private
      */
    def _onSlotChange(slotName: String): Unit = js.native
    
    /**
      * Note: this method is also manually called by "compatibility/patchNodeValue.js"
      * @private
      */
    def _processChildren(): js.Promise[Unit] = js.native
    
    /**
      * Do not call this method directly, only intended to be called by js
      * @protected
      */
    def _render(): Unit = js.native
    
    var _rendered: Boolean = js.native
    
    var _slotChangeListeners: Map[String, SlotChangeListener] = js.native
    
    var _slotsAssignedNodes: WeakMap[HTMLSlotElement, js.Array[Node]] = js.native
    
    /**
      * @private
      */
    def _startObservingDOMChildren(): Unit = js.native
    
    var _state: State = js.native
    
    /**
      * @private
      */
    def _stopObservingDOMChildren(): Unit = js.native
    
    var _suppressInvalidation: Boolean = js.native
    
    /**
      * @private
      */
    def _updateAttribute(name: String, newValue: PropertyValue): Unit = js.native
    
    /**
      * @private
      */
    def _updateSlots(): js.Promise[Unit] = js.native
    
    /**
      * @private
      */
    def _waitForDomRef(): PromisevoiddeferredResolv = js.native
    
    /**
      * Returns the component accessibility info.
      * @private
      */
    def accessibilityInfo: AccessibilityInfo = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /**
      * Attach a callback that will be executed whenever the component's state is finalized
      *
      * @param callback
      * @public
      */
    def attachComponentStateFinalized(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Attach a callback that will be executed whenever the component is invalidated
      *
      * @param callback
      * @public
      */
    def attachInvalidate(callback: js.Function1[/* param */ InvalidationInfo, Unit]): Unit = js.native
    
    /**
      * Do not override this method in derivatives of UI5Element
      * @private
      */
    def attributeChangedCallback(name: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: String, newValue: String): Unit = js.native
    def attributeChangedCallback(name: String, oldValue: Null, newValue: String): Unit = js.native
    
    def checkValidity(): Boolean = js.native
    
    def classes: ClassMap = js.native
    
    /**
      * Do not call this method from derivatives of UI5Element, use "onEnterDOM" only
      * @private
      */
    def connectedCallback(): js.Promise[Unit] = js.native
    
    /**
      * Detach the callback that is executed whenever the component's state is finalized
      *
      * @param callback
      * @public
      */
    def detachComponentStateFinalized(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Detach the callback that is executed whenever the component is invalidated
      *
      * @param callback
      * @public
      */
    def detachInvalidate(callback: js.Function1[/* param */ InvalidationInfo, Unit]): Unit = js.native
    
    /**
      * Do not call this method from derivatives of UI5Element, use "onExitDOM" only
      * @private
      */
    def disconnectedCallback(): Unit = js.native
    
    /**
      * Determines whether the component should be rendered in RTL mode or not.
      * Returns: "rtl", "ltr" or undefined
      *
      * @public
      * @default undefined
      */
    def effectiveDir: js.UndefOr[String] = js.native
    
    var eventDetails: /* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any = js.native
    
    /**
      * Fires a custom event, configured via the "event" decorator.
      * @public
      * @param name - name of the event
      * @param data - additional data for the event
      * @returns false, if the event was cancelled (preventDefault called), true otherwise
      */
    def fireDecoratorEvent[N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof this['eventDetails'] */ js.Any */](name: N): Boolean = js.native
    @JSName("fireDecoratorEvent")
    def fireDecoratorEvent_eventDetails[N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof this['eventDetails'] */ js.Any */](
      name: N,
      data: /* import warning: importer.ImportType#apply Failed type conversion: this['eventDetails'][N] */ js.Any
    ): Boolean = js.native
    
    /**
      *
      * @public
      * @param name - name of the event
      * @param data - additional data for the event
      * @param cancelable - true, if the user can call preventDefault on the event object
      * @param bubbles - true, if the event bubbles
      * @returns false, if the event was cancelled (preventDefault called), true otherwise
      * @deprecated use fireDecoratorEvent instead
      */
    def fireEvent[T](name: String): Boolean = js.native
    def fireEvent[T](name: String, data: T): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: T, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Boolean, bubbles: Boolean): Boolean = js.native
    def fireEvent[T](name: String, data: Unit, cancelable: Unit, bubbles: Boolean): Boolean = js.native
    
    def formAssociatedCallback(): Unit = js.native
    
    /**
      * Returns the DOM Element inside the Shadow Root that corresponds to the opening tag in the UI5 Web Component's template
      * *Note:* For logical (abstract) elements (items, options, etc...), returns the part of the parent's DOM that represents this option
      * Use this method instead of "this.shadowRoot" to read the Shadow DOM, if ever necessary
      *
      * @public
      */
    def getDomRef(): js.UndefOr[HTMLElement] = js.native
    
    def getEventData(name: String): Bubbles = js.native
    
    /**
      * Returns the DOM Element marked with "data-sap-focus-ref" inside the template.
      * This is the element that will receive the focus by default.
      * @public
      */
    def getFocusDomRef(): js.UndefOr[HTMLElement] = js.native
    
    /**
      * Waits for dom ref and then returns the DOM Element marked with "data-sap-focus-ref" inside the template.
      * This is the element that will receive the focus by default.
      * @public
      */
    def getFocusDomRefAsync(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    /**
      * Returns the actual children, associated with a slot.
      * Useful when there are transitive slots in nested component scenarios and you don't want to get a list of the slots, but rather of their content.
      * @public
      */
    def getSlottedNodes[T](slotName: String): js.Array[T] = js.native
    
    var initializedProperties: Map[String, Any] = js.native
    
    def isUI5AbstractElement: Boolean = js.native
    
    /**
      * Used to duck-type UI5 elements without using instanceof
      * @public
      * @default true
      */
    def isUI5Element: Boolean = js.native
    
    /**
      * Called every time after the component renders.
      * @public
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * Called every time before the component renders.
      * @public
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Called on connectedCallback - added to the DOM.
      * @public
      */
    def onEnterDOM(): Unit = js.native
    
    /**
      * Called on disconnectedCallback - removed from the DOM.
      * @public
      */
    def onExitDOM(): Unit = js.native
    
    /**
      * A callback that is executed each time an already rendered component is invalidated (scheduled for re-rendering)
      *
      * @param  changeInfo An object with information about the change that caused invalidation.
      * The object can have the following properties:
      *  - type: (property|slot) tells what caused the invalidation
      *   1) property: a property value was changed either directly or as a result of changing the corresponding attribute
      *   2) slot: a slotted node(nodes) changed in one of several ways (see "reason")
      *
      *  - name: the name of the property or slot that caused the invalidation
      *
      *  - reason: (children|textcontent|childchange|slotchange) relevant only for type="slot" only and tells exactly what changed in the slot
      *   1) children: immediate children (HTML elements or text nodes) were added, removed or reordered in the slot
      *   2) textcontent: text nodes in the slot changed value (or nested text nodes were added or changed value). Can only trigger for slots of "type: Node"
      *   3) slotchange: a slot element, slotted inside that slot had its "slotchange" event listener called. This practically means that transitively slotted children changed.
      *	  Can only trigger if the child of a slot is a slot element itself.
      *   4) childchange: indicates that a UI5Element child in that slot was invalidated and in turn invalidated the component.
      *	  Can only trigger for slots with "invalidateOnChildChange" metadata descriptor
      *
      *  - newValue: the new value of the property (for type="property" only)
      *
      *  - oldValue: the old value of the property (for type="property" only)
      *
      *  - child the child that was changed (for type="slot" and reason="childchange" only)
      *
      * @public
      */
    def onInvalidation(changeInfo: ChangeInfo): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def render(): js.Object = js.native
    
    def reportValidity(): Boolean = js.native
    
    def updateAttributes(): Unit = js.native
    
    def validationMessage: String = js.native
    
    def validity: ValidityState = js.native
  }
}
