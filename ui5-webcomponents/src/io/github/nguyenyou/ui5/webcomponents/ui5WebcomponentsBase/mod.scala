package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.ClassDecorator
import io.github.nguyenyou.ui5.webcomponents.std.DOMHighResTimeStamp
import io.github.nguyenyou.ui5.webcomponents.std.PropertyDecorator
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cancelable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Cldr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Promise
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.TypeofUI5Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesI18nMod.I18nLoader
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesIconsMod.IconLoader
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesLocaleDataMod.LocaleDataLoader
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesThemesMod.ThemeLoader
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigIconsMod.IconCollection
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distConfigNoConflictMod.NoConflictData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distCustomElementsScopeUtilsMod.Rules
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.ItemNavigationOptions
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesLegacyDateFormatsMod.LegacyDateCalendarCustomizing
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nBundleGetter
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distJsxRuntimeMod.JSX_.Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distJsxRuntimeMod.VNode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleDirectionChangeMod.DirectionChangeCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distLocaleLanguageChangeMod.LanguageChangeCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distMediaRangeMod.Range
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThemingThemeLoadedMod.ThemeLoadedCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.ComponentStylesData
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.Renderer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Metadata
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Property
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Slot
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ltr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.rtl
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.DragEvent
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ui5/webcomponents-base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    * Base class for all UI5 Web Components
    *
    * @extends HTMLElement
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents-base", JSImport.Default)
  @js.native
  open class default ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  object default {
    
    @JSImport("@ui5/webcomponents-base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default._metadata")
    @js.native
    def _metadata: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default = js.native
    inline def _metadata_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_metadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default.asyncFinished")
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
    inline def define(): TypeofUI5Element & (Instantiable0[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
      ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[TypeofUI5Element & (Instantiable0[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
      ])]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default.definePromise")
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
    inline def getUniqueDependencies(): js.Array[
        TypeofUI5Element & (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
        ])
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueDependencies")().asInstanceOf[js.Array[
        TypeofUI5Element & (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
        ])
      ]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default.i18nBundleStorage")
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
    @JSImport("@ui5/webcomponents-base", "default.metadata")
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
    @JSImport("@ui5/webcomponents-base", "default.renderer")
    @js.native
    def renderer: Renderer = js.native
    inline def renderer_=(x: Renderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS for this UI5 Web Component Class
      * @protected
      */
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default.styles")
    @js.native
    def styles: ComponentStylesData = js.native
    inline def styles_=(x: ComponentStylesData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "default.template")
    @js.native
    def template: js.UndefOr[TemplateFunction] = js.native
    inline def template_=(x: js.UndefOr[TemplateFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ui5/webcomponents-base", "EventProvider")
  @js.native
  open class EventProvider[EventListenerParam, EventListenerReturn] ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distEventProviderMod.default[EventListenerParam, EventListenerReturn]
  
  inline def Fragment(props: Record[String, Any]): ComponentChildren = ^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any]).asInstanceOf[ComponentChildren]
  inline def Fragment(props: Record[String, Any], context: Any): ComponentChildren = (^.asInstanceOf[js.Dynamic].applyDynamic("Fragment")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ComponentChildren]
  
  /**
    * @class
    * @public
    */
  @JSImport("@ui5/webcomponents-base", "I18nBundle")
  @js.native
  open class I18nBundle protected ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default {
    def this(packageName: String) = this()
  }
  
  /**
    * The ItemNavigation class manages the calculations to determine the correct "tabindex" for a group of related items inside a root component.
    * Important: ItemNavigation only does the calculations and does not change "tabindex" directly, this is a responsibility of the developer.
    *
    * The keys that trigger ItemNavigation are:
    *  - Up/down
    *  - Left/right
    *  - Home/End
    *
    * Usage:
    * 1) Use the "getItemsCallback" constructor property to pass a callback to ItemNavigation, which, whenever called, will return the list of items to navigate among.
    *
    * Each item passed to ItemNavigation via "getItemsCallback" must be:
    *  - A) either a UI5Element with a "forcedTabIndex" property
    *  - B) or an Object with "id" and "forcedTabIndex" properties which represents a part of the root component's shadow DOM.
    *    The "id" must be a valid ID within the shadow root of the component ItemNavigation operates on.
    *    This object must not be a DOM object because, as said, ItemNavigation will not set "tabindex" on it. It must be a representation of a DOM object only
    *    and the developer has the responsibility to update the "tabindex" in the component's DOM.
    *  - C) a combination of the above
    *
    * Whenever the user navigates with the keyboard, ItemNavigation will modify the "forcedTabIndex" properties of the items.
    * It is the items' responsibilities to re-render themselves and apply the correct value of "tabindex" (i.e. to map the "forcedTabIndex" ItemNavigation set to them to the "tabindex" property).
    * If the items of the ItemNavigation are UI5Elements themselves, this can happen naturally since they will be invalidated by their "forcedTabIndex" property.
    * If the items are Objects with "id" and "forcedTabIndex" however, it is the developer's responsibility to apply these and the easiest way is to have the root component invalidated by ItemNavigation.
    * To do so, set the "affectedPropertiesNames" constructor property to point to one or more of the root component's properties that need refreshing when "forcedTabIndex" is changed deeply.
    *
    * 2) Call the "setCurrentItem" method of ItemNavigation whenever you want to change the current item.
    * This is most commonly required if the user for example clicks on an item and thus selects it directly.
    * Pass as the only argument to "setCurrentItem" the item that becomes current (must be one of the items, returned by "getItemsCallback").
    *
    * @class
    * @public
    */
  @JSImport("@ui5/webcomponents-base", "ItemNavigation")
  @js.native
  open class ItemNavigation protected ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default {
    /**
      *
      * @param rootWebComponent the component to operate on (component that slots or contains within its shadow root the items the user navigates among)
      * @param {ItemNavigationOptions} options Object with configuration options:
      *  - currentIndex: the index of the item that will be initially selected (from which navigation will begin)
      *  - navigationMode (Auto|Horizontal|Vertical): whether the items are displayed horizontally (Horizontal), vertically (Vertical) or as a matrix (Auto) meaning the user can navigate in both directions (up/down and left/right)
      *  - rowSize: tells how many items per row there are when the items are not rendered as a flat list but rather as a matrix. Relevant for navigationMode=Auto
      * 	- skipItemsSize: tells how many items upon PAGE_UP and PAGE_DOWN should be skipped to applying the focus on the next item
      *  - behavior (Static|Cycling): tells what to do when trying to navigate beyond the first and last items
      *    Static means that nothing happens if the user tries to navigate beyond the first/last item.
      *    Cycling means that when the user navigates beyond the last item they go to the first and vice versa.
      *  - getItemsCallback: function that, when called, returns an array with all items the user can navigate among
      *  - affectedPropertiesNames: a list of metadata properties on the root component which, upon user navigation, will be reassigned by address thus causing the root component to invalidate
      */
    def this(
      rootWebComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default,
      options: ItemNavigationOptions
    ) = this()
  }
  
  /**
    * API for screen width changes.
    */
  object MediaRange {
    
    @JSImport("@ui5/webcomponents-base", "MediaRange")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ui5/webcomponents-base", "MediaRange.RANGESETS")
    @js.native
    def RANGESETS: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RANGESETS */ Any = js.native
    inline def RANGESETS_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RANGESETS */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RANGESETS")(x.asInstanceOf[js.Any])
    
    inline def getCurrentRange(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getCurrentRange(name: String, width: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentRange")(name.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def initRangeSet(name: String, range: Range): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initRangeSet")(name.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@ui5/webcomponents-base", "RegisteredIconCollection")
  @js.native
  object RegisteredIconCollection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection & String
      ] = js.native
    
    /* "business-suite-v1" */ val SAPBSIconsV1: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPBSIconsV1 & String = js.native
    
    /* "business-suite-v2" */ val SAPBSIconsV2: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPBSIconsV2 & String = js.native
    
    /* "tnt-v2" */ val SAPIconsTNTV2: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsTNTV2 & String = js.native
    
    /* "tnt-v3" */ val SAPIconsTNTV3: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsTNTV3 & String = js.native
    
    /* "SAP-icons-v4" */ val SAPIconsV4: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsV4 & String = js.native
    
    /* "SAP-icons-v5" */ val SAPIconsV5: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distAssetRegistriesUtilIconCollectionsByThemeMod.RegisteredIconCollection.SAPIconsV5 & String = js.native
  }
  
  /**
    * Allows to register/deregister resize observers for a DOM element
    *
    * @public
    * @class
    */
  @JSImport("@ui5/webcomponents-base", "ResizeHandler")
  @js.native
  open class ResizeHandler ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.default
  object ResizeHandler {
    
    @JSImport("@ui5/webcomponents-base", "ResizeHandler")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @public
      * @param element UI5 Web Component or DOM Element to be unobserved
      * @param callback Callback to be removed
      */
    /* static member */
    inline def deregister(element: HTMLElement, callback: ResizeObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deregister")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @public
      * @param element UI5 Web Component or DOM Element to be observed
      * @param callback Callback to be executed
      */
    /* static member */
    inline def register(element: HTMLElement, callback: ResizeObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("@ui5/webcomponents-base", "ScrollEnablement")
  @js.native
  open class ScrollEnablement protected ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateScrollEnablementMod.default {
    def this(containerComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default) = this()
  }
  
  /**
    * @class
    * Base class for all UI5 Web Components
    *
    * @extends HTMLElement
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents-base", "UI5Element")
  @js.native
  open class UI5Element ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  object UI5Element {
    
    @JSImport("@ui5/webcomponents-base", "UI5Element")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element._metadata")
    @js.native
    def _metadata: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default = js.native
    inline def _metadata_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_metadata")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element.asyncFinished")
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
    inline def define(): TypeofUI5Element & (Instantiable0[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
      ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")().asInstanceOf[TypeofUI5Element & (Instantiable0[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
      ])]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element.definePromise")
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
    inline def getUniqueDependencies(): js.Array[
        TypeofUI5Element & (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
        ])
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUniqueDependencies")().asInstanceOf[js.Array[
        TypeofUI5Element & (Instantiable0[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.UI5Element
        ])
      ]]
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element.i18nBundleStorage")
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
    @JSImport("@ui5/webcomponents-base", "UI5Element.metadata")
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
    @JSImport("@ui5/webcomponents-base", "UI5Element.renderer")
    @js.native
    def renderer: Renderer = js.native
    inline def renderer_=(x: Renderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the CSS for this UI5 Web Component Class
      * @protected
      */
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element.styles")
    @js.native
    def styles: ComponentStylesData = js.native
    inline def styles_=(x: ComponentStylesData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents-base", "UI5Element.template")
    @js.native
    def template: js.UndefOr[TemplateFunction] = js.native
    inline def template_=(x: js.UndefOr[TemplateFunction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
  }
  
  inline def addCustomCSS(tag: String, css: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomCSS")(tag.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def applyDirection(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyDirection")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Attaches a callback that will be executed after boot finishes.
    * **Note:** If the framework already booted, the callback will be immediately executed.
    * @public
    * @param { Function } listener
    */
  inline def attachBoot(listener: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBoot")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Attach a callback that will be executed whenever the application calls the "applyDirection" function
    * @public
    * @param listener
    */
  inline def attachDirectionChange(listener: DirectionChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachDirectionChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def attachLanguageChange(listener: LanguageChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachLanguageChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def attachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Cancels the rendering of a component, if awaiting to be rendered, and removes it from the registry of rendered components
    *
    * @param webComponent
    */
  inline def cancelRender(webComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelRender")(webComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Returns a custom element class decorator.
    *
    * @param { string | object } tagNameOrComponentSettings
    * @returns { ClassDecorator }
    */
  inline def customElement(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")().asInstanceOf[ClassDecorator]
  inline def customElement(tagNameOrComponentSettings: Cldr): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def customElement(tagNameOrComponentSettings: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("customElement")(tagNameOrComponentSettings.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  /**
    * Detach a callback that was passed with "attachDirectionChange"
    * @public
    * @param listener
    */
  inline def detachDirectionChange(listener: DirectionChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachDirectionChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachLanguageChange(listener: LanguageChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachLanguageChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def event[EventDetail](name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("event")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  inline def event[EventDetail](name: String, data: Cancelable[EventDetail]): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("event")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  
  /**
    * Returns the animation mode - "full", "basic", "minimal" or "none".
    * @public
    * @returns { AnimationMode }
    */
  inline def getAnimationMode(): /* template literal string: ${AnimationMode} */ String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnimationMode")().asInstanceOf[/* template literal string: ${AnimationMode} */ String]
  
  /**
    * Returns the configured or default calendar type.
    * @public
    * @returns { CalendarType } the effective calendar type
    */
  inline def getCalendarType(): CalendarType = ^.asInstanceOf[js.Dynamic].applyDynamic("getCalendarType")().asInstanceOf[CalendarType]
  
  /**
    * Returns the rules, governing which custom element tags to scope and which not. By default, all elements
    * starting with "ui5-" are scoped. The default rules are: {include: [/^ui5-/]}.
    *
    * @public
    * @returns {Object}
    */
  inline def getCustomElementsScopingRules(): Rules = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingRules")().asInstanceOf[Rules]
  
  /**
    * Returns the currently set scoping suffix, or undefined if not set.
    *
    * @public
    * @returns {String|undefined}
    */
  inline def getCustomElementsScopingSuffix(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomElementsScopingSuffix")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns the configured default icon collection for a given theme.
    *
    * @param { string } theme
    * @public
    * @returns { string | undefined }
    */
  inline def getDefaultIconCollection(theme: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultIconCollection")(theme.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns the default languague.
    *
    * Note: Default language might be different than the configurated one.
    *
    * @public
    * @returns {string}
    */
  inline def getDefaultLanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLanguage")().asInstanceOf[String]
  
  /**
    * Returns the default theme.
    *
    * Note: Default theme might be different than the configurated one.
    *
    * @public
    * @returns {string}
    */
  inline def getDefaultTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTheme")().asInstanceOf[String]
  
  inline def getEffectiveDir(element: HTMLElement): rtl | ltr = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveDir")(element.asInstanceOf[js.Any]).asInstanceOf[rtl | ltr]
  
  /**
    * Returns the effective theme dependant icon collection:
    *
    * - "no collection" resolves to "SAP-icons-v4" in "Quartz" and to "SAP-icons-v5" in "Horizon"
    * - "tnt" (and its alias "SAP-icons-TNT") resolves to "tnt-v2" in "Quartz" and resolves to "tnt-v3" in "Horizon"
    * - "business-suite" (and its alias "BusinessSuiteInAppSymbols") resolves to "business-suite-v1" in "Quartz" and resolves to "business-suite-v2" in "Horizon"
    *
    * @param { IconCollection } collectionName
    * @returns { IconCollection } the effective collection name
    */
  inline def getEffectiveIconCollection(): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveIconCollection")().asInstanceOf[IconCollection]
  inline def getEffectiveIconCollection(collectionName: IconCollection): IconCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveIconCollection")(collectionName.asInstanceOf[js.Any]).asInstanceOf[IconCollection]
  
  /**
    * Returns the currently set scoping suffix, if any and if the tag should be scoped, or undefined otherwise.
    *
    * @public
    * @param tag
    * @returns {String}
    */
  inline def getEffectiveScopingSuffixForTag(tag: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveScopingSuffixForTag")(tag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns if the default language, that is inlined, should be fetched over the network.
    * @public
    * @returns {boolean}
    */
  inline def getFetchDefaultLanguage(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getFetchDefaultLanguage")().asInstanceOf[Boolean]
  
  /**
    * Returns the first day of the week from the configured format settings or based on the current locale.
    * @public
    * @returns {Number} 0 (Sunday) through 6 (Saturday)
    */
  inline def getFirstDayOfWeek(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstDayOfWeek")().asInstanceOf[js.UndefOr[Double]]
  
  /**
    * Fetches and returns the I18nBundle instance for the given package.
    *
    * @public
    * @param packageName
    */
  inline def getI18nBundle(packageName: String): js.Promise[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nBundle
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getI18nBundle")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nBundle
  ]]
  
  /**
    * Returns the currently configured language, or the browser language as a fallback.
    * @public
    * @returns {string}
    */
  inline def getLanguage(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguage")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Returns the currently set customizing data for Islamic calendar support
    *
    * @return {object[]} Returns an array that contains the customizing data.
    * @public
    */
  /* static member */
  /* was `typeof LegacyDateFormats.getLegacyDateCalendarCustomizing` */
  inline def getLegacyDateCalendarCustomizing(): LegacyDateCalendarCustomizing = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegacyDateCalendarCustomizing")().asInstanceOf[LegacyDateCalendarCustomizing]
  
  /**
    * Returns if the "noConflict" configuration is set.
    * @public
    * @returns { NoConflictData }
    */
  inline def getNoConflict(): NoConflictData = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoConflict")().asInstanceOf[NoConflictData]
  
  inline def getTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[String]
  
  inline def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  inline def isChrome(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isChrome")().asInstanceOf[Boolean]
  
  inline def isCombi(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCombi")().asInstanceOf[Boolean]
  
  inline def isDesktop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDesktop")().asInstanceOf[Boolean]
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhone")().asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  inline def isTablet(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTablet")().asInstanceOf[Boolean]
  
  inline def jsx(
    `type`: (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element,
    props: Record[String, Any],
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsx(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxDEV(
    `type`: (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element,
    props: Record[String, Any],
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxDEV(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxDEV")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  inline def jsxs(
    `type`: (Instantiable0[
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    ]) & TypeofUI5Element,
    props: Record[String, Any],
    key: String
  ): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  inline def jsxs(`type`: String, props: Record[String, Any], key: String): VNode[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsxs")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[VNode[Any]]
  
  /**
    * Returns a property decorator.
    *
    * @param { Property } propData
    * @returns { PropertyDecorator }
    */
  inline def property(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("property")().asInstanceOf[PropertyDecorator]
  inline def property(propData: Property): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("property")(propData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  /**
    * Allows developers to provide a custom getI18nBundle implementation
    * If this function is called, the custom implementation will be used for all components and will completely
    * replace the default implementation.
    *
    * @public
    * @param customGet the function to use instead of the standard getI18nBundle implementation
    */
  inline def registerCustomI18nBundleGetter(customGet: I18nBundleGetter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCustomI18nBundleGetter")(customGet.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers i18n loader function for given package and locale.
    *
    * @public
    * @param {string} packageName for which package this loader can fetch data
    * @param {string} localeId locale that this loader can handle
    * @param {function} loader async function that will be passed a localeId and should return a JSON object
    */
  inline def registerI18nLoader(packageName: String, localeId: String, loader: I18nLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerI18nLoader")(packageName.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIconLoader(collectionName: String, loader: IconLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconLoader")(collectionName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerLocaleDataLoader(localeId: String, loader: LocaleDataLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleDataLoader")(localeId.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerThemePropertiesLoader(packageName: String, themeName: String, loader: ThemeLoader): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerThemePropertiesLoader")(packageName.asInstanceOf[js.Any], themeName.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Schedules a render task (if not already scheduled) to render the component
    *
    * @param webComponent
    * @returns {Promise}
    */
  inline def renderDeferred(webComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderDeferred")(webComponent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def renderFinished(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFinished")().asInstanceOf[js.Promise[Unit]]
  
  /**
    * Renders a component synchronously and adds it to the registry of rendered components
    *
    * @param webComponent
    */
  inline def renderImmediately(webComponent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderImmediately")(webComponent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def scroll(element: HTMLElement, dx: Double, dy: Double): Promise = (^.asInstanceOf[js.Dynamic].applyDynamic("scroll")(element.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[Promise]
  
  /**
    * Sets the animation mode - "full", "basic", "minimal" or "none".
    * @public
    * @param { AnimationMode } animationMode
    */
  inline def setAnimationMode(animationMode: /* template literal string: ${AnimationMode} */ String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAnimationMode")(animationMode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the rules, governing which custom element tags to scope and which not, f.e.
    * setCustomElementsScopingRules({include: [/^ui5-/]}, exclude: [/^ui5-mylib-/, /^ui5-carousel$/]);
    * will scope all elements starting with "ui5-" but not the ones starting with "ui5-mylib-" and not "ui5-carousel".
    *
    * @public
    * @param rules Object with "include" and "exclude" properties, both arrays of regular expressions. Note that "include"
    * rules are applied first and "exclude" rules second.
    */
  inline def setCustomElementsScopingRules(rules: Rules): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingRules")(rules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the suffix to be used for custom elements scoping, f.e. pass "demo" to get tags such as "ui5-button-demo".
    *
    * **Note:** By default all tags starting with "ui5-" will be scoped, unless you change this by calling "setCustomElementsScopingRules"
    * **Note:** Setting the scoping suffix must be done before importing any components.
    *
    * @public
    * @param suffix The scoping suffix
    */
  inline def setCustomElementsScopingSuffix(suffix: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCustomElementsScopingSuffix")(suffix.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the default icon collection for a given theme.
    *
    * SAP Icons is the default icon collection (that resolves to SAP-icons version 5.x in Horizon theme family and SAP-icons version 4.x in all other themes)
    * and to display icons from other collections, you have to specify the icon collection in addition to the icon name, for example: "tnt/actor", "business-suite/1x2-grid-layout", etc.
    * This method allows setting another (built-in or custom) icon collection as default per theme.
    *
    * **Usage**
    * **For example**, to make "SAP-icons version 5.x" the default icon collection in "sap_fiori_3":
    *
    * ```
    * setDefaultIconCollection("sap_fiori_3", "SAP-icons-v5");
    *
    * <ui5-icon name="home"></ui5-icon>
    * ```
    *
    * **For example**, to make a custom icon collection (with name "my-custom-collection") the default icon collection in "sap_fiori_3":
    *
    * ```
    * setDefaultIconCollection("sap_fiori_3", "my-custom-collection");
    *
    * <ui5-icon name="custom-icon-name"></ui5-icon>
    * ```
    *
    * @public
    * @param { string } theme
    * @param { string } collectionName
    */
  inline def setDefaultIconCollection(theme: String, collectionName: IconCollection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultIconCollection")(theme.asInstanceOf[js.Any], collectionName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Defines if the default language, that is inlined, should be
    * fetched over the network instead of using the inlined one.
    * **Note:** By default the language will not be fetched.
    *
    * @public
    * @param {boolean} fetchDefaultLang
    */
  inline def setFetchDefaultLanguage(fetchDefaultLang: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFetchDefaultLanguage")(fetchDefaultLang.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Changes the current language, re-fetches all message bundles, updates all language-aware components
    * and returns a promise that resolves when all rendering is done.
    *
    * @param {string} language
    * @public
    * @returns {Promise<void>}
    */
  inline def setLanguage(language: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLanguage")(language.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Sets the "noConflict" mode.
    * - When "false" (default value), all custom events are fired with and without the "ui5-" prefix.
    * - When "true", all custom events are fired with the "ui5-" prefix only.
    * - When an object is supplied, just the specified events will be fired with the "ui5-" prefix.
    * @public
    * @param { NoConflictData } noConflictData
    */
  inline def setNoConflict(noConflictData: NoConflictData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNoConflict")(noConflictData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Applies a new theme after fetching its assets from the network.
    * @public
    * @param {string} theme the name of the new theme
    * @returns {Promise<void>} a promise that is resolved when the new theme assets have been fetched and applied to the DOM
    */
  inline def setTheme(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def slideDown(element: HTMLElement): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("slideDown")(element.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  inline def slideUp(element: HTMLElement): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("slideUp")(element.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  /**
    * Returns a slot decorator.
    *
    * @param { Slot } slotData
    * @returns { PropertyDecorator }
    */
  inline def slot(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("slot")().asInstanceOf[PropertyDecorator]
  inline def slot(slotData: Slot): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("slot")(slotData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  /**
    * Starts a multiple drag operation by creating a drag ghost element.
    * The drag ghost will be displayed when dragging multiple items.
    *
    * @param {number} count - The number of items being dragged.
    * @param {DragEvent} e - The drag event that triggered the operation.
    * @public
    */
  inline def startMultipleDrag(count: Double, e: DragEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startMultipleDrag")(count.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def supportsTouch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsTouch")().asInstanceOf[Boolean]
  
  type JsxTemplate = js.Function0[JsxTemplateResult]
  
  type JsxTemplateResult = Element | Unit
  
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
  
  /* Inlined @ui5/webcomponents-base.@ui5/webcomponents-base.TargetedCustomEvent<T['eventDetails'][N], T> */
  trait UI5CustomEvent[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['eventDetails'] */ js.Any */] extends StObject {
    
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
    
    var detail: /* import warning: importer.ImportType#apply Failed type conversion: T['eventDetails'][N] */ js.Any
    
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
  object UI5CustomEvent {
    
    inline def apply[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['eventDetails'] */ js.Any */](
      bubbles: Boolean,
      cancelBubble: Boolean,
      cancelable: Boolean,
      composed: Boolean,
      composedPath: () => js.Array[EventTarget],
      currentTarget: T,
      defaultPrevented: Boolean,
      detail: /* import warning: importer.ImportType#apply Failed type conversion: T['eventDetails'][N] */ js.Any,
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
    ): UI5CustomEvent[T, N] = {
      val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initCustomEvent = js.Any.fromFunction1(initCustomEvent), initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI5CustomEvent[T, N]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UI5CustomEvent[?, ?], T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */, N /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof T['eventDetails'] */ js.Any */] (val x: Self & (UI5CustomEvent[T, N])) extends AnyVal {
      
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
      
      inline def setDetail(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T['eventDetails'][N] */ js.Any
      ): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
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
}
