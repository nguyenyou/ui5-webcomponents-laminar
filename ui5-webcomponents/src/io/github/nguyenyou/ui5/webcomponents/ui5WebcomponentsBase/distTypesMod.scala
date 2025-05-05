package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.EventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.Lowercase
import io.github.nguyenyou.ui5.webcomponents.std.PromiseLike
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.ReturnType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.FnCall
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait AccessibilityAttributes extends StObject {
    
    var ariaCurrent: js.UndefOr[AriaCurrent] = js.undefined
    
    var ariaKeyShortcuts: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaPosinset: js.UndefOr[Double] = js.undefined
    
    var ariaSetsize: js.UndefOr[Double] = js.undefined
    
    var controls: js.UndefOr[LowercaseString[String]] = js.undefined
    
    var current: js.UndefOr[AriaCurrent] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
  }
  object AccessibilityAttributes {
    
    inline def apply(): AccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setAriaCurrent(value: AriaCurrent): Self = StObject.set(x, "ariaCurrent", value.asInstanceOf[js.Any])
      
      inline def setAriaCurrentUndefined: Self = StObject.set(x, "ariaCurrent", js.undefined)
      
      inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
      
      inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaPosinset(value: Double): Self = StObject.set(x, "ariaPosinset", value.asInstanceOf[js.Any])
      
      inline def setAriaPosinsetUndefined: Self = StObject.set(x, "ariaPosinset", js.undefined)
      
      inline def setAriaSetsize(value: Double): Self = StObject.set(x, "ariaSetsize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetsizeUndefined: Self = StObject.set(x, "ariaSetsize", js.undefined)
      
      inline def setControls(value: LowercaseString[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setCurrent(value: AriaCurrent): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait AccessibilityInfo extends StObject {
    
    var children: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var `type`: js.UndefOr[LowercaseString[String]] = js.undefined
  }
  object AccessibilityInfo {
    
    inline def apply(): AccessibilityInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccessibilityInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessibilityInfo] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[HTMLElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: HTMLElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setType(value: LowercaseString[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.list
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`inline`
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.both
    - scala.Unit
  */
  type AriaAutoComplete = js.UndefOr[_AriaAutoComplete]
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.page
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.step
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.location
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.date
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.time
    - scala.Boolean
    - scala.Unit
  */
  type AriaCurrent = js.UndefOr[_AriaCurrent | Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dialog
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.grid
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.listbox
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.menu
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tree
  */
  trait AriaHasPopup extends StObject
  object AriaHasPopup {
    
    inline def dialog: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dialog = "dialog".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dialog]
    
    inline def grid: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.grid = "grid".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.grid]
    
    inline def listbox: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.listbox = "listbox".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.listbox]
    
    inline def menu: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.menu = "menu".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.menu]
    
    inline def tree: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tree = "tree".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.tree]
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.banner
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.main
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.region
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.navigation
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.search
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.complementary
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.form
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contentinfo
  */
  trait AriaLandmarkRole extends StObject
  object AriaLandmarkRole {
    
    inline def banner: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.banner = "banner".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.banner]
    
    inline def complementary: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.complementary = "complementary".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.complementary]
    
    inline def contentinfo: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contentinfo = "contentinfo".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.contentinfo]
    
    inline def form: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.form = "form".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.form]
    
    inline def main: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.main = "main".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.main]
    
    inline def navigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.navigation = "navigation".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.navigation]
    
    inline def none: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none = "none".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none]
    
    inline def region: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.region = "region".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.region]
    
    inline def search: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.search = "search".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.search]
  }
  
  type AriaRole = io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distJsxRuntimeMod.JSX_.AriaRole
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ClassMap = {[x: string] : @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMapValue | @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMap}
  }}}
  to avoid circular code involving: 
  - @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ClassMap
  */
  trait ClassMap
    extends StObject
       with /* x */ StringDictionary[ClassMapValue | ClassMap]
  object ClassMap {
    
    inline def apply(): ClassMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassMap]
    }
  }
  
  type ClassMapValue = Record[String, Boolean]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ComponentStylesData = std.Array<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ComponentStylesData> | string
  }}}
  to avoid circular code involving: 
  - @ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.ComponentStylesData
  */
  type ComponentStylesData = js.Array[Any] | String
  
  type Interval = ReturnType[FnCall]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends string ? std.Lowercase<T> : never
    }}}
    */
  type LowercaseString[T] = Lowercase[T]
  
  trait PassiveEventListenerObject
    extends StObject
       with EventListenerObject {
    
    var passive: Boolean
  }
  object PassiveEventListenerObject {
    
    inline def apply(handleEvent: Event => Unit, passive: Boolean): PassiveEventListenerObject = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent), passive = passive.asInstanceOf[js.Any])
      __obj.asInstanceOf[PassiveEventListenerObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PassiveEventListenerObject] (val x: Self) extends AnyVal {
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
    }
  }
  
  type PromiseResolve = js.Function1[/* value */ Unit | PromiseLike[Unit], Unit]
  
  type StyleData = String
  
  type Timeout = ReturnType[FnCall]
  
  trait _AriaAutoComplete extends StObject
  
  trait _AriaCurrent extends StObject
}
